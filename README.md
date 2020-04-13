# ProjetoRest
Projeto RestFul com Spring Boot, H2, Swagger2 e Project Lombok




Embora dentro do Swaager tenha os exemplos de envio de JSON para cada situação, listo opções abaixo como exemplo:

Exemplo de adição de um livro

```
{
   "nome":"O livro dos leigos",
   "edicao":"1ª Edição",
   "anoPublicacao":2009,
   "editora":"Editora Nova"
}
```

Exemplo de Edição de livro

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
