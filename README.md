# Vinod_Misal_teladoc_challenge
Automation challenge using BDD cucumber
This project demonstrates a Selenium BDD framework using Cucumber for automating the testing of web tables on the Way2Automation website. Same project created on Eclipse.
**Features**
Add User to the table and validate the user has been added.
Delete User from the table and validate the user has been deleted.

**Prerequisites**
Java JDK 8 or higher
Maven
Chrome WebDriver (ensure it's added to your system PATH)
Eclipse

**Project design**
│   ├── main
│   │   java
│   │    └── BasePck
│   │   │       └── BasePage.java
│   ├── test
│   │   ├── java
│   │      ├── StepDefinations
│   │      │    Steps.java
│   │      ├── TestRunner
│   │      │    TestRunner.java
│   │   ── resources
│   │       features
│   │          AddDelete.feature
└── pom.xml

**Run**

1.Open TestRunner class
2.Right clic on Test Runner class and select Run As Junit
3.After run refresh project and goto to target folder
4. Open Report File
