public class OrdenaQuickSort {
    public static void main(String [] args){
    int [] vetor = new int[30];
    geraVetor(vetor);
    quickSort(vetor,0, vetor.length-1);
    exibeVetor(vetor); 
    }
    static void geraVetor (int[] vetor) { 
    System.out.println("Vetor antes da ordenação");
    for (int i=0;i<vetor.length;i++){
    vetor[i]=(int) (100*Math.random());
    System.out.print(vetor[i] + " ");
    }
    }
    static int separa (int[] vetor, int ini, int fim) {
     int pivo,esq; 
     pivo = vetor[ini];
     esq=0;
     while (ini < fim){
     if (esq==0)
     if (pivo >= vetor[fim]){
     vetor[ini]=vetor[fim];
     ini++;
     esq=1;
     } 
     else
     fim--;
     else
        if (pivo < vetor[ini]){
        vetor[fim]=vetor[ini];
        fim--;
        esq=0;
        } 
        else
        ini++;
        } 
        vetor[fim]=pivo;
        return fim;
        }
        static void quickSort (int[] vetor, int ini, int fim){
        int k; 
        if (fim > ini) {
        k=separa (vetor, ini,fim); 
        quickSort (vetor, ini, k-1); 
        quickSort (vetor, k+1, fim); 
        } 
        }
        static void exibeVetor (int[] vetor) { 
        System.out.println("\nVetor após ordenação");
        for (int i=0;i<vetor.length;i++){
        System.out.print(vetor[i] + " ");
        }
        }
        }