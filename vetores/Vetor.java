package vetores;

public class Vetor {

    private String[] vetor;     // armazena os elementos do vetor
    private int capacity;       // capacidade do vetor
    private int size;           // elementos no vetor

    public Vetor(int capacity) {
        vetor = new String[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        //verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        //retornar a qtde de elementos da lista
        return size;
    }

    public String get(int i) throws Exception {
        //retorna o conteúdo da posição i
        if (i >= size()) {
            throw new Exception("Posição Inválida!");
        }
        return vetor[i];
    }

    public void set(int i, String novo) throws Exception {
        //altera o conteúdo da posição i para o valor de n
        if (i >= size) {
            throw new Exception("Posição Inválida!");
        }
        vetor[i]=novo;
    }
    
    public void add(int i, String novo) throws Exception {
        //adiciona um novo elemento na posição i
        if (size()==capacity)
            throw new Exception ("Lista cheia! Impossível inserir!");
        if (i>size)
            throw new Exception ("Posição de inserção inválida!");
        //abre espaço de inserção (mov direita)
        for(int j=size-1;j>=i;j--)
            vetor[j+1] = vetor[j];
        vetor[i]=novo;
        size++;
    }

    public void remove(int i) throws Exception {
        //remove o elemento da posição i
        if (isEmpty())
            throw new Exception ("Lista Vazia! Impossível remover!");
        if (i>=size)
            throw new Exception ("Posição de remoção inválida!");
        //desloca os elementos para a esquerda
        for (int j=i;j<=size-2;j++)
            vetor[j]=vetor[j+1];
        size--;
    }

    public int search(String nome) {
        //busca pelo nome indicado na lista
        for(int i=0;i<size;i++)
            if(nome.equals(vetor[i]))
                return i;
        //não encontrou
        return -1;
    }
    
    public String[] getArray() {
        return vetor;
    }
}
