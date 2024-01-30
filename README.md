# RS-Scripts
Automative Scripts I've made to assist with AFK gaming.

# DeathSkullRotation Project

## Introduction
This project contains a Java script for the DeathSkullRotation application, which automates key press events with specific delays.

## Installation

1. **Clone the Repository**
   - Open IntelliJ IDEA.
   - Select `File` > `New` > `Project from Version Control`.
   - In the URL field, paste the URL of your Git repository.
   - Choose a directory on your local machine and click `Clone`.

2. **Set Up the Project**
   - Once the project is opened in IntelliJ, it should automatically recognize it as a Java project.
   - If needed, set up the JDK by going to `File` > `Project Structure` > `Project` and selecting the appropriate JDK from the `Project SDK` dropdown.

3. **Build the Project**
   - Build the project by selecting `Build` > `Build Project` from the main menu.

## Usage

1. **Running the Application**
   - In the `Project` view, find the `DeathSkullRotation` class.
   - Right-click on the file and select `Run 'DeathSkullRotation.main()'`.
   - The application will execute according to the script's logic.

2. **Customizing Key Events**
   - To modify the key events, open the `DeathSkullRotation` class.
   - Adjust the key event codes and delays in the `keyEvents` list as needed.

## Contributing

1. **Reporting Issues**
   - If you find any bugs or have feature requests, please create an issue in the GitHub repository.

2. **Submitting Changes**
   - Fork the repository and create a new branch for your changes.
   - Make your changes in the forked repo and test them thoroughly.
   - Submit a pull request to the main repository with a clear list of what you've done.
   - Your pull request will be reviewed, and if accepted, merged into the main codebase.

3. **Code Style and Conventions**
   - Please follow standard Java coding conventions.
   - Ensure your code is well-documented and includes comments where necessary.

## Changelog
### Version 0.1
**Release Date: 1/27/2024
#### Changes:
-

### Version 0.02
**Release Date: 1/27/2024

- Added "jnativehook" Library: Introduced the "jnativehook" library to enable global key listeners. This enhancement allows the script to listen for key press events globally, even when the application is not in focus.
 Start and Stop Automation: Implemented a dynamic start and stop functionality based on specific key press events. When the designated key (e.g., F2) is pressed, the automation can be toggled on or off. This feature provides greater control  over when the script executes its actions.

- How it Works: When the script is running, it continuously monitors for the designated key (e.g., F2) press event. Upon pressing this key, the script either starts or stops the automation based on its current state. This enables users to     easily initiate or halt the automated actions while using the application.

#### Changes:
- Adjusted the delay calculation logic in the DeathSkullRotation script.
- Ensured that the sum of the four randomized delays for each key press event totals between 1900ms and 2000ms.
- Distributed the total delay more evenly across each key event while maintaining the overall execution time.

### Version 0.01
**Release Date:** 1/26/2024

#### Initial Release:
- Created the basic structure of the DeathSkullRotation script.
- Implemented key press events with initial delay logic.
