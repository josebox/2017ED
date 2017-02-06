package pruebaGitBash;

import java.util.Scanner;

public class GitPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota;

		System.out.println("Introduce nota del alumno");
		nota = teclado.nextDouble();

		if (nota >= 0 && nota < 5) {
			System.out.println("Sus");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Aprobado");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("nota incorrecta");
		}

	}

}
