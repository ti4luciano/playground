package br.com.luciano.livraria.teste;

import br.com.luciano.livraria.produtos.Produto;
import java.util.ArrayList;

/**
 *
 * @author Luciano Alves
 */
public class CarrinhoDeCompras {

    private double total;
    private ArrayList<Produto> produtos;
    
    public CarrinhoDeCompras(){
    this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto) {
        System.out.println("Produto adicionado: ");
        this.produtos.add(produto);
        this.total += produto.getPreco();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return this.total;
    }

}
