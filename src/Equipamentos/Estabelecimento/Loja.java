package Equipamentos.Estabelecimento;

import Equipamentos.Impressora.Deskjet;
import Equipamentos.Impressora.Impressora;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();

    }
}
