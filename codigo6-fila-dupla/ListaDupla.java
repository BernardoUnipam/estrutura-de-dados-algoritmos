public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla() {
        this("Lista dupla");
    }

    public ListaDupla(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void addInicio(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if (primeiroNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
    }

    public void atualizaIndice() {
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
        atualizaIndice();
        tamanho++;
    }

    public void addFinal() {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void imprimeListaDupla() {
        if (primeiroNo == null) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("imprimeindo lista dupla");
            NoDuplo<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getProximoNo();
            }
            System.out.println();
        }
    }
}
