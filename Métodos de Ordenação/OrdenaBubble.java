public class OrdenaBubble {
    public static void main(String[] args){
    int[] chave = new int[50];
    int n = chave.length;
    sorteia(chave,n);
    bubbleSort(chave,n);
    exibe(chave,n);
    }
    public static void sorteia(int[] chave, int n){
    // sorteia valores para o vetor
    for (int i=0;i<n;i++){
    chave[i]=(int)(51*Math.random());
    System.out.print(chave[i] + " ");
    }
}

public static void bubbleSort (int[] chave, int n){
    int temp;
    // inicia o Bubble Sort
    for(int i=0; i<n; i++)
    for(int j=1; j<n-i;j++)
    if(chave[j-1] > chave[j]){
    //troca os elementos
    temp = chave [j-1];
    chave [j-1] = chave [j];
    chave [j] = temp;
    }
    }
    public static void exibe (int[] chave, int n){
    // exibe vetor ordenado
    System.out.println ("Resultado da Classificação");
    for (int i=0;i< n;i++)
    System.out.println(chave[i] + " ");
    }
    }