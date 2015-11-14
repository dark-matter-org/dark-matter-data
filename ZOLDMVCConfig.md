# The `MVCConfig` Definition #

The `MVCConfig` object will be the first thing in any `.mvc` configuration file.

<table width='820'>

<tr>
<td width='120' valign='top'>
<b><code>name</code></b>
</td>
<td valign='top'>
this is the globally unique name for this configuration. The is the name that other configurations would refer to in their <code>dependsOnMVC</code> attributes.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>genPackage</code></b>
</td>
<td valign='top'>
this is the fully qualified package structure to the point where your <code>.mvc</code> configuration file exists. If your source structure looked like:<br>
<pre><code>src<br>
    com<br>
        example<br>
            client<br>
                feature1<br>
                    dmdconfig<br>
                        v0dot1<br>
                            example.mvc<br>
                    generated<br>
                        mvc<br>
</code></pre>
the <code>genPackage</code> would be <code>com.example.client.feature1</code> and the generated code for your configuration would wind up in the <code>generated/mvc</code> folder.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>dependsOnMVC</code></b>
</td>
<td valign='top'>
this is a reference to another DM-MVC configuration on which you depend, usually for <code>MvcEvent</code> definitions, but also for <code>MvcRegistryItem</code> definitions.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b><code>description</code></b>
</td>
<td valign='top'>
some useful description of what feature or functionality is implemented by this configuration.<br>
</td>
</tr>
</table>

## An Example MVCConfig Definition ##

```
MvcConfig
name         feature1
dependsOnMVC baseFeatureX
dependsOnMVC baseFeatureY
genPackage   com.example.client.feature1
description  The feature1 feature provides basic presentation of blah, blah, blah
 And here is a line continuation because the line starts with a single
 space. This is borrowed from LDAP ldiff representation.
```