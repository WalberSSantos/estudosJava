package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 

 public class Listas {
    public static void main(String[] args) {

        List<String> listNomes = new ArrayList<>();
        listNomes.add("Walber");
        listNomes.add("Luciana");
        listNomes.add("Larissa");
        listNomes.add("Wanderson");
        listNomes.add("Wamberto");
        listNomes.add("Walberto");
                
        for(String nomes : listNomes){
            System.out.println(nomes);
        }

        System.out.println("======== LISTAR POR LETRA ===============");
       
        List<String> result = listNomes.stream().filter(nomes -> nomes.charAt(0) == 'W').collect(Collectors.toList());

        for(String nomes : result){
            System.out.println(nomes);
        }

        System.out.println("======== LISTAR PRIMEIRA INCIDÊNCIA DA LETRA PESQUISADA ===============");
       
        String name = listNomes.stream().filter(nomes -> nomes.charAt(0) == 'L').findFirst().orElse(null);
       
            System.out.println(name);


        System.out.println("======== ADD NOME EM POSIÇÃO ESPECÍFICA ===============");
        listNomes.add(3,"Pingo");
        for(String nomes : listNomes){
            System.out.println(nomes);
        }

        System.out.println("======== REMOVENDO ITEM POR COMPARAÇÃO E POR ORDEM ===============");
        listNomes.remove("Pingo");
        listNomes.remove(0);

        for(String nomes : listNomes){
            System.out.println(nomes);
        }

        System.out.println("======== REMOVENDO COM UTILIZAÇÃO DE PREDICADO ===============");
        listNomes.removeIf(nomes -> nomes.charAt(0) == 'L');

        for(String nomes : listNomes){
            System.out.println(nomes);
        }

        System.out.println("======== IDENTIFICANDO POSIÇÃO DE UM REGISTRO ===============");
        System.out.println("Wamberto ocupa a posição: " + listNomes.indexOf("Wamberto"));

    }
}