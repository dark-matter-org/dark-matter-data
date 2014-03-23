Instructions

Create a new Java project

Add a test source directory (we'll be generating JUnit tests as well)


Create a new extjar folder in the project and drop in the following jars:
dark-matter-data-3.0.0
dark-matter-concinnity-1.0.0
dark-matter-templates-1.0.0
commons-io-2.0.1

Select the project ->Build Path->Configure Build Path

Select Libraries and click the Add Jars button

Select your new project and open it to find the extjars folder, select all of the jars


Go to your run configuration menu and select Run Configurations...

Add a new Java Application run configuration

For the main class, select org.dmd.dsd.tools.dsdwizard.DSDWizardMain (this is in the dark-matter jar)

Run the DSL Wizard and select the new project as the target project

Answer the questions and things will happen!




