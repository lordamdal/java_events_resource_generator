# <a name="_hroe8050m8vs"></a>**Cirrus Link Resource Event Project Documentation**
## <a name="_j7xquaot6wwi"></a>**Project Overview**
The Cirrus Link Resource Event Project is a Java application that simulates a Resource Event Generator producing events every second. Each event is represented as a map containing details such as name, timestamp, data type, and value. The project utilizes Maven for build management and includes handlers for logging events to the console and encoding events as JSON using Jackson ObjectMapper.
### <a name="_ekdj2f71d4ul"></a>**Project Structure**
The project structure is organized as follows:

**CirrusResourceEventProject/**

**├── src/**

**│   └── main/**

**│       └── java/**

**│           └── com/**

**│               └── cirruslink/**

**│                   ├── ConsoleLoggingEventHandler.java**

**│                   ├── JSONEncodingEventHandler.java**

**│                   ├── ResourceEventGenerator.java**

**│                   └── ResourceEventHandler.java**

**├── pom.xml**

**└── .vscode/**

`    `**└── launch.json**

#### <a name="_4w4rc1xx64o1"></a>**Files and Directories**
- **src/main/java/com/cirrus/**
  - **ConsoleLoggingEventHandler.java**: Handles resource events by logging them to the console.
  - **JSONEncodingEventHandler.java**: Handles resource events by encoding them as JSON using Jackson ObjectMapper.
  - **ResourceEventGenerator.java**: Main class that generates resource events and notifies registered event handlers.
  - **ResourceEventHandler.java**: Interface defining the contract for handling resource events.
- **pom.xml**: Maven configuration file specifying project dependencies, plugins, and build settings.
- **.vscode/launch.json**: Visual Studio Code configuration file defining launch configurations for running and debugging the project.
## <a name="_5uo583hivxah"></a>**Detailed Description of Files**
### <a name="_f62u6v3evona"></a>**1. ConsoleLoggingEventHandler.java**
This file contains the implementation of ConsoleLoggingEventHandler, which implements ResourceEventHandlerinterface. It logs resource events to the console.
### <a name="_co7mvason7ix"></a>**2. JSONEncodingEventHandler.java**
This file contains the implementation of JSONEncodingEventHandler, which implements ResourceEventHandlerinterface. It encodes resource events as JSON strings using Jackson ObjectMapper.
### <a name="_t0g9qrt52y5e"></a>**3. ResourceEventGenerator.java**
This is the main class of the project. It generates resource events and notifies registered event handlers (ResourceEventHandler). It includes methods to add event handlers, start generating events, and methods for generating random resource data.
### <a name="_qvrdmip7bo2u"></a>**4. ResourceEventHandler.java**
This interface defines the contract for handling resource events. Classes implementing this interface must implement the handleEvent(Map<String, Object> resource) method.
### <a name="_gh0ef42o6wte"></a>**5. pom.xml**
The pom.xml file is the Maven project descriptor containing project dependencies, plugins, and build settings. It includes the dependency on Jackson Databind for JSON processing.
### <a name="_kp5lou2pej9"></a>**6. .vscode/launch.json**
launch.json is a configuration file used by Visual Studio Code to define launch configurations for debugging Java applications. It specifies how to run the ResourceEventGenerator class.
## <a name="_n6edjhq8bwk"></a>**Running the Project**
### <a name="_ct9zdj5xjefw"></a>**Prerequisites**
- **Java Development Kit (JDK)**: Ensure JDK 8 or higher is installed on your system.
- **Apache Maven**: Make sure Maven is installed and configured in your PATH.
- **Visual Studio Code**: The project is developed and tested on macOS using Visual Studio Code.
### <a name="_9hbnr7nwh88z"></a>**Steps to Run the Project**
**Clone the Repository (if not already done)**:

**git clone https://github.com/lordamdal/Java_ResourceEventGenerator.git or unzip the archive**

**cd CirrusResourceEventProject**

**Build the Project**:
bash
Copy code
**mvn clean install**

**Run the Application**:

**mvn exec:java -Dexec.mainClass="com.cirrus.ResourceEventGenerator"**

1. This command executes the ResourceEventGenerator main class, which starts generating resource events and outputs them to the console.
### <a name="_q5vwj449llsx"></a>**Debugging with Visual Studio Code**
To debug the project in Visual Studio Code:

1. Open the project folder in Visual Studio Code.
1. Ensure you have the "Java Extension Pack" installed.

Create or update launch.json in .vscode directory with the following configuration:
json
Copy code
**{**

`    `**"version": "0.2.0",**

`    `**"configurations": [**

`        `**{**

`            `**"type": "java",**

`            `**"name": "Debug ResourceEventGenerator",**

`            `**"request": "launch",**

`            `**"mainClass": "com.cirrus.ResourceEventGenerator",**

`            `**"projectName": "resource-event-project",**

`            `**"args": ""**

`        `**}**

`    `**]**

**}**

1. Press F5 to start debugging the ResourceEventGenerator class.
### <a name="_yi4yj9e145c"></a>**Notes**
- **Environment**: This project has been developed and tested on macOS. Ensure compatibility with other operating systems if deploying elsewhere.
- **Dependencies**: Maven handles dependencies automatically based on pom.xml configuration.
- **Extensibility**: The project can be extended by adding new event handlers or modifying existing ones to support additional features.

