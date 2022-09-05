public class VetorSoma {
    public static void main(String[] args) throws Exception {
        int n[] = {3,5,3,2};
        int soma = 0;

        for(int i = 0; i<n.length; i++) {
            soma +=n[i];
        }
            System.out.println("A soma dos valores é: " + soma);

}

}