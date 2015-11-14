

# Type Definitions #


The `TypeDefinition` forms the heart of all data representation in Dark Matter and, whether or not you need to define your own types, deserves a bit of your attention. If you don't give a rat's ass about implementation related stuff, jump straight to the [Built in Types](WikiSyntax#Built_in_Types.md) section.



## Built in Types ##

The following types are defined as part of the Dark Matter metaschema.


### Basic Types ###

These should be pretty self explanatory.

<table width='820'>
<tr>
<td> <b>Boolean</b> </td>
<td> <code>java.lang.Boolean</code> </td>
</tr>

<tr>
<td> <b>Date</b> </td>
<td> <code>java.lang.Date</code> </td>
</tr>

<tr>
<td> <b>Double</b> </td>
<td> <code>java.lang.Double</code> </td>
</tr>

<tr>
<td> <b>Float</b> </td>
<td> <code>java.lang.Float</code> </td>
</tr>

<tr>
<td> <b>Integer</b> </td>
<td> <code>java.lang.Integer</code> </td>
</tr>

<tr>
<td> <b>Long</b> </td>
<td> <code>java.lang.Long</code> </td>
</tr>

<tr>
<td width='220'> <b>String</b> </td>
<td> <code>java.lang.String</code> </td>
</tr>

</table>


---

### Other Primitive Types ###

This section lists some types that are primitive in nature and used to support various various capabilities within the Dark Matter Framework. Many of these types are pretty esoteric, so don't worry if the reason for the type escapes you!
<table width='820'>

<tr>
<td width='220' valign='top'> <b><code>DmcObject</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.DmcObject</code>

When you want to hold values which are <a href='DMOOverview.md'>DMOs</a> themselves, you use the <code>DmcObject</code> type. This is used in places like the <a href='DMPGetRequest.md'>DMP Get Response</a> object to return a set of objects.<br>
</td>
</tr>

<tr>
<td valign='top'> <b><code>Modifier</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.type.Modifier</code>

One of the more interesting aspects of <a href='DMOOverview.md'>DMOs</a> is that they allow for recording of the changes that you make to them. Any operation that you can perform against the collection of attributes in a <a href='DMOOverview.md'>DMO</a> can be represented by a <code>Modifier</code>. See the <a href='DMPSetRequest.md'>Set Request</a> page for examples of how this type (used for the <code>modify</code> attribute.<br>
</td>
</tr>

<tr>
<td valign='top'> <b><code>NameContainer</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.NameContainer</code>

As discussed on the <a href='DMONaming.md'>DMO Naming</a> page, <a href='Name_Types.md'>Name Types</a> are specialized types that represent the names of <a href='DMOOverview.md'>DMOs</a>. When the names of things are transported, they have to maintain their identity because the actual implementation of the name is type specific. The <code>NameContainer</code> type provides this mechanism for holding a self described object name.<br>
<br>
As I said, some of these types are pretty esoteric, so if none of that made sense, check out places where the <code>NameContainer</code> type is used e.g. in <a href='DMPOverview.md'>Dark Matter Protocol</a> requests for the <code>target</code> attribute and for the <code>source</code> attribute in <a href='DMPEvent.md'>DMP Events</a>.<br>
</td>
</tr>

</table>


---

### Graphing/Plotting Types ###

Displaying data in charts is a fairly common operation in many applications and it's good to have some types that facilitate this activity.

<table width='820'>

<tr>
<td width='220' valign='top'> <b><code>LabelledIntegerDataPoint</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.LabelledIntegerDataPoint</code>

Need to populate a <a href='http://code.google.com/apis/visualization/documentation/gallery/piechart.html'>Pie Chart</a>? Then request a series of LabelledIntegerDataPoints. This is simple a label string followed by an integer value. A multi-valued attribute of this type called data series,might appear as follows in OIF form:<br>
<pre><code>dataSeries  Work 11<br>
dataSeries  Eat 2<br>
dataSeries  Commute 2<br>
dataSeries  Watch TV 2<br>
dataSeries  Sleep 7<br>
</code></pre>
</td>
</tr>

<tr>
<td valign='top'> <b><code>TimeDoubleDataPoint</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.TimeDoubleDataPoint</code>

Need to plot a series of values over time? The <code>TimeDoubleDataPoint</code> may be what you need. This type is very handy as well for providing ongoing updates to a chart since values may be removed from the trailing edge of the data series and added to leading edge.<br>
</td>
</tr>

</table>


---

### Name Types ###

[DMO Naming](DMONaming.md) is a fundamental concept in Dark Matter and, since naming is very application specific, these types are merely examples of naming mechanisms. All values associated name types must be derived from the [DmcObjectName](http://code.google.com/p/dark-matter-data/source/browse/trunk/%20dark-matter-data/dark-matter-data/src/org/dmd/dmc/DmcObjectName.java) class which provides a standard interface for all names.

Another standard base for naming is the `DmcHierarchicObjectName`. This is derived from `DmcObjectName` and adds the concept of being able to get the name of a parent object. This is especially useful when representing hierarchic data relationships.

<table width='820'>

<tr>
<td valign='top'> <b><code>DotName</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.DotName</code> derived from <code>DmcHierarchicObjectName</code>

Dot names are a fairly common naming mechanism that includes hierarchy in the structure of a name. The <code>DotName</code> type lets you easily represent names of this type. If you a name of the form <code>grandparent.parent.child</code>, calling <code>getParentName()</code> will return <code>grandparent.parent</code>, as you might expect.<br>
</td>
</tr>
<tr>
<td valign='top'> <b><code>IntegerName</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.IntegerName</code> derived from <code>DmcObjectName</code>

If you just need things numerically identified, the <code>IntegerName</code> may fit your needs. Nothing complex, just an Integer.<br>
</td>
</tr>
<tr>
<td width='220' valign='top'> <b><code>StringName</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.StringName</code> derived from <code>DmcObjectName</code>

At base, the <code>StringName</code> is just a String. It used as the basic naming mechanism for schema definitions and a variety of other configuration definitions.<br>
</td>
</tr>
<tr>
<td valign='top'> <b><code>UUIDName</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.UUIDName</code> derived from <code>DmcObjectName</code>

A common mechanism for uniquely naming objects is using <a href='http://en.wikipedia.org/wiki/Universally_unique_identifier'>UUIDs</a>. The <code>UUIDName</code> provides this mechanism in a GWT friendly way by using the <code>UUIDLite</code> type as its basis.<br>
</td>
</tr>
</table>


---

### Mapped Types ###

Mapped types are required if you want to create `HASHMAP` or 'TREEMAP` attributes. All mapped types implement the `DmcMappedAttributeIF` interface which allows the Dark Matter infrastructure to retrieve the key for a particular value.

All [DMO Names](DMONaming.md) are mapped types since `DmcObjectName` implements the `DmcMappedAttributeIF`.

All [DMO Object References](DMOReferences.md), which are generated automatically for named objects as part of the [DMO Generation Process](DMOGenerator.md) also implement this interface so that they can be stored in `MAPPED` attributes.

<table>

<tr>
<td width='220' valign='top'> <b><code>IntegerToBoolean</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.IntegerToBoolean</code> implements <code>DmcMappedAttributeIF</code>
</td>
</tr>

<tr>
<td valign='top'> <b><code>IntegerToString</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.IntegerToString</code> implements <code>DmcMappedAttributeIF</code>
</td>
</tr>

<tr>
<td valign='top'> <b><code>IntegerToUUIDLite</code></b> </td>
<td valign='top'> <code>org.dmd.dmc.types.IntegerToUUIDLite</code> implements <code>DmcMappedAttributeIF </code>
</td>
</tr>

</table>

## Defining Your Own Types ##

Defining your own types is a fairly straightforward exercise and involves 3 steps:

<table width='820'>

<tr>
<td width='20' valign='top'>
<b>1.</b>
</td>
<td valign='top'>
Create your value container/primitive type.<br>
<br>
<font color='#9E0B0F'>
<b>All aspects of your type must conform to the <a href='http://code.google.com/webtoolkit/doc/2.2/RefJreEmulation.html'>JRE Emulation</a> guidlelines.</b>
</font>

A decent example of a non-trivial type is the <a href='http://code.google.com/p/dark-matter-data/source/browse/trunk/%20dark-matter-data/dark-matter-data/src/org/dmd/dmc/types/UUIDLite.java'>UUIDLite</a> which just allows for use of UUIDs in a GWT context.<br>
<br>
The basic parts you need:<br>
<br>
<pre><code>// There's nothing special about the value container, but<br>
// it's good form to mark it as Serializable<br>
public class MyType extends implements Serializable {<br>
<br>
    // storage for whatever bits you need to store your type<br>
 <br>
    // Don't forget your zero arg constructor!<br>
    public MyType(){<br>
    }<br>
<br>
    // You should be able to instantiate your type from whatever<br>
    // basic bits you use to represent it<br>
    public MyType(args){<br>
       ...<br>
    }<br>
<br>
    // A clone constructor is useful to have <br>
    public MyType(MyType original){<br>
       ...<br>
    }<br>
<br>
    // A constructor that takes a String is useful, since all types must<br>
    // be representable as Strings and parsable from Strings. If the <br>
    // String contents don't satisfy you, throw an exception!<br>
    public MyType(String value) throws DmcValueException {<br>
        ...<br>
    }<br>
<br>
    // On the String theme - you should override toString() to produce<br>
    // the appropriate String representation of your type<br>
    @Override<br>
    public String toString(){<br>
        ...<br>
    }<br>
<br>
    // Not explicitly required, but useful<br>
    public int compareTo(Object obj) {<br>
    }<br>
<br>
    // Likewise, not explicitly required but useful<br>
    @Override<br>
    public boolean equals(Object object) {<br>
    }<br>
<br>
    // Support for serializing the type: see the Serialization page<br>
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {<br>
        ...<br>
    }<br>
<br>
    // Support for deserializing the type: see the Serialization page<br>
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {<br>
        ...<br>
    }<br>
<br>
}<br>
</code></pre>

Most of the aspects here are for the convenience of the enclosing <code>DmcType</code> described in the next section.<br>
<br>
The <a href='DMOSerialization.md'>Serialization</a> mechanisms are pretty straightforward and allow you to focus just on your little piece of the world i.e. the type you'll be serializing. The overall serialization/deserialization mechanism of complete objects is handled for you automatically by the Dark Matter Core classes.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>2.</b>
</td>
<td valign='top'>
Define your <code>DmcTypeMyType</code> class. Although you can name this class anything you like, the convention is to call it <code>DmcType[value container type]</code>.<br>
<br>
Another convention is that you define your types in a separate <code>types</code> folder in your shared code folder (since types are a shared resource). This makes it fairly clear where your <code>type</code> related code lives.<br>
<br>
<pre><code>src<br>
    com<br>
        example<br>
            client<br>
            server<br>
            shared<br>
                dmdconfig<br>
                    v0dot1<br>
                       myschema.dms<br>
                types<br>
                    DmcTypeMyType.java<br>
                    MyType.java<br>
<br>
</code></pre>

All <code>DmcType</code> implementations are derived from the parameterized base type <code>DmcAttribute</code> and are <code>abstract</code>.<br>
<br>
Your class definition will appear as follows:<br>
<br>
<pre><code>@SuppressWarnings("serial")<br>
abstract public class DmcTypeMyType extends DmcAttribute&lt;MyType&gt; implements Serializable {<br>
	<br>
	// The obligatory zero arg constructor.<br>
	public DmcTypeMyType(){<br>
	}<br>
	<br>
        // This constructor is mandatory and passes required information to the DmcAttribute<br>
	public DmcTypeMyType(DmcAttributeInfo ai){<br>
		super(ai);<br>
	}<br>
</code></pre>

Nothing complicated here, the class is abstract, it extends <code>DmcAttribute</code> and has a couple of constructors; that's it.<br>
<br>
The next portion is a little more interesting, but still straight forward:<br>
<br>
<pre><code>    @Override<br>
    public MyType typeCheck(Object value) throws DmcValueException {<br>
        MyType rc = null;<br>
		<br>
        if (value instanceof MyType)<br>
            rc = (MyType)value;<br>
        else if (value instanceof String)<br>
            rc = new MyType((String)value);<br>
        else<br>
            throw(new DmcValueException("Useful error message");<br>
        return(rc);<br>
    }<br>
</code></pre>

The <code>typeCheck</code> method provides a basic mechanism for verifying that a value passed in for an attribute of the specified type conforms to that type. If it does, it passes back a value of the required type. If not, a <code>DmcValueException</code> should be thrown.<br>
<br>
The next part just allows for a standard deep cloning mechanism on <code>DmcObject</code> i.e the <code>cloneIt()</code> method. This is where the standard clone constructor on your primitive type comes in handy!<br>
<br>
<pre><code>    @Override<br>
    public MyType cloneValue(MyType original) {<br>
        return(new MyType(original));<br>
    }<br>
</code></pre>

And finally, support for serialization/deserialization, which, if you followed the basic layout for a value container, is quite straight forward.<br>
<br>
<pre><code>        <br>
    /**<br>
     * Write a MyType.<br>
     * @param dos The output stream.<br>
     * @param value The value to be serialized.<br>
     * @throws Exception<br>
     */<br>
    public void serializeValue(DmcOutputStreamIF dos, MyTypevalue) throws Exception {<br>
        value.serializeIt(dos);<br>
    }<br>
<br>
    /**<br>
     * Read a MyType.<br>
     * @param dis the input stream.<br>
     * @return A value read from the input stream.<br>
     * @throws Exception<br>
     */<br>
    public MyType deserializeValue(DmcInputStreamIF dis) throws Exception {<br>
    	MyType rc = new MyType();<br>
        rc.deserializeIt(dis);<br>
        return(rc);<br>
    }<br>
<br>
</code></pre>


</td>
</tr>

<tr>
<td valign='top'>
<b>3.</b>
</td>
<td valign='top'>
So, all of the hard work is done.<br>
<br>
Now you just need to define the type in your <a href='DMSOverview.md'>Schema</a>, as follows:<br>
<br>
<pre><code>TypeDefinition<br>
name 		MyType<br>
typeClassName	com.example.shared.types.DmcTypeMyType<br>
primitiveType   org.example.shared.types.MyType<br>
description	The MyType lets me store what I want.<br>
</code></pre>
</td>
</tr>

</table>