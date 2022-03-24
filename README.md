# Introduction

Java BDD framework for automated regression of Storefront. 
For now functionally is focused on Login for http://automationpractice.com/ website. 

Build on top of tools and frameworks:

- Cucumber
- Selenium WebDriver
- Junit
- Maven


# Getting Started

Install:

- Maven
- IntelliJ  (recommended)
- Java 11 sdk

And clone or fork this repo.

# Additional Information

- Design Pattern: Page Object Model with Page Factory
- Code Quality Management: Checkstyle.xml file in main package (plugin in pom.xml is also present)
- Dependency Injection: sharing state is done thanks to PicoContainer (dependency in pom.xml) 


# How to run tests

There are two ways of running tests.

1) Junit (TestRunner)
   In TestRunner class, add tags inside CucumberOptions(...) with value for which tests will run. 
   For example : tags = "@login_successful" . 
   Then click arrow next to public class TestRunner and click Run 'TestRunner'. 
   All test scenarios with this tag will run. 
   If the whole feature needs to be run, then a tag on the top of feature file is used.
   For example : tags = "@login" . This way all scenarios in this feature will run.
   
  After this run, reports generate in target/cucumber-report
   
2) Cucumber Java
   In specific feature, arrows can be clicked next to the specific scenario (it will run) 
   or next to feature name (all scenarios will run).
   
# Reports

  Reports for Junit (TestRunner) tests are placed in Reports package in cucumber-report.html file.  
