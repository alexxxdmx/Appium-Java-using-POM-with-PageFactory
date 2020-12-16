# Appium-Java-using-POM-and-PageFactory

## 1. POM

This automation created using POM design pattern. What is POM? POM stands for Page Object Model. POM is a design pattern used to make automation. Where each page an application or website is used as its own class. This gives an advantage when one of a page's interface changes, then other classes will not be affected. 

## 2. Cucumber dan Gherkin

Then for Scenario scripting, we will use Cucumber and Gherkin.<br/>
What is Cucumber? What is Gherkin?<br/>
**Cucumber** is a tool that supports BDD *(Behavior-Driven Development)*.<br/>
**Gherkin** is a set of grammar rules that makes plain text structured enough to be understood by Cucumber. Scenario scripts are written using Gherkin.<br/><br/>Referensi: https://docs.cucumber.io/docs/guides/overview/

## 3. Preparation

| Unsur        | Item                                                         |
| ------------ | ------------------------------------------------------------ |
| Editor       | Intellij IDEA Community (https://www.jetbrains.com/idea/download/#section=windows) |
| JDK          | JDK 8 (https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) |
| SDK          | Android SDK (https://developer.android.com/studio/archive)   |
| Tools        | Node.js (https://nodejs.org/dist/latest/)                    |
| Device       | Real device or emulator                                      |
| Dependencies | artifactId: `selenium-java`, groupId: `org.seleniumhq.selenium` <br />artifactId: `selenium-api`, groupId: `org.seleniumhq.selenium`<br />artifactId: `cucumber-junit`, groupId: `info.cukes`<br />artifactId: `cucumber-java`, groupId: `info.cukes`<br />artifactId: `cucumber-core`, groupId: `info.cukes`<br />artifactId: `gherkin`, groupId: `info.cukes`<br />artifactId: `java-client`, groupId: `io-appium`<br />artifactId: `testng`, groupId: `org.testng` |

## 4. Installation

#### General

Install Editor Intellij Idea Community, SDK, Tools, and JDK in komputer.

#### Appium

###### Windows & Mac OS

1. Run terminal or command prompt
2. Type ```npm install -g appium``` 
3. Enter

###### Linux

1. Run terminal
2. Type ```sudo npm install -g appium --unsafe-perm=true --allow-root``` 
3. Enter

## 5. Configuration

#### Windows

###### JDK 8

1. Right-click My Computer > Properties > Advance system settings > Environment Variables > PATH > Edit 
2. Type `C:\Java\java-8\bin` 
3. Click Save

###### Android SDK

1. Right-click My Computer > Properties > Advance system settings > Environment Variables > PATH > Edit
2. Type ```C:\Android\Android-sdk\tools;C:\Android\Android-sdk\platform-tools;``` > Save
3. Create new variable  ```ANDROID_HOME``` then type: ```C:\Android\Android-sdk``` > Save

#### Linux dan Mac OS

###### JDK 8

*Automatically set itself*

###### Android SDK

1. Run Terminal.

2. For Linux: Ketikkan ```sudo nano ~/.bashrc``` For Mac OS: ```sudo nano ~/.bash-profile``` 

3. On top row type

   ```
   export ANDROID_HOME=/Users/itworker/Library/Android/sdk
   export PATH="${ANDROID_HOME}/tools:${PATH}"
   export PATH="${ANDROID_HOME}/emulator:${PATH}"
   export PATH="${ANDROID_HOME}/platform-tools:${PATH}"
   ```

   *Path depend user computer.*

4. Then save

## 6. Project

#### Clone

Clone this repository using this command `git clone https://github.com/cahkla10/Appium-Java-using-POM` in terminal or command prompt.

#### Intellij IDEA Configuration

Open this automation using Intellij IDEA.

##### Project Setting

1. Click File > Project Structure
2. Make sure JDK 8 is selected in Project SDK

##### Plugin

1. Klik Preferences > Plugins
2. Search using keyword `cucumber for java`
3. Click Install
4. Repeat steps 2-3 for plugin `gherkin`

## 7. Package & Class

### Project Structure

```
|-- test
		|-- java
				|-- pages
				|-- setups
				|-- steps
		|-- resources
				|-- features
```

- `pages` package for all page classes.
- `setups` package for all automation configuration.
-  `steps` package for all page step definitions.
- `resources` package for all features or non java classes.

## 8. Running Automation

For running the automation, we can open scenario file. For example, we will run homage scenarios:

1. Open `Homepage.feature`
2. Right click one of scenario, then click Run

If we need run some scenarios and or create report, we need to create Runner class.
