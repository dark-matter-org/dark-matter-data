package org.dmd.dmw.generated;

import java.util.Iterator;

import org.dmd.dmw.DmwMVIterator;

public class StringIteratorDMW extends DmwMVIterator<String>{

    public final static StringIteratorDMW emptyList = new StringIteratorDMW();

    protected StringIteratorDMW(){
        super();
    }

    public StringIteratorDMW(Iterator<String> it){
        super(it);
    }

}
