public class Principal {
    public static void main(String[] args) {
        System.out.println("-----Minha Fila-----\n");
        Fila<String> fila = new Fila<String>("Nomes de Alunos");

        fila.enfileirar("Bernardo Willian");
        fila.enfileirar("Mateuso Xavier");
        fila.enfileirar("Matheuso Larápio");

        // Adicionando mais dois
        fila.enfileirar("João Francisco");
        fila.enfileirar("João Manuca");

        // Chamo a função para imprimir a fila
        fila.imprimeFila();

        System.out.println("\nElemento removido: " + fila.desenfileirar());    
    }
}
