package projarvorebinaria;

public class BinaryTree {
    Node root;
   
    public void ArvoreBinaria(){
        root=null;
    }
   
    public boolean isEmpty(){
        if(root==null)
            return true;
        else
            return false;
       
       
    }
   
    public void addRoot(Node e) throws Exception{
        //ADICIONA UM NÓ E COMO RAIZ
        if(root!=null)
            throw new Exception("Arvore já tem raiz!");
        else
            root = e;
    }
   
    public Node root(){
        //Retorna raíz da árvore
     return root;  
    }
   
    public boolean isInternal(Node e){
       //Verifica se o nó e é interno
       if(e.left != null || e.right != null)
           return true;
       else
           return false;
    }
   
    public boolean isLeaf(Node e){
        //Verifica se o nó e é folha ou não
        if(e.left == null && e.right == null)
            return true;
        else
            return false;
       
    }
   
    public void addLeft(Node e, Node m) throws Exception{
    //Adiciona e como filho esquerdo de m
        if(m.left != null)
            throw new Exception("Já existe filho esquerdo!");
        else
            m.left = e;
            e.parent =m;
    }
   
    public Node left(Node e){
    //retorna filho a esquerda de e
    return e.left;
    }
   
    public boolean hasLeft(Node e){
    //verifica se e tem ou não filho a esquerda
    if(e.left != null)
        return true;
    else
        return false;
    }
   
     public void addRight(Node e, Node m) throws Exception{
    //Adiciona e como filho direito de m
        if(m.right != null)
            throw new Exception("Já existe filho direito!");
        else
            m.right = e;
            e.parent =m;
    }
   
    public Node Right(Node e){
    //retorna filho a direito de e
    return e.right;
    }
   
    public boolean hasRight(Node e){
    //verifica se e tem ou não filho a direito
    if(e.right != null)
        return true;
    else
        return false;
    }
   
    public void remove(Node e){
    //Remove o e com todos os descendentes
        if(e==root)
            root = null;
        else
            if(e.parent.left == e)
                e.parent.left = null;
            else
                if(e.parent.right == e)
                    e.parent.right = null;
    }
   
    public void visitaPreOrdem (Node e){
       //Exibe todos os nós na forma RED
       if(e == null)
           return;
       e.exibeNo();
       visitaPosOrdem(e.left);
       visitaPosOrdem(e.right);
    }
   
    public void visitaPosOrdem(Node e){
    //Exibe todos os nós na forma EDR
    if(e == null)
        return;
    visitaPosOrdem(e.left);
    visitaPosOrdem(e.right);
    e.exibeNo();
    }
   
    public void visitaInOrdem(Node e){
        if (e == null)
            return;
        visitaInOrdem(e.left);
        e.exibeNo();
        visitaInOrdem(e.right);
       
    }
}