# Book Tracker API

A lightweight Spring Boot application that allows users to track books using a RESTful API. Built with Java 17, Spring Data JPA, and an in-memory H2 database. This project demonstrates lazy service loading and CRUD operations.

---

## Features

- REST API for managing books
- In-memory H2 database for testing
- Spring Data JPA repository pattern
- Lazy-loaded `BookService`
- Preloaded example data using `CommandLineRunner`

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

---

## How to Run Locally

1. **Clone the repository**
   ```bash
   git clone https://github.com/darianharropwilliams/booktracker.git
   cd booktracker
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

s3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Visit the API or H2 Console**
   - API: [http://localhost:8080/books](http://localhost:8080/books)
   - H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

   **JDBC URL:** `jdbc:h2:mem:booksdb`  
   **Username:** `sa`  
   **Password:** *(leave blank)*

---

## API Endpoints

| Method | Endpoint        | Description           |
|--------|-----------------|-----------------------|
| GET    | `/books`        | Get all books         |
| POST   | `/books`        | Add a new book        |
| DELETE | `/books/{id}`   | Delete a book by ID   |

### Example Request

```bash
# Add a new book
curl -X POST http://localhost:8080/books \
  -H "Content-Type: application/json" \
  -d '{"title": "1984", "author": "George Orwell"}'

# Get all books
curl http://localhost:8080/books

# Delete a book
curl -X DELETE http://localhost:8080/books/1
```

---

## Lazy Loading

This project demonstrates the use of `@Lazy` for initializing the `BookService` only when needed. Useful for large-scale applications where some services are expensive to instantiate.

---

## License

This project is open-source and available under the [MIT License](LICENSE).

---

##  Author

Created by [Darian Harrop-Williams](https://github.com/yourusername)
