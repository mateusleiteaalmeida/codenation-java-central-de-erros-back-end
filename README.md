<h1 align="center">
  <img src="./assets/siren.gif">
  <br />
  Central de erros
</h1>


## Projeto

Este é um projeto desenvolvido durante a aceleração em Java da Codenation. O projeto busca implementar uma API Rest para centralizar o registro de erros de aplicações. Este repositório contém a parte do back-end da aplicação.

A API apresenta as seguintes funcionalidades:
<ul>
<li>Permite a autenticação do sistema que deseja utilizar a API gerando o Token de Acesso</li>
      <li>Pode ser acessada por múltiplos sistemas</li>
      <li>Permite gravar registros de eventos de log salvando informações de Level(error, warning, info), Descrição do Evento, LOG do Evento, ORIGEM(Sistema ou Serviço que originou o evento), DATA(Data do evento), QUANTIDADE(Quantidade de Eventos de mesmo tipo)</li>
      <li>Permite a listagem dos eventos juntamente com a filtragem de eventos por qualquer parâmetro especificado acima</li>
      <li>Suporta Paginação</li>
      <li>Suporta Ordenação por diferentes tipos de atributos</li>
      <li>A consulta de listagem não retorna os LOGs dos Eventos</li>
      <li>Permite a busca de um evento por um ID, exibindo o LOG desse evento em específico</li>
</ul>

O repositório do front-end da aplicação pode ser acesso nesse [link](https://github.com/mateusleiteaalmeida/codenation-react-central-de-erros-front-end).


## Tecnologias

Esse projeto foi desenvolvido utilizando as seguintes tecnologias:

- [Spring Boot](https://spring.io/)
- [Hibernate](https://hibernate.org/)
- [H2](https://www.h2database.com/html/main.html)
- [Swagger](https://swagger.io/)


## Colaboradores
[Ana Caroline Andrade](https://github.com/CarolSi-hub)</li></br>
[Filipi Firmino](https://github.com/ic3web)</li></br>
[Mateus Leite](https://github.com/mateusleiteaalmeida)</li>
</ul>


## Empresas colaboradoras
Projeto desenvolvido por [Codenation](https://www.codenation.dev/) e [Trybe](https://www.betrybe.com/) com a colaboração da [Conta Azul](https://contaazul.com/).
