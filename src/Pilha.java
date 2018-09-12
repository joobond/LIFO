public class Pilha {

    private int elementos[];
    private int topo;

    //Criar
    public Pilha(){
        elementos = new int[6];
        topo = -1;
    }

    //Pilha Vazia
    public boolean isVazia(){
        return topo == -1;
    }

    //Pilha Cheia
    public boolean isCheia(){
        return topo == 5;
    }

    //Empilhar
    public void empilhar(int elemento){
        if(!isCheia()){
            topo++;
            elementos[topo] = elemento;
        }else{
            System.out.println("A pilha já está cheia!");
        }
    }

    //Desempilhar, ou acessar objetos
    public int desempilhar(){
       if(!isVazia()){
           int elemento = elementos[topo];
           topo--;
           return elemento;
       }else{
           System.out.println("A pilha está vazia!");
           return -1;
       }

    }
}
