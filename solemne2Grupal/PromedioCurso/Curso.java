package PromedioCurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Curso {

	private Alumno[] cjto;

	public Alumno[] getCjto() {
		return cjto;
	}

	private String nombreCurso;

	public String getNombreCurso() {
		return nombreCurso;
	}

	public String verNombre() {
		return getNombreCurso();
	}

	private int total;

	public int getTotal() {
		return total;
	}

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader entrada = new BufferedReader(isr);

	// constructor
	public Curso(int total, String nombreCurso) throws IOException {

		this.total = total;
		valTotalCurso();
		cjto = new Alumno[total];
		this.nombreCurso = nombreCurso;
		String nombre;
		int edad;

		for (int i = 0; i < cjto.length; i++) {
			System.out.println("Ingrese nombre de alumno: ");
			nombre = entrada.readLine();
			System.out.println("Ingrese edad: ");
			edad = Integer.parseInt(entrada.readLine());
			valEdad(edad);
			cjto[i] = new Alumno(nombre, edad);
		}

	}

	private void valTotalCurso() {
		if (total <= 0)
			System.out.println("debes ingresar un valor mayor que 0");

	}

	private void valEdad(int edad) {
		if (edad <= 0 || edad > 100)
			System.out.println("debe ingresar una edad entre 1 y 100");
	}

	public int AdultosNoJovenes() {

		int NoAdultJov = 0;
		for (int i = 0; i < cjto.length; i++) {
			if (cjto[i].getEdad() < 20 || cjto[i].getEdad() > 40)
				NoAdultJov = NoAdultJov + cjto[i].getEdad();
		}
		return NoAdultJov;

	}

	public int AdultosJovenes() {
		int AdultJov = 0;

		for (int i = 0; i < cjto.length; i++) {
			if (cjto[i].getEdad() >= 20 || cjto[i].getEdad() <= 40)
				AdultJov = AdultJov + cjto[i].getEdad();
		}
		return AdultJov;

	}

	public void buscarNombre() throws IOException {
		Arrays.asList(cjto);
		System.out.println("ingrese el nombre que quiere encontrar: ");
		String buscar = entrada.readLine();
		// int indice = cjto.indexOf(buscar);

	

		int encontrado = 0;

		String cambiarEdad = "";
		int edad;

	}

	

	public float Promedio() {
		float sumaEdad = 0;
		for (int i = 0; i < cjto.length; i++)
			sumaEdad = sumaEdad + cjto[i].getEdad();

		return sumaEdad / cjto.length;
	}

	public void listado() {

		for (int i = 0; i < cjto.length; i++) {
			System.out.println("nombre: " + cjto[i].getName() + " | " + "edad: " + cjto[i].getEdad());
		}

	}

}

class Alumno {

	private String name;
	private int edad;

	public Alumno(String name, int edad) {
		this.name = name;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void encontrar(Alumno[] cjto, String buscar) {
		Boolean coincidencia = name.contains(buscar);
		if (coincidencia == true) {
			System.out.println("se encontro el nombre");

		} else {
			System.out.println("No se encontro ningun nombre");
		}

		int indice = name.indexOf(buscar);
		if (indice != -1) {
			System.out.println(cjto[indice].getName());

		} else {
			System.out.println("no se encontro");
		}

	}

}
