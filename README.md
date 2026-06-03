# API Java - CRUD 

## Sobre o Projeto

Esta é uma API REST desenvolvida com Spring Boot para treinamento pessoal.

O projeto utiliza:

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Lombok

## Estrutura do Projeto

```text
src/main/java/com/example/apiJava
│
├── controller
│   └── ProdutoController.java
│
├── service
│   └── ProdutoService.java
│
├── repository
│   └── ProdutoRepos.java
│
├── model
│   └── Produto.java
│
└── ApiJavaApplication.java
```

## Modelo de Dados

### Produto

| Campo | Tipo   |
| ----- | ------ |
| id    | Long   |
| name  | String |
| price | Double |

## Configuração do Banco de Dados

Criar o banco:

```sql
CREATE DATABASE doma;
```

Configurar o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/doma?allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Dependências Principais

* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok

## Executando o Projeto

Clone o repositório:

```bash
git clone <url-do-repositorio>
```

Entre na pasta:

```bash
cd apiJava
```

Execute:

```bash
mvn spring-boot:run
```

Ou execute a classe:

```java
ApiJavaApplication
```

## Endpoints

### Listar Produtos

**GET**

```http
GET /produtos
```

Resposta:

```json
[
  {
    "id": 1,
    "name": "Notebook",
    "price": 3500.00
  }
]
```

## Arquitetura

A aplicação segue a arquitetura em camadas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL
```

### Responsabilidades

* Controller: Recebe requisições HTTP.
* Service: Contém as regras de negócio.
* Repository: Realiza acesso ao banco de dados.
* Model: Representa as entidades do sistema.

## Melhorias Futuras

* CRUD completo de produtos
* Validações de entrada
* Tratamento global de exceções
* Documentação Swagger/OpenAPI
* Autenticação JWT
* Testes unitários
* Docker
* Deploy em nuvem

## Autor

Desenvolvido por David Cordeiro Nascimento.
