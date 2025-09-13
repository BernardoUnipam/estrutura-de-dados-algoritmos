public class Principal {
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");

        lista.addInicio("Rafacel");
        lista.addInicio("Cristinao ronaldo");

        lista.imprimeListaDupla();
    }
}
