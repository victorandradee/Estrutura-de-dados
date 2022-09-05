package listaligada;

public class Node {

    String nomeAnimal;	// elemento armazenado no nó
    Node next;	// próximo elemento da lista... que também é do tipo  Node

    public Node(String nomeAnimal) {
        // construtor	
        this.nomeAnimal = nomeAnimal;
        next = null;
    }

    public void mostraAnimal() {
        System.out.println("Animal: " + nomeAnimal);
    }

    public void meioLista(){
        System.out.println("O Animal que está no meio da lista, será o: " + mostraMeio);
    }

}
