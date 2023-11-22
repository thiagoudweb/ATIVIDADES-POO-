package cartaEbaralho.Baralho;

import java.util.ArrayList;
import java.util.Random;
// import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import cartaEbaralho.Carta.Carta;

public class Baralhos {

    // ATRIBUTOS //

    private List<Carta> cartas;
    String[] nomes = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
    String[] naipes = { "Copas", "Ouros", "Espadas", "Paus" };

    //

    public Baralhos() {

        cartas = new ArrayList<Carta>();
        for (String naipe : naipes) {
            for (String nome : nomes) {
                Carta cartas = new Carta(naipe, nome);
                this.cartas.add(cartas);

            }

        }

        for (int i = 0; i < 4; i++) {

            Carta cartas = new Carta("Coringa", "Coringa ");
            this.cartas.add(cartas);

        }

    }

    // metodos //

    public void embaralhar() {
        int tamnCartas = this.cartas.size();
        Random r = new Random();

        for (int i = tamnCartas - 1; i > 0; i--) {
            int indexCartaTrocar = r.nextInt(i + 1);
            Carta cartaVet = cartas.get(i);
            cartas.set(i, cartas.get(indexCartaTrocar));
            cartas.set(indexCartaTrocar, cartaVet);

        }

    }

    public Optional<Carta> darCarta() {

        int ultPosi = cartas.size() - 1;
        Carta ultCarta = cartas.remove(ultPosi);

        if (this.cartas.size() > 0) {

            return Optional.of(ultCarta);
        } else {

            return Optional.empty();
        }
    }

    public Boolean temCarta() {

        if (this.cartas.size() > 0) {

            return true;

        }

        else {

            return false;
        }

    }

    public void imprimirCarta() {

        // int tamVet = this.cartas.size() - 1;

        for (Carta carta : this.cartas) {

            System.out.println("" + carta.getNaipe() + "" + carta.getNome());

        }
    }

}
