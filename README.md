**Apache Camel Integration POC**
A Spring Boot and Apache Camel integration application demonstrating enterprise integration patterns (EIP) including file processing, message routing, validation, transformation, and REST service integration.

**Overview**
This project showcases how Apache Camel can be used to build integration solutions by processing shipment files, validating and transforming data, and invoking downstream REST services.

**Features**
File-based integration using Apache Camel File Component
Record validation and transformation
Enterprise Integration Patterns (EIP)
Splitter
Content-Based Routing
Processor
Validator
REST service integration
Exception handling
Maven-based build
Spring Boot integration

**Technology Stack**
Java 21
Spring Boot
Apache Camel
Maven
REST APIs
Postman
Git

**Project Flow**
Input File
    |
    v
File Route
    |
    v
Split Records
    |
    v
Validate Records
    |
    v
Transform Data
    |
    v
Invoke REST Service
    |
    v
Success Response
