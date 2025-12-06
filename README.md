# Java Maven Demo

A simple demo Java application built with Maven.

## Prerequisites

- Java 17 or higher
- Maven 3.6+

## Project Structure

```
java-maven-demo/
├── pom.xml                          # Maven configuration
├── README.md
└── src/
    ├── main/java/com/demo/
    │   └── App.java                 # Main application
    └── test/java/com/demo/
        └── AppTest.java             # Unit tests
```

## Build & Run

### Compile the project
```bash
mvn compile
```

### Run tests
```bash
mvn test
```

### Package as JAR
```bash
mvn package
```

### Run the application
```bash
# Using Maven
mvn exec:java -Dexec.mainClass="com.demo.App"

# Or using the JAR directly
java -jar target/java-maven-demo-1.0-SNAPSHOT.jar
```

### Clean build artifacts
```bash
mvn clean
```

## Common Maven Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Remove target directory |
| `mvn compile` | Compile source code |
| `mvn test` | Run unit tests |
| `mvn package` | Create JAR file |
| `mvn install` | Install to local repository |
| `mvn clean package` | Clean and rebuild |

