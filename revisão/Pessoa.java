// 4 tipos - public, private, protected e default (sem modificador)
// public - acessível de qualquer lugar
// private - acessível apenas dentro da própria classe
// protected - acessível dentro do mesmo pacote e subclasses
// default (sem modificador) - acessível apenas dentro do mesmo pacote

//java é uma linguagem de tipagem forte e estática, pois ela precisa definir o tipo 

public class Pessoa {
    private String nome; //todas as pessoas que forem criadas nessa classe devem ter um nome
    private int idade; 

    public Pessoa() { // construtor padrão
        this("", 0);
    }

    public Pessoa(String nome, int idade) { // esse construtor com parâmetros exclui o construtor padrão -- caso seja feito sozinho sem o de cima
        this.nome = nome; 
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    } //caso eu apague isso, ele vai imprimir o endereço de memória do objeto, por isso a gente faz a sobrecarga do toString
}

// sobrecarga - quando eu crio um método com o mesmo nome, mas com parâmetros diferentes
// sobrescrita - quando eu crio um método com o mesmo nome, mas na classe filha, alterando o comportamento do método da classe mãe 