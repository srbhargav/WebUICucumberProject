# Web application Testing with cucumber framework using Selenium and Java

This automation framework is developed using selenium, cucumber, java and maven.

## Project Description

It is a behavior driven development (BDD) approach to write automation test script to test Web applications. It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free. Automate your test cases with minimal coding.

## Installation

Pre-requisite You need to have following softwares installed on your computer

1) Install JDK 1.8 and set path
2) Install Maven and set path
3) Eclipse
4) Eclipse Plugins: Maven and Cucumber

git clone hhttps://github.com/srbhargav/UIWebCucumber.git

## Project structure

1) src/test/resources/feature - Cucumber features files
2) src/test/java/pages - All page object classes
3) src/test/java/steps - Cucumber step defination class
4) src/test/java/base - driver factory classes
5) src/test/java/runners - Cucumber test runner class


## Writing test cases
The cucumber features goes in the features library and should have the ".feature" extension.

You can start out by looking at src/test/resources/feature. You can extend this feature or make your own features using some of the predefined steps that comes with selenium-cucumber.


## Execute test cases in the framework
Navigate to your project directory from terminal and run following commands 

```python
mvn clean test verify
```

## Report Path
Cucumber HTML Report: {ROOT_PROJECT_FOLDER}/target/cucumber-html-reports/overview-features.html

## Contributing
1) Create your feature branch: git checkout -b my-new-feature
2) Commit your changes: git commit -am 'Add some feature'
3) Push to the branch: git push origin my-new-feature
4) Submit a pull request
5) Please make sure to update tests as appropriate.

