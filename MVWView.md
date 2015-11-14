# `View` #

The `View` definition allows you specify the event and data interface for a `View`.



<table width='600'>

<tr>
<td valign='top'> <img src='http://www.dark-matter-data.org/images/mandatorySV.png' />  </td>
<td width='120' valign='top'>
<b><code>viewName</code></b>
</td>

<td valign='top'>
The unique name of this view across all <code>Modules</code> that you compose to form a web application or a web site.<br>
</td>
</tr>

<tr>
<td valign='top'> <img src='http://www.dark-matter-data.org/images/optionalMV.png' />  </td>
<td valign='top'>
<b><code>displayData</code></b>
</td>

<td valign='top'>
indicates a type(s) of data to be presented in a <code>View</code>. The attribute takes the form:<br>
<pre><code>DMSClass SINGLE|MULTI varname<br>
</code></pre>
<ul><li>DMSClass is the name of a class defined via <a href='DMSOverview.md'>Dark Matter Schema</a>
</li><li><code>SINGLE</code> indicates a single object while <code>MULTI</code> indicates a set of objects<br>
</li><li><code>varname</code> indicates how the object is referred to in member functions and events</li></ul>

If you specified:<br>
<pre><code>Contact MULTI contacts<br>
</code></pre>
Your <code>View</code> interface would have these methods:<br>
<pre><code>public void setContacts(List&lt;Contact&gt; contacts);<br>
<br>
public List&lt;Contact&gt; getContacts();<br>
</code></pre>

If your view displays multiple objects of different types, simply specify multiple <code>displayData</code> values.<br>
<br>
</td>
</tr>


<tr>
<td valign='top'> <img src='http://www.dark-matter-data.org/images/optionalSV.png' />  </td>
<td valign='top'>
<b><code>selectEvent</code></b>
</td>

<td valign='top'>
indicates that you want your <code>View</code> to provide events related to the selection of data objects. The form of the attribute is:<br>
<pre><code>varname SINGLE|MULTI LOCAL|BROADCAST|BROADCASTONLY<br>
</code></pre>
<ul><li><code>varname</code> refers to a <code>varname</code> defined in one of your <code>displayData</code> specifications<br>
</li><li><code>SINGLE</code>|<code>MULTI</code> indicates if your selection mechanism supports single or multiple selections<br>
</li><li>and finally, the scope of the event. <code>LOCAL</code> indicates that there will be a method on the <code>Presenter</code> to accept the notification. <code>BROADCAST</code> indicates that a <code>GwtEvent</code> will be generated for the selection; the <code>Presenter</code> will receive the notification first and then the event will be broadcast on the <code>EventBus</code>. <code>BROADCASTONLY</code> indicates that the event will be passed through the <code>Presenter</code> implementation and directly to the <code>EventBus</code>; a <code>GwtEvent</code> is generated in this case as well.</li></ul>

Examples:<br>
<pre><code>contacts MULTI LOCAL<br>
</code></pre>

Generates a <code>Presenter</code> method:<br>
<pre><code>public void contactsSelected(List&lt;Contact&gt; contacts);<br>
</code></pre>

While the following:<br>
<pre><code>contacts MULTI BROADCAST<br>
</code></pre>

Generates a <code>GwtEvent</code> called <code>ContactsSelectedEvent</code> and a handler called <code>ContactsSelectedEventHandler</code>.  The event will have a constructor that takes a list of <code>Contact</code> and a method to retrieve this data.<br>
<br>
</td>
</tr>

<tr>
<td valign='top'> <img src='http://www.dark-matter-data.org/images/optionalSV.png' />  </td>
<td width='120' valign='top'>
<b><code>deleteEvent</code></b>
</td>

<td valign='top'>
indicates that you want your <code>View</code> to provide events related to the deletion of data objects. The attribute semantics are similar to the <code>selectEvent</code> attribute except that the generated events and interfaces will indicate that the object(s) where deleted rather than selected.<br>
</td>
</tr>


</table>