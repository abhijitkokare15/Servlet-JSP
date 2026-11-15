# Servlet and JSP Learning Projects

This repository contains a collection of Java web application exercises and examples built while learning Java Servlets and JavaServer Pages (JSP). The projects are organized in an Eclipse workspace under `eclipse-workspace/`.

## Topics covered

The workspace includes examples related to:

- Servlet-based web applications
- JSP basics, tags, and functions
- Filters, cookies, and URL rewriting
- Exception handling
- Login and database-related exercises

Each subfolder is a separate exercise or web application. There is no single build or launch command for the entire workspace.

## Getting started

1. Install a JDK and Eclipse IDE for Enterprise Java and Web Developers.
2. Install a servlet container compatible with the individual project (for example, Apache Tomcat).
3. In Eclipse, import the relevant project from `eclipse-workspace/` using **File → Import → Existing Projects into Workspace**. If a project is not detected automatically, create or configure it as a Dynamic Web Project and point Eclipse at its existing source and web content.
4. Configure the project's target runtime and any database connection or dependencies it requires.
5. Run the project on the configured server.

The repository does not specify a common JDK, servlet API, server, or database version, so those may need to be adjusted for each exercise.

## Repository layout

`eclipse-workspace/` contains the Eclipse workspace and the individual exercises. Its project folders include examples for cookies, exception handling, filters, JSP tags and functions, login, and web application basics.

## Notes

The `.gitignore` excludes generated Java build output and local Eclipse workspace metadata. Eclipse project configuration files are not ignored, so project-specific settings can be shared when present.
