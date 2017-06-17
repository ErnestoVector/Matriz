//Principal de Matrices
import java.util.Scanner;	//Biblioteca para leer los datos del teclado

class Principal
{
	public static void main(String[] args)
	{
//-----Declaración de variables---------------------------------------------------------------		
		int fil = 50;							//Declaramos las filas (El límite son 50)
		int col = 50;							//Declaramos las columnas (El límite son 50)
		double escalar = 0;
		double [][] transp;
		Matriz mat_a = new Matriz(fil, col);	//Creamos el objeto Matriz mat_a
		Matriz mat_b = new Matriz(fil, col);	//Creamos el objeto Matriz mat_b
		Scanner sc = new Scanner(System.in);	//Creamos al objeto para leer desde el teclado
		char opcion;
		Menu menu = new Menu();
//--------------------------------------------------------------------------------------------

		menu.imprimeMenu();

		//mat_a.setFilas(fil);					//De la matriz, actualizamos filas
		//mat_a.setColumnas(col);					//De la matriz, actualizamos columnas

		//mat_b.setFilas(fil);
		//mat_b.setColumnas(col);

		//System.out.println("Filas =" + mat_a.getFilas());		//Imprime filas
		//System.out.println("Columnas =" + mat_a.getColumnas());	//Imprime columnas
		
		//mat_a.llenaMatriz();					//Llenamos todos los valores de la matriz a
		//mat_b.llenaMatriz();					//Llenamos todos los valores de la matriz a
		//mat_a.imprimeMatriz();					//Visualizamos la matriz
		//mat_b.imprimeMatriz();					//Visualizamos la matriz

		//mat_a.transpuesta().imprimeMatriz();	//Transponemos la matriz e imprimimos la matriz Transpuesta

		//mat_b = mat_a.transpuesta();			//Inicializamos una nueva matriz a partir de la transpusta de la otra

		//mat_b.imprimeMatriz();					//Ahora mat_b tiene guardada la transpuesta de mat_a

		//mat_a.setEscalar(escalar);				//A mat_b se le asigna un escalar para multiplicarla
		//System.out.println("Escalar =" + mat_b.getEscalar()); //Imprime el escalar por el cual se multiplica
		//mat_b.multEscalar().imprimeMatriz();	//multiplica a la mat_b por el escalar e imprime

		//mat_b = mat_a.multEscalar();			//Actualiza el valor de mat_b
		//mat_b.imprimeMatriz();

		//mat_a = mat_b.sumaMatriz(mat_a);
		//System.out.println("Suma de la matriz B + A = A");
		//mat_a.imprimeMatriz();

		//mat_b = mat_a.sumaMatriz(mat_b);
		//System.out.println("\nSuma de la matriz A + B = B");
		//mat_b.imprimeMatriz();

	}
}