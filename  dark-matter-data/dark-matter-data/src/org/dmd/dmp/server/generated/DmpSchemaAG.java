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
package org.dmd.dmp.server.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


public class DmpSchemaAG extends SchemaDefinition {

    public static ClassDefinition _DMPMessage;
    public static ClassDefinition _Request;
    public static ClassDefinition _Response;
    public static ClassDefinition _LoginRequest;
    public static ClassDefinition _LoginResponse;
    public static ClassDefinition _LogoutRequest;
    public static ClassDefinition _LogoutResponse;
    public static ClassDefinition _GetRequest;
    public static ClassDefinition _GetResponse;
    public static ClassDefinition _ActionRequest;
    public static ClassDefinition _ActionResponse;
    public static ClassDefinition _SetRequest;
    public static ClassDefinition _SetResponse;
    public static ClassDefinition _CreateRequest;
    public static ClassDefinition _CreateResponse;
    public static ClassDefinition _DeleteRequest;
    public static ClassDefinition _DeleteResponse;
    public static ClassDefinition _Event;

    public static AttributeDefinition _requestID;
    public static AttributeDefinition _sessionID;
    public static AttributeDefinition _requestRoot;
    public static AttributeDefinition _responseType;
    public static AttributeDefinition _responseCategory;
    public static AttributeDefinition _responseText;
    public static AttributeDefinition _userName;
    public static AttributeDefinition _password;
    public static AttributeDefinition _FQN;
    public static AttributeDefinition _FQNList;
    public static AttributeDefinition _objName;
    public static AttributeDefinition _objClass;
    public static AttributeDefinition _lastResponse;
    public static AttributeDefinition _scope;
    public static AttributeDefinition _objectList;
    public static AttributeDefinition _actionName;
    public static AttributeDefinition _responseFormat;
    public static AttributeDefinition _readableFormat;
    public static AttributeDefinition _timeMS;
    public static AttributeDefinition _blockingFactor;
    public static AttributeDefinition _filter;
    public static AttributeDefinition _modify;
    public static AttributeDefinition _eventType;

    public static EnumDefinition _ScopeEnum;
    public static EnumDefinition _EventTypeEnum;
    public static EnumDefinition _FileModeEnum;
    public static EnumDefinition _ResponseTypeEnum;
    public static EnumDefinition _ResponseCategoryEnum;
    public static EnumDefinition _ResponseFormatEnum;

    static DmpSchemaAG instance;

    public DmpSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmp.server.generated.DmpSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmp");
            me.setSchemaPackage("org.dmd.dmp.shared");
            me.setDmwPackage("org.dmd.dmp.server");
            me.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/dmp.dms");

