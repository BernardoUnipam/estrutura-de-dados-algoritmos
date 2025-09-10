package codigo4;

public class Principal {
    public static void main(String[] args) {
        Pilha<String> Pilha = new Pilha<String>("Times de futebol");

        Pilha.push("Palmeiras");
        Pilha.push("Corinthians");

        Pilha.imprimePilha();

        // pilha.addInicio("Rafael");
        // pilha.addInicio("Mateus");
        // pilha.addInicio("Benardo");

        // pilha.imprimePilha();
        // pilha.removeFim();
        // pilha.imprimePilha();
    }
}