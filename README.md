# Java Swing Login Form

## Description

A simple **Login and Sign Up form** built using **Java Swing**. The application allows users to:

* Sign up with a username and password.
* Log in with existing credentials.
* Display a success screen with animation when login is successful.
* Change the background color of the main screen.

## Project Structure

* `App.java` → Main class, entry point of the program.
* `loglog.java` → Handles login functionality.
* `signsign.java` → Handles user registration.
* `Horay.java` → Success animation panel shown after successful login.

## Requirements

* **Java JDK 8** or higher.
* Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or compile via command line.

## How to Run

1. Open the project in your IDE.
2. Run the `App` class (it contains the `main` method).
3. Use the buttons to either **Sign up** or **Login**.

### Example Users

By default, the following users exist:

* `Loay` / `123`
* `Mahmoud` / `1234`
* `Momen` / `12345`

## Notes

* New users are stored in memory only (not in a database).
* The project is for educational/demo purposes.

## Suggested .gitignore

```gitignore
# Compiled class files
*.class

# Package files
*.jar
*.war
*.ear

# Eclipse
.settings/
.project
.classpath
bin/

# IntelliJ
*.iml
.idea/
out/

# NetBeans
nbproject/private/
build/
dist/

# OS files
.DS_Store
Thumbs.db
```
