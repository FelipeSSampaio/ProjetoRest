package br.com.projetoRest.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projetoRest.models.Book;

public interface BookRepository extends CrudRepository<Book, String>{
	Book findById(long codigo);
}
