

# Login Request: Client Perspective #

Strangely enough, the `LoginRequest` allows users to login to an application.

## GWT/DMO Operational Context ##

<font color='#9E0B0F'>
<b><code>import org.dmd.dmp.shared.generated.dmo.LoginRequestDMO</code></b>
</font>

Example usage:
```
LoginRequestDMO request = new LoginRequestDMO();

request.addrequestID(1);
request.setUserName("joe");
request.setPassword("joesPassword");
```

## Full Java Operational Context ##

<font color='#9E0B0F'>
<b><code>import org.dmd.dmp.server.extended.LoginRequest</code></b>
</font>

Example usage:
```
LoginRequest request = new LoginRequest();

request.addrequestID(1);
request.setUserName("joe");
request.setPassword("joesPassword");
```

## `LoginRequest` [OIF](DMOOverview#Object_Instance_Format.md) ##

```
LoginRequest
requestID 1
userName  joe
password  joesPassword
```

# Login Response: Client Perspective #