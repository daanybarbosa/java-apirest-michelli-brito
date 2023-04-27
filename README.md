# API REST com Spring Boot 
### Michelli Brito 
#### Link youtube: https://www.youtube.com/watch?v=bpBRFNKg8k4&t=97s
#### Link Github: https://github.com/MichelliBrito/produtos-apirest

## Iniciando projeto
### Spring Initializr: https://start.spring.io/
- Project: [Maven]
- Language: [Java]
- Spring Boot: [3.0.6]
- Project Metadata:
    - Group: [com.produtos]
    - Artifact: [apirest]
    - Name: [apirest]
    - Description: [API REST com Spring Boot]
    - Package Name: [com.produtos.apirest]
    - Packaging: [Jar]
    - Java: [17]
- Dependencies:
    - Spring Boot DevTools
    - Spring Web
    - Spring Data JPA
    - PostgreSQL Driver

## Arquitetura o projeto
- src/main/java: ficará as pastas/pacotes onde vão conter as classes Java
  - com.produtos.apirest.ApirestApplication: classe de inicialização do spring boot, sempre ficará na raiz do projeto.
- src/main/resources:
  - static: fica as views do projeto
  - templates: fica as views do projeto
  - application.properties: arquivo de configuração do banco de dados

## Acesso ao Banco de dados
- SQL Shell
  - Server [localhost]: [enter]
  - Database [postgres]: [produtos-apirest]
  - Port [5432]: [enter]
  - Username [postgres]: [enter]
  - Senha para o usuario postgres: [123456]


### produtos-apirest=#

**irá listar as tabelas**: ``$ \d``
``` 
    List of relations
    Schema |      Name      |   Type   |  Owner   
    --------+----------------+----------+----------
    public | tb_produto     | table    | postgres
    public | tb_produto_seq | sequence | postgres
```
**Inserir os primeiros registros:**
```
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (1, 'samsung s8', 1.00, 2599.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (2, 'Notebook Lenovo', 2.00, 3500.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (3, 'Macbook', 1.00, 8000.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (4, 'Iphone 8', 2.00, 4500.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (5, 'Notebook Lenovo', 1.00, 3500.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (6, 'Notebook Lenovo', 1.00, 3500.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (7, 'Moto G', 1.00, 1500.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (8, 'SmartTV LG 50', 1.00, 3550.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (9, 'SmartTV LG 65', 1.00, 4990.00);
INSERT INTO tb_produto(id, nome, quantidade, valor) VALUES (10, 'SmartTV LG 40', 1.00, 2500.00);
```

**Visualizar os registros da tabela**:
``` 
SELECT * FROM tb_produto;
```

- **Massa de dados do Postman**:
