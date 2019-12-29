package br.com.luciano.livraria.teste;

import br.com.luciano.livraria.GerenciadorDeCupons;

/**
 *
 * @author Luciano Alves
 */
public class Main {

    public static void main(String args[]) throws Exception {

        
        GerenciadorDeCupons gc = new GerenciadorDeCupons();
        
        String cup = "CUP123";
        
        if(gc.validaCupom(cup)){
            System.out.println("Cupom válido");
        }else{
            System.out.println("Cupon Inválido");
        }
        
    }

}
