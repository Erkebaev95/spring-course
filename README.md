# Spring course

## Introduction to Spring core

The Spring Framework is an application framework and inversion of control container for the Java platform. 
The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE (Enterprise Edition) platform. 
Although the framework does not impose any specific programming model, it has become popular in the Java community as an addition to the Enterprise JavaBeans (EJB) model. 
The Spring Framework is open source.

Spring framework consists of many components to facilitate many aspects of Java application.

* Application Context and Dependency Injection.
* Easy and efficient access to the database.
* Component for web application development in Java(Spring MVC).

Spring is a Java-based framework that provides a number of features and components for building Java applications, 
including support for IoC and DI. **Spring's IoC and DI** capabilities allow developers to build applications using a loosely coupled, modular approach, 
which can make the application more flexible and easier to maintain.

* In the context of the Spring framework, **Inversion of Control (IoC)** refers to the design principle in which an object's behavior is governed by an external entity rather than being hard-coded within the object itself. 
This is typically achieved through dependency injection, where the external entity provides an object with its dependencies, rather than the object creating them itself.

* **Dependency Injection (DI)** is a specific implementation of **IoC** that involves injecting the dependencies that an object requires into the object at runtime, rather than the object creating them itself. 
This allows the object to be more loosely coupled with its dependencies and makes it easier to change or swap out those dependencies at runtime.

## Spring MVC

The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that dispatches requests to handlers, 
with configurable handler mappings, view resolution, locale and theme resolution as well as support for uploading files. 
The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods. 
With the introduction of Spring 3.0, the @Controller mechanism also allows you to create RESTful Web sites and applications, 
through the @PathVariable annotation and other features.

- **Model**. The model contains application data. Usually includes POJO classes (Plain Old Java Objects) - plain old Java objects or, in other words, beans.
- **View**. Used to visualize and display application data using a user interface. Responsible for how the model data will look in the user's browser.
- **Controller**. The controller is needed to process user requests and call back-end services. It structures the request, creates an appropriate model for further display in the browser.
- **The Dispatcher Servlet** is the heart of Spring Web MVC, a fully customizable front controller that coordinates all request processing actions:

![img.png](img.png)

### Spring MVC configuration applications using Java code.

How to replace web.xml ?
Starting with version 3 of the Spring Framework, you can
use Java code instead of web.xml.
To do this, you need to create a Java class in the project,
which implements the interface
**org.springframework.web.WebApplicationInitializer**.

* Such a class is read automatically and works like **web.xml**.

But we will use an abstract class for the configuration
**AbstractAnnotationConfigDispatcherServletInitializer**.
This class was introduced in Spring 3.2 and it
implements the **WebApplicationInitializer interface**
for us.

![img_1.png](img_1.png)


