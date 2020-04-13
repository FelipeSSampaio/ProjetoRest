package br.com.projetoRest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="book_sequence")
	@SequenceGenerator(name="book_sequence", sequenceName="book_sequence")
	private long id;
	
	private String nome;
	private String edicao;
	private int anoPublicacao;
	private String editora;

}
