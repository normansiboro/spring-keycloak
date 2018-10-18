# spring-keycloak

## Keycloak:
1. Download keycloak from https://www.keycloak.org/downloads.html
2. Extract the files into your prefered directory
3. Go to the keycloak directory and find directory bin. Run the standalone.sh by executing the following command on command prompt
```
standalone.sh
```
   By Default keycloak will run at port 8080 and if you want to change the port you can run this command (example: port 8180)
```
standalone.sh -Djboss.socket.binding.port-offset=100
```
4. Go to http://localhost:8180 to create administrator
5. Create a new realm
6. Create and configure new client based on how many apps that you want to protect in the same realm
7. Create some roles
8. Create some user
9. Create Mapping role for user
* Note: Step 5-9 can be handled by importing real-export.json file to keycloak

## Run Back-end apps:
To run the project with embedded Tomcat by maven:
```
cd spring-keycloak
mvn spring-boot:run
```
