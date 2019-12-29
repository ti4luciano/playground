package br.com.luciano.livraria.teste;

import br.com.luciano.livraria.produtos.Ebook;
import br.com.luciano.livraria.produtos.LivroFisico;
import br.com.luciano.livraria.Autor;
import br.com.luciano.livraria.produtos.Produto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luciano Alves
 */
public class RegistroDeVendas {

    public static void main(String args[]) {
        Autor autor = new Autor("Ariano Suassuna");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setTitulo("O auto da compadecida");
        livroFisico.setPreco(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setTitulo("Os homens de barro");
        ebook.setPreco(29.90);
        ebook.setWatermark("Livro do Luciano");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        List<Produto> prod = Arrays.asList(livroFisico, ebook);

        Collections.sort(prod);

        prod.forEach((produt) -> {
            System.out.println(">" + produt.getPreco());
        });

        carrinho.adiciona(livroFisico);
        carrinho.adiciona(ebook);

        ArrayList<Produto> produtos = carrinho.getProdutos();

        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println("Valor: " + produto.getPreco());
                System.out.println("Valor: " + produto);
            }
        }
    }
}
