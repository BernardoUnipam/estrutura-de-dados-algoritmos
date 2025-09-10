public class Principal {
    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa("Cristiano Ronaldo", 40); // criei o obejeto obj1 e agora ele ganhou um espaço na memória para apontar
        // String obj2 = new Pessoa();
        System.out.println(obj1.getNome());
        
        // System.out.println(obj1.nome); //não funciona pois o atributo nome é private --- tenho que alterar para public

        // Pessoa obj2 = obj1; //obj2 aponta para o mesmo lugar que obj1 aponta

        // obj2.nome = "Lionel Messi"; //alterei o nome do obj2, mas como os dois apontam para o mesmo lugar, o nome do obj1 também é alterado -- porém preciso usar o getter e setter

        // System.out.println(obj2.nome); //printa duas vezes o mesmo nome
        // obj1 = null; // obj1 não aponta mais para lugar nenhum, mas obj2 continua apontando para o mesmo lugar que obj1 apontava antes
        // System.out.println(obj2.nome); // ainda funciona pois ainda existe uma referência para o objeto na memória -- mesmo apontando o 1 para null

        // obj2 = null; // agora ninguem aponta para o objeto que estava na memória -- mas ainda funciona, só vai imprimir "null"

        Pessoa obj3 = new Pessoa("Neymar Jr", 30); //agora o obj3 aponta para um novo espaço na memória
        No<Pessoa> objP_1 = new No<>(obj3); //criei um nó que aponta para o obj1 -- quer dizer que esse no é do tipo pessoa apenas
        // ou seja isso aí de cima, o T é do tipo pessoa (Tesão de pessoa)
        System.out.println(objP_1.getDado()); // assim ele imprimit e só o endereço de memória
    }
}

//estudar memória heap e stack
// na stak fica os dados primitivos e referencias
// na heap fica os metodos string e objetos
// garbage collector - limpa a memória automaticamente, eliminando os objetos que não possuem mais referências apontando para eles
// try catch finaly - tratar erros  