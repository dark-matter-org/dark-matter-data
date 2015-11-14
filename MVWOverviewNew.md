

# Large scale application development with GWT revisited #

The Google articles [Large scale application development and MVP](http://code.google.com/webtoolkit/articles/mvp-architecture.html) and [GWT Development with Activities and Places](http://code.google.com/webtoolkit/doc/latest/DevGuideMvpActivitiesAndPlaces.html) have provided the basis that many of us have used to guide our GWT development efforts.
However, trying to reconcile these ideas into something coherent and systematic was leaving me with conceptual indigestion.

The Model View Whatever (MVW) framework and code generation mechanisms are meant to provide a consistent conceptual view of the various aspects presented by these articles. The goal of MVW is to leverage the basic concepts of the dark-matter framework and combine them with MVP to create a clear methodology for the development of complex GWT applications.

Just like the original articles, I'll introduce the overall structure of an MVW application by walking through an example application, in this case
the [The Contacts Example](EXTheContactsExample.md). That's probably the best place to start before returning here to examine the details of the various components that comprise MVW.