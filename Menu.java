//Clase menu (para imprimir las opciones)

public class Menu
{
	public static void imprimeMenu()
	{	
				
		System.out.println("\nMenu:");
		System.out.println("\t1) Matriz A (Llena matriz).");
		System.out.println("\t2) Matriz B (Llena matriz).");
		System.out.println("\t3) A + B");
		System.out.println("\t4) A - B");
		System.out.println("\t5) B - A");
		System.out.println("\t6) kA");
		System.out.println("\t7) kB");
		System.out.println("\t8) Traza A");
		System.out.println("\t9) Traza B");
		System.out.println("\t0) Para salir");

	}

	public static void LimpiarPantalla()
	{
		System.out.print("\n\nPresiona cualquier tecla para elegir otra opcion");
		new java.util.Scanner(System.in).nextLine();
		System.out.print("\033[H\033[2J");
		System.out.flush();			
	}
	
}