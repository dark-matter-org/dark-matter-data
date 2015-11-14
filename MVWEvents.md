# MVW Events #

MVW Events are just GWT Events, but there is a great deal of [buzz, buzz](http://www.shakespeare-navigators.com/hamlet/HamletNotes22.html#393) surrounding events and the latest approaches to GWT application architecture.

So, stepping back and looking at things in a generic way, here's the event architecture used by Model View Whatever.

## Basic Definition of Terms ##

When discussing MVW Events, the following terms will be used:

<table width='650'>

<tr>
<td width='150' valign='top'>
<b>Local Event</b>
</td>
<td valign='top'>
is an event that implies the definition of an event handler interface. It is expected that any component that wants to handle the event must implement the event handler interface.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>Broadcast Event</b>
</td>
<td valign='top'>
is an event that is broadcast on the Event Bus<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>Producer</b>
</td>
<td valign='top'>
fires events.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>Consumer</b>
</td>
<td valign='top'>
handles events.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>Prosumer</b>
</td>
<td valign='top'>
both fires and handles events.<br>
</td>
</tr>

</table>

So, the basic conceptual model of MVW Events is:

<img src='http://www.dark-matter-data.org/images/mvwEvents.png' />
