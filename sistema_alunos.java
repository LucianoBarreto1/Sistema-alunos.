import java.util.Scanner;

// Classe que representa um aluno
class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    // Método para exibir dados do aluno
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        if (calcularMedia() >= 6) {
            System.out.println("Situação: Aprovado ✅");
        } else {
            System.out.println("Situação: Reprovado ❌");
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Criando o objeto Aluno
        Aluno aluno = new Aluno(nome, nota1, nota2);

        // Exibindo os dados
        System.out.println("\n=== Dados do Aluno ===");
        aluno.exibirDados();

        scanner.close();
    }
}
