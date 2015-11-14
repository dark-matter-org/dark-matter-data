<table border='0'>


<tr>

<td cellpadding='5' width='120' valign='top'>
<img src='http://www.dark-matter-data.org/images/dmd-100x100.png' />
</td>

<td valign='top'>
<font color='#6A6A6A'>
<h1>Dark Matter Data</h1>
</font>
<br>
<br>
<br>

<h2>Web Applications vs Web Sites</h2>
The current landscape of web application development is vast and confusing, with a wide variety of choices as to how to proceed with that development. I've chosen the term <font color='#9E0B0F'> <b>web application development</b> </font> as being distinct from <font color='#9E0B0F'> <b>web site development</b> </font> which is, I believe, a very different undertaking. Many frameworks already exist that support the rapid development of web sites and maintenance of their content; Dark Matter does not directly relate to web site development.<br>
<br>
Instead, the Dark Matter Data project addresses the development of data management applications that run within a web browser (and in full Java clients). These applications tend to support a different usage paradigm than standard websites and tend to behave more like desktop applications than a series of distinct web pages.<br>
<br>
Although the concepts presented here can be used piecemeal to support traditional web page development that makes use of embedded GWT widgets, the real power of the framework derives from its ability to provide overall structure for more complex web applications.<br>
<br>
<h2>It Starts with a Model</h2>
So much attention is focused on the <a href='http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html'>MVP</a>/<a href='http://vesprogstuff.wordpress.com/2010/03/19/ext-gwt-mvc-pattern-explained/'>MVC</a> aspects of applications, whereas the handling of data (the model) is mentioned as an afterthought. This is despite the fact that the presentation and manipulation of data is the primary reason for the existence of the user interface.<br>
<br>
The Dark Matter Data project addresses this disparity by defining a <a href='DMSOverview.md'>schema</a> driven framework that provides a consistent, easy to understand  mechanism for defining your data model, <a href='DMOGenerator.md'>generating Java objects</a> that represent that data and a <a href='DMPOverview.md'>standard protocol</a> for Creating, Retrieving, Updating, Deleting and receiving Events about those objects.<br>
<br>
Instead of just <a href='http://en.wikipedia.org/wiki/Create,_read,_update_and_delete'>CRUD</a>, one might say you get <font color='#9E0B0F'> CRUDE </font><b>, where the E stands for Events.</b>

And we all understand how valuable crude is these days.<br>
<br>
<h2>Beyond DTOs: Context is Everything</h2>

If Dark Matter were simply another rehash of the <a href='http://java.sun.com/blueprints/corej2eepatterns/Patterns/TransferObject.html'>Transfer Object Pattern</a>, there would be little added value. But Dark Matter goes beyond the basic Data Transfer Object (DTO) mechanisms by providing ways to use <a href='DMOOverview.md'>Dark Matter Objects</a> (DMOs) in different operational contexts and to extend the DMOs with behaviour that is appropriate to the given context.<br>
<br>
By "operational context" here, I mean that you can use DMOs in a Java server implementation, in a Java client, in a GWT-based browser application or any other context where Java is supported. The difference between Dark Matter and most other frameworks is that you can add behavior to your DMOs in each of these contexts by using the <a href='DMWOverview.md'>Dark Matter Wrapper</a> (DMW) concepts provided by the framework.<br>
<br>
Since each context has its own limitations/advantages, this means that you can tailor the behavioral aspects of your objects to their environment without polluting the data representation. By using the standardized (but extensible) <a href='DMPOverview.md'>Dark Matter Protocol</a> (DMP) all communications associated with your CRUDE interactions can take place between your various operational contexts.<br>
<br>
<table width='100%' border='0'>
<blockquote><tr align='center'>
<blockquote><td>
<blockquote><img src='http://dark-matter-data.org/images/dmoOverview.png' />
</blockquote></td>
</blockquote></tr>
</table></blockquote>

<h2>How to proceed?</h2>

Everyone has a different approach to learning new concepts; and Dark Matter Data definitely has some new concepts.<br>
<br>
If you're a "hands-on" sort, you might start with the <a href='http://code.google.com/p/dark-matter-data/wiki/EXTheContactsExample'>The Contacts Example</a> which presents the use of Dark Matter in recreating the functionality presented in <a href='http://code.google.com/webtoolkit/articles/mvp-architecture.html'>Large scale application development and MVP</a>. We start from scratch and put a lot more meat on the bones of the original Contacts example. Along the way, you get to see many of the features of Dark Matter.<br>
<br>
If you're approach to learning is more conceptual, you might want to start with <a href='DMOOverview.md'>Dark Matter Objects</a> and how to <a href='DMOGenerator.md'>generate them</a> and then move on to <a href='DMSOverview.md'>schema definition</a> where we discuss the basics of schema driving your applications. After that you might want to look at the <a href='DMPOverview.md'>Dark Matter Protocol</a> that supports the CRUDE operations we talked about earlier.<br>
<br>
Either way, I hope that this open-source project is of some use to you.<br>
<br>
<br>
<br>
<a href='Hidden comment: 
These tags should be here, but the page complains if they are left here


Unknown end tag for </td>




Unknown end tag for </tr>





Unknown end tag for </table>



'></a>