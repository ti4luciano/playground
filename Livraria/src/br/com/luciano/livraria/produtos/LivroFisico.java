package br.com.luciano.livraria.produtos;

import br.com.luciano.livraria.produtos.Livro;
import br.com.luciano.livraria.Autor;

/**
 *
 * @author Luciano Alves
 */
public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean descontoDe(double desconto) {

        if (desconto > 0.3 && desconto > 0) {
            return false;
        } else {
            double valor = this.getPreco() * desconto;
            this.setPreco(this.getPreco() - valor);
            return true;
        }

    }

    public double taxaDeImpressao() {
        return this.getPreco() * 0.05;
    }
}
