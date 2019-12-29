package br.com.luciano.livraria.produtos;

import br.com.luciano.livraria.produtos.Promocional;
import br.com.luciano.livraria.produtos.Livro;
import br.com.luciano.livraria.Autor;

/**
 *
 * @author Luciano Alves
 */
public class Ebook extends Livro implements Promocional{

    private String waterMark;
    

    public Ebook(Autor autor) {
        super(autor);
    }

    public String getWatermark() {
        return this.waterMark;
    }

    public void setWatermark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public boolean descontoDe(double desconto) {

        if (desconto < 0.15) {
            double valor = this.getPreco() * desconto;
            setPreco(this.getPreco() - valor);
            return true;
        }
        return false;
    }
}
