import java.util.LinkedList;
import java.util.List;

public class LinkedListExamplo2 {
    public static void main(String[] args) {
        // Criação de uma LinkedList
        List<String> linkedList = new LinkedList<>();

        // Adicionando elementos
        linkedList.add("Elemento 1");
        linkedList.add("Elemento 2");
        linkedList.add("Elemento 3");

        // Adicionando um elemento na primeira posição
        linkedList.add(0, "Elemento 0");

        // Acessando elementos
        System.out.println("Primeiro elemento: " + linkedList.get(0));

        // Modificando elementos
        linkedList.set(2, "Elemento Modificado");

        // Removendo elementos
        linkedList.remove("Elemento 3");
        linkedList.remove(0);

        // Iterando sobre a lista
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
