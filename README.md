# JobListBackend (Spring Boot)

This is the backend repository of a Job Listing Application project built using **Spring Boot**. It handles the business logic, database operations, and provides RESTful APIs for managing job listings and user data. This project is intended for demonstration purposes and is not a fully functional website.

## Features

- RESTful API endpoints for managing job listings.
- CRUD operations (Create, Read, Update, Delete) for job listings.
- Integration with a MongoDB database.
- Basic error handling and validation.

## Tech Stack

- **Spring Boot** - Backend framework
- **MongoRepository** - For database interactions
- **Maven** - Dependency management

## Getting Started

### Prerequisites

Before running the project, ensure you have the following installed:

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html)

### API Endpoints
Here are some example API endpoints for interacting with the job listings:

### `GET /allPosts` - Get a list of all job listings
### `GET /post/{text}` - Get job listing with specific keyword
### `POST /post` - Create a new job listing

### Example Payload for Creating a Job
```
{
  "Profile": "Software Engineer",
  "exp": "1",
  "description": "Looking for a skilled software engineer to join our team.",
  "techs[]": ["Java", "Spring Boot", "SQL"]
}
```

## Contributing
Contributions are welcome! As of now, its just a basic project so Feel free to submit a pull request or open an issue to discuss improvements.
