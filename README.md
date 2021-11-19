# Cinema Service
![cinema](https://pro.sony/s3/2017/04/08151948/main-banner_1600x450.jpg)
# General info
* A simple cinema app project is based on a three-tier architecture that includes Dao, Service and Controller levels.
* Main functional  able to  HTTP requests, connect to the database and perform CRUD operations on it.
* Users can choose between two roles: admin or user. Each role has its own level of access
  ![line](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)
## Technologies
* Java 11
* Apache Tomcat
* MySQL
* Spring (Spring Core, Spring Security, Spring Web)
* Hibernate
  ![line](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)
## Setup
1. Configure Apache Tomcat
2. Connect your DB to the project
3. In the db.properties file change properties
   ``` java
   #MySQL properties
   db.driver = YOUR DRIVER
   db.url = YOUR DB url
   db.user = YOUR NAME
   db.password = YOUR PASSWORD
   ```
5. Start the application
6. If you want to login as Admin - use e-mail: admin@mail.com, password: admin
7. If you want to login as User - use e-mail: bob@mail.com, passwors: bob12345
  ![line](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png)
