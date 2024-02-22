package lista.colecao.dados.dados;

import java.util.ArrayList;
import java.util.Collections;

public class Numeros {
        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(5);
            numeros.add(2);
            numeros.add(8);
            numeros.add(1);
            numeros.add(22);
            numeros.add(35);
            numeros.add(3);
            numeros.add(11);

            Collections.sort(numeros);

            System.out.println("Lista ordenada: " + numeros);
        }
}

