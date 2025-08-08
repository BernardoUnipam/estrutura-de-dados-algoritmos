public class Professor extends Pessoa{
    private int idProfessor;

    public Professor(){

    }

    public Professor(String nome, long cpf, int idade, int idProfessor){
        super(nome, cpf, idade);
        this.idProfessor = idProfessor;
    }

    public void setIdProfessor(int idProfessor){
        this.idProfessor = idProfessor;
    }

    public int getIdProfessor(){
        return this.idProfessor;
    }

    public String toString(){
        return String.format(super.toString() + "ID Professor: " + getIdProfessor());
    }
}
