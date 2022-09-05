package listaligada;

public class LL {

    public static void main(String[] args) throws Exception {

        ListaLigada lista = new ListaLigada();
        lista.addFirst(new Node("GATO"));
        lista.addFirst(new Node("CACHORRO"));
        lista.addLast(new Node("BOI"));
        lista.addLast(new Node("BODE"));
        lista.addLast(new Node("BODE"));
        lista.addAfter(new Node("GIRAFA"),"GATO");
        lista.addLast(new Node("COELHO"));
        
        lista.mostraLista();        
        System.out.println("\nQtde elementos na lista: " + lista.size());   
        //System.out.println("\nAnimais com a letra B: " + contarAnimal(lista));
        System.out.println("Animal do meio da lista: "+lista.meioLista().nomeAnimal);
        System.out.println("Quantidade de vezes que bode apareceu: "+lista.ocorr("BODE"));
        
    }
    
    //public static boolean comparaLista(ListaLigada lista1, ListaLigada lista2){
        
        
    //}    
    
    
    

}
