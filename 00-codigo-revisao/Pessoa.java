public class Pessoa {
    private String nome;
    private long cpf;
    private int idade;

    public Pessoa() {
        this("", 0, 0);
    }

    public Pessoa(String nome, int idade) {
        this(nome, 0, idade);
    }

    public Pessoa(String nome, long cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCpf(){
        return this.cpf;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        // return "Nome: " + getNome() + " CPF: " + getCpf() + " Idade: " + getIdade();
        return String.format("Nome: %s, CPF: %i, Idade: %i", getNome(), getCpf(), getIdade());
    }
}

