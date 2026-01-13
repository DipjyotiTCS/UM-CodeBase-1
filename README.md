# User Management Module (Spring Boot 3.5.0, Java 21, PostgreSQL)

## What’s included
- 3-layer architecture: Controller → Service → Repository
- Entities: User, Address, Designation, Organization (JPA/Hibernate)
- Authentication:
  - `/api/auth/register` (register a user)
  - `/api/auth/login` (authenticate and get JWT)
  - `/api/auth/validate` (validate token)
- Sample secured endpoint:
  - `/api/users/me` (requires Bearer token)
- Spring Security stateless JWT filter (JJWT)

## How to run
1. Create a PostgreSQL DB:
   - database: `user_management`
   - update `src/main/resources/application.yml` with correct username/password

2. Run:
```bash
mvn spring-boot:run
```

## Example requests

### Register
```bash
curl -X POST http://localhost:8080/api/auth/register   -H "Content-Type: application/json"   -d '{
    "username":"jdoe",
    "email":"jdoe@example.com",
    "password":"ChangeMe123!",
    "fullName":"John Doe",
    "designationTitle":"Engineer",
    "organizationName":"Acme Corp",
    "address":{
      "line1":"1 Main St",
      "line2":"",
      "city":"New York",
      "state":"NY",
      "postalCode":"10001",
      "country":"USA"
    }
  }'
```

### Login
```bash
curl -X POST http://localhost:8080/api/auth/login   -H "Content-Type: application/json"   -d '{"usernameOrEmail":"jdoe","password":"ChangeMe123!"}'
```

### Validate token
```bash
curl http://localhost:8080/api/auth/validate   -H "Authorization: Bearer <TOKEN>"
```

### Call secured endpoint
```bash
curl http://localhost:8080/api/users/me   -H "Authorization: Bearer <TOKEN>"
```

## Notes
- For production, replace `app.security.jwt.secret` with a strong secret and store it securely (Vault / env vars).
- You can expand the model with Roles/Authorities, refresh tokens, password reset, etc.
