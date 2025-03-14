Download Wildfly from 

https://www.wildfly.org/downloads/

extract and go to the bin/standalone

do a chmod +x ./standalone.sh

./standalone.sh


Then download the project and do a
mvn clean install wildfly:deploy


The application is running on 

http://localhost:8080/BookManagementApp/book
