package Aula5;

import java.util.ArrayList;
import java.util.List;

public class Pratos {

    String[] pratos;

    public Pratos(String[] pratos){
        this.pratos = pratos;
    }

    public String[] getPratos() {
        return pratos;
    }

    public void setPratos(String[] pratos) {
        this.pratos = pratos;
    }

    public void listaPratos(){
        System.out.println();
        for (String x: pratos) {
            System.out.println(x);
        }
    }
}
