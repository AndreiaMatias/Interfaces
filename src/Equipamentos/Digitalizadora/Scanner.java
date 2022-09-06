package Equipamentos.Digitalizadora;

import Equipamentos.Copiadora.Copiadora;

import java.sql.SQLOutput;

public class Scanner implements Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("DIGITALIANDO NO SCANNER");
    }
}
