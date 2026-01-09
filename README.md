# Task Tracker

A full-stack task management application built with Spring Boot (backend) and React + TypeScript (frontend). It lets users create lists, manage tasks, set priorities and due dates, and track progress.

## Features

- Task lists: create, update, delete, and view progress
- Tasks: CRUD operations within lists
- Priority: HIGH, MEDIUM, LOW
- Status: OPEN, CLOSED
- Due dates and descriptions
- Dark mode UI and responsive design

## Tech Stack

- Backend: Spring Boot 3, Java 21, Spring Data JPA, PostgreSQL (prod), H2 (test), Maven
- Frontend: React 18, TypeScript, Vite, Tailwind CSS, NextUI, Axios, React Router

## Project Structure

```
tasks/
├── src/
│   ├── main/
│   │   ├── java/com/raed/tasks/
│   │   │   ├── controllers/
│   │   │   ├── domain/
│   │   │   │   ├── dto/
│   │   │   │   └── entities/
│   │   │   ├── mappers/
│   │   │   ├── repositories/
│   │   │   ├── sevices/
│   │   │   └── TasksApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── banner.txt
│   └── test/
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── domain/
│   │   ├── App.tsx
│   │   ├── AppProvider.tsx
│   │   └── main.tsx
│   ├── package.json
│   ├── vite.config.ts
│   └── tailwind.config.js
├── pom.xml
└── docker-compose.yml
```

## Getting Started

### Prerequisites

- Java 21+
- Node.js 20+
- Maven (or Maven Wrapper)
- Docker (optional)
- PostgreSQL (for production/dev DB)

### Backend Setup (Windows)

1. Start PostgreSQL via Docker:
   ```bash
   docker-compose up -d
   ```

2. Configure database in src/main/resources/application.properties:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
   spring.datasource.username=postgres
   spring.datasource.password=changeme
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Run the backend:
   ```bash
   mvnw.cmd spring-boot:run
   ```
   Backend is available at http://localhost:8080

### Frontend Setup

1. Open terminal in frontend folder:
   ```bash
   cd frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start dev server:
   ```bash
   npm run dev
   ```
   Frontend is available at http://localhost:5173

## API Overview

- Task Lists
  - GET /task-lists
  - POST /task-lists
  - GET /task-lists/{id}
  - PUT /task-lists/{id}
  - DELETE /task-lists/{id}

- Tasks
  - GET /task-lists/{listId}/tasks
  - POST /task-lists/{listId}/tasks
  - GET /task-lists/{listId}/tasks/{taskId}
  - PUT /task-lists/{listId}/tasks/{taskId}
  - DELETE /task-lists/{listId}/tasks/{taskId}

## Development

- Run backend tests:
  ```bash
  mvnw.cmd test
  ```
- Build backend:
  ```bash
  mvnw.cmd clean package
  ```
- Build frontend:
  ```bash
  cd frontend
  npm run build
  ```

## Environment Variables

- Backend (application.properties):
  - spring.datasource.url
  - spring.datasource.username
  - spring.datasource.password

- Frontend (.env):
  - VITE_API_BASE_URL=http://localhost:8080

## License

MIT License
