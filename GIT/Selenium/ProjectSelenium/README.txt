How to create a Maven project

1) Download Maven from https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
2) Set MAVEN_Home in environment variables
   C:\Users\ChandaN\Documents\PratiseProjects\maven\apache-maven-3.5.2
3) Set the Path 
   C:\Users\ChandaN\Documents\PratiseProjects\maven\apache-maven-3.5.2\bin
4) Check maven is installed in the command prompt
   mvn --version 
5) Create a project in a directory with the following command
   mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   where groupid is the package name and artifactid is the project name
   When creating a project for the first time it takes longer as maven is downloading the repos and dependencies for the first time
6) Build the project 
   mvn package
7) Test the newly compiled project
   java -cp target/ProjectSelenium-1.0-SNAPSHOT.jar org.selenium.app.App
   The output of this should be "Hello World!"
8) Clean the project, copy dependencies and package the project
   mvn clean dependency:copy-dependencies package
9) Generating the site
   mvn site