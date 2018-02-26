# spring-boot-maven
Configuring Maven and SpringBoot profiles

How to check build profile:

1. Build the application
   > mvn clean install -P local | dev | uat

2. check the target folder: 
   - the profile name is appended to WAR file name
   - check the application.properties file in classpath resource. properties should reflect the profile used

3. See if the Spring Boot application runs:
   > mvn spring-boot:run (this will use the compiled classes and resources built on step #1)

4. Ctrl + C to stop
