//UMB Virtual - Ingenier�a de Software - Semestre II - Algoritmica y Programaci�n
//Profesora: Brigitte Rodriguez Mendoza
//Estudiosos: Bairon Jose Garcia Mendoza
//			  Eliecer Urbano Daza Parra
//			  Jorge  Manuel  Galindo  Yanez
//		      Julian  David  Casta�eda

//Programa que calcula el valor a pagar a 5 empleados, 
//el primero gana 2 millones, el segundo gana el 10% m�s que el primero, 
//el tercero el 10% m�s que el segundo, y as� sucesivamente hasta llegar al quinto. Se deben hacer tres rutinas.
//	 La primera, debe calcular el salario.
//	 La segunda, debe calcular el valor neto a pagar considerando descuentos como retenci�n en la fuente (puede ser 14%), seguro social y pensi�n.
//	 La tercera, debe imprimir la informaci�n de cada empleado (salario, valor de la retenci�n en la fuente, valor del seguro social, valor pensi�n, neto a pagar).

/* Se importan librer�as*/ 

public class Nomina {

	public static void main(String[] args) {
		Double valsal = (double) 2000000;
		System.out.println("Salario Empleado 1: " + valsal);
		for (int i = 1; i < 5; i++) {
		    
			valsal = calcula_salario(valsal); 
			
			System.out.println("Salario Empleado " + i + " " + valsal);
		    
		}
	}

	static double calcula_salario(double salario){
		double newsalario;
		newsalario = (double) (salario * 1.1);
		return newsalario;
	}
}
