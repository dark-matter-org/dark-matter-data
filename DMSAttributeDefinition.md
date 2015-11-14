

# Attribute Definitions #

The `AttributeDefinition` allows you to define named attributes that will be included in [Class Definitions](DMSClassDefinition.md), the next step in your schema specification. By defining the attributes separately, you can reuse attributes in many objects.

```
AttributeDefinition
name             <unique name>
type             <defined type reference>
dmdID            <unique identifier>
valuetype        <cardinality>
nullReturnValue  <a value appropriate to the type>
```

<table width='820'>
<tr>
<td width='135' valign='top'>
<b><code>name</code></b>
</td>
<td>
indicates the unique name of this attribute across all schemas that you eventually wind up using in your application.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>type</code></b>
</td>
<td>
this is a reference to one of the <a href='DMSTypeDefinition#Built_in_Types.md'>built in types</a> or one that you've defined as part of your schema.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>dmdID</code></b>
</td>
<td>
the unique identifier for this attribute within your schema. The identifier base (<code>schemaBaseID</code>) and range (<code>schemaIDRange</code>) for your schema are defined as part of the [<a href='DMSSchemaDefinition#An_Example_Schema_Definition.md'>DMSSchemaDefinition#An_Example_Schema_Definition</a> <code>SchemaDefinition</code>.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>valueType</code></b>
</td>
<td>
indicates the cardinality and organization of the attribute values; this is based on the <code>ValueTypeEnum</code>. The allowable values are:<br>
<table>

<tr>
<td width='100'>
<code>SINGLE</code>
</td>
<td>
a single value<br>
</td>
</tr>

<tr>
<td>
<code>MULTI</code>
</td>
<td>
an <code>ArrayList</code> of values<br>
</td>
</tr>

<tr>
<td valign='top'>
<code>HASHMAPPED</code>
</td>
<td>
a <code>HashMap</code> of values. The primitive value must implement the <code>DmcMappedAttributeIF</code> interface and the <code>TypeDefinition</code> must indicate the <code>keyClass</code>.<br>
</td>
</tr>

<tr>
<td>
<code>TREEMAPPED</code>
</td>
<td>
a <code>TreeMap</code> of values, in case you want the values in sorted order.<br>
</td>
</tr>

<tr>
<td>
<code>HASHSET</code>
</td>
<td>
a <code>HashSet</code> of values.<br>
</td>
</tr>

<tr>
<td>
<code>TREESET</code>
</td>
<td>
a <code>TreeSet</code> of values, in case you want the values in sorted order.<br>
</td>
</tr>
</table>

</td>
</tr>

<tr>
<td valign='top'>
<b><code>nullReturnValue</code></b>
</td>
<td>
in cases where you'd like to always have a value for an attribute, you can specify a null return value. This is only applicable to single-valued attributes.<br>
<br>
Now some might say, "Why don't you just have an attribute initialization mechanism?". Well, I guess we could, but why bother assigning storage and transporting a value around when we don't need to? This way, the <code>getter()</code> method on the [<a href='DMOOverview.md'>DMO</a> just checks to see if the attribute exists and, if not, returns the <code>nullReturnValue</code>.<br>
</td>
</tr>
<tr>
<td valign='top'>
<b><code>description</code></b>
</td>
<td>
a description of the attribute, possibly including its semantics.<br>
</td>
</tr>

</table>


## Single-valued Attributes ##

Below is an example of a single-valued attribute definition:

```
AttributeDefinition
name        stockSymbol
type        String
dmdID       1
description The registered stock symbol for stock in a company.
```

This is about the simplest `AttributeDefinition` you can have. It indicates a `name` for the attribute, a `type` (from one of the [built in types](DMSTypeDefinition#Built_in_Types.md) or from your own type definitions, a unique identifier (within this schema) and a `description` (which is optional).

You'll notice that we don't specify `valueType SINGLE`. That's because the `nullReturnValue` for the `ValueTypeEnum` type is `SINGLE`.

When the [DMO](DMOOverview.md) is generated for this attribute, the following getters/setters will be generated:

  * `setStockSymbol(Object value) throws DmcValueException`
  * `setStockSymbol(String value)`
  * `String getStockSymbol()`

## MULTI Attributes ##

There are several different types of multi-valued attributes; this is indicated by the `valueType` attribute of the `AttributeDefinition`. Here's a definition for a multi-valued Integer attribute:

```
AttributeDefinition
name        intArray
type        Integer
valueType   MULTI
description An array if integers that blah, blah ,blah
```

All defined types can exist as single-valued or multi-valued attributes.

When the [DMO](DMOOverview.md) is generated for this attribute, the following methods will be generated:

  * `addIntArray(Object value) throws DmcValueException`
  * `addIntArray(Integer value)`
  * `Iterator<Integer> getIntArray()`

## `HASHMAPPED` & `TREEMAPPED` Attributes ##

An example of a `TREEMAPPED` attribute:

```
AttributeDefinition
name        intToString
type        IntegerToString
valueType   TREEMAPPED
description Maps a set of integer values to their String equivalents.
```

When the [DMO](DMOOverview.md) is generated for this attribute, the following methods will be generated:

  * `addIntToString(Object value) throws DmcValueException`
  * `addIntToString(Integer value)`
  * `Iterator<Integer> getIntToString()`

Now, since this is a mapped type, you might be wondering, "Where's the key for value?". Well, it's built in to the value itself and that's why values that are stored in mapped attributes have to implement the `DmcMappedAttributeIF`, which implies that the value has a getKey() method.

## `HASHSET` & `TREESET` Attributes ##

An example of a `HASHSET` attribute:

```
AttributeDefinition
name        myAliases
type        String
valueType   HASHSET
description A set of pseudonyms by which you may refer to me.
```

When the [DMO](DMOOverview.md) is generated for this attribute, the following methods will be generated:

  * `addMyAliases(Object value) throws DmcValueException`
  * `addMyAliases(String value)`
  * `Iterator<Integer> getMyAliases()`

And obviously, the attribute follows SET semantics; no duplicate values allowed.

## A Note About Single-valued Boolean Attributes ##

The getters generated on DMOs for attributes usually take the form `get[attrname]()`, as indicated previously. For single-valued Boolean attributes, however, things are slightly different:

```
AttributeDefinition
name        fabulous
type        Boolean
description A flag to indicate if something is fabulous.
```

The getters/setters will appear as:

  * `setFabulous(Object value) throws DmcValueException`
  * `setFabulous(Boolean value)`
  * `isFabulous()`

So the "getter" is `isFabulous()`. Having things this way just makes code a bit more readable.