            ClassDefinitionDMO _DMPMessageOBJ = new ClassDefinitionDMO();
            _DMPMessage = new ClassDefinition(_DMPMessageOBJ);
            _DMPMessageOBJ.setClassType("ABSTRACT");
            _DMPMessage.setDefinedIn(this);
            _DMPMessageOBJ.setDescription("The DMPMessage class provides a common base for all messages that comprise the Dark Matter Protocol (DMP).");
            _DMPMessageOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _DMPMessageOBJ.setIsNamedBy("requestID");
            _DMPMessageOBJ.setLineNumber("11");
            _DMPMessageOBJ.addMust("requestID");
            _DMPMessageOBJ.setName("DMPMessage");
            _DMPMessageOBJ.addObjectClass("ClassDefinition");
            _DMPMessageOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_DMPMessage);

            ClassDefinitionDMO _RequestOBJ = new ClassDefinitionDMO();
            _Request = new ClassDefinition(_RequestOBJ);
            _RequestOBJ.setClassType("ABSTRACT");
            _Request.setDefinedIn(this);
            _RequestOBJ.setDerivedFrom("DMPMessage");
            _RequestOBJ.setDescription("The request class provides a common base for all request messages.");
            _RequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _RequestOBJ.setLineNumber("22");
            _RequestOBJ.addMay("sessionID");
            _RequestOBJ.addMay("readableFormat");
            _RequestOBJ.addMay("responseFormat");
            _RequestOBJ.setName("Request");
            _RequestOBJ.addObjectClass("ClassDefinition");
            _RequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_Request);

            ClassDefinitionDMO _ResponseOBJ = new ClassDefinitionDMO();
            _Response = new ClassDefinition(_ResponseOBJ);
            _ResponseOBJ.setClassType("STRUCTURAL");
            _Response.setDefinedIn(this);
            _ResponseOBJ.setDerivedFrom("DMPMessage");
            _ResponseOBJ.setDescription("The Response class serves as a common base for all response messages. It used to be that the Response was abstract, but because we could receive a completely unknown request (for instance via a JSON/XML interface), we had to have the ability to return a generic error response.");
            _ResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _ResponseOBJ.setLineNumber("36");
            _ResponseOBJ.addMay("responseText");
            _ResponseOBJ.addMay("responseCategory");
            _ResponseOBJ.addMust("lastResponse");
            _ResponseOBJ.addMust("responseType");
            _ResponseOBJ.setName("Response");
            _ResponseOBJ.addObjectClass("ClassDefinition");
            _ResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_Response);

            ClassDefinitionDMO _LoginRequestOBJ = new ClassDefinitionDMO();
            _LoginRequest = new ClassDefinition(_LoginRequestOBJ);
            _LoginRequestOBJ.setClassType("STRUCTURAL");
            _LoginRequest.setDefinedIn(this);
            _LoginRequestOBJ.setDerivedFrom("Request");
            _LoginRequestOBJ.setDescription("The LoginRequest allows you to connect to connect to something and pass along credentials.");
            _LoginRequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _LoginRequestOBJ.setLineNumber("47");
            _LoginRequestOBJ.addMust("userName");
            _LoginRequestOBJ.addMust("password");
            _LoginRequestOBJ.setName("LoginRequest");
            _LoginRequestOBJ.addObjectClass("ClassDefinition");
            _LoginRequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_LoginRequest);

            ClassDefinitionDMO _LoginResponseOBJ = new ClassDefinitionDMO();
            _LoginResponse = new ClassDefinition(_LoginResponseOBJ);
            _LoginResponseOBJ.setClassType("STRUCTURAL");
            _LoginResponse.setDefinedIn(this);
            _LoginResponseOBJ.setDerivedFrom("Response");
            _LoginResponseOBJ.setDescription("The LoginResponse is returned after a Login request is received. If the login is successful, a session ID will be assigned and a request root will be given. All subsequent requests must contain the session ID and all requests will be checked to ensure that they pertain to objects at or below the request root.");
            _LoginResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _LoginResponseOBJ.setLineNumber("60");
            _LoginResponseOBJ.addMay("sessionID");
            _LoginResponseOBJ.addMay("requestRoot");
            _LoginResponseOBJ.setName("LoginResponse");
            _LoginResponseOBJ.addObjectClass("ClassDefinition");
            _LoginResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_LoginResponse);

            ClassDefinitionDMO _LogoutRequestOBJ = new ClassDefinitionDMO();
            _LogoutRequest = new ClassDefinition(_LogoutRequestOBJ);
            _LogoutRequestOBJ.setClassType("STRUCTURAL");
            _LogoutRequest.setDefinedIn(this);
            _LogoutRequestOBJ.setDerivedFrom("Request");
            _LogoutRequestOBJ.setDescription("The LogoutRequest allows you to disconnect from your current session.");
            _LogoutRequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _LogoutRequestOBJ.setLineNumber("70");
            _LogoutRequestOBJ.addMust("userName");
            _LogoutRequestOBJ.addMust("sessionID");
            _LogoutRequestOBJ.setName("LogoutRequest");
            _LogoutRequestOBJ.addObjectClass("ClassDefinition");
            _LogoutRequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_LogoutRequest);

            ClassDefinitionDMO _LogoutResponseOBJ = new ClassDefinitionDMO();
            _LogoutResponse = new ClassDefinition(_LogoutResponseOBJ);
            _LogoutResponseOBJ.setClassType("STRUCTURAL");
            _LogoutResponse.setDefinedIn(this);
            _LogoutResponseOBJ.setDerivedFrom("Response");
            _LogoutResponseOBJ.setDescription("The LogoutResponse will indicate that you have successfully terminated your current session.");
            _LogoutResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _LogoutResponseOBJ.setLineNumber("80");
            _LogoutResponseOBJ.addMust("sessionID");
            _LogoutResponseOBJ.setName("LogoutResponse");
            _LogoutResponseOBJ.addObjectClass("ClassDefinition");
            _LogoutResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_LogoutResponse);

            ClassDefinitionDMO _GetRequestOBJ = new ClassDefinitionDMO();
            _GetRequest = new ClassDefinition(_GetRequestOBJ);
            _GetRequestOBJ.setClassType("STRUCTURAL");
            _GetRequest.setDefinedIn(this);
            _GetRequestOBJ.setDerivedFrom("Request");
            _GetRequestOBJ.setDescription("The GetRequest is used to retrieve objects.");
            _GetRequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _GetRequestOBJ.setLineNumber("92");
            _GetRequestOBJ.addMay("filter");
            _GetRequestOBJ.addMay("blockingFactor");
            _GetRequestOBJ.addMust("scope");
            _GetRequestOBJ.addMust("FQN");
            _GetRequestOBJ.setName("GetRequest");
            _GetRequestOBJ.addObjectClass("ClassDefinition");
            _GetRequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_GetRequest);

            ClassDefinitionDMO _GetResponseOBJ = new ClassDefinitionDMO();
            _GetResponse = new ClassDefinition(_GetResponseOBJ);
            _GetResponseOBJ.setClassType("STRUCTURAL");
            _GetResponse.setDefinedIn(this);
            _GetResponseOBJ.setDerivedFrom("Response");
            _GetResponseOBJ.setDescription("The GetResponse returns a set of objects. The form of this response will depend on the readableResponse and responseFormat values that may have been sent with the original Get request. GetResponses");
            _GetResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _GetResponseOBJ.setLineNumber("103");
            _GetResponseOBJ.addMay("objectList");
            _GetResponseOBJ.setName("GetResponse");
            _GetResponseOBJ.addObjectClass("ClassDefinition");
            _GetResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_GetResponse);

            ClassDefinitionDMO _ActionRequestOBJ = new ClassDefinitionDMO();
            _ActionRequest = new ClassDefinition(_ActionRequestOBJ);
            _ActionRequestOBJ.setClassType("EXTENSIBLE");
            _ActionRequest.setDefinedIn(this);
            _ActionRequestOBJ.setDerivedFrom("Request");
            _ActionRequestOBJ.setDescription("The ActionRequest is used to trigger behaviour on one or more objects.");
            _ActionRequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _ActionRequestOBJ.setLineNumber("115");
            _ActionRequestOBJ.addMay("scope");
            _ActionRequestOBJ.addMay("objectList");
            _ActionRequestOBJ.addMust("FQN");
            _ActionRequestOBJ.addMust("actionName");
            _ActionRequestOBJ.setName("ActionRequest");
            _ActionRequestOBJ.addObjectClass("ClassDefinition");
            _ActionRequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_ActionRequest);

            ClassDefinitionDMO _ActionResponseOBJ = new ClassDefinitionDMO();
            _ActionResponse = new ClassDefinition(_ActionResponseOBJ);
            _ActionResponseOBJ.setClassType("EXTENSIBLE");
            _ActionResponse.setDefinedIn(this);
            _ActionResponseOBJ.setDerivedFrom("Response");
            _ActionResponseOBJ.setDescription("The ActionResponse returns the results of a particular ActionRequest. Exactly what is returned will depend on the efActionDef.");
            _ActionResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _ActionResponseOBJ.setLineNumber("126");
            _ActionResponseOBJ.addMay("objectList");
            _ActionResponseOBJ.addMust("timeMS");
            _ActionResponseOBJ.setName("ActionResponse");
            _ActionResponseOBJ.addObjectClass("ClassDefinition");
            _ActionResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_ActionResponse);

            ClassDefinitionDMO _SetRequestOBJ = new ClassDefinitionDMO();
            _SetRequest = new ClassDefinition(_SetRequestOBJ);
            _SetRequestOBJ.setClassType("STRUCTURAL");
            _SetRequest.setDefinedIn(this);
            _SetRequestOBJ.setDerivedFrom("Request");
            _SetRequestOBJ.setDescription("The SetRequest allows you to alter the attribute values associated with an object. Like the get request, the set of attributes that can be manipulated will depend on the object type that is specified.");
            _SetRequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _SetRequestOBJ.setLineNumber("138");
            _SetRequestOBJ.addMust("FQN");
            _SetRequestOBJ.addMust("modify");
            _SetRequestOBJ.setName("SetRequest");
            _SetRequestOBJ.addObjectClass("ClassDefinition");
            _SetRequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_SetRequest);

            ClassDefinitionDMO _SetResponseOBJ = new ClassDefinitionDMO();
            _SetResponse = new ClassDefinition(_SetResponseOBJ);
            _SetResponseOBJ.setClassType("EXTENSIBLE");
            _SetResponse.setDefinedIn(this);
            _SetResponseOBJ.setDerivedFrom("Response");
            _SetResponseOBJ.setDescription("The SetResponse returns the results of a particular SetRequest. The objectList will contain the objects with the previously specified edits.");
            _SetResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _SetResponseOBJ.setLineNumber("149");
            _SetResponseOBJ.addMay("objectList");
            _SetResponseOBJ.addMust("timeMS");
            _SetResponseOBJ.setName("SetResponse");
            _SetResponseOBJ.addObjectClass("ClassDefinition");
            _SetResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_SetResponse);

            ClassDefinitionDMO _CreateRequestOBJ = new ClassDefinitionDMO();
            _CreateRequest = new ClassDefinition(_CreateRequestOBJ);
            _CreateRequestOBJ.setClassType("STRUCTURAL");
            _CreateRequest.setDefinedIn(this);
            _CreateRequestOBJ.setDerivedFrom("Request");
            _CreateRequestOBJ.setDescription("The CreateRequest allows you to create one or more objects. If an FQN is specified, the objects will be created beneath that parent object.");
            _CreateRequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _CreateRequestOBJ.setLineNumber("160");
            _CreateRequestOBJ.addMay("FQN");
            _CreateRequestOBJ.addMust("objectList");
            _CreateRequestOBJ.setName("CreateRequest");
            _CreateRequestOBJ.addObjectClass("ClassDefinition");
            _CreateRequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_CreateRequest);

            ClassDefinitionDMO _CreateResponseOBJ = new ClassDefinitionDMO();
            _CreateResponse = new ClassDefinition(_CreateResponseOBJ);
            _CreateResponseOBJ.setClassType("STRUCTURAL");
            _CreateResponse.setDefinedIn(this);
            _CreateResponseOBJ.setDerivedFrom("Response");
            _CreateResponseOBJ.setDescription("The CreateResponse returns the results of a particular CreateRequest. The objectList contents will be implementation specific e.g. if there were problems with object creation there may be error indications.");
            _CreateResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _CreateResponseOBJ.setLineNumber("171");
            _CreateResponseOBJ.addMay("objectList");
            _CreateResponseOBJ.setName("CreateResponse");
            _CreateResponseOBJ.addObjectClass("ClassDefinition");
            _CreateResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_CreateResponse);

            ClassDefinitionDMO _DeleteRequestOBJ = new ClassDefinitionDMO();
            _DeleteRequest = new ClassDefinition(_DeleteRequestOBJ);
            _DeleteRequestOBJ.setClassType("STRUCTURAL");
            _DeleteRequest.setDefinedIn(this);
            _DeleteRequestOBJ.setDerivedFrom("Request");
            _DeleteRequestOBJ.setDescription("The DeleteRequest allows you to delete one or more objects. If no scope is specified, the scope is assumed to be BASE i.e. just the specific object indicated by the FQN(s). The behaviour of this request is implementation specific.");
            _DeleteRequestOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _DeleteRequestOBJ.setLineNumber("183");
            _DeleteRequestOBJ.addMay("scope");
            _DeleteRequestOBJ.addMust("FQNList");
            _DeleteRequestOBJ.setName("DeleteRequest");
            _DeleteRequestOBJ.addObjectClass("ClassDefinition");
            _DeleteRequestOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_DeleteRequest);

            ClassDefinitionDMO _DeleteResponseOBJ = new ClassDefinitionDMO();
            _DeleteResponse = new ClassDefinition(_DeleteResponseOBJ);
            _DeleteResponseOBJ.setClassType("STRUCTURAL");
            _DeleteResponse.setDefinedIn(this);
            _DeleteResponseOBJ.setDerivedFrom("Response");
            _DeleteResponseOBJ.setDescription("The DeleteResponse returns the results of a particular DeleteRequest. The objectList contents will be implementation specific e.g. if there were problems with object deletion there may be error indications.");
            _DeleteResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _DeleteResponseOBJ.setLineNumber("194");
            _DeleteResponseOBJ.addMay("objectList");
            _DeleteResponseOBJ.setName("DeleteResponse");
            _DeleteResponseOBJ.addObjectClass("ClassDefinition");
            _DeleteResponseOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_DeleteResponse);

            ClassDefinitionDMO _EventOBJ = new ClassDefinitionDMO();
            _Event = new ClassDefinition(_EventOBJ);
            _EventOBJ.setClassType("STRUCTURAL");
            _Event.setDefinedIn(this);
            _EventOBJ.setDerivedFrom("DMPMessage");
            _EventOBJ.setDescription("The Event class allows for the asynchronous notification of noteworthy system events.");
            _EventOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/classes2.dmd");
            _EventOBJ.setLineNumber("207");
            _EventOBJ.addMay("objName");
            _EventOBJ.addMay("objClass");
            _EventOBJ.addMay("objectList");
            _EventOBJ.addMust("eventType");
            _EventOBJ.setName("Event");
            _EventOBJ.addObjectClass("ClassDefinition");
            _EventOBJ.setUseWrapperType("EXTENDED");
            _EventOBJ.setUsesInterface("de.novanic.eventservice.client.event.Event");
            addClassDefList(_Event);


            AttributeDefinitionDMO _requestIDOBJ = new AttributeDefinitionDMO();
            _requestID = new AttributeDefinition(_requestIDOBJ);
            _requestID.setDefinedIn(this);
            _requestIDOBJ.setDescription("A unique identifier that is generated on a client to distinguish the responses that are associated with a given request.");
            _requestIDOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _requestIDOBJ.setLineNumber("6");
            _requestIDOBJ.setName("requestID");
            _requestIDOBJ.addObjectClass("AttributeDefinition");
            _requestIDOBJ.setType("Integer");
            addAttributeDefList(_requestID);

            AttributeDefinitionDMO _sessionIDOBJ = new AttributeDefinitionDMO();
            _sessionID = new AttributeDefinition(_sessionIDOBJ);
            _sessionID.setDefinedIn(this);
            _sessionIDOBJ.setDescription("A unique identifier that identifies a client session with the server.");
            _sessionIDOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _sessionIDOBJ.setLineNumber("11");
            _sessionIDOBJ.setName("sessionID");
            _sessionIDOBJ.addObjectClass("AttributeDefinition");
            _sessionIDOBJ.setType("String");
            addAttributeDefList(_sessionID);

            AttributeDefinitionDMO _requestRootOBJ = new AttributeDefinitionDMO();
            _requestRoot = new AttributeDefinition(_requestRootOBJ);
            _requestRoot.setDefinedIn(this);
            _requestRootOBJ.setDescription("For a set of objects stored in a hierarchic name space, this will be prefix beneath which all objects managed through the interface will reside.");
            _requestRootOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _requestRootOBJ.setLineNumber("17");
            _requestRootOBJ.setName("requestRoot");
            _requestRootOBJ.addObjectClass("AttributeDefinition");
            _requestRootOBJ.setType("String");
            addAttributeDefList(_requestRoot);

            AttributeDefinitionDMO _responseTypeOBJ = new AttributeDefinitionDMO();
            _responseType = new AttributeDefinition(_responseTypeOBJ);
            _responseType.setDefinedIn(this);
            _responseTypeOBJ.setDescription("Indicates the category of response, success, failure, warning etc.");
            _responseTypeOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _responseTypeOBJ.setLineNumber("22");
            _responseTypeOBJ.setName("responseType");
            _responseTypeOBJ.addObjectClass("AttributeDefinition");
            _responseTypeOBJ.setType("ResponseTypeEnum");
            addAttributeDefList(_responseType);

            AttributeDefinitionDMO _responseCategoryOBJ = new AttributeDefinitionDMO();
            _responseCategory = new AttributeDefinition(_responseCategoryOBJ);
            _responseCategory.setDefinedIn(this);
            _responseCategoryOBJ.setDescription("Indicates the category of a response.");
            _responseCategoryOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _responseCategoryOBJ.setLineNumber("27");
            _responseCategoryOBJ.setName("responseCategory");
            _responseCategoryOBJ.addObjectClass("AttributeDefinition");
            _responseCategoryOBJ.setType("ResponseCategoryEnum");
            addAttributeDefList(_responseCategory);

            AttributeDefinitionDMO _responseTextOBJ = new AttributeDefinitionDMO();
            _responseText = new AttributeDefinition(_responseTextOBJ);
            _responseText.setDefinedIn(this);
            _responseTextOBJ.setDescription("Textual information associated with a response.");
            _responseTextOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _responseTextOBJ.setLineNumber("32");
            _responseTextOBJ.setName("responseText");
            _responseTextOBJ.addObjectClass("AttributeDefinition");
            _responseTextOBJ.setType("String");
            addAttributeDefList(_responseText);

            AttributeDefinitionDMO _userNameOBJ = new AttributeDefinitionDMO();
            _userName = new AttributeDefinition(_userNameOBJ);
            _userName.setDefinedIn(this);
            _userNameOBJ.setDescription("The login name of a user.");
            _userNameOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _userNameOBJ.setLineNumber("37");
            _userNameOBJ.setName("userName");
            _userNameOBJ.addObjectClass("AttributeDefinition");
            _userNameOBJ.setType("String");
            addAttributeDefList(_userName);

            AttributeDefinitionDMO _passwordOBJ = new AttributeDefinitionDMO();
            _password = new AttributeDefinition(_passwordOBJ);
            _password.setDefinedIn(this);
            _passwordOBJ.setDescription("The password associated with a user.");
            _passwordOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _passwordOBJ.setLineNumber("42");
            _passwordOBJ.setName("password");
            _passwordOBJ.addObjectClass("AttributeDefinition");
            _passwordOBJ.setType("String");
            addAttributeDefList(_password);

            AttributeDefinitionDMO _FQNOBJ = new AttributeDefinitionDMO();
            _FQN = new AttributeDefinition(_FQNOBJ);
            _FQN.setDefinedIn(this);
            _FQNOBJ.setDescription("The fully qualified name of a hierarchic object. The exact form of the FQN is application specific.");
            _FQNOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _FQNOBJ.setLineNumber("48");
            _FQNOBJ.setName("FQN");
            _FQNOBJ.addObjectClass("AttributeDefinition");
            _FQNOBJ.setType("String");
            addAttributeDefList(_FQN);

            AttributeDefinitionDMO _FQNListOBJ = new AttributeDefinitionDMO();
            _FQNList = new AttributeDefinition(_FQNListOBJ);
            _FQNList.setDefinedIn(this);
            _FQNListOBJ.setDescription("A set of fully qualified names.");
            _FQNListOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _FQNListOBJ.setIsMultiValued("true");
            _FQNListOBJ.setLineNumber("54");
            _FQNListOBJ.setName("FQNList");
            _FQNListOBJ.addObjectClass("AttributeDefinition");
            _FQNListOBJ.setType("String");
            addAttributeDefList(_FQNList);

            AttributeDefinitionDMO _objNameOBJ = new AttributeDefinitionDMO();
            _objName = new AttributeDefinition(_objNameOBJ);
            _objName.setDefinedIn(this);
            _objNameOBJ.setDescription("The name of an object.");
            _objNameOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _objNameOBJ.setLineNumber("59");
            _objNameOBJ.setName("objName");
            _objNameOBJ.addObjectClass("AttributeDefinition");
            _objNameOBJ.setType("String");
            addAttributeDefList(_objName);

            AttributeDefinitionDMO _objClassOBJ = new AttributeDefinitionDMO();
            _objClass = new AttributeDefinition(_objClassOBJ);
            _objClass.setDefinedIn(this);
            _objClassOBJ.setDescription("The class name of an object.");
            _objClassOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _objClassOBJ.setLineNumber("64");
            _objClassOBJ.setName("objClass");
            _objClassOBJ.addObjectClass("AttributeDefinition");
            _objClassOBJ.setType("String");
            addAttributeDefList(_objClass);

            AttributeDefinitionDMO _lastResponseOBJ = new AttributeDefinitionDMO();
            _lastResponse = new AttributeDefinition(_lastResponseOBJ);
            _lastResponse.setDefinedIn(this);
            _lastResponseOBJ.setDescription("Flag that indicates if this is the last response to a request.");
            _lastResponseOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _lastResponseOBJ.setLineNumber("69");
            _lastResponseOBJ.setName("lastResponse");
            _lastResponseOBJ.addObjectClass("AttributeDefinition");
            _lastResponseOBJ.setType("Boolean");
            addAttributeDefList(_lastResponse);

            AttributeDefinitionDMO _scopeOBJ = new AttributeDefinitionDMO();
            _scope = new AttributeDefinition(_scopeOBJ);
            _scope.setDefinedIn(this);
            _scopeOBJ.setDescription("Indicates the scope of an operation applied to a hierarchy of objects.");
            _scopeOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _scopeOBJ.setLineNumber("74");
            _scopeOBJ.setName("scope");
            _scopeOBJ.addObjectClass("AttributeDefinition");
            _scopeOBJ.setType("ScopeEnum");
            addAttributeDefList(_scope);

            AttributeDefinitionDMO _objectListOBJ = new AttributeDefinitionDMO();
            _objectList = new AttributeDefinition(_objectListOBJ);
            _objectList.setDefinedIn(this);
            _objectListOBJ.setDescription("A set of objects returned from the server.");
            _objectListOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _objectListOBJ.setIsMultiValued("true");
            _objectListOBJ.setLineNumber("80");
            _objectListOBJ.setName("objectList");
            _objectListOBJ.addObjectClass("AttributeDefinition");
            _objectListOBJ.setType("DmcObject");
            addAttributeDefList(_objectList);

            AttributeDefinitionDMO _actionNameOBJ = new AttributeDefinitionDMO();
            _actionName = new AttributeDefinition(_actionNameOBJ);
            _actionName.setDefinedIn(this);
            _actionNameOBJ.setDescription("The name of an action to be triggered.");
            _actionNameOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _actionNameOBJ.setLineNumber("85");
            _actionNameOBJ.setName("actionName");
            _actionNameOBJ.addObjectClass("AttributeDefinition");
            _actionNameOBJ.setType("String");
            addAttributeDefList(_actionName);

            AttributeDefinitionDMO _responseFormatOBJ = new AttributeDefinitionDMO();
            _responseFormat = new AttributeDefinition(_responseFormatOBJ);
            _responseFormat.setDefinedIn(this);
            _responseFormatOBJ.setDescription("When the protocol is used for a JSON interface, the response format indicates whether the client wants the results as a flat set of objects (STANDARD) or as hierarchy of child objects embedded in arrays beneath their parents (DOM).");
            _responseFormatOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _responseFormatOBJ.setLineNumber("98");
            _responseFormatOBJ.setName("responseFormat");
            _responseFormatOBJ.addObjectClass("AttributeDefinition");
            _responseFormatOBJ.setType("ResponseFormatEnum");
            addAttributeDefList(_responseFormat);

            AttributeDefinitionDMO _readableFormatOBJ = new AttributeDefinitionDMO();
            _readableFormat = new AttributeDefinition(_readableFormatOBJ);
            _readableFormat.setDefinedIn(this);
            _readableFormatOBJ.setDescription("A flag that indicates if you want a response in a human readable format with  formatting. The default is to use the most compact form - no additional whitespace and no newlines.");
            _readableFormatOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _readableFormatOBJ.setLineNumber("105");
            _readableFormatOBJ.setName("readableFormat");
            _readableFormatOBJ.addObjectClass("AttributeDefinition");
            _readableFormatOBJ.setType("Boolean");
            addAttributeDefList(_readableFormat);

            AttributeDefinitionDMO _timeMSOBJ = new AttributeDefinitionDMO();
            _timeMS = new AttributeDefinition(_timeMSOBJ);
            _timeMS.setDefinedIn(this);
            _timeMSOBJ.setDescription("A time stamp in milliseconds.");
            _timeMSOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _timeMSOBJ.setLineNumber("110");
            _timeMSOBJ.setName("timeMS");
            _timeMSOBJ.addObjectClass("AttributeDefinition");
            _timeMSOBJ.setType("Long");
            addAttributeDefList(_timeMS);

            AttributeDefinitionDMO _blockingFactorOBJ = new AttributeDefinitionDMO();
            _blockingFactor = new AttributeDefinition(_blockingFactorOBJ);
            _blockingFactor.setDefinedIn(this);
            _blockingFactorOBJ.setDescription("The number of objects to be returned in a block in a GetResponse. If not specified, the server will attempt to return all requested objects in a single response.");
            _blockingFactorOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _blockingFactorOBJ.setLineNumber("116");
            _blockingFactorOBJ.setName("blockingFactor");
            _blockingFactorOBJ.addObjectClass("AttributeDefinition");
            _blockingFactorOBJ.setType("Integer");
            addAttributeDefList(_blockingFactor);

            AttributeDefinitionDMO _filterOBJ = new AttributeDefinitionDMO();
            _filter = new AttributeDefinition(_filterOBJ);
            _filter.setDefinedIn(this);
            _filterOBJ.setDescription("Currently a place holder for the eventually filter implementation.");
            _filterOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _filterOBJ.setLineNumber("121");
            _filterOBJ.setName("filter");
            _filterOBJ.addObjectClass("AttributeDefinition");
            _filterOBJ.setType("String");
            addAttributeDefList(_filter);

            AttributeDefinitionDMO _modifyOBJ = new AttributeDefinitionDMO();
            _modify = new AttributeDefinition(_modifyOBJ);
            _modify.setDefinedIn(this);
            _modifyOBJ.setDescription("Currently a place holder for the eventually modify implementation.");
            _modifyOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _modifyOBJ.setLineNumber("126");
            _modifyOBJ.setName("modify");
            _modifyOBJ.addObjectClass("AttributeDefinition");
            _modifyOBJ.setType("String");
            addAttributeDefList(_modify);

            AttributeDefinitionDMO _eventTypeOBJ = new AttributeDefinitionDMO();
            _eventType = new AttributeDefinition(_eventTypeOBJ);
            _eventType.setDefinedIn(this);
            _eventTypeOBJ.setDescription("The eventType indicates the nature of an event.");
            _eventTypeOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/attributes2.dmd");
            _eventTypeOBJ.setLineNumber("131");
            _eventTypeOBJ.setName("eventType");
            _eventTypeOBJ.addObjectClass("AttributeDefinition");
            _eventTypeOBJ.setType("EventTypeEnum");
            addAttributeDefList(_eventType);


            EnumDefinitionDMO _ScopeEnumOBJ = new EnumDefinitionDMO();
            _ScopeEnum = new EnumDefinition(_ScopeEnumOBJ);
            _ScopeEnum.setDefinedIn(this);
            _ScopeEnumOBJ.setDescription("The ScopeEnum indicates the scope of an operation when applied to a hierarchy of objects.");
            _ScopeEnumOBJ.addEnumValue("0 NONE Indicates that no value has been set.");
            _ScopeEnumOBJ.addEnumValue("1 BASE Applies the operation only to the object named in the request.");
            _ScopeEnumOBJ.addEnumValue("2 NEXT Applies the operation to the children, or next layer, of objects below the target object.");
            _ScopeEnumOBJ.addEnumValue("3 ALL Applies the operation to the entire sub-tree of objects beneath the target object.");
            _ScopeEnumOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/types.dmd");
            _ScopeEnumOBJ.setLineNumber("12");
            _ScopeEnumOBJ.setName("ScopeEnum");
            _ScopeEnumOBJ.addObjectClass("EnumDefinition");
            addEnumDefList(_ScopeEnum);

            EnumDefinitionDMO _EventTypeEnumOBJ = new EnumDefinitionDMO();
            _EventTypeEnum = new EnumDefinition(_EventTypeEnumOBJ);
            _EventTypeEnum.setDefinedIn(this);
            _EventTypeEnumOBJ.setDescription("The ObjectEventEnum indicates the type of operation that caused  an object event to be generated.");
            _EventTypeEnumOBJ.addEnumValue("0 CREATED Indicates that an object was created.");
            _EventTypeEnumOBJ.addEnumValue("1 DELETED Indicates that an object was deleted.");
            _EventTypeEnumOBJ.addEnumValue("2 MODIFIED Indicates that an object was modified.");
            _EventTypeEnumOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/types.dmd");
            _EventTypeEnumOBJ.setLineNumber("20");
            _EventTypeEnumOBJ.setName("EventTypeEnum");
            _EventTypeEnumOBJ.addObjectClass("EnumDefinition");
            addEnumDefList(_EventTypeEnum);

            EnumDefinitionDMO _FileModeEnumOBJ = new EnumDefinitionDMO();
            _FileModeEnum = new EnumDefinition(_FileModeEnumOBJ);
            _FileModeEnum.setDefinedIn(this);
            _FileModeEnumOBJ.setDescription("The FileModeEnum is used to indicate the mode in which a file is opened for writing  when the results of an operation are to be captured to a file.");
            _FileModeEnumOBJ.addEnumValue("0 OPEN Causes a save to file operation to overwrite an existing file or create it if it doesn't exist.");
            _FileModeEnumOBJ.addEnumValue("1 APPEND Causes a save to file operation to append to an existing file or create it if it doesn't exist.");
            _FileModeEnumOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/types.dmd");
            _FileModeEnumOBJ.setLineNumber("29");
            _FileModeEnumOBJ.setName("FileModeEnum");
            _FileModeEnumOBJ.addObjectClass("EnumDefinition");
            addEnumDefList(_FileModeEnum);

            EnumDefinitionDMO _ResponseTypeEnumOBJ = new EnumDefinitionDMO();
            _ResponseTypeEnum = new EnumDefinition(_ResponseTypeEnumOBJ);
            _ResponseTypeEnum.setDefinedIn(this);
            _ResponseTypeEnumOBJ.setDescription("The ResponseTypeEnum indicates the type of a response.");
            _ResponseTypeEnumOBJ.addEnumValue("0 UNKNOWN An unknown type of response; shouldn't happen.");
            _ResponseTypeEnumOBJ.addEnumValue("1 SUCCESS Indicates that the request was successful.");
            _ResponseTypeEnumOBJ.addEnumValue("2 WARNING Indicates that the request was sucessful but that there were warnings generated and that there is some descriptive text that indicates what happened.");
            _ResponseTypeEnumOBJ.addEnumValue("3 ERROR Indicates that the request failed and that there is some descriptive text that indicates what happened.");
            _ResponseTypeEnumOBJ.addEnumValue("4 PROGRESSTEXT Indicates that the request is proceeding and that this is a textual update on the progress of the request.");
            _ResponseTypeEnumOBJ.addEnumValue("5 PROGRESSPERCENT Indicates that the request is proceeding and that this is the percentage of the processing that's complete.");
            _ResponseTypeEnumOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/types.dmd");
            _ResponseTypeEnumOBJ.setLineNumber("44");
            _ResponseTypeEnumOBJ.setName("ResponseTypeEnum");
            _ResponseTypeEnumOBJ.addObjectClass("EnumDefinition");
            addEnumDefList(_ResponseTypeEnum);

            EnumDefinitionDMO _ResponseCategoryEnumOBJ = new EnumDefinitionDMO();
            _ResponseCategoryEnum = new EnumDefinition(_ResponseCategoryEnumOBJ);
            _ResponseCategoryEnum.setDefinedIn(this);
            _ResponseCategoryEnumOBJ.setDescription("The ResponseCategoryEnum indicates the category of an error response.");
            _ResponseCategoryEnumOBJ.addEnumValue("0 UNKNOWN An uncategorized response.");
            _ResponseCategoryEnumOBJ.addEnumValue("1 SOFTWARE A response related to software.");
            _ResponseCategoryEnumOBJ.addEnumValue("2 SECURITY A response related to security.");
            _ResponseCategoryEnumOBJ.addEnumValue("3 REPOSITORY A response related to the repository.");
            _ResponseCategoryEnumOBJ.addEnumValue("4 COMMS A response related to communication.");
            _ResponseCategoryEnumOBJ.addEnumValue("5 OPERATIONAL A response related to an operation.");
            _ResponseCategoryEnumOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/types.dmd");
            _ResponseCategoryEnumOBJ.setLineNumber("54");
            _ResponseCategoryEnumOBJ.setName("ResponseCategoryEnum");
            _ResponseCategoryEnumOBJ.addObjectClass("EnumDefinition");
            addEnumDefList(_ResponseCategoryEnum);

            EnumDefinitionDMO _ResponseFormatEnumOBJ = new EnumDefinitionDMO();
            _ResponseFormatEnum = new EnumDefinition(_ResponseFormatEnumOBJ);
            _ResponseFormatEnum.setDefinedIn(this);
            _ResponseFormatEnumOBJ.setDescription("The ResponseFormatEnum indicates how JSON responses are to be formatted.");
            _ResponseFormatEnumOBJ.addEnumValue("0 STANDARD Indicates that the responses should be in standard flat format.");
            _ResponseFormatEnumOBJ.addEnumValue("1 DOM  Indicates that the response should be in DOM format i.e. the hierarchic structure of the data should be reflected by indenting children in subarrays beneath an object.");
            _ResponseFormatEnumOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmp/shared/schema/v0dot1/types.dmd");
            _ResponseFormatEnumOBJ.setLineNumber("60");
            _ResponseFormatEnumOBJ.setName("ResponseFormatEnum");
            _ResponseFormatEnumOBJ.addObjectClass("EnumDefinition");
            addEnumDefList(_ResponseFormatEnum);


        }
    }


    @Override
    public DmpSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}

