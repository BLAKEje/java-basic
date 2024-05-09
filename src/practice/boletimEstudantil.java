package practice;

public class boletimEstudantil {
    public static void main(String[] args) {

        // nota final do aluno
        int notaFinal = 7;

        // verfica se o aluno foi aprovado, reprovado ou se precisa fazer outra prova
        if (notaFinal < 6)
            System.out.println("O aluno foi REPROVADO");
        else if (notaFinal == 6)
            System.out.println("O aluno precisará fazer outra prova");
        else
            System.out.println("O aluno foi APROVADO!");
    }
}
