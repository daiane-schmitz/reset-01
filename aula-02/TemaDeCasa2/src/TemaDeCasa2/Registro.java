package TemaDeCasa2;

import java.util.ArrayList;
import java.util.List;

public class Registro {

    private static List<String> registros = new ArrayList<>();

    public void adicionarRegistro(String registro) {
        registros.add(registro);
    }

    public void imprimir(){
        for(String registro : registros){
            System.out.println(registro);
        }
    }
}
