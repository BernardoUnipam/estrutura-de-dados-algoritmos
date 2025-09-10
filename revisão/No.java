public class No<T> { // T é um tipo genérico, pode ser qualquer tipo de dado
    private T dado; 
    private No<T> nextNo; // nesse momento ele só pode apontar para algo do tipo no do tipo T

    public No(T dado) {
        this.dado = dado;
        this.nextNo = null; // quando eu criar um novo nó, ele não aponta para nada
    }  

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getNextNo() {
        return nextNo;
    }

    public void setNextNo(No<T> nextNo) {
        this.nextNo = nextNo;
    }

    
}
