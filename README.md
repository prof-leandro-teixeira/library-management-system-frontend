# 📚 Library Frontend - Spring Boot 3.0.6

Sistema de gerenciamento de biblioteca desenvolvido com Spring Boot 3.0.6, utilizando arquitetura MVC, Thymeleaf como motor de template e banco de dados PostgreSQL. Ideal para estudos e demonstrações de boas práticas com Java, Spring, JPA e segurança com Spring Security.

---

## 🚀 Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.0.6  
  - Spring Web  
  - Spring Data JPA  
  - Spring Security  
  - Thymeleaf  
  - Actuator  
- PostgreSQL  
- Hibernate Validator  
- Lombok  
- Maven  

---

## 📁 Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/
│   │   └── com/example/library
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   │   └── application.properties
└── test/
```

---

![Exemplo de tela](static/login.png)
![Exemplo de tela](static/admin.png)
![Exemplo de tela](static/adicionar.png)
![Exemplo de tela](static/produto_add.png)
![Exemplo de tela](static/user_read_only.png)


## ⚙️ Configuração da Aplicação

No arquivo `application.properties`:

```properties
# Endpoints disponíveis via Actuator
management.endpoints.web.exposure.include=health,info,beans,conditions

# Configurações do banco de dados
spring.datasource.url=jdbc:postgresql://localhost:5432/librarydb
spring.datasource.username=postgres
spring.datasource.password=123456
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update

# Configurações de desenvolvimento
spring.devtools.restart.poll-interval=2s
spring.devtools.restart.quiet-period=1s

# Internacionalização
spring.web.locale=pt_BR
```

> 💡 **Dica:** Certifique-se de que o PostgreSQL esteja rodando com o banco `librarydb` criado e as credenciais estejam corretas. Use ferramentas como **DBeaver** ou **pgAdmin** para facilitar a visualização dos dados.

---

## 🛠️ Como Rodar Localmente

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/library-frontend-sb-3.0.6.git
```

2. Configure o PostgreSQL:

- Crie o banco de dados `librarydb`.
- Atualize o `application.properties` com suas credenciais.

3. Compile e execute o projeto:

```bash
./mvnw spring-boot:run
```

---

## 📌 Funcionalidades

- ✅ Cadastro e listagem de livros  
- 🖥 Interface web com Thymeleaf  
- 🔒 Segurança com Spring Security  
- 📊 Monitoramento com Actuator  
- ✅ Validações com Hibernate Validator  

---

## 🧠 Boas Práticas

- Arquitetura em camadas (MVC)  
- Uso do padrão SOLID  
- Separação de responsabilidades  
- Configuração por ambiente  
- Uso de DevTools para hot reload  

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT.  
Sinta-se livre para usar e contribuir!

---

Desenvolvido por Leandro Teixeira
