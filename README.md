Download Wildfly from 

https://www.wildfly.org/downloads/

extract and go to the bin/standalone

do a chmod +x ./standalone.sh

./standalone.sh


Then download the project and do a
mvn clean install wildfly:deploy

copy the war file from the target of the projects to standalone/deployments

The application is running on 

http://localhost:8080/BookManagementApp/book
