# Class Definitions #

Okay. You've had to wade through some preliminary stuff to get here, but here's where that effort begins to pay off; `ClassDefinitions` are the starting point for the [generation of Dark Matter Objects](DMOGenerator.md).

We're going to start simple and work up from there. Here's the basic form of a `ClassDefinition`:

```
ClassDefinition
name
classType    (the type of class)
derivedFrom  (reference to another class definition)
isNamedBy    (the naming attribute)
must[]       (attributes that must exist for the whole object to be valid)
may[]        (attributes that may exist on the class)
```

<table width='820'>

<tr>
<td width='120' valign='top'>
<b><code>name</code></b>
</td>
<td>
the name of the class. The convention is that it should start with a capital letter and be camel case thereafter. If the class was named <code>MyClass</code>, the associated <a href='DMOOverview.md'>DMO</a> would be <code>MyClassDMO</code>.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>classType</code></b>
</td>
<td>
the class type value comes from the <code>ClassTypeEnum</code> which allows for the following types:<br>
<table>

<tr>
<td width='100' valign='top'>
<code>STRUCTURAL</code>
</td>
<td>
a structural class is your standard Java class that can be instantiated<br>
</td>
</tr>
<tr>
<td width='100' valign='top'>
<code>ABSTRACT</code>
</td>
<td>
this indicates an abstract class, as you might expect<br>
</td>
</tr>
<tr>
<td width='100' valign='top'>
<code>AUXILIARY</code>
</td>
<td>
and then there's auxiliary which, if you're not familiar with <a href='https://www.opends.org/wiki/page/UnderstandingObjectClasses#section-UnderstandingObjectClasses-ObjectClassKinds'>kinds of LDAP Objects</a> you've probably never heard of. Auxiliary classes are one of the most powerful mechanisms available to support application extensibility of existing objects.<br>
<br>
An auxiliary class allows you decorate an existing object with additional attributes required to support some additional functionality you're adding to an existing system. It is discussed further on the <a href='DMSAuxiliaryClasses.md'>Auxiliary Classes</a> page.<br>
</td>
</tr>
</table>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>derivedFrom</code></b>
</td>
<td>
indicates the name of a <code>ClassDefinition</code> from which this class is derived.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>isNamedBy</code></b>
</td>
<td>
indicates the name of the naming attribute if this is a named object. All naming attribute are derived from <code>DmcObjectName</code> and have some special characteristics. Please read the <a href='DMONaming.md'>DMO Naming</a> page for more details on object naming.<br>
</td>
</tr><tr>
<td valign='top'>
<b><code>must</code></b>
</td>
<td>
a multi-valued list of attributes that must exist in the object if it is to be considered valid.<br>
</td>
</tr><tr>
<td valign='top'>
<b><code>may</code></b>
</td>
<td>
a multi-valued list of attributes that are optional to the object.<br>
</td>
</tr>

</table>

## An Example Class Definition ##

Examples of using Dark Matter are provided in several different projects, including dark-matter-stock. Here's part of the Stock class:

```
ClassDefinition
name       Stock
classType  STRUCTURAL
isNamedBy  stockName
must       stockName
must       stockCode
must       companyName
must       ISIN
may        stockNews   
```

After all of the other configuration for [types](DMSTypeDefinition.md), [enums](DMSEnumDefinition.md) and [attributes](DMSAttributeDefinition.md), is all seems somewhat anti-climactic doesn't it?

However, that's more or less the point. Once you've specified a `ClassDefinition` you can start generating code with the [DMO Generator](DMOGenerator.md).