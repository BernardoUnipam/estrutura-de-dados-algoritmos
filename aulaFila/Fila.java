package aulaFila;

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

    // enfileirar lista
    public void enfileirar(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    // desenfileirar
    public T desenfileirar() {
        if (primeiroNo == null) {
            System.out.println("A lista " + nomeFila + " está vazia");
            return null;
        } else {
            T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getNextNo();

            if(primeiroNo == null) {
                ultimoNo = null;
            }

            return dadoTemp;
        }
    }
}
