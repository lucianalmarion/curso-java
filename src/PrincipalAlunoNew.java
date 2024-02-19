public class PrincipalAlunoNew {
    public static void main(String[] args) {
        AlunoNew aluno1 = new AlunoNew();
        AlunoNew aluno2 = new AlunoNew();
        aluno1.setNome("Gustavo Marion");
        aluno1.setNota1(7.5);
        aluno1.setNota2(8.0);
        aluno1.setNota3(9.2);
        aluno2.setNome("Felipe Marion");
        aluno2.setNota1(6.8);
        aluno2.setNota2(7.3);
        aluno2.setNota3(8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
    }
}