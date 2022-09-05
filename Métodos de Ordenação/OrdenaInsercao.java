public class OrdenaInsercao {
    public static void main(String [] args){
    int [] vetor = new int[30];
    geraVetor(vetor);
    insertionSort(vetor);
    exibeVetor(vetor); 
    }
    static void geraVetor (int[] vetor) { 
    System.out.println("Vetor antes da ordenação");
    for (int i=0;i<vetor.length;i++){
    vetor[i]=(int) (100*Math.random());
    System.out.print(vetor[i] + " ");
    }
    }
    static void insertionSort (int[] vetor) {
    int j,aux; 
    for (int i=1;i<vetor.length;i++) { 
    aux=vetor[i];
    for (j=i-1;j>=0 && aux < vetor[j];j--)
    vetor[j+1]=vetor[j];
    vetor[j+1]=aux;
    } 
    }
    static void exibeVetor (int[] vetor) { 
    System.out.println("\nVetor após ordenação");
    for (int i=0;i<vetor.length;i++){
    System.out.print(vetor[i] + " ");
    }
    }
}
    