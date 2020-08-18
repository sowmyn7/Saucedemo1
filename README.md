
# How to run

Create a TestNG Runner with following VM options (Framework supports running tests using latest firefox and chrome browsers)

For Generating Report, please run the below in terminal 
mvn cluecumber-report:reporting

after the tests executed run the command from terminal
and reports generated on folder generated_report and open index.html

# Saucedemo

1. Open a terminal window/command prompt
2. Clone this project.
3. CD into project directory
4. mvn clean verify

All dependencies should now be downloaded and all features with @e2e tag should run successfully (Assuming you have Firefox installed in the default location)


### Anything else?

Yes you can specify which browser to use by using one of the following switches:

- -Dbrowser=firefox
- -Dbrowser=chrome
- -Dbrowser=ie8
- -Dbrowser=ie11

