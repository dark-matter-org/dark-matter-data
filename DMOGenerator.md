

# The DMO Generator Tool #

The DMO Generator Tool takes your [Dark Matter Schemas](DMSOverview.md) and generates [Dark Matter Objects](DMOOverview.md) and a variety of other things that you don't need to worry about at the moment ;-)

<table width='100%' border='0'>
<blockquote><tr align='center'>
<blockquote><td>
<blockquote><img src='http://www.dark-matter-data.org/images/dmoGenerator.png' />
</blockquote></td>
</blockquote></tr>
</table></blockquote>

## JDK 1.6 Compliance Note ##

Dark Matter generates quite a bit of code on your behalf and that code is designed to comply with Java 1.6 or higher.

Please ensure that your compiler compliance level is set to 1.6.

<img width='550' src='http://www.dark-matter-data.org/images/jdkCompliance.gif' />

## Running the DMO Generator ##

Here's how to run the generator:

<table width='820'>

<tr>
<td valign='top'>
<b>1.</b>
</td>
<td valign='top'>
head over to the <a href='http://code.google.com/p/dark-matter-data/downloads/list'>download page</a> and grab the latest version of the Dark Matter jar.<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>2.</b>
</td>
<td valign='top'>
add the Dark Matter jar to you project's classpath<br>
</td>
</tr>

<tr>
<td valign='top'>
<b>3.</b>
</td>
<td valign='top'>
open your Run Configs<br>
<br>
<img width='600' src='http://www.dark-matter-data.org/images/runConfigs1.png' />
</td>
</tr>

<tr>
<td valign='top'>
<b>4.</b>
</td>
<td valign='top'>
Create a new Java Application run config<br>
<br>
<img width='600' src='http://www.dark-matter-data.org/images/runConfigs2.png' />
</td>
</tr>

<tr>
<td valign='top'>
<b>5.</b>
</td>
<td valign='top'>
Name your config DMO Generator (or anything else you like).<br>
<br>
Enter <code>dmo*</code> in the Main class: field and hit Search...<br>
<br>
<img width='600' src='http://www.dark-matter-data.org/images/runConfigs3.png' />
</td>
</tr>

<tr>
<td valign='top'>
<b>6.</b>
</td>
<td valign='top'>
Select <code>DmoGeneratorMain</code> and hit OK.<br>
<br>
<img width='600' src='http://www.dark-matter-data.org/images/runConfigs4.png' />
</td>
</tr>

<tr>
<td valign='top'>
<b>7.</b>
</td>
<td valign='top'>
Select the Arguments tab.<br>
<br>
Enter <code>-workspace</code> (followed by a space) in the Program arguments area.<br>
<br>
Click the <code>Variables</code> button, scroll to the bottom and double-click <code>workspace_loc</code>

Click OK<br>
<br>
<img width='600' src='http://www.dark-matter-data.org/images/runConfigs5.png' />
</td>
</tr>

<tr>
<td valign='top'>
<b>8.</b>
</td>
<td valign='top'>
Enter a space after the <code>${workspace_loc}</code>

And enter <code>-srcdir [your-project-name]/src</code>

Note: If you have multiple projects using Dark Matter, just add them, space separated, after the initial <code>project/src</code>

Hit Apply<br>
<br>
Then hit Run to run in interactive mode.<br>
<br>
if you enter ?, the tool will list the various available schemas in your source directories.<br>
<br>
<img width='600' src='http://www.dark-matter-data.org/images/runConfigs6.png' />
</td>
</tr>

<tr>
<td valign='top'>
<b>9.</b>
</td>
<td valign='top'>
If you just want to generate the DMOs from all available schemas, simply add a space and <code>-autogen</code> to the program arguments.<br>
<br>
<br>
</td>
</tr>

</table>

Regardless of whether you run in interactive or auto mode, the tool will only regenerate those files that need to be updated based on any modifications you've made to your schema.

