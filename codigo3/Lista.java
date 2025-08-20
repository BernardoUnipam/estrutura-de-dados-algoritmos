public class Lista<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista() {
        this("Lista");
    }

    public Lista(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado) {
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void imprimeLista() {
        if(primeiroNo == null) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Dados da Lista " + nomeLista);
            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getNextNo();
            }
        }
    }

    public No<T> getPrimeiroNo() {
        return this.primeiroNo;
    }
    
    
}
