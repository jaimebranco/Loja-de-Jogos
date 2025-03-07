# Projeto Loja de Games 🎮

<div align="center">
  <strong>🚀 Descrição do Projeto 📚</strong>
</div>

<div align="center">
  <p>O **Projeto Loja de Games** é um sistema de gerenciamento de vendas de jogos, desenvolvido com **Spring Boot**. Ele permite aos usuários visualizar, adicionar, editar, excluir e comprar jogos, oferecendo um gerenciamento completo dos produtos disponíveis na loja.</p>
  <p>Este projeto foi desenvolvido como parte de um **projeto acadêmico**, com o objetivo de aplicar conceitos de **Java**, **Spring Boot**, e **CRUD** (Create, Read, Update, Delete).</p>
  <p>O sistema inclui funcionalidades como cadastro de produtos, visualização do estoque, atualização e exclusão de jogos, e a capacidade de realizar compras simuladas, proporcionando uma experiência prática de desenvolvimento com **Spring Boot** e **MySQL**.</p>
</div>

## 📖 Índice

- [Visão Geral](#visão-geral)
- [Tecnologias](#tecnologias)
- [Funcionalidades](#funcionalidades)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Licença](#licença)

## 🔭 Visão Geral

O **Projeto Loja de Games** é um sistema de gestão de uma loja de jogos desenvolvido com **Spring Boot** e **MySQL**, incluindo as operações de CRUD. As principais funcionalidades incluem:

- **Cadastro de Jogos**: O administrador pode adicionar novos jogos à loja.
- **Visualização de Produtos**: O sistema permite visualizar todos os jogos cadastrados.
- **Edição e Exclusão de Jogos**: O administrador pode editar ou excluir jogos do sistema.
- **Simulação de Compras**: Os usuários podem simular compras com base no estoque disponível.
- **Interface Simples**: O sistema é acessado via API RESTful, utilizando o **Spring Boot** para as operações de backend.

Este projeto é ideal para quem está aprendendo a integrar **Spring Boot**, **MySQL** e operações CRUD em uma aplicação prática.

## 💻 Tecnologias

- **Java** (linguagem de programação)
- **Spring Boot** (framework para desenvolvimento de aplicações Java)
- **MySQL** (banco de dados)
- **Spring Data JPA** (para persistência de dados)
- **Thymeleaf** (para templates, caso haja front-end em HTML)
- **Spring Tools Suite** (IDE utilizada para o desenvolvimento)

## 🛠️ Funcionalidades

- **Cadastro de Jogos**: O administrador pode adicionar jogos à loja, incluindo nome, preço e descrição.
- **Visualização de Produtos**: Os usuários podem visualizar todos os jogos disponíveis no sistema.
- **Edição de Produtos**: O administrador pode editar os jogos, alterando informações como preço, descrição e quantidade.
- **Exclusão de Produtos**: O administrador pode excluir jogos da loja.
- **Realização de Compras**: O usuário pode simular compras de jogos.

## ⚙️ Configuração do Ambiente

1. **Clonando o Repositório**:
   ```bash
   git clone https://github.com/Shost01/Projeto_Loja_de_Games.git

2. **Pré-requisitos**:

- Java versão 8 ou superior.
- MySQL instalado e configurado.
- Spring Tools Suite ou outra IDE de sua preferência.

3. **Configuração do Banco de Dados**:

- O banco de dados será criado automaticamente ao iniciar o projeto, desde que a configuração esteja correta no arquivo **application.properties**.
- Verifique se o arquivo **application.properties** contém as configurações adequadas para o banco de dados
   **application.properties**:
  
      spring.datasource.url=jdbc:mysql://localhost:3306/loja_de_games
      spring.datasource.username=root
      spring.datasource.password=root
      spring.jpa.hibernate.ddl-auto=update

4. **Compilando e Executando o Projeto**:

- Abra o projeto na sua IDE e execute o arquivo **Application.java** para rodar o servidor Spring Boot.
- O sistema estará acessível via API RESTful (por padrão, na URL **http://localhost:8080**).

5. **Testando o CRUD**:

- Utilize ferramentas como Postman ou Insomnia para testar as operações de CRUD:
**POST /games**: Adiciona um novo jogo.
**GET /games**: Retorna todos os jogos cadastrados.
**GET /games/{id}**: Retorna os detalhes de um jogo específico.
**PUT /games/{id}**: Atualiza as informações de um jogo.
**DELETE /games/{id}**: Exclui um jogo da loja.
