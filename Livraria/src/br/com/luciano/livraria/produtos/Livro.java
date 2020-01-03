package br.com.luciano.livraria.produtos;

import br.com.luciano.livraria.Autor;
import br.com.luciano.livraria.exception.AutorNuloException;

/**
 *
 * @author Luciano Alves
 */
public abstract class Livro implements Produto {

    private Autor autor;
    private String titulo;
    private String descricao;
    private String isbn;
    private double preco;

    public Livro(Autor autor) {
        this();
        if (autor == null) {
            throw new AutorNuloException(
                    "O autor não pode ser nulo");
        }
        this.autor = autor;
    }

    public Livro() {
        this.isbn = "000-0000-0000-00";
    }

    public void mostraDetalhes() {
        System.out.println("Detalhes do Livro");
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Autor: " + autor.getName());
        System.out.println("Preço: " + this.preco);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("--");
    }

    @Override
    public String toString() {

        mostraDetalhes();
        String test = "";
        return test;
    }

    @Override
    public int compareTo(Produto outroProduto) {

        return (int) (this.getPreco() - outroProduto.getPreco());
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Autor getAutor() {
        return this.autor;
    }

}
