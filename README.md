# NimapMachineTest

A Spring Boot REST API for managing **Categories** and **Products** with a one-to-many relationship, including full CRUD operations and server-side pagination.

---

## 📦 Features

- Category CRUD (Create, Read, Update, Delete)
- Product CRUD (Create, Read, Update, Delete)
- One-to-Many relationship between Category and Product
- Server-side pagination for both Category and Product
- JSON API responses
- Uses relational database (MySQL/PostgreSQL)
- Annotation-based configuration (No XML)

---

## 🚀 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or any RDBMS)
- Maven
- Postman / Swagger for testing

---




---

## 🔗 API Endpoints

### Category APIs
| Method | Endpoint                      | Description                     |
|--------|-------------------------------|---------------------------------|
| POST   | `/api/categories/add`         | Create a new category           |
| GET    | `/api/categories/all`         | Get all categories              |
| GET    | `/api/categories/{id}`        | Get category by ID              |
| PUT    | `/api/categories/{id}`        | Update category by ID           |
| DELETE | `/api/categories/delete/{id}` | Delete category by ID           |
| GET    | `/api/categories`             | Get categories (paginated)      |

### Product APIs
| Method | Endpoint                      | Description                     |
|--------|-------------------------------|---------------------------------|
| POST   | `/api/products/save`          | Create a new product            |
| GET    | `/api/products/all`           | Get all products                |
| GET    | `/api/products/{id}`          | Get product by ID               |
| PUT    | `/api/products/{id}`          | Update product by ID            |
| DELETE | `/api/products/{id}`          | Delete product by ID            |
| GET    | `/api/products`               | Get products (paginated)        |

---

## ⚙️ Configuration

### `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/NimapCompany?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect



🧪 Testing the API
Use Postman or Swagger to test endpoints.

For paginated APIs:

arduino
Copy
Edit
GET /api/categories?page=0&size=5
GET /api/products?page=1&size=10
For adding Category:

json
Copy
Edit
{
  "category_name": "Electronics"
}
For adding Product:

json
Copy
Edit
{
  "product_name": "iPhone",
  "product_price": 999.99,
  "product_description": "Latest model",
  "category": {
    "category_id": 1
  }
}






