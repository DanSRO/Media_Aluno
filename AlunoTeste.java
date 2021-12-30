package exercicio03;
import java.util.Scanner;

public class AlunoTeste{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno D = new Aluno();
		System.out.println("Nome do aluno: ");
		D.nome=entrada.nextLine();
		System.out.println("CPF do aluno: ");
		D.CPF=entrada.nextLine();
		System.out.println("Curso do aluno: ");
		D.curso=entrada.nextLine();
		System.out.println("Disciplina do aluno: ");
		D.disciplina=entrada.nextLine();
		System.out.println("Nota P1 do aluno: ");
		D.notaP1=entrada.nextFloat();
		System.out.println("Nota P2 do aluno: ");
		D.notaP2=entrada.nextFloat();
		System.out.println("Nota Final do aluno: ");
		D.notaFinal=entrada.nextFloat();
		entrada.close();
		
		D.mostraAlunos();
		D.calculaNota();
		D.calculaNotaFinal();
		D.mostraSituacao();
	}
}
