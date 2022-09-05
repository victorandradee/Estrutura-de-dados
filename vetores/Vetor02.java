public class Vetor02 {
    public static void main(String[] args) throws Exception {

        int n[] = {3, 5, 8, 7, 9, 10};
        System.out.println("Total de casas de n: " + n.length);
        String nom[] = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis"};
        for (int i = 0; i < n.length; i++) {
            System.out.println("\n Na posição: " + nom[i] + ", Temos o valor: " + n[i]);
        }
    }
}