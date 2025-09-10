package codigo3;

public class Lista<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public No<T> getPrimeiroNo(){
        return this.primeiroNo;
    }
    
    public void setPrimeiroNo(No<T> primeiroNo){
        this.primeiroNo = primeiroNo;
    }

    public No<T> getUltimoNo(){
        return this.ultimoNo;
    }

    public void setUltimoNo(No<T> ultimoNo){
        this.ultimoNo = ultimoNo;
    }

    public void imprimeLista(){
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

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void addFim(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void removeInicio(){
        if(primeiroNo == null) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("Dado removido: " + primeiroNo.getDado());

            if(primeiroNo == ultimoNo) {
                primeiroNo = null;
                ultimoNo = null;
            } else {
                primeiroNo = primeiroNo.getNextNo();
            }
        }
    }

    public void removeFim(){
        if(primeiroNo == null) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("Dado removido: " + ultimoNo.getDado());
            No<T> aux = primeiroNo;
            while(aux.getNextNo() != ultimoNo) {
                aux = aux.getNextNo();
            }

            ultimoNo = aux;
            aux.setNextNo(null);
        }
    }
}
