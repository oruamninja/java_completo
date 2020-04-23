package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // retornar o primeiro valor de uma lista com um predicado
        String name = list.stream().filter( x -> x.charAt(0) == 'A' ).findFirst().orElse(null);
        System.out.println("Primeiro nome com o predicado: " + name);

        System.out.println("---------------------------------------------------------");

        // filtro com predicado retornando em uma nova lista 
        List<String> result = list.stream().filter( x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String obj : result) {
            System.out.println("Resultado nova Lista: " + obj);
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("Res");

        // adicionar um valor posição especifica.
        list.add(2, "Marco");

        // remover um valor
        list.remove("Bob");

        // remover da lista pelo index;
        list.remove(1);

        // uso do for earch
        for(String obj : list) {
            System.out.println(obj);
        }

        System.out.println("----------------------------------------------------");

        // remove valores por um predicado - com uma função lambda.
        list.removeIf( x -> x.charAt(0) == 'M' );

        // uso do for earch
        for(String obj : list) {
            System.out.println(obj);
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Index of Anna: " + list.indexOf("Anna"));


        System.out.println("Tamanho da Lista: " + list.size());
    }
}