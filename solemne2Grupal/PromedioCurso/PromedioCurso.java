package PromedioCurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioCurso {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(isr);

		// primer curso
		System.out.println("ingrese nombre del primer curso: ");
		String nombreCurso1 = entrada.readLine();
		System.out.println("ingrese total de alumnos de: " + nombreCurso1);
		int total1 = Integer.parseInt(entrada.readLine());
		Curso curso1 = new Curso(total1, nombreCurso1);

		// segundo curso
		System.out.println("ingrese nombre del segundo curso: ");
		String nombreCurso2 = entrada.readLine();
		System.out.println("ingrese total de alumnos del curso" + nombreCurso2);
		int total2 = Integer.parseInt(entrada.readLine());
		Curso curso2 = new Curso(total2, nombreCurso2);

		System.out.println("nombre     " + "  total de alumnos     ");
		System.out.println(curso1.getNombreCurso() + " | " + curso1.getTotal());
		System.out.println(curso2.getNombreCurso() + " | " + curso2.getTotal());
		//
		curso1.buscarNombre();
		

		

	}

}
