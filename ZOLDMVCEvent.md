# The `MvcEvent` Definition #

The `MvcEvent` Definition is one of the primary aspects of the DM-MVC mechanisms, since all Events that are generated or handled by [Controllers](MVCController.md) or [Views](MVCView.md) must be explicitly defined.

The `MvcEvent` has the following attributes:

<table width='820'>

<tr>
<td width='180' valign='top'>
<b><code>name</code></b>
</td>
<td valign='top'>
the name of this event. This name should be a <a href='http://en.wikipedia.org/wiki/CamelCase'>camelCase</a>, globally unique name for your event. Since this name is actually embedded in code, don't use anything other than <code>[a-z][A-Z]</code> characters.<br>
<br>
If you are dealing with large numbers of events and are afraid of overlapping names, you may want to use a convention of using a standard prefix on event names defined in related DM-MVC configurations.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>description</code></b>
</td>
<td valign='top'>
a useful indication of when the Event indicates has happened. No need to be long winded, since the event name should be descriptive enough in most cases.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>userDataType</code></b>
</td>
<td valign='top'>
In ExtGWT, Events can also have user data associated with them. That is, you would call <code>Dispatcher.forwardEvent(AppEvents.Init, someuserData)</code>.<br>
<br>
By specifying userDataType, the DM-MVC Generator will create appropriately typed convenience functions to forward and receive the event and its user data.<br>
<br>
The value for this attribute should be the fully qualified name of the class you're passing with the event. for example:<br>
<pre><code>com.example.client.feature1.util.SomeData<br>
</code></pre>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>userDataCollection</code></b>
</td>
<td valign='top'>
if you wish to pass a collection of <code>userDataType</code> in your event, this is the fully qualified class name of collection you want to use. If want wanted to pass on an <code>ArrayList</code> of <code>SomeData</code>, you would specify:<br>
<pre><code>userDataType       com.example.client.feature1.util.SomeData<br>
userDataCollection java.util.ArrayList<br>
</code></pre>

This would indicate that an <code>ArrayList&lt;SomeData&gt;</code> would be passed along with the event.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>userDataGenericSpec</code></b>
</td>
<td valign='top'>
allows you specify the e=generic arguments for more complex types of collections, for example HashMaps. If you wanted to send along a HashMap of SomeData keyed on a String, you would specify:<br>
<pre><code>userDataType        com.example.client.feature1.util.SomeData<br>
userDataCollection  java.util.HashMap<br>
userDataGenericSpec &lt;String,SomeData&gt;<br>
</code></pre>

this would indicate that a <code>HashMap&lt;String,SomeData&gt;</code> would be passed along withe the event.<br>
</td>
</tr>

</table>

## Example MvcEvent Definition ##

```
MvcEvent
name        f1AddThingButtonPressed
description Sent when the user wants to add a thing to the sytem.
```