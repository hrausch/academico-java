import java.util.ArrayList;

public class AulaArrayList{



    public static void main(String args[]){

        exemplo1();
        exemplo2();
        exemplo3();

    }

    public static void exemplo1(){

        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("Comprar pão");
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");

        // Exibir todas as tarefas
        System.out.println("Tarefas:");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }

        // Remover uma tarefa concluída
        tarefas.remove("Comprar pão");

        System.out.println("\nTarefas Após Conclusão:");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }


    }

    public static void exemplo2(){
        // Criando uma ArrayList de Inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Verificando se a lista está vazia
        System.out.println("Lista vazia? " + numeros.isEmpty());


        // Adicionando números
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Exibindo a lista de números
        System.out.println("Números: " + numeros);

    }

    public static void exemplo3(){
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Alice", "alice@example.com"));

        User user = userList.get(0); // Acessa o primeiro elemento

        userList.remove(0); // Remove o primeiro elemento

        for (User usuario : userList) {
            System.out.println(usuario.getName());
        }

        int size = userList.size();


    }
}

