package cartaEbaralho.Carta;

public class Carta {

    // Atributos

    String nome;
    String naipe;

    // CONSTRUTOR //

    public Carta(String nome, String naipe) {

        this.nome = nome;
        this.naipe = naipe;

    }

    // metodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

}