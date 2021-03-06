//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.Result;
import org.dmd.util.exceptions.ResultException;

/**
 * This class provides a convenient way to manage and invoke callbacks on objects.
 */

public class Callback {

    /**
     * The object to be called when the callback is invoked.
     */
    Object  targetObj;

    /**
     * The method to be called.
     */
    Method  method;

    /**
     * Method name.
     */
    String  methodName;

    /**
     * The types of the parameters of the callback method.
     */
	Class<?>  parms[];

    /**
     * The arguments to be passed to the callback method.
     */
    Object  args[];

    /**
     * The current parameter being specified.
     */
    int     currParm;

    /**
      * Creates a new callback instance.
      * @param argCount The number of arguments to be sent to the callback
      * method.
      */
    public Callback(int argCount) {
        targetObj   = null;
        method      = null;
        parms       = new Class[argCount];
        args        = new Object[argCount];
        currParm    = 0;
    }
    
    /**
     * @return the method name
     */
    public String getMethodName(){
    	return(methodName);
    }

    /**
     * You must call this function once for each type of parameter in the argument vector of the callback method.
     * @param name The fully qualified name of the class e.g. com.dmc.common.rrf.RrfResponse
     */
	public void addParm(String name) throws ResultException {
        Class<?> c;

        try{
            c = Class.forName(name);
        }
        catch(Exception e){
            ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Couldn't retrieve Class for " + name);
            throw(ex);
        }
        parms[currParm++] = c;
    }

    /**
     * You must call this function once for each type of parameter in the argument vector of the callback method.
     * @param c The Class of the next argument.
     */
	public void addParm(Class<?> c){
        parms[currParm++] = c;
    }

    /**
     * Initializes the callback.
     * @param cbobj The object to be called.
     * @param cbfun The callback function.
     */
    public void initialize(Object cbobj, String cbfun) throws ResultException {

        // Set the target object
        targetObj   = cbobj;

        methodName  = new String(cbfun);

        // Now try to set the method
        try{
            // NOTE: we use getMethod() rather than getDeclaredMethod() so that
            // we can call member functions in base classes.
            method = cbobj.getClass().getMethod(cbfun,parms);
        } catch ( NoSuchMethodException e ) {
            ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Unknown callback function: " + cbfun);
            ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());
            throw(ex);
        } catch ( SecurityException e ) {
            ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Security exception: " + e.getMessage());
            ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());
        }
    }

    /**
     * When you're ready to invoke the callback, call this function to set
     * each of the arguments that you're going to send.
     */
    public void setArg(int argNum, Object o){
        args[argNum] = o;
    }

    /**
     * @return The number of arguments for the callback.
     */
    public int getArgsCount() {
        if (args == null) {
            return (0);
        } else {
            return (args.length);
        }
     }

    /**
     * This function should be called by the entity (or entities) that are
     * performing a unit of work.
     */
    public void invoke()
        throws ResultException {
        try{
            method.invoke(targetObj, args);
        } catch ( InvocationTargetException e ) {
            StringWriter sw = new StringWriter();
            PrintWriter  pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Invocation failed for method: " + methodName + " on " + targetObj.getClass().getName());
            ex.result.lastResult().moreMessages(sw.toString());
            throw(ex);
        } catch ( IllegalAccessException e ) {
            ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Couldn't invoke method: " + methodName + " " + e.toString());
            throw(ex);
        } catch ( IllegalArgumentException e ) {
            ResultException ex = new ResultException();
            ex.result.addResult(Result.ERROR,"Couldn't invoke method: " + methodName + " " + e.toString());
            throw(ex);
        }
    }
}

