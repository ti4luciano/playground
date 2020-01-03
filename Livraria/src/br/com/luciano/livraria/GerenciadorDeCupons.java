package br.com.luciano.livraria;

import java.util.List;

/**
 *
 * @author Luciano Alves
 */
public class GerenciadorDeCupons {

    private List<String> cupons;

    public GerenciadorDeCupons() {

        for (int i = 0; i < 20; i++) {
            String cup = "CUP" + Math.random();
            this.cupons.add(cup);
        }

    }

    public boolean validaCupom(String cupom) {
        return this.cupons.contains(cupom);
    }
}
