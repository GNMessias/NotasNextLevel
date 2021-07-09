import java.util.Scanner;

// Nota semestral dos Alunos Next Level
public class NotasAlunos {

	public static void main(String[] args) {
			
			// Nome do Aluno
		Scanner nome = new Scanner(System.in);
		String aluno;
		System.out.println("Nome do Aluno: ");
		aluno = nome.nextLine();
		
			// Nota da prova primeiro bimestre
		Scanner prova1 = new Scanner(System.in);
		float p1;
		System.out.println("Nota da prova do primeiro bimestre: ");
		p1 = prova1.nextFloat();
		
			// Nota do projeto primeiro bimestre
		Scanner projeto1 = new Scanner(System.in);
		float pj1;
		System.out.println("Nota da projeto do primeiro bimestre: ");
		pj1 = projeto1.nextFloat();
		
			// Nota lista de exercícios primeiro bimestre
		Scanner exercicio1 = new Scanner(System.in);
		float ex1;
		System.out.println("Nota da lista de exercício do primeiro bimestre: ");
		ex1 = exercicio1.nextFloat();
		
			// Nota MOOC primeiro bimestre
		Scanner mooc1 = new Scanner(System.in);
		float pjs1;
		System.out.println("Nota do MOOC do primeiro bimestre: ");
		pjs1 = mooc1.nextFloat();
		
			// Atribuindo pesos e calculo media primeiro bimestre
		float media1b = ((3*p1)+(3*pj1)+(3*ex1)+(2*pjs1))/11;
		
			// Nota da prova segundo bimestre
		Scanner prova2 = new Scanner(System.in);
		float p2;
		System.out.println("Nota da prova do segundo bimestre: ");
		p2 = prova2.nextFloat();
		
			// Nota do projeto segundo bimestre
		Scanner projeto2 = new Scanner(System.in);
		float pj2;
		System.out.println("Nota da projeto do segundo bimestre: ");
		pj2 = projeto2.nextFloat();
		
			// Nota lista de exercícios segundo bimestre
		Scanner exercicio2 = new Scanner(System.in);
		float ex2;
		System.out.println("Nota da lista de exercício do segundo bimestre: ");
		ex2 = exercicio2.nextFloat();
		
			// Nota MOOC segundo bimestre
		Scanner mooc2 = new Scanner(System.in);
		float pjs2;
		System.out.println("Nota do MOOC do segundo bimestre: ");
		pjs2 = mooc2.nextFloat();
		
			// Atribuindo pesos e calculo media segundo bimestre
		float media2b = ((3*p2)+(3*pj2)+(3*ex2)+(2*pjs2))/11;
		
			//Media Semestre
		float mediasemestre = (media1b+media2b)/2;
		System.out.println("O média semestral do aluno " + aluno + " é: " + mediasemestre );
		
			// Verificar se passou ou faz prova final
		if (mediasemestre>=8) {
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno deve tirar na prova final para passar a nota:" +(10-mediasemestre));
		}
	}

}
