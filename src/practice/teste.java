package practice;

public class teste {
    public static void main(String[] args) {

        // os numeros usados no experimento
        int numeroUm = 20;
        int numeroDois = 15;

        // puxando o metodo
        String doisNumeros = doisNumeros (numeroUm, numeroDois);
        System.out.println(doisNumeros);

        // fazendo a soma
        int soma = numeroUm + numeroDois;
        System.out.println("A soma entre os dois números é: " + soma);

    }
    public static String doisNumeros (int numeroUm, int numeroDois) {
        return "Os números utilizados no experimento foram: " + numeroUm + " e " + numeroDois;
    };

}
