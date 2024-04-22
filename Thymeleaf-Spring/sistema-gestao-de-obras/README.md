# SGO - Sistema de Gestão de Obras

O SGO (Sistema de Gestão de Obras) é uma aplicação web desenvolvida com Spring e Thymeleaf, projetada para auxiliar pequenas empresas da área de construção civil no gerenciamento de funcionários, cargos e custos relacionados a obras.

## Funcionalidades Principais

- **Cadastro de Funcionários:** Permite o registro e gerenciamento dos funcionários envolvidos nas obras.
- **Cadastro de Cargos:** Facilita a definição e organização dos diferentes cargos ocupados pelos funcionários.
- **Cadastro de Custos:** Permite o registro e acompanhamento dos custos relacionados às obras em andamento.

## Tecnologias Utilizadas

- **Spring Framework:** Utilizado para o desenvolvimento da camada de controle e acesso aos dados da aplicação.
- **Thymeleaf:** Utilizado para a construção das páginas HTML, facilitando a integração entre o front-end e o back-end.
- **Java:** Linguagem de programação principal do projeto.
- **HTML/CSS:** Utilizados para a estilização e estruturação das páginas web.

## Pré-requisitos

- JDK 17 ou superior

## Como Executar

1. Clone o repositório para a sua máquina local.
2. Importe o projeto em sua IDE preferida (Eclipse, IntelliJ, etc.).
3. Configure o banco de dados MySQL de acordo com as configurações definidas no arquivo `application.properties`.
4. Execute o comando `mvn spring-boot:run` na raiz do projeto para iniciar a aplicação.
5. Acesse a aplicação em seu navegador utilizando o endereço `http://localhost:8080`.
