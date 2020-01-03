package br.com.luciano.livraria.produtos;

import br.com.luciano.livraria.Editora;

/**
 *
 * @author Luciano Alves
 */
public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double preco;
    private Editora editora;

    @Override
    public boolean descontoDe(double desconto) {
        if (desconto > 0 && desconto < 0.1) {
            double valor = this.preco * desconto;
            this.preco -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public int compareTo(Produto outraRevista){
        
        return (int) (this.getPreco() - outraRevista.getPreco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public void setPreco(double valor) {
        this.preco = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
