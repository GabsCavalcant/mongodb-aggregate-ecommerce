Workshop Spring Boot & MongoDB 🍃
Este projeto é uma API REST desenvolvida durante o curso de Programação Orientada a Objetos com Java O objetivo principal foi aplicar o paradigma orientado a documentos utilizando Spring Boot e MongoDB.

🚀 Tecnologias Utilizadas
Java 17

Spring Boot 3+

Spring Data MongoDB

MongoDB Atlas / Local

Postman (para testes de API)

Chamada Do Postman
<img width="1527" height="930" alt="image" src="https://github.com/user-attachments/assets/5ac6b91d-b944-455e-b3fc-dab2f0261fbc" />


🏗️ Arquitetura do Projeto
O sistema segue o padrão de Arquitetura em Camadas:

Domain: Entidades principais (User, Post).

Repository: Interfaces de acesso aos dados com MongoRepository.

Service: Lógica de negócio e tratamento de exceções.

Resource (Controllers): Endpoints da API.

DTO (Data Transfer Object): Otimização do tráfego de dados e projeções.

🛠️ Funcionalidades Principais
CRUD Completo: Cadastro, listagem, atualização e deleção de usuários e posts.

Modelagem NoSQL: Uso de objetos aninhados (Comments) e referências (@DBRef) para associar posts a usuários.

Tratamento de Exceções: Retorno de erros padronizados (ex: ObjectNotFoundException).

Instanciação Automática: Carga inicial do banco de dados ao subir a aplicação (CommandLineRunner).

🔍 Consultas Avançadas (@Query)
Um dos pontos altos do projeto foi a implementação de buscas complexas no MongoDB:

Simple Search: Busca de posts por título.

Full Search: Busca avançada que cruza dados de título, corpo do post e comentários, filtrando também por um intervalo de datas.

Exemplo de Query Customizada:
<img width="1036" height="73" alt="image" src="https://github.com/user-attachments/assets/12f7c6a9-cc90-45ad-bb4b-45d129cd1d2e" />
📋 Como executar o projeto
Clone o repositório.

Certifique-se de que o MongoDB está rodando localmente ou configure seu cluster no Atlas.

Configure as credenciais no arquivo src/main/resources/application.properties.

Execute o comando ./mvnw spring-boot:run ou inicie pela sua IDE (NetBeans/IntelliJ).
