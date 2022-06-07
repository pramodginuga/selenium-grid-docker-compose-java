# Selenium Grid Tests with Docker Compose Java
Selenium UI Tests can be executed using docker compose making it easier to run suites from local machine. Some of the advantages are listed below:

* Tests can be executed in different browser versions and platforms
* Supports Video recording of Test Execution
* Ability to scale based on the need
* With compose, its easy to setup and run tests on Selenium Grid. Grid configurations will be part of compose yaml file
* Run tests locally before merging the code
* Saves time executing multiple tests locally

## Getting Started
* The test framework uses Maven for managing dependencies
* TestNG framework is used to write the test
* This setup is created to ensure we can easily run existing testng suites using docker compose

## Pre-Requisites
#### Install Docker Desktop (Community Version)
* Please follow instructions from Docker Desktop community from [here](https://docs.docker.com/desktop/windows/install/)
* AFter installing Docker Desktop in windows, need to install WSL. Have a read about it [here](https://docs.microsoft.com/en-us/windows/wsl/install)

#### Docker Compose yaml Instructions
* In this project i have created Docker Compose yaml file using instruction from [Selenium Docker Git Community](https://github.com/SeleniumHQ/docker-selenium)
* Note: Video recording is in bete stage and we are expecting more changes around this
* Docker compose file is located /DockerCompose/docker-compose.yml

## Run Selenium Tests
* Open Powershell using Administrative access
* Naviagate to Project path using cd C:\**\**\DockerCompose
* Run .\runTestsDockerCompose.ps1 command
  * Starts Docker Desktop application
  * Executes Docker Compose up commands. Sets Selenium Grid Hub and Nodes as per yaml file
  * Run Tests
  * Executes Docker Compose down commands. 
  * Closes Docker Desktop application

