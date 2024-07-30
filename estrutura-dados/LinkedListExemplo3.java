import java.util.LinkedList;
import java.util.List;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

public class LinkedListExamplo3 {
    public static void main(String[] args) {
        // Criação de uma LinkedList de objetos Pessoa
        List<Pessoa> pessoas = new LinkedList<>();

        // Adicionando objetos Pessoa
        pessoas.add(new Pessoa("Alice", 30));
        pessoas.add(new Pessoa("Bob", 25));
        pessoas.add(new Pessoa("Carlos", 35));

        // Iterando sobre a lista de pessoas
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Removendo uma pessoa
        pessoas.remove(1);

        // Iterando após a remoção
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
