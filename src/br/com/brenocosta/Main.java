package br.com.brenocosta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando a lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("Pedro", "Masculino"));
        pessoas.add(new Pessoa("Carla", "Feminino"));

        // Lista para armazenar as mulheres
        List<Pessoa> mulheres = new ArrayList<>();

        // Usando if-else para verificar o gênero e filtrar as mulheres
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getGenero().equals("Feminino")) {
                mulheres.add(pessoa);
            } else {

                System.out.println(pessoa.getNome() + " não é mulher.");
            }
        }

        // Imprimindo a lista de mulheres
        System.out.println("\nMulheres na lista:");
        for (Pessoa mulher : mulheres) {
            System.out.println(mulher);
        }
    }
}

