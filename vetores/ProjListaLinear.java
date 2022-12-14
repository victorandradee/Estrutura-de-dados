package vetores;

public class ProjListaLinear {
   
    public static void main(String[] args) {
        Vetor lista = new Vetor(5);
        try{
            lista.add(0, "Fabio");
            lista.add(1, "Maria");
            lista.add(2, "Pedro");
            lista.add(3, "Paula");    
            lista.add(4, "Joana");
            int resp = lista.search("Pedro");
            if (resp==-1)
                System.out.println("O nome não existe na lista");
            else
                System.out.println("O nome está na posição " + resp + " da lista");
            String[] aux = lista.getArray();
            for (int i=0;i<lista.size();i++)
                System.out.println(aux[i] + " - ");    
            lista.remove(2);
            aux = lista.getArray();
            System.out.println("\nApós remoção");
            for (int i=0;i<lista.size();i++)
                System.out.println(aux[i] + " - "); 
            lista.set(0, "Solange");
            aux = lista.getArray();
            System.out.println("\nApós troca");
            for (int i=0;i<lista.size();i++)
                System.out.println(aux[i] + " - "); 
        }
        catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }      
    }
    
}
