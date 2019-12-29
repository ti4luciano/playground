package br.com.luciano.livraria.produtos;

/**
 *
 * @author Luciano Alves
 */
@FunctionalInterface
public interface Promocional {
    boolean descontoDe(double desconto);
}
