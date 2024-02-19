package br.com.aluraminhasmusicas.principal;

import br.com.aluraminhasmusicas.modelos.Pessoa;

import java.util.ArrayList;
public class PrincipalPessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Luciana", 38);
        Pessoa pessoa1 = new Pessoa("Washington", 38);
        Pessoa pessoa2 = new Pessoa("Gustavo", 10);
        
        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();

        listaDePessoa.add(pessoa);
        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoa.size());
        System.out.println("Primeira posição da lista: " + listaDePessoa.get(0));
        System.out.println("Lista completa: " + listaDePessoa.toString());


    }

}