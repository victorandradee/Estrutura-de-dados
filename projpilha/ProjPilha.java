package projpilha;

import java.util.*;

public class ProjPilha {

    public static void main(String[] args) throws Exception {
        try (Scanner ent = new Scanner(System.in)) {
            int valor = 0;
            do {
                System.out.println("Digite o número na base 10");
                valor = ent.nextInt();
            } while (valor <= 0);

            Pilha restos = new Pilha(10);
            int quoc = 0;
            int resto = 0;
            
            do {
                quoc = valor / 16;
                resto = valor % 16;
                restos.push(resto);
                valor = quoc;
            } while (quoc != 0);
            
            System.out.println("Resultado");
            do {
                if (restos.top() < 10)
                    System.out.print(restos.top());
                else
                    System.out.print(converte(restos.top()));
                restos.pop();
            } while (restos.size()!=0);
        }

    }
    
    public static char converte (int resto){
        if (resto==10)
            return 'A';
        else
            if (resto==11)
                return 'B';
            else
                if (resto==12)
                    return 'C';
                else
                   if (resto == 13)
                       return 'D';
                   else
                      if (resto==14)
                          return 'E';
                      else
                          return 'F';        
    }
}
