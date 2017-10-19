//Principal de Matrices
import java.util.Scanner;	//Biblioteca para leer los datos del teclado

class Principal
{
	public static void main(String[] args)
	{
//-----Declaración de variables---------------------------------------------------------------------------
		int fil = 50;							//Declaramos las filas (El límite son 50)
		int col = 50;							//Declaramos las columnas (El límite son 50)
		double escalar = 0;						//La constante por la cual se multiplicara la matriz
		Matriz mat_a = new Matriz(fil, col);	//Creamos el objeto Matriz mat_a
		Matriz mat_b = new Matriz(fil, col);	//Creamos el objeto Matriz mat_b
		Matriz mat_c = new Matriz(fil, col);	//Creamos una tercer matriz para guardar los resultados
		Scanner sc = new Scanner(System.in);	//Creamos al objeto para leer desde el teclado
		int opcion;
		double traza = 0;						//La constante que almacena el resultado de la traza
//--------------------------------------------------------------------------------------------------------

		do
		{
					
			Menu.imprimeMenu();
			opcion = sc.nextInt();
			System.out.println("\nProcesando opcion:\t" + opcion);

			switch(opcion)
			{
				//Matriz A
				case 1:
					mat_a.setFilas(fil);					//De la matriz A, actualizamos filas
					mat_a.setColumnas(col);					//De la matriz A, actualizamos columnas
					mat_a.llenaMatriz();					//Llenamos la matrtiz A
					mat_a.imprimeMatriz();					//Visualizamos la matriz A
				break;
				

				//Matriz B
				case 2:
					mat_b.setFilas(fil);					//De la matriz B, actualizamos filas
					mat_b.setColumnas(col);					//De la matriz B, actualizamos columnas
					mat_b.llenaMatriz();					//Llenamos la matrtiz B
					mat_b.imprimeMatriz();					//Visualizamos la matriz B
				break;
				
				
				//Suma A + B
				case 3:
					mat_c = mat_a.sumaMatriz(mat_b);		//Asignamos a C la suma A + B
					System.out.println("La suma de las matrices es:");
					mat_c.imprimeMatriz();					//Visualizamos el resultado (C)	
				break;
				
				
				//Resta A - B
				case 4:
					mat_c = mat_a.restaMatriz(mat_b);		//Asignamos a C la resta A - B
					mat_c.imprimeMatriz();    				//Visualizamos el resultado (C)
				break;

				
				//Resta B - A
				case 5:
					mat_c = mat_b.restaMatriz(mat_a);		//Asignamos a C la resta B - A
					mat_c.imprimeMatriz();					//Visualizamos el resultado (C)	
				break;

				
				//Multiplicacion entre matrices A*B
				case 6:
					mat_c = mat_a.producto(mat_b);
					mat_c.imprimeMatriz();
				break;
/*				Ya que no lo tienes implementado, no lo muestres ya que no va a realizar nada
				
				//Multiplicacion por escalar matriz A
				case 7:
				break;

				//Multilicacion por escalar matriz B
				case 8:
				break;

				
				//Traza matriz A 
				case 9:
				break;

				
				//Traza matriz B
				case 10:
				break;

				default:
				break;
*/
			}
		}while(opcion != 0); //Condicion para salir del menu y del programa


		

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

		//traza = mat_a.trazaMatriz();
		//System.out.println("Traza de la matriz:\t" + traza);

	}
}
