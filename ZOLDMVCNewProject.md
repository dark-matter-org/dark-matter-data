# Creating a New GWT Project and Using Dark Matter #

## Create the GWT Project ##

Use your preferred method, following the [instructions](http://code.google.com/webtoolkit/doc/latest/tutorial/create.html#create) for creating the application from within Eclipse or using the `webAppCreator` command line tool.

If you're not familiar with running in [development mode](http://code.google.com/webtoolkit/doc/latest/tutorial/create.html#test), continue a little further in the documentation.

The sample dark-matter-stock

## Set up your Dark Matter Schema ##

Your project folders should look something like:

```
src
    com
        example
            client
            server
            shared
            application.gwt.xml
```

Schema is a shared resource so create the following folder structure beneath the shared folder:

```
src
    com
        example
            client
            server
            shared
                dmdcofig
                    vodot1
                        myapp.dms
                        attributes.dmd
                        classes.dmd
```