

# The `ContactDMO` Object #

Okay.

So, you've just specified a simple schema and generated some stuff.

What have you gotten for it?

Well, you now have the `ContactDMO` object that we'll use throughout the rest of this example.

It has all of the basic characteristics of a [Dark Matter Object](DMOOverview.md), but we'll just look at three of these for now:

  * standard presentation in [Object Instance Format](http://code.google.com/p/dark-matter-data/wiki/DMOOverview#Object_Instance_Format)
  * the ability to record modifications made to it
  * the ability to [slice](DMOSlice.md) the object i.e. take a subset of its attributes

## `ContactDMO` in OIF Format ##

There's really not a lot to say about [Object Instance Format](http://code.google.com/p/dark-matter-data/wiki/DMOOverview#Object_Instance_Format), other than it's very handy for debug purposes and can be used for all [DMOs](DMOOverview.md).

When you realize that everything you do with the Dark Matter Framework can be displayed as OIF, you'll begin to appreciate it; if you don't already.

You'll really appreciate it when you realize that all [Dark Matter Protocol (DMP)](DMPOverview.md) interactions can also be displayed in this way; we'll get into DMP a little later in this example.

For now, realize that writing some code like this...

```
ContactDMO contact = new ContactDMO();
		
contact.setUuidName(getUUIDName());
contact.setFirstName("Hollie");
contact.setLastName("Voss");
contact.addUrlCE("http://example.com");
contact.addUrlCE("http://contacts.com");
contact.setBirthdayCE("19750804:000000");
contact.setEmailCE("holliev@example.com");
contact.setMiddleName("Margeurite");
contact.setNickName("vossie");
contact.setNotesCE("Kids are Jason and Amanda");
contact.setPhoneNumberCE("555-793-1212");
contact.setPrefixCE("Dr.");

System.out.println(contact);
```

gets you this...

```
Contact
birthdayCE      19750804:000000
emailCE         holliev@example.com
firstName       Hollie
lastName        Voss
middleName      Margeurite
nickName        vossie
notesCE         Kids are Jason and Amanda
phoneNumberCE   555-793-1212
prefixCE        Dr.
urlCE           http://example.com
urlCE           http://contacts.com
uuidName        f9e8fd62-7242-472c-8665-66c4397f616a
```

# Modification Recording #

Okay. Now I'm jumping ahead a bit, since this next capability comes into play when dealing with Views that alter data, communicating those changes to the server via [DMP](DMPOverview.md) and sending events about those modifications via [DMP Events](DMPEvent.md).

However, if you haven't yet been convinced that Dark Matter can save you time and effort, maybe modification recording will change your mind.

## The gwteventservice ##

If you've actually been following along and building the project, you'll need to grab an additional jar at this point; this is the [gwteventservice](http://code.google.com/p/gwteventservice/). Head over to its [download page](http://code.google.com/p/gwteventservice/downloads/list) and grab the `gwteventservice-1.1.1-core.zip` file.

Unzip it and add the `gwteventservice-1.1.1.jar` to your build path.

## Using a Modification Recorder ##

We'll start with the same object that we created for the OIF example, except that this time, we're going record the changes we make to the object:

```
ContactDMO contact = new ContactDMO();
		
contact.setUuidName(getUUIDName());
contact.setFirstName("Hollie");
contact.setLastName("Voss");
contact.addUrlCE("http://example.com");
contact.addUrlCE("http://contacts.com");
contact.setBirthdayCE("19750804:000000");
contact.setEmailCE("holliev@example.com");
contact.setMiddleName("Margeurite");
contact.setNickName("vossie");
contact.setTitleAndCompany("VP of Marketing at Examples");
contact.setNotesCE("Kids are Jason and Amanda");
contact.setPhoneNumberCE("555-793-1212");
contact.setPrefixCE("Dr.");

System.out.println(contact);

ContactDMO modrec = contact.getModificationRecorder();
		
modrec.setNickName("voster");
modrec.setTitleAndCompany("CEO of Bigger and Better");
modrec.setPhoneNumberCE("555-504-5656");
modrec.remUrlCE();
modrec.addUrlCE("http://www.bigger-better.com");
		
SetRequest request = new SetRequest();
request.setTarget(modrec.getObjectName());
request.setModify(modrec.getModifier());
		
System.out.println(request);
```

The line of interest here is
```
ContactDMO modrec = contact.getModificationRecorder();
```
What this gives us is another `ContactDMO` with the same object name (stored in the `uuidName` attribute) as the original contact instance for Hollie Voss.

Hollie has been on the way up in the world and several things have changed with her contact information. We go ahead and makes those changes to `modrec` - short for modification recorder. Note: there's nothing magic about the name, you can call the thing you get back from `getModificationRecorder()` anything you want.

## Creating a `SetRequest` with your Modificiations ##

Next (jumping ahead a bit to [DMP](DMPOverview.md) related stuff) we create a [SetRequest](DMPSet.md):
```
SetRequest request = new SetRequest();
request.setTarget(contact.getObjectName());
request.setModify(modrec.getModifier());
```
We set the target of the request to be the object name of the Contact - all named objects overload the `getObjectName()` method to return the attribute specified in their [ClassDefinition](DMSClassDefinition.md) by the [isNamedByAttribute](http://code.google.com/p/dark-matter-data/wiki/DMONaming#isNamedBy_and_Named_Object_References), in this case the `uuidName` attribute.

And then, we indicate the changes that we've recorded in the `modrec` by setting the `modify` attribute of the `SetRequest` with the modifier (a specialized attribute type) from the `modrec`.

When the `SetRequest` is dumped, here's what it looks like:

```
SetRequest
modify   nickName SET voster
modify   titleAndCompany SET CEO of Bigger and Better
modify   phoneNumberCE SET 555-504-5656
modify   urlCE REM
modify   urlCE ADD http://www.bigger-better.com
target   uuidName 3d09fd40-69a2-40e6-8d7a-6bafabda9788
```

Each of the operations you performed on the `modrec` is now indicated in the `SetRequest's` `modify` attribute.

## Applying a Modifier to a Dark Matter Object ##

I'm going to save the details of how modifiers work for a later discussion.

For now, it's enough to understand that once you've created a set of modifications, they can be transported (via [GWT RPC](http://code.google.com/webtoolkit/doc/latest/tutorial/RPC.html) or any other communications mechanism) and applied to a remote [DMO](DMOOverview.md) or even another local DMO, as we'll show here.

We're just adding a few more lines to our example:

```
contact.applyModifier(request.getModifyAttribute());
		
System.out.println(contact);
```

Imagine that we've sent that `SetRequest` to the server, found the object referred to by the `target` and we're now applying the modifier to the existing contact. Here's the result:

```
Contact
birthdayCE      19750804:000000
emailCE         holliev@example.com
firstName       Hollie
lastName        Voss
middleName      Margeurite
nickName        voster
notesCE         Kids are Jason and Amanda
phoneNumberCE   555-504-5656
prefixCE        Dr.
titleAndCompany CEO of Bigger and Better
urlCE           http://www.bigger-better.com
uuidName        a8b3c028-3853-40cd-83f9-44d14f502898
```

Without much effort, we've recorded a set of modifications to an object, transported those changes elsewhere and applied them to another object.

Are you feeling lazy yet?

Well, maybe after the last step in this sequence of "events".

## Reporting Modifications in a DMP Event ##

Okay, so this next bit is far fetched with this particular set of data, but imagine that our `Contact` object is actually something that's shared among a group of users and that those users are connected to the same system and interested in up-to-the-minute changes in Hollie's contact information (hey! it might happen ;-)

Anyway, for any situation where you want to broadcast modifications to other attached users of your web application, you simply create an event from the `SetRequest` and fire it out on the gwteventservice (the details of which we'll get to later):

```
DMPEvent event = new DMPEvent(request);
		
System.out.println(event);

// Send the event
```

And the event appears as:

```
DMPEvent
eventTypeDMP   MODIFIED
modify         nickName SET voster
modify         titleAndCompany SET CEO of Bigger and Better
modify         phoneNumberCE SET 555-504-5656
modify         urlCE REM
modify         urlCE ADD http://www.bigger-better.com
source         uuidName 97dfc6af-3b2d-4b0d-9307-c0f7e785aa88
```

When the event is received, the modifier it contains can be applied to the cached DMO, if the client happens to have it.

Whew!

There's a lot of stuff to absorb there, but it will all start to make sense as we proceed with the example, if it doesn't already.

# Slicing #

In the original [Contacts](http://code.google.com/webtoolkit/articles/mvp-architecture.html) project, there is a tiny section on the model aspects, I'll quote it here verbatim:

<table width='600'>
<tr>
<td width='20' valign='top'>
</td>
<td valign='top'>
<ul><li><i>Contact: A representation of a contact within the contact list. For simplicity, this object contains a first name, last name, and email address. In a more complex application, this object would have more fields.</i>
</td>
</tr>
<tr>
<td valign='top'>
</td>
<td valign='top'>
</li><li><i><code>ContactDetails</code>: A light version of the Contact that contains only the unique identifier and display name.</i><font color='#9E0B0F'> This "light" version of the Contact object will make the Contact list retrieval more efficient, as there will be fewer bits to serialize and transport across the wire. </font> In the case of our example application, this optimization has less impact than it would in a more complex app where Contact objects have substantially more fields. The initial RPC will return a list of <code>ContactDetails</code>, and we've added a display name field so that there is some amount of data that can be displayed (within the <code>ContactsView</code>) without having to making subsequent RPCs._<br>
</td>
</tr>
</table></li></ul>_

This concept of having a "light version" of the Contact object seems useful, but the pain of having to create a light version of every object that you wanted to display in this manner sounds painful, especially when the title of the piece is "Large scale application development and MVP".

The "light version" of the contact had the unique identifer for the contact, and the first name, last name and email address of the contact.

Here's how to get the same functionality using the Dark Matter "slice" concept:

<table width='820'>

<tr>
<td width='20' valign='top'>

</td>
<td valign='top'>
<b>1.</b> Create a <code>slices.dmd</code> file in your <code>dmdconfig</code> folder<br>
</td>
</tr>

<tr>
<td valign='top'>

</td>
<td valign='top'>
<b>2.</b> Define a <code>slice</code> as follows:<br>
<pre><code>SliceDefinition<br>
name            lightContact<br>
selectAttribute	firstName<br>
selectAttribute	lastName<br>
selectAttribute emailCE<br>
description 	Get a light version of the Contact.<br>
</code></pre>
</td>
</tr>

<tr>
<td valign='top'>

</td>
<td valign='top'>
<b>3.</b> Add the <code>slices.dmd</code> to your <code>contacts.dms</code> file.<br>
<pre><code>SchemaDefinition<br>
name            contacts<br>
schemaPackage   com.google.gwt.sample.contacts.shared<br>
schemaBaseID    1000<br>
schemaIDRange   50<br>
defFiles        attributes.dmd<br>
defFiles        classes.dmd<br>
defFiles	slices.dmd<br>
description     The contacts schema defines objects associated with the contacts<br>
 GWT application example.<br>
</code></pre>
</td>
</tr>

<tr>
<td valign='top'>

</td>
<td valign='top'>
<b>4.</b> Run the <a href='DMOGenerator.md'>DMOGenerator</a> DMO Generator<br>
<br>
This will result in the regeneration of a single file, <code>ContactsASAG</code> - this is the Attribute Schema Auto Generated (ASAG). It contains a variety of information that, for the most part, you don't need to worry about at the moment (and probably never).<br>
<br>
However, it also contains a handy static member which is the handle to your slice definition: <code>ContactsASAG.__lightContact</code>
</td>
</tr>

<tr>
<td valign='top'>

</td>
<td valign='top'>
<b>5.</b> You can now "slice" a complete <code>Contact</code> object as follows:<br>
<br>
<pre><code>ContactDMO heavy = new ContactDMO();<br>
		<br>
heavy.setUuidName(getUUIDName());<br>
heavy.setFirstName("Hollie");<br>
heavy.setLastName("Voss");<br>
heavy.addUrlCE("http://example.com");<br>
heavy.addUrlCE("http://contacts.com");<br>
heavy.setBirthdayCE("19750804:000000");<br>
heavy.setEmailCE("holliev@example.com");<br>
heavy.setMiddleName("Margeurite");<br>
heavy.setNickName("vossie");<br>
heavy.setNotesCE("Kids are Jason and Amanda");<br>
heavy.setPhoneNumberCE("555-793-1212");<br>
heavy.setPrefixCE("Dr.");<br>
<br>
System.out.println(heavy.toOIF());<br>
<br>
ContactDMO light = heavy.getSlice(ContactsASAG.__lightContact);<br>
		<br>
System.out.println(light.toOIF());<br>
<br>
</code></pre>

And here's the associated output:<br>
<br>
<pre><code>Contact<br>
birthdayCE      19750804:000000<br>
emailCE         holliev@example.com<br>
firstName       Hollie<br>
lastName        Voss<br>
middleName      Margeurite<br>
nickName        vossie<br>
notesCE         Kids are Jason and Amanda<br>
phoneNumberCE   555-793-1212<br>
prefixCE        Dr.<br>
urlCE           http://example.com<br>
urlCE           http://contacts.com<br>
uuidName        f9e8fd62-7242-472c-8665-66c4397f616a<br>
<br>
Contact<br>
emailCE     holliev@example.com<br>
firstName   Hollie<br>
lastName    Voss<br>
uuidName    f9e8fd62-7242-472c-8665-66c4397f616a<br>
<br>
<br>
</code></pre>
</td>
</tr>
</table>

As you can see from the OIF dump, the light version of the object has the fields that attributes that we want and, as part of the standard behaviour of "slicing", the `uuidName` that uniquely identifies the contact.

Slicing is easily accomplished because the attributes of a [DMO](DMOOverview.md) are stored as a Hash of attributes rather than discrete object attributes.

And now, on to [Events and Views](EXContacts3.md).