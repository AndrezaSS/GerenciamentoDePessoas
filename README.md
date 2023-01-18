<h1 align = "center"> 💻 Gerenciamento de Pessoas </h1>

## Definição:
Trata-se da criação de um gerenciamento de usuários que permita realizar um CRUD para o cadastro de pessoas e endereços. 

## Habilidades utilizadas:

Foram utilizados os conceitos de Java com orientação a Objetos, onde classes foram criadas para representar as entidades gerenciadas. Para armazenar os dados foi utilizado o h2 e para criação do projeto foi utilizado o o Maven com Spring Boot (Java Web, actuator, data jpa, h2, Lombok).	

## ⚙️ Tecnologias necessárias para utilização do sistema:
+ Java 19
+ Apache Maven
+ Spring Boot 3.0.1
+ Spring Data JPA
+ Lombok
+ H2 
+ Postman

## Caso de uso do sistema:
O sistema permite o cadastro de novos usuários, incluindo dados pessoais (nome, data de nascimento) e endereço (Logadouro, CEP, número e cidade0. Nesse projeto, é possível:

+ Criar uma pessoa
+ Editar uma pessoa
+	Consultar uma pessoa
+ Listar pessoas
+	Criar endereço para pessoa
+	Poder informar qual endereço é o principal da pessoa

## Endpoints:

### Pessoas:

Para a manipulação dos Endpoints foi ultilizado o Postman.

-	`Get` Buscar pessoas: http://localhost:8080/pessoas
-	`Get` Buscar pessoa por id: http://localhost:8080/pessoa/{id}

- exemplo:
- ![image](https://user-images.githubusercontent.com/108132741/213063054-b9619983-cd89-40b8-abb9-ade1c720c5cd.png)


-	`Post` Criar pessoa: http://localhost:8080/pessoa
-	`Put` Alterar pessoa: http://localhost:8080//alterapessoa/{id}

## Banco de Dados- H2:

![image](https://user-images.githubusercontent.com/108132741/213057137-dd2b6595-bbe8-452d-b1b1-7081fab8b71c.png)
