package practice;

public class practice2 {
    public static void main(String[] args) {

        int numberOne = 15;
        int numberTwo = 20;

        String twoNumbers = twoNumbers (numberOne, numberTwo);
        System.out.println(twoNumbers);

        int soma = numberOne + numberTwo;
        System.out.println("A soma desses dois números é: " + soma);

    }
    public static String twoNumbers (int numberOne, int numberTwo ){
        return "Os dois números inseridos foram: " + numberOne + " e " + numberTwo;


    }

}
