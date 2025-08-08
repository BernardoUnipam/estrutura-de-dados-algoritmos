public class Principal {

    public static void main(String[] args){
        Pessoa objeto1 = new Pessoa();
        Pessoa objeto2 = new Pessoa("Bernardo", 21);
        Pessoa objeto3 = new Pessoa("Cristiano Ronaldo", 87126172l, 28);

        System.out.println(objeto1.toString());
        System.out.println(objeto2.toString());
        System.out.println(objeto3.toString());
    }
}