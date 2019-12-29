package br.com.luciano.livraria;

/**
 *
 * @author Luciano Alves
 */
public class Autor {

    private String name;
    private String cpf;
    private String email;

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Autor)) return false;
        Autor outroAutor = (Autor) obj;
        return outroAutor.name.equals(this.name);
    }
    
    public Autor(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

}
