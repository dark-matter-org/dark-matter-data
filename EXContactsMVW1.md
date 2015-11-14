

# Introduction #

This tutorial assumes that:

  * you have [Eclipse](http://www.eclipse.org/) installed
  * you have the [GWT Eclipse plugin](https://developers.google.com/eclipse/)
  * you are using (or have available) the [GWT 2.2.0 SDK](http://code.google.com/p/google-web-toolkit/downloads/detail?name=gwt-2.2.0.zip). See the [Installing a GWT SDK](EXContactsMVW1#Installing_a_GWT_SDK.md) section if you need a hand with this.
  * you have the Google Web Toolkit Developer Plugin for your browser. If you don't have it, you'll be prompted to install it as required.

## Import the dark-matter-data project ##

Import the dark-matter-data project into your workspace. This can be accomplished in a couple of ways:
  * checkout the dark-matter-data project from Google Code, the SVN URL is `https://dark-matter-data.googlecode.com/svn/trunk/`<p />Note: the eclipse project is below the `dark-matter-data` folder beneath `trunk` and is also called `dark-matter-data`.<p />
  * OR grab the latest dark-matter-data.zip file from the [Downloads Page](http://code.google.com/p/dark-matter-data/downloads/list).<p />Unzip the file and use the File->Import - General - Existing Projects into Workspace to load the project.

Usually, you would just use the dark-matter-data JAR, but, since this is a tutorial, it is useful to have access to the full dark-matter code base.

## Import the dark-matter-contacts project ##

Import the dark-matter-contacts project into your workspace, again, using your preferred method:
  * checkout dark-matter-contacts from `https://dark-matter-contacts.googlecode.com/svn/trunk` <p />
  * OR grab the latest dark-matter-contacts.zip from the [Downloads Page](http://code.google.com/p/dark-matter-data/downloads/list).<p />Unzip the file and use the File->Import - General - Existing Projects into Workspace to load the project.

Note: you may have to set the GWT SDK on the contacts project. Right click the project in the package explorer and select `Google->Web Toolkit Settings` and ensure that the SDK being used is 2.2.0.

## Run dark-matter-contacts ##

Once you have the projects imported, you should be able to:
  * right click dark-matter-contacts in the package explorer and select `Run As -> Web Application`
  * double click the URL that appears in the Development Mode window
  * the login page for the contacts application should be presented
  * enter user name `user1` with password `user1`
  * hit the `Login` button
  * you should see the list of contacts displayed




# Installing a GWT SDK #

If you need to install the 2.2.0 SDK, just follow these steps:

  * Download the [GWT 2.2.0 SDK](http://code.google.com/p/google-web-toolkit/downloads/detail?name=gwt-2.2.0.zip)
  * Unzip the SDK to a convenient location
  * Right click the dark-matter-contacts project in the package explorer and select `Google->Web Toolkit Settings`
  * Click `Configure SDKs..`
  * Click the `Add` button
  * Browse for the location where you unzipped the SDK, select the top level folder and click `OK`
  * Select the 2.2.0 SDK from the list and click `OK`
  * Click `OK` to close the Web Toolkit dialog
  * You're done!