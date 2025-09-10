package codigo4;

public class Pilha<T> {
    private No<T> Topo;
    private String nomePilha;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.Topo = null;
    }

    public No<T> getTopo(){
        return this.Topo;
    }
    
    public void setTopo(No<T> Topo){
        this.Topo = Topo;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        // if(Topo == null) {
        //     Topo = novoNo;
        // } else {
        //     novoNo.setNextNo(Topo);
        //     Topo = novoNo;       
        // } // Mesma coisa que o if acima então não precisa ficar verificando se é nulo ou não

        novoNo.setNextNo(Topo);
        Topo = novoNo;
    }

    public void peek(){
        // if(Topo == null) {
        //     System.out.println("A pilha está vazia!");
        // } else {
        //     System.out.println("Dado do topo: " + Topo.getDado());
        // }
        if(Topo != null) {
            System.out.println("Dado do topo: " + Topo.getDado());
        } else {
            System.out.println("A pilha está vazia!");
        }
    }

    // public T peek() {
    //     if(Topo == null) {
    //         System.out.println("A pilha está vazia!");
    //         return null;
    //     }
    //     return topo.getDado();
    // }

    // public void pop(){
    //     if(Topo == null) {
    //         System.out.println("A pilha está vazia!");
    //     } else {
    //         System.out.println("Dado removido: " + Topo.getDado());
    //         Topo = Topo.getNextNo();
    //     }
    // }

    public T pop() {
        if(Topo == null) {
            System.out.println("A pilha está vazia!");
            return null;
        } 
        T dadoRemovido = Topo.getDado();
        Topo = Topo.getNextNo();
        System.out.println("Dado removido: " + dadoRemovido);
        return dadoRemovido;
    }

    public void imprimePilha(){
        if(Topo == null) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("Imprimindo a pilha: " + this.nomePilha);
            No<T> aux = Topo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getNextNo();
            }
        }
    }
}
