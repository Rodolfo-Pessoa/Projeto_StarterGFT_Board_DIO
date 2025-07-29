# 📝 BoardDio

Projeto desenvolvido como parte do programa **GFT START #Java** em parceria com a DIO (Digital Innovation One).

Este projeto é uma aplicação simples de gerenciamento de tarefas com usuários e tarefas persistidos em banco de dados utilizando Spring Boot e JPA.

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (banco em memória)
- Jakarta Annotations
- Maven

## 📦 Estrutura do Projeto

br.com.dio.BoardDio
│
├── model/
│ ├── User.java
│ └── Task.java
│
├── repository/
│ ├── UserRepository.java
│ └── TaskRepository.java
│
├── BoardDioApplication.java


## 💡 Funcionalidades

- Cadastro de usuários
- Cadastro de tarefas vinculadas a usuários
- Persistência automática via `JpaRepository`
- Inicialização com dados via `@PostConstruct`

