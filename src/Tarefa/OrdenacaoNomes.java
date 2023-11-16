package Tarefa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OrdenacaoNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler nomes do console separados por vírgula
        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

        // Separar os nomes usando o comando split
        String[] nomes = input.split(",");

        // Ordenar os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprimir os nomes ordenados
        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

        // Separar por gênero
        System.out.println("\nSeparar por gênero:");
        for (String nome : nomes) {
            String[] partes = nome.split("-");
            
            if (partes.length == 2) {
                String nomeCompleto = partes[0].trim();
                String genero = partes[1].trim();

                if (genero.equalsIgnoreCase("M")) {
                    System.out.println(nomeCompleto + " - Masculino");
                } else if (genero.equalsIgnoreCase("F")) {
                    System.out.println(nomeCompleto + " - Feminino");
                } else {
                    System.out.println("Gênero não reconhecido para: " + nomeCompleto);
                }
            } else {
                System.out.println("Formato inválido para: " + nome);
            }
        }
    }
}

