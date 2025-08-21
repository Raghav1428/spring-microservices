# Microservices with Spring Boot

![Java](https://img.shields.io/badge/Java-17-blue.svg)  ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen.svg)  ![Maven](https://img.shields.io/badge/Maven-3.9.11-orange.svg) ![Latest Commit](https://img.shields.io/github/last-commit/Raghav1428/spring-microservices?logo=github)


A learning project to explore and build microservices using **Spring Boot**. This repository will gradually evolve as different microservices are added and integrated.

---

## 📑 Table of Contents
- [Introduction](#-introduction)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure-initial)
- [Getting Started](#-getting-started)
- [Build & Run](#-build--run)
- [Planned Features](#-planned-features)

## 🚀 Introduction
This project is created as part of my journey to learn **Microservices Architecture with Spring Boot**.  
Initially, this repo contains only the base project setup. Over time, I will be adding:
- Individual microservices (e.g., Customer, Fraud, API Gateway, etc.)
- Service discovery (Eureka/Consul)
- Inter-service communication
- Centralized configuration
- Monitoring and logging

Stay tuned as the repo grows into a full-fledged microservice ecosystem.

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot 3.5.3**
- **Maven** for build and dependency management
- **Lombok** for reducing boilerplate code

## 📂 Project Structure (initial)
```
microservices/
├── .mvn/
│ ├── jvm.config
│ └── maven.config
├── pom.xml
├── README.md
```

As development progresses, individual microservices will be added as separate modules inside this repository.

## ⚙️ Getting Started

### Prerequisites
- Install **Java 17**
- Install **Maven 3.9+**
- Clone this repository

```bash
git clone https://github.com/Raghav1428/spring-microservices.git
cd microservices
```

### Build the Project
```bash
mvn clean install
```


## ▶️ Build & Run

Since no microservices are implemented yet, this base project is not executable. Once services are added, instructions will be updated here.

## 📌 Planned Features

✅ Base Maven + Spring Boot setup

⏳ Add first microservice

⏳ Implement service discovery

⏳ Add API Gateway

⏳ Centralized configuration

⏳ Distributed tracing and monitoring

