package Clase_anidada_estatica;

public class Externo {
	// Creacion de la clase estatica
	static class Anidado{
		// Metodo dentro de la clase estatica
		public void miMetodo() {
			System.out.println("ESTA ES MI CLASE ANIDADA");
		}
	}
	public static void main(String args []) {
		// Acceso a la clase estatica
		Externo.Anidado anid = new Externo.Anidado();
		anid.miMetodo();
	}
}
