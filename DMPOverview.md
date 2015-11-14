

# The Dark Matter Protocol #

Many of the interfaces to data that I've seen for applications, web and desktop alike, have been ad hoc in nature. When you access data in this way, the interface tends to grow in an organic way and access methods tend to follow the whim of the individual designers who work on the project.

Some will argue that this is the appropriate way to approach interface design; that you're dealing with an object oriented system and you should name your methods according to their purpose to make things more clearly understandable. On this topic, you will get no argument from me, I like well designed, well named interfaces.

However, when dealing with data, it's useful to have a clear set of standard interfaces to perform CRUDE operations - see the [Dark Matter Overview](DMDOverview#It_Starts_with_a_Model.md) for a definition of CRUDE. The Dark Matter Protocol provides that standard interface to data, as well as to the events associated with the data and being able to trigger behavior against your objects.

As mentioned in [Goals & Philosophy](DMDGoalsAndPhilosophy#Manipulate_Your_Data_in_a_Rational_Way.md) page, the Dark Matter Protocol is based on the [Common Management Information Protocol](http://en.wikipedia.org/wiki/Common_management_information_protocol) (CMIP). Although CMIP and the [Open Systems Interconnection](http://en.wikipedia.org/wiki/Open_Systems_Interconnection) (OSI) intiative of which it was a part are now pretty much obsolete, the basic concepts of CMIP remain quite valid.

[DON'T PANIC!](http://en.wikipedia.org/wiki/Phrases_from_The_Hitchhiker%27s_Guide_to_the_Galaxy#Don.27t_Panic) The Dark Matter Protocol IS NOT AN IMPLEMENTATION OF CMIP!

_"Using concepts from"_ and _"implementation of"_ are two different things. Just so that we're clear.


The protocol is composed of the following messages:

<table width='820'>

<tr>
<td width='140' valign='top'>
<b><code>LoginRequest</code></b>
<b><code>LoginResponse</code></b>
</td>
<td valign='top'>
The <a href='DMPLogin.md'>LoginRequest</a> provides a standard means of authentication a user of the system. The <a href='DMPLogin.md'>LoginResponse</a> may contain a session identifier that should be passed along in all subsequent requests.<br>
<br>
</td>
</tr>

<tr>
<td width='140' valign='top'>
<b><code>LogoutRequest</code></b>
<b><code>LogoutResponse</code></b>

</td>
<td valign='top'>
The <a href='DMPLogout.md'>LogoutRequest</a> provides a standard mechanism for signing out of an application in a graceful manner.<br>
<br>
</td>
</tr>


<tr>
<td width='140' valign='top'>
<b><code>GetRequest</code></b>
<b><code>GetResponse</code></b>

</td>
<td valign='top'>
The <a href='DMPGet.md'>GetRequest</a> provides the <code>R</code> part of <code>CRUDE</code> i.e. the Retrieval of one or more <a href='DMOOverview.md'>DMOs</a>.<br>
<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>SetRequest</code></b>
<b><code>SetResponse</code></b>

</td>
<td valign='top'>
The <a href='DMPSet.md'>SetRequest</a> provides the <code>U</code> part of <code>CRUDE</code> and lets you Update the attributes of one or more <a href='DMOOverview.md'>DMOs</a>.<br>
<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>CreateRequest</code></b>
<b><code>CreateResponse</code></b>

</td>
<td valign='top'>
The <a href='DMPCreate.md'>CreateRequest</a> provides, you guessed it, the <code>C</code> part of <code>CRUDE</code> i.e. the ability to Create a new object.<br>
<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>DeleteRequest</code></b>
<b><code>DeleteResponse</code></b>
</td>
<td valign='top'>
The <a href='DMPDelete.md'>DeleteRequest</a> allows for the Deletion of one or more objects. That's the <code>D</code> part of <code>CRUDE</code>, for those who may have missed it ;-)<br>
<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>ActionRequest</code></b>
<b><code>ActionResponse</code></b>
</td>
<td valign='top'>
Here's your opportunity to get "organic" and trigger behaviour on objects based on your previously defined <a href='DMSActionDefinition.md'>ActionDefinitions</a>. You are free to name actions whatever you want so that you can put your stamp of individuality on your protocol.<br>
<br>
See the <a href='DMPAction.md'>ActionRequest</a> for examples of how to use actions.<br>
<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>NotifyRequest</code></b>
<b><code>NotifyResponse</code></b>
</td>
<td valign='top'>
The <a href='DMPNotify.md'>NotifyRequest</a> allows you to register for events that indicate when <a href='DMOOverview.md'>DMOs</a> are created, deleted or modified.<br>
<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>DMPEvent</code></b>
</td>
<td valign='top'>
The <a href='DMPEvent.md'>DMPEvent</a> is an autonomous notification of creation of, deletion of, or modifications to <a href='DMOOverview.md'>DMOs</a>. This is also the <code>E</code> part of <code>CRUDE</code>, but I've named it DMPEvent so that people don't get it confused with all of the other "Event" classes out there.<br>
<br>
So many events! So few names for them!<br>
<br>
</td>
</tr>

</table>

## The `DMPMessage` Base Class ##

All Dark Matter Protocol messages are derived from DMPMessage. It has the following attributes:

<table width='820'>

<tr>
<td width='140' valign='top'>
<b><code>requestID</code></b>
</td>
<td>
uniquely identifies a request message from a particular source. This is actually a multi-valued attribute; the reasons for this are covered in the <a href='DMDAdvancedConcepts.md'>Advanced Concepts</a> section. For most situations, just adding a single identifier is sufficient.<br>
<br>
Due to the fact that DMP is a truly asynchronous protocol (event in GWT), the <code>requestID</code> allows for association of <code>Responses</code> with their initiating <code>Requests</code> where a complete response may span several messages. All <code>Responses</code> to the same <code>Request</code> will have the same <code>requestID</code> as the <code>Request</code>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>timeMS</code></b>
</td>
<td>
you can optionally set <code>timeMS</code> on your <code>Requests</code> and it will be echoed back in the subsequent <code>Responses</code>. This allows you to determine the overall responsiveness or your server connection.<br>
</td>
</tr>

</table>

## The `Request` Base Class ##

The `Request` class has two other attributes beyond the `DMPMessage`:

<table width='820'>

<tr>
<td width='140' valign='top'>
<b><code>handlerID</code></b>
</td>
<td valign='top'>
is used to route responses back to the appropriate handler functions if you are using the Dark Matter GWT Communications mechanisms in your client.<br>
</td>
</tr>

<tr>
<td width='140' valign='top'>
<b><code>sessionID</code></b>
</td>
<td valign='top'>
is a session identifier provided by the server when you log in. Whether or not you use these mechanisms is up to you, but forcing the client to identify itself with an authenticated session identifier is a useful practice.<br>
<br>
Handling of session identifiers is provided as a standard part of the Dark Matter GWT Communications mechanisms.<br>
</td>
</tr>

</table>

## The `Response` Base Class ##

The `Response` class has a few more attributes that generally reflect the state of the response.

<table width='820'>

<tr>
<td width='140' valign='top'>
<b><code>handlerID</code></b>
</td>
<td valign='top'>
is just reflected back from the <code>Request</code>
</td>
</tr>

<tr>
<td width='140' valign='top'>
<b><code>responseType</code></b>
</td>
<td valign='top'>
GWT RPC provides its own indication of overall success or failure, but assuming that the request actually made it through, DMP allows you to indicate further granularity of feedback for a response.<br>
<table width='680'>

<tr>
<td width='160' valign='top'>
<b><code>SUCCESS</code></b>
</td>
<td>
the request generated a successful response.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>WARNING</code></b>
</td>
<td>
the request was successful but something was slightly amiss. If you indicate a warning, you should also provide some other useful information via <code>responseText</code>.<br>
</td>
</tr>

<tr>
<td width='100' valign='top'>
<b><code>ERROR</code></b>
</td>
<td>
something went wrong. Some other information should be provided in <code>responseText</code>.<br>
</td>
</tr>

<tr>
<td width='100' valign='top'>
<b><code>PROGRESSTEXT</code></b>
</td>
<td>
if a request is of indeterminate length in terms of response, you might want to provide feedback on its progress. If the percentage of completion can't be completed, you might provide a textual indication via the responseText.<br>
</td>
</tr>

<tr>
<td width='100' valign='top'>
<b><code>PROGRESSPERCENTAGE</code></b>
</td>
<td>
if a request is of indeterminate length in terms of response and you can calculate a percentage for completeness, you can send it via responseText.<br>
</td>
</tr>

</table>

</td>
</tr>

<tr>
<td width='140' valign='top'>
<b><code>responseText</code></b>
</td>
<td valign='top'>
is a holding place for error, warning and progress information (either text or percentage).<br>
</td>
</tr>

<tr>
<td width='140' valign='top'>
<b><code>responseCategory</code></b>
</td>
<td valign='top'>
is generally used to indicate a broad category of error if an error is encountered. The allowed values are <code>SOFTWARE</code>, <code>SECURITY</code>, <code>REPOSITORY</code>, <code>COMMS</code> and <code>OPERATIONAL</code>.<br>
</td>
</tr>

<tr>
<td width='140' valign='top'>
<b><code>lastResponse</code></b>
</td>
<td valign='top'>
is a flag to indicate if this response is the last one for a given request. Since DMP messages are asynchronous, this flag is important in situations where there can be many responses for a given request.<br>
</td>
</tr>

</table>