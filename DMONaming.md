

# The Naming of Dark Matter Objects #

Object naming is a crucial aspect of [DMOs](DMOOverview.md) and this page gives you an overview of what you need to know.

## Object Identification is Application Specific ##

This is probably an obvious generality, but it has a big impact on any framework that labels itself as flexible or extensible; and Dark Matter would like to label itself as both!

Often, framework or infrastructure projects take the easy way out by indicating that object names can be Integers or Strings, and while any object naming scheme is likely representable as a String, that doesn't make it easy to take advantage of the information that can actually be embedded in the name. You'll often see utility classes or methods that are designed to pull apart names to get at that additional information, but if you're dealing with a set of heterogeneous objects that have different naming mechanisms, this approach can be error prone and messy.

So what's a framework designer to do?

## Make Names a Distinct Type: `DmcObjectName` ##

Dark Matter approaches this issue by defining a base type from which all forms of object names are derived, [DmcObjectName](http://code.google.com/p/dark-matter-data/source/browse/trunk/%20dark-matter-data/dark-matter-data/src/org/dmd/dmc/DmcObjectName.java).

Now at first, this may seem restrictive, but because your derived type can take any form you need it to and because you are free to mix different name types together in the same application, you have ultimate freedom. If you want straight String or Integer names, the built in `StringName` and `IntegerName` types have you covered. If you want names based on [UUIDs](http://en.wikipedia.org/wiki/Universally_unique_identifier), you can use the `UUIDName` type.

However, lets says you want to represent containment hierarchy in your names and provide methods to traverse the hierarchy; well, you can do that by deriving from `DmcHierarchicObjectName` and providing the functionality you need to make it happen.

A variety of [built in name types](http://code.google.com/p/dark-matter-data/wiki/DMSTypeDefinition#Name_Types) have been defined.

## Defining Named Objects in the Dark Matter Schema ##

Dark Matter Objects can be named, or not, it depends on how you intend to use them. If an object class is going to have a name, you indicate this via its [ClassDefinition](DMSClassDefinition.md) as follows:

```
ClassDefinition
name      Stock
isNamedBy isinName
must      isinName
...
```

The `isNamedBy` attribute is a reference to an [AttributeDefinition](DMSAttributeDefinition.md), `isinName`. All naming attributes are special. Why and how they are special is discussed in the [Defining Your Own Name Types](#Defining_Your_Own_Name_Types.md) section.

For now, it's enough to understand that there's a "must have" attribute called `isinName` that will uniquely identify instances of the `Stock` class.

By the way ISIN refers to the [International Securities Identification Number](http://en.wikipedia.org/wiki/International_Securities_Identification_Number) of things like bonds, stocks etc.

## `isNamedBy` and Named Object References ##

By specifying that your class `isNamedBy` an attribute, you trigger some additional code generation in Dark Matter. It results in the creation of a DmcNamedObjectREF derivative, which is a base type that allows you to easily define references between objects. These references can exist in both resolved and unresolved states i.e. if they are resolved, you can immediately access the object that is referred to. When the reference is unresolved, it contains just the name of the object to which it's referring.

## Name Support in the Dark Matter Protocol ##

The primary message types associated with the [Dark Matter Protocol](DMPOverview.md) are based on the use of named objects. Likewise, the [DMPEvent](DMPEvent.md) contains a `source` attribute that indicates the name of the object that caused a particular event.

So, if you intend to use the [Dark Matter Protocol](DMPOverview.md) you will become very familiar with object naming.

## Defining Your Own Name Types ##

Defining your own name types is fairly straight forward, but there are a few steps you have to follow to make it all fit together.

<table width='820'>

<tr>
<td width='20' valign='top'>
<b>1.</b>
</td>
<td valign='top'>
Define your primitive name type (see <a href='http://code.google.com/p/dark-matter-data/source/browse/trunk/%20dark-matter-data/dark-matter-data/src/org/dmd/dmc/types/IntegerName.java'>IntegerName</a> for a simple example).<br>
<br>
The important aspects to note are that you must derive from <code>DmcObjectName</code> and implement <code>Serializable</code> for example:<br>
<br>
<pre><code>public class MyName extends DmcObjectName implements Serializable {<br>
<br>
    // You will need this to pass back from the getNameClass() function<br>
    // which is required by DmcObjectName<br>
    public final static String className = "MyName";<br>
<br>
    // storage for whatever bits you need to store your name<br>
 <br>
    // Don't forget your zero arg constructor!<br>
    public MyName(){<br>
    }<br>
<br>
    // You should be able to instantiate your name from whatever<br>
    // basic bits you use to represent it<br>
    public MyName(args){<br>
       ...<br>
    }<br>
<br>
    // A clone constructor is useful to have <br>
    public MyName(MyName original){<br>
       ...<br>
    }<br>
<br>
    // And then there will be a bunch of overridden methods to satisfy DmcObjectName<br>
<br>
}<br>
</code></pre>

</td>
</tr>

<tr>
<td valign='top'>
<b>2.</b>
</td>
<td valign='top'>
Define your <code>DmcTypeMyName</code> object. Again, see the <a href='http://code.google.com/p/dark-matter-data/source/browse/trunk/%20dark-matter-data/dark-matter-data/src/org/dmd/dmc/types/DmcTypeIntegerName.java'>DmcTypeIntegerName.java</a> for a simple example.<br>
<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>3.</b>
</td>
<td valign='top'>
Add the new type to your <a href='DMSOverview.md'>Dark Matter Schema</a> type definitions. The definition will resemble the following:<br>
<br>
<pre><code>TypeDefinition<br>
name		MyName<br>
typeClassName	com.mine.types.DmcTypeMyName<br>
primitiveType	com.mine.types.MyName<br>
isNameType	true<br>
description     The MyName type is specially designed to name my things!<br>
</code></pre>
</td>
</tr>

<tr>
<td valign='top'>
<b>4.</b>
</td>
<td valign='top'>
And finally, create the attribute that you will use in your <code>isNamedBy</code> attribute on classes that are named by this name type:<br>
<br>
<pre><code>AttributeDefinition<br>
name                    myName<br>
dmdID		        2<br>
type                    MyName<br>
designatedNameAttribute true<br>
description             The myName attribute is used to name my things!<br>
</code></pre>
</td>
</tr>

</table>