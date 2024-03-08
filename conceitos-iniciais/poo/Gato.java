public class Gato {

    String nome;
    int idade;
    String cor;

    public Gato(String name){
        this.nome = name;
    }

    public Gato(){

    }

    /*
    Métodos de instancia: Comportamento do gato
     */
    void sleep(){
        System.out.println("Dormindo");
    }
    void play(){
        System.out.println("Brincando");
    }
    void feed(){
        System.out.println("Comendo");
    }

}