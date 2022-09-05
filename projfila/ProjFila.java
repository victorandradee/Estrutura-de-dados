
package projfila;

public class ProjFila {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Queue q1 = new Queue(5);
        
        Pilha p1 = new Pilha(5);
        
        q1.enqueue("MARCOS");
        q1.enqueue("RITA");
        q1.enqueue("JOANA");
        q1.enqueue("FERNANDO");
        q1.enqueue("ANA");
        
        System.out.println("Primeiro da fila: " + q1.front());
        
               
        // transfere da fila´para pilha
        while (q1.size()!=0){            
            p1.push(q1.front());
            q1.dequeue();
        }
        
        
        // transfere da pilha´para fila
        while (p1.size()!=0){
           
            q1.enqueue(p1.top());
            p1.pop();
        }
        
        for (int i=0;i<q1.size();i++)
            System.out.println(q1.get(i));
        
        System.out.println("Primeiro da fila: " + q1.front());     
        
        
        
    } 
    
}
