# Enhance Test

## Introduction
This project was created for an interview with Enhance Consulting. I had a lot of fun working on this and it introduced me to new tools such as Selenium and I also used this as an excuse to try TestNG over JUnit. This is a private repository so it is likely that not many will see this but this readme is appropriate for best practice. 

## Technologies & Tools Used
This project is created with:
* Java Development Kit 8
* Selenium 3.141.59
* ChromeDriver 90.0.4430.24
* TestNG 7.4.0
* JCommander 1.7

## Setup
Follow the following steps to setup the tests:
1. Install either Eclipse or IntelliJ to your machine. Instructions can be found here: https://www.eclipse.org/downloads/packages/installer (Eclipse) or https://www.jetbrains.com/help/idea/installation-guide.html (IntelliJ).
2. Using Git, clone the project into your local repository. Instructions can be found here: https://tools.jboss.org/documentation/howto/git_import_projects.html (Eclipse) or https://www.jetbrains.com/help/idea/set-up-a-git-repository.html (IntelliJ).
3. Download Selenium using this link: https://www.selenium.dev/downloads/ and scroll down till you find the Selenium Client & WebDriver Language Bindings. Download the version for Java. 
4. Extract the zip files and put the selenium-java-3.141.59 folder somewhere safe and where you can access later.
5. On Eclipse, right click on the root element of the project and click 'Properties'. Then navigate to Java Build Path and then select Libraries. Click the 'Add External JARs' button and navigate to the selenium-java-3.141.59 folder and then select all the 'Executable Jar Files' within the folder (there are more in the libs folder as well) and select open. Then hit the 'Apply and Close' button to confirm it.
6. On IntelliJ, right click on the root element of the project and click 'Open Module Settings'. Navigate to Libraries under Project Settings and then click the plus button without any other symbol on it. Navigate to the selenium-java-3.141.59 folder and then select all the 'Executable Jar Files' within the folder (there are more in the libs folder as well) and select open. Then hit the 'Apply' button to confirm it. 
7. To download JCommander, go to this link: http://www.java2s.com/Code/Jar/j/Downloadjcommanderjar.htm and then follow the same steps above to add another external JAR file.
8. Download ChromeDriver using this link: https://chromedriver.chromium.org/ and save the location of where this file is stored.
9. Follow this link to setup TestNG in Eclipse or IntelliJ: https://www.toolsqa.com/testng/install-testng/

## Running the Program
CHROMEDRIVER

## Future Works
While it does test all the requirements, I would prefer it if it were to test the API calls by creating an XML document within the Java file which I could test. However, since this caused me a lot of issues, I decided to just test the XML document as a String. This probably introduces some code smells and is defiently not best practice so would need to be fixed for future use.

## Sources Used
Mainly followed the tutorial at: https://www.guru99.com/selenium-tutorial.html in order to learn how to use Selenium. Also used the Java & Selenium Docs for the rest of it.
