package br.com.bibliotecasilva.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//indica que a classe Livro é uma entidade armazenável em banco de dados.
@Table(name = "tabela_livro")//associo explicitamente o nome da tabela que armazena.
public class Livro {
	
	
	@Column(name = "id")//define que o atributo é uma coluna.
	@Id//Aqui identificamos como chave primária.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//indica que esse atributo deve ser auto-incrementado
	private int id;
	
	@Column(name = "titulo",  length = 100)
	private String titulo;
	
	@Column(name = "autor",  length = 100)
	private String autor;
	
	@Column(name = "anoDePublicacao")
	private int anoDePublicacao;
	
	@Column(name = "categoria")
	private String categoria;
	
	
	@Column(name = "estante")
	private int estante;
	
	@Column(name = "prateleira")
	private int prateleira;
	
	@Column(name = "disponibilidade")
	private boolean disponibilidade;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEstante() {
		return estante;
	}
	public void setEstante(int estante) {
		this.estante = estante;
	}
	public int getPrateleira() {
		return prateleira;
	}
	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}
