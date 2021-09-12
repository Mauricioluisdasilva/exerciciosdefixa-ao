import java.util.Scanner;
public class MainTurma{
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Turma t1 = new Turma();

        System.out.println("Calcular a média de notas de uma turma de até 3 alunos." + "\n" +
                            "Nome da Turma: ");
        t1.setTurma(read.nextLine());

        System.out.println("Nome do aluno 1: ");
        t1.setNomeA1(read.nextLine());
        System.out.println("Nome do aluno 2: ");
        t1.setNomeA2(read.nextLine());
        System.out.println("Nome do aluno 3: ");
        t1.setNomeA3(read.nextLine());
        

        System.out.println("Nota do aluno 1: ");
        t1.setN1(read.nextDouble());;
        System.out.println("Nota do aluno 2: ");
        t1.setN2(read.nextDouble());;
        System.out.println("Nota do aluno 3: ");
        t1.setN3(read.nextDouble());;
        

        System.out.println(t1 + "\n" + t1.maiorNota());                   
    }
}