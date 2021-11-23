# Basic cinema application
## General info
The goal of this project is to create a basic model of a cinema ticket service

## The application offers this functionality:
- registration, login - for all
- get all cinema-halls, movies, available movie sessions - for Users and Administrators
- View shopping cart or order history - for Users
- add a cinema-hall, movie or movie session - for Administrators
- to make an order - for User
- refresh movie sessions - for Administrator
- add, remove ticket from shopping cart - for User
- delete movie session - for Administrator

The structure of the database can be seen below:
![pic](CinemaDB_Uml.png)

## The project was created using these technologies:
- Java 11
- MySQL
- Spring
- Hibernate
- Tomcat 9.0.54 (to run app locally)

## To start a project by your own you have to:
1) Fork and clone this project into your local directory and open the project in an IDE.
2) To configure the MySQL DBMS, provide the database URL and password, and username in the project directory.
<a href="https://github.com/Andruwa808/cinema-app/blob/master/src/main/resources/db.properties">resources/db.properties</a>.
3) Configure Apache Tomcat
4) Run this project using Tomcat
5) To sign in you can use default account:
- Admin - login: admin@gmail.com and password: 1234
- User - login: user@gmail.com and password: 1234
