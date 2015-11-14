

# Dark Matter: How does it relate to GWT? #

That depends.

I guess I sound like a politician or a lawyer with that remark, but it is entirely truthful. The next few sections should clarify the statement.

## Conformance with GWT JRE Emulation ##

There is nothing in the Dark Matter Core (DMC) classes that has any direct dependence on any Google Web Toolkit related concepts, but all DMC classes and all `DmcType` derivatives (the basis for all attribute types) are intended to conform to the [JRE Emulation](http://code.google.com/webtoolkit/doc/2.2/RefJreEmulation.html) guidelines.

By following these guidelines for the classes that you use as the `primitiveType` in your [TypeDefinitions](DMSTypeDefinition.md), you make your code easily usable in both full Java and GWT operational contexts.

Now, if you don't intend to use [Dark Matter](DMDOverview.md) concepts in conjunction with GWT, feel free to do whatever you want in your base types.

## Support for Base GWT Concepts ##

The next few sections indicate how Dark Matter relates to some specific GWT concepts.

### GWT RPC ###

If you follow the [JRE Emulation](http://code.google.com/webtoolkit/doc/2.2/RefJreEmulation.html) guidelines, all [DMOs](DMOOverview.md) are usable by themselves or in conjunction with the [Dark Matter Protocol](DMPOverview.md) via the [GWT RPC](http://code.google.com/webtoolkit/doc/latest/tutorial/RPC.html) mechanisms.

If you use only [built in types](DMSTypeDefinition#Built_in_Types.md) when defining your [ClassDefinitions](DMSClassDefinition.md) you are guaranteed that your objects will function properly with GWT RPC.

If you ensure that your own types are in accordance with the JRE Emulation guidelines and have **zero arg constructors** (which is the most common oversight when dealing with GWT RPC) then, likewise everything will just work with GWT RPC.

By generating your [POJOs](http://en.wikipedia.org/wiki/Plain_Old_Java_Object) using the [DMO Generator](DMOGenerator.md) you remove one more possibility that something will be forgotten and cause your GWT RPC communications to silently fail.

### GWT MVP ###

Coming soon.

### GWT `RequestFactory` ###

Coming soon.

## Support for `ExtGWT` Concepts ##

The next few sections indicate how Dark Matter relates to Sencha's `ExtGWT` toolkit, aka GXT.

### MVC ###