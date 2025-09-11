public class Principal {
    public static void main(String[] args) {
        System.out.println("-----Minha Pilha-----\n");
        Pilha<String> pilha = new Pilha<String>("Linguagens de Programação");

        // Adicionando as lingugagens agora
        pilha.push("Java :(");
        pilha.push("Python");
        pilha.push("C++");

        // adicionando mais 2 elementos na pilha
        pilha.push("JavaScript");
        pilha.push("C#");


        // Chamando a função para imprimir a pilha]
        pilha.imprimePilha();


        // Imprimir a função pop que remove o elemento do topo da pilha e mostra ele
        System.out.println("\nElemento removido: " + pilha.pop());
    }
}
