package br.com.projetoRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoRest.exception.NotFoundException;
import br.com.projetoRest.models.Book;
import br.com.projetoRest.service.BookService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@PostMapping(value="/cadastrarBook", consumes="application/json")
	@ApiOperation(value="Método para salvar um book")
	public Book cadastraBook(@RequestBody Book book) throws Exception {
		return bookService.cadastrarBook(book);
	}
	
	@GetMapping(value="/")
	@ApiOperation(value="Método para listar todos os books")
	public Iterable<Book> buscaAllBook() {
		return bookService.buscaAllBooks();
	}
	
	@GetMapping(value="/buscaBook/{book_id}")
	@ApiOperation(value="Método para listar um livro específico")
	public Book buscaBook(
				@ApiParam(name="book_id", value="Id do book", required = true, example = "1") @PathVariable long book_id
			) {
		return bookService.buscaBook(book_id);
	}
	
	@PutMapping(value="/alteraBook/")
	@ApiOperation(value="Método para alterar um livro específico")
	public Book alteraBook(@RequestBody Book book) throws Exception {
		if(book.getId() == 0) {
			throw new NotFoundException("O id do livro precisa ser informado.");
		}
		return bookService.alteraBook(book);
	}
	
	@DeleteMapping(value="/deletaBook/{book_id}")
	@ApiOperation(value="Método para deletar um livro específico")
	public Book deletaBook(
			@ApiParam(name="book_id", value="Id do book", required = true, example = "1") @PathVariable long book_id 
			) {
		return bookService.deletaBook(book_id);
	}
}
