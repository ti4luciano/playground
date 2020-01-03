package br.com.luciano.livraria.teste;


/**
 *
 * @author Luciano Alves
 */

public class Fornecedor  {

    private long id;
    private String nome;
    private String email;

    public Fornecedor() {
    }

    public void inserNewFornecedor(String nome, String email) {

        this.email = email;
        this.nome = nome;

    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
