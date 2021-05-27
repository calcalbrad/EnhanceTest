# Enhance Test

## Introduction
This project was created for an interview with Enhance Consulting. I had a lot of fun working on this and it introduced me to new tools such as Selenium and I also used this as an excuse to try TestNG over JUnit. 

## Technologies & Tools Used
This project is created with:
* Java Development Kit 8
* Selenium 3.141.59
* ChromeDriver 90.0.4430.24
* TestNG 7.4.0
* JCommander 1.7

## Setup
Follow the following steps to setup the tests (for use with IntelliJ):
1. Install Google Chrome at this link: https://www.google.com/chrome/
2. Install IntelliJ to your computer. Instructions can be found here: https://www.jetbrains.com/help/idea/installation-guide.html.
3. Using Git, clone the project into your local repository. Instructions can be found here: https://www.jetbrains.com/help/idea/set-up-a-git-repository.html
4. Download Selenium using this link: https://www.selenium.dev/downloads/ and scroll down till you find the Selenium Client & WebDriver Language Bindings. Download the version for Java. 
5. Extract the zip files and put the selenium-java-3.141.59 folder somewhere safe and where you can access later.
6. On IntelliJ, right click on the root element of the project and click 'Open Module Settings'. Navigate to Libraries under Project Settings and then click the plus button without any other symbol on it. Navigate to the selenium-java-3.141.59 folder and then select all the 'Executable Jar Files' within the folder (there are more in the libs folder as well) and select open. Then hit the 'Apply' button to confirm it. 
7. To download JCommander, go to this link: http://www.java2s.com/Code/Jar/j/Downloadjcommanderjar.htm and then follow the same steps above to add another external JAR file.
8. Download ChromeDriver using this link: https://chromedriver.chromium.org/ and save the location of where this file is stored.
9. Follow this link and scroll down where it shows you how to setup TestNG in IntelliJ: https://www.toolsqa.com/testng/install-testng/
10. Go into each test file and change the System.getProperty value to the location of the ChromeDriver on your computer

## Running the Program
Right click on the testng.xml file and select run and the test suite should show up in the console. It will also open Chrome to the web pages listed on the tests so that it can grab test components from the website.

## Future Works
* While it does test all the requirements, I would prefer it if it were to test the API calls by creating an XML document within the Java file which I could test. However, since this caused me a lot of issues, I decided to just test the XML document as a String. This probably introduces some code smells and is defiently not best practice so would need to be fixed for future use.
* Make it easier to swtich between IDEs (tried to use on Eclipse but was a horrible mess)

## Sources Used
Mainly followed the tutorial at: https://www.guru99.com/selenium-tutorial.html in order to learn how to use Selenium. Also used the Java & Selenium Docs for the rest of it.
