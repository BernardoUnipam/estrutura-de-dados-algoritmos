public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;
    
    public Fila() {
        this("");
    }

    public Fila(String nomeFila) {
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    // Metodo para adicionar elemento ao final da fila
    public void enfileirar(T dado) {
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    // Metodo para remover o primeiro elemento e imprimir ele
    public T desenfileirar() {
        if (primeiroNo == null) {
            System.out.println("A fila está vazia!");
            return null;
        }   
        T dadoTemp = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();

        if (primeiroNo == null){
            ultimoNo = null;
        }
        return dadoTemp;
    }

    // Metodo para imprimir os elementos da fila
    public void imprimeFila() {
        if (primeiroNo == null) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.printf("Dados da fila: %s\n", nomeFila);
            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.printf("%s\n", aux.toString());
                aux = aux.getNextNo();
            }
            System.out.println();
        }
    }

}
