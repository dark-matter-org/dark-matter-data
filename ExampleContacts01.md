This sequence of tutorials assumes that you're using version 2.2 of the [Google Web Toolkit](https://developers.google.com/web-toolkit/download) and the associated [Eclipse plugin](https://developers.google.com/eclipse/).

  * Import the dark-matter-data project into your workspace.<p />The SVN URL is `https://dark-matter-data.googlecode.com/svn/trunk/`. <p>Note: the eclipse project is below the <code>dark-matter-data</code> folder beneath <code>trunk</code> and is also called <code>dark-matter-data</code>.<p />Usually, you would just use the dark-matter JAR, but, since this is a tutorial, it is useful to have access to the full dark-matter code base.<p />
<ul><li>Use the Google plugin mechanisms to create a new Web Application Project with name <code>contacts1</code> and package <code>com.example</code><p />
</li><li>Right click the <code>contacts1</code> project and select <code>Build Path-&gt;Configure Build Path...</code><p />
</li><li>Select the <code>Projects</code> tab. Click <code>Add...</code> <br>
<blockquote>Select the <code>dark-matter-data</code> project and hit <code>Ok</code><p /> This provides access to the dark-matter code base.<p />
</blockquote></li><li>Select the <code>Libraries</code> tab. Click <code>Add JARs...</code>
<blockquote>Expand the <code>dark-matter-data</code> project <br>
Expand the <code>extjars</code> folder <br>
Select the <code>gwteventservice-1.1.1.jar</code> and hit <code>Ok</code><p />The <a href='http://code.google.com/p/gwteventservice/'>GWTEventService</a> is used to allow the dark-matter to provide truly asynchronous messaging and event notification (thanks Sven!).<p />
</blockquote></li><li>In your source tree, beneath <code>com.example.contacts</code> edit the <code>Contacts1.gwt.xml</code> file (in text mode) and replace its contents with: <p />
<pre><code>&lt;?xml version="1.0" encoding="UTF-8"?&gt;<br>
&lt;module rename-to='contacts1'&gt;<br>
  &lt;!-- Inherit the core Web Toolkit stuff.                        --&gt;<br>
  &lt;inherits name='com.google.gwt.user.User'/&gt;<br>
<br>
  &lt;!-- Inherit the default GWT style sheet.  You can change       --&gt;<br>
  &lt;!-- the theme of your GWT application by uncommenting          --&gt;<br>
  &lt;!-- any one of the following lines.                            --&gt;<br>
  &lt;inherits name='com.google.gwt.user.theme.clean.Clean'/&gt;<br>
  &lt;!-- &lt;inherits name='com.google.gwt.user.theme.standard.Standard'/&gt; --&gt;<br>
  &lt;!-- &lt;inherits name='com.google.gwt.user.theme.chrome.Chrome'/&gt; --&gt;<br>
  &lt;!-- &lt;inherits name='com.google.gwt.user.theme.dark.Dark'/&gt;     --&gt;<br>
<br>
  &lt;!-- Other module inherits                                      --&gt;<br>
<br>
  &lt;inherits name="de.novanic.eventservice.GWTEventService"/&gt;<br>
  <br>
  &lt;inherits name="org.dmd.darkmatterprotocol"/&gt;<br>
<br>
  &lt;!-- Specify the app entry point class.                         --&gt;<br>
  &lt;entry-point class='com.example.contacts.client.Contacts1'/&gt;<br>
<br>
  &lt;!-- Specify the paths for translatable code                    --&gt;<br>
  &lt;source path='client'/&gt;<br>
  &lt;source path='shared'/&gt;<br>
  <br>
  &lt;!-- Turn off loggin for now --&gt;<br>
  &lt;set-property name="gwt.logging.enabled" value="FALSE"/&gt; <br>
  <br>
&lt;/module&gt;<br>
<br>
</code></pre>
</li></ul><blockquote><p />The salient points here are the addition of dependencies on the GWT Event Service and dark-matter (in the other module inherits section) and disabling of GWT Logging (which is inherited by the <code>darkmatterprotocol</code> module). <p />
</blockquote><ul><li>The next step is to add support for the services implied by the entries we added to the <code>Contacts1.gwt.xml</code> configuration.<p />
</li></ul><blockquote>Beneath the <code>contacts1</code> project, open the <code>war</code> folder <br>
Open the <code>WEB-INF</code> folder <br>
Edit the <code>web.xml</code> file (in text mode)<p />
</blockquote><ul><li>Replace the <code>greetServlet</code> definition with the following servlet definitions:<p />
<pre><code>  &lt;!-- Servlets --&gt;<br>
  <br>
  &lt;!-- The GWT Event Service --&gt;<br>
  &lt;servlet&gt;<br>
      &lt;servlet-name&gt;eventServiceImpl&lt;/servlet-name&gt;<br>
      &lt;servlet-class&gt;de.novanic.eventservice.service.EventServiceImpl&lt;/servlet-class&gt;<br>
  &lt;/servlet&gt;<br>
  &lt;servlet-mapping&gt;<br>
      &lt;servlet-name&gt;eventServiceImpl&lt;/servlet-name&gt;<br>
      &lt;url-pattern&gt;/contacts1/gwteventservice&lt;/url-pattern&gt;<br>
  &lt;/servlet-mapping&gt;<br>
<br>
  &lt;!-- The Dark Matter Protocol Service - Reference Implementation --&gt;<br>
  &lt;servlet&gt;<br>
    &lt;servlet-name&gt;DMPServlet&lt;/servlet-name&gt;<br>
    &lt;servlet-class&gt;org.dmd.dmp.server.servlet.dmpservletri.DMPServiceImpl&lt;/servlet-class&gt;<br>
    &lt;load-on-startup&gt;1&lt;/load-on-startup&gt;<br>
  &lt;/servlet&gt;<br>
  <br>
  &lt;servlet-mapping&gt;<br>
    &lt;servlet-name&gt;DMPServlet&lt;/servlet-name&gt;<br>
    &lt;url-pattern&gt;/contacts1/DMP&lt;/url-pattern&gt;<br>
  &lt;/servlet-mapping&gt;<br>
<br>
  &lt;!-- Default page to serve --&gt;<br>
<br>
</code></pre>
<p />
This definitions establish the basis for using the dark-matter protocol mechanisms and a simple, plugin based servlet that implements the<br>
</li><li>Directly beneath the <code>war</code> folder create a new text file called <code>dmpServletplugins.oif</code> and add the following content:<p />
<pre><code>PluginConfig<br>
pluginName		cache<br>
pluginClass		org.dmd.dmp.server.servlet.base.plugins.BasicCachePlugin<br>
<br>
PluginConfig<br>
pluginName		security<br>
pluginClass		org.dmd.dmp.server.servlet.base.plugins.BasicSecurityPlugin<br>
<br>
PluginConfig<br>
pluginName		requestTracker<br>
pluginClass		org.dmd.dmp.server.servlet.base.plugins.BasicRequestTrackerPlugin<br>
</code></pre>