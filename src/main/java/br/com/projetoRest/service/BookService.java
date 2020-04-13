package br.com.projetoRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.projetoRest.models.Book;
import br.com.projetoRest.repository.BookRepository;

@Component
public class BookService {
	
	@Autowired
	BookRepository bookRepository;

	public Book cadastrarBook(Book book) throws Exception {
		return bookRepository.save(book);
	}

	public Iterable<Book> buscaAllBooks() {
		return bookRepository.findAll();
	}

	public Book buscaBook(Long book_Id) {
		return bookRepository.findById(book_Id);
	}

	public Book alteraBook(Book book) throws Exception {	
		Book bookAlterado = bookRepository.findById(book.getId()); 
		bookRepository.save(book);
		return bookAlterado;
	}
	
	public Book deletaBook(Long book_id) {
		Book bookDeletado = bookRepository.findById(book_id); 
		bookRepository.delete(bookDeletado);
		return bookDeletado;
	}
}
