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

### Version 0.02
**Release Date: 1/27/2024

#### Changes:
- Adjusted the delay calculation logic in the DeathSkullRotation script.
- Ensured that the sum of the four randomized delays for each key press event totals between 1900ms and 2000ms.
- Distributed the total delay more evenly across each key event while maintaining the overall execution time.

### Version 0.01
**Release Date:** 1/26/2024

#### Initial Release:
- Created the basic structure of the DeathSkullRotation script.
- Implemented key press events with initial delay logic.
