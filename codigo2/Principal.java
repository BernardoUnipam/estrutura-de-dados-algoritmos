import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        No<String> objt1 = new No<String>("Mussolini");
        // System.out.println(objt1.toString());

        No<String> objt2 = new No<String>("Hitler");
        // System.out.println(objt2.toString());

        No<String> objt3 = new No<String>("Stalin");
        // System.out.println(objt3.toString());

        No<String> objt4 = new No<String>("Mao");
        // System.out.println(objt4.toString());

        objt1.setNextNo(objt2);
        // System.out.println(objt1.getNextNo().toString());

        objt2.setNextNo(objt3);
        // System.out.println(objt2.getNextNo().toString());

        objt3.setNextNo(objt4);
        // System.out.println(objt3.getNextNo().toString());

        /* 
        System.out.println(obj1.toString());
        System.out.println(obj1.getNextNo().toString());
        System.out.println(obj1.getNextNo().getNextNo().toString());
        System.out.println(obj1.getNextNo().getNextNo().getNextNo().toString());
        System.out.println(obj1.getNextNo().getNextNo().getNextNo().getNextNo().toString());
        */

        No<String> aux = objt1;
        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getNextNo();
        } 


        input.close();
    }
}
