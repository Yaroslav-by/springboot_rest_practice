# Spring Boot REST API App
<a name="readme-top"></a>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/Yaroslav-by/springboot_rest_practice">
    <img src="https://download.logo.wine/logo/Spring_Framework/Spring_Framework-Logo.wine.png" alt="Logo" width="300" height="200">
  </a>

<h3 align="center">Spring Boot REST API App</h3>

  <p align="center">
    Simple REST API app that uses Spring Boot Framework, Hibernate, MySQL.
    <br />
    <br />
    <a href="https://github.com/Yaroslav-by/springboot_rest_practice">View Demo</a>
    ·
    <a href="https://github.com/Yaroslav-by/springboot_rest_practice/issues">Report Bug</a>
    ·
    <a href="https://github.com/Yaroslav-by/springboot_rest_practice/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
This is simple RESTful App on Spring Boot. The application implements CRUD (Create, Read, Update, Delete) operations on clients. <br>
You can see all HTTP methods, URLs and CRUD operations in the following table. <br><br>
<p align="center">
<a href="https://ibb.co/9pMC28w"><img src="https://i.ibb.co/TwCFRvK/image.png" alt="image" border="0" /></a>
</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* Java
* Spring Boot Framework
* MySQL Database

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/Yaroslav-by/springboot_rest_practice
   ```
2. Create database in MySQL database.
3. Connect database with Java via application.properties.
```Java
    spring.datasource.url=jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC
    spring.datasource.username={Your username}
    spring.datasource.password={Your password}
    
    server.port=3333
    server.servlet.context-path=/springboot-rest
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- USAGE EXAMPLES -->
## Usage
By using GET-request "api/employees", you get all Employees from Database in JSON format. <br>
<a href="https://ibb.co/Qd6BpM8"><img src="https://i.ibb.co/0tfNmrB/image.png" alt="image" border="0" /></a> <br><br>

By using GET-request "api/employees/{employeeID}", you get Employee by ID from Database in JSON format. <br>
<a href="https://ibb.co/9rG91Yf"><img src="https://i.ibb.co/3Ckyjh8/image.png" alt="image" border="0" /></a> <br><br>

By using POST-request "api/employees" with BODY filled with information about employee in JSON format, 
you add new Employee in Database with filled information. Also, as a response you get information about new employee with generated ID in JSON format<br>
<a href="https://ibb.co/qyhySW0"><img src="https://i.ibb.co/Vjbj1QH/image.png" alt="image" border="0" /></a> <br><br>

By using PUT-request "api/employees" with BODY filled with changed information about employee(with ID) in JSON format, 
you change Employee by ID in Database with filled information. Also, as a response you get information about employee with changed information in JSON format<br>
<a href="https://ibb.co/HdT5PNj"><img src="https://i.ibb.co/FV4RYsF/image.png" alt="image" border="0" /></a> <br><br>

By using DELETE-request "api/employees{employeeID}" you delete Employee by ID in Database. Also, as a response you get information about it <br>
<a href="https://ibb.co/y8SZWMm"><img src="https://i.ibb.co/zSJBGLW/image.png" alt="image" border="0" /></a>
<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

- [+] Congiguration Spring Boot App
- [+] Hibernate realisation
- [+] JPA realisation
- [-] New features, such as search, filter etc.


<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Yaroslav Salnikov - asgen-yaroslav@mail.ru

Project Link: [Spring Boot REST API App](https://github.com/Yaroslav-by/springboot_rest_practice)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
