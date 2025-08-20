import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // Pessoa pessoa1 = new Pessoa("Cristiano", 10);
        // Pessoa pessoa2 = new Pessoa("Ronaldo", 50);
        // Pessoa pessoa3 = new Pessoa("Neymar", 60);

        // System.out.println(pessoa1.toString());
        // System.out.println(pessoa2.toString());
        // System.out.println(pessoa3.toString());

        // ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();
        // listaP.add(pessoa3);
        // listaP.add(pessoa2);
        // listaP.add(pessoa1);

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();
        listaP.add(new Pessoa("Cristiano", 19));
        listaP.add(new Pessoa("Ronaldo", 20));
        listaP.add(new Pessoa("Neymar", 19));


        // System.out.println(listaP.get(0));
        // System.out.println(listaP.get(1));
        // System.out.println(listaP.get(2));


        for (Pessoa auxP : listaP) {
            System.out.println(auxP.toString());
        }
    }
}
