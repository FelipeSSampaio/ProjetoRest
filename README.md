# ProjetoRest
Projeto RestFul com Spring Boot, H2, Swagger2 e Project Lombok

- [X] Spring Boot
- [X] H2
- [X] Swagger
- [X] Project Lombok
- [ ] Junit

----------------------
PASSOS NECESSÁRIOS
----------------------

1 - Spring Boot

Como estamos lidando com um projeto Spring Boot, basta rodar a classe de aplicação e ele irá baixar as dependências e subir o app.

2 - Maven

Caso queira colocar num servidor separado, terá que criar o Jar, War ou EAR para subir no seu servidor.
   Nesse caso, crie através do comando: '''mvn install''' 

3 - Banco de Dados

Nesse projeto estou usando o H2, então não é preciso instalar nada.

OBS: Atenção ao fato de que o projeto está usando devtools. Ocorre que qualquer alteração no código enquanto o mesmo está rodando fará limpará o banco. Você pode definir um arquivo data.sql com inserts se quiser manter alguns dados pré-estabelecidos.

4 - Swagger

Para acessar o Swagger no browser: http://localhost:8080/swagger-ui.html

Embora dentro do Swagger tenha os exemplos de envio de JSON para cada situação, listo opções abaixo como exemplo:

Exemplo de adição de um livro

```
{
   "nome":"O livro dos leigos",
   "edicao":"1ª Edição",
   "anoPublicacao":2009,
   "editora":"Editora Nova"
}
```

Exemplo de Edição de livro, com alguns campos alterados:

```
{
   "id":1,
   "nome":"O livro dos leigos",
   "edicao":"2ª Edição",
   "anoPublicacao":2013,
   "editora":"Editora Inciante"
}
```

Para excluir um livro ou realizar uma busca de livro basta a url com o id do livro, exemplo:

-Buscar
http://localhost:8080/buscaBook/1

-Excluir
http://localhost:8080/deletaBook/1

Ainda existe a opção de buscar todos os livros que são listados na raiz do projeto
http://localhost:8080/

----------------------
PROBLEMAS ENFRENTADOS
----------------------
Pode ser que seu eclipse fique reclamando da versão do Maven assim como o meu ficou. Nesse caso basta adicionar o seguinte código no seu pom.xml:

```
<properties>
	<java.version>1.8</java.version>
	<maven-jar-plugin.version>3.1.1</maven-jar-plugin.version>
</properties>
```
