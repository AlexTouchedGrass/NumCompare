import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroUno = 0;
        int numeroDos = 0;

        System.out.println("Please enter the first integer to be compared.");
        numeroUno = scan.nextInt();

        System.out.println("Please enter the second integer to be compared.");
        numeroDos = scan.nextInt();

        if (numeroUno > numeroDos) {
            System.out.println(numeroUno + " is greater than " + numeroDos);
        }
        else if(numeroDos > numeroUno) {
            System.out.println(numeroDos + " is greater than " + numeroUno);
        }
        else {
            System.out.println(numeroUno + " is equal to " + numeroDos);
        }



    }
}