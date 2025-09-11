public class Pilha<T> {
    private No<T> topo;
    private String nomePilha;

    // construtores
    public Pilha() {
        this("");
    }

    public Pilha (String nomePilha) {
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    // metodo push adiciona um novo elemento ao topo da pilha
    public void push(T dado) {
        No<T> novoNo = new No<T>(dado);
        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    // metodo que remove e imprime o elemento do topo da pilha
    public T pop() {
        if (topo == null) {
            System.out.println("A pilha está vazia!");
            return null;
        }
        T dadoTemp = topo.getDado();
        topo = topo.getNextNo();
        return dadoTemp;
    }

    // metodo imprimePilha serve para mostrar os elementos da pilha
    public void imprimePilha() {
        if (topo == null) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.printf("Dados da pilha: %s\n", nomePilha);
            No<T> aux = topo;
            while (aux != null) {
                System.out.printf("%s\n", aux.toString());
                aux = aux.getNextNo();
            }
        }
    }
}
