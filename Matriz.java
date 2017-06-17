//Clase Matriz (Objeto Matriz)
import java.util.Scanner;	//Biblioteca para leer los datos del teclado

public class Matriz
{	//Ini Clase Matriz

	//Agregando comentario para comprender el trabajo de github

	//Atributos:
	private int fil;			//El numero de filas de la matriz
	private int col;			//El numero de columnas de la matriz
	private double [][] mat;	//Declarando la matriz (tipo [][] nombre)
	private double [][] mat2;	//Declarando la matriz 2 (Para hacer operaciones entre 2 matrices)
	private double escalar;		//El valor escalar por el cual se multiplicará la matriz
	
	
//-----Constructores----------------------------------------------------------------------------------------------------------------------
	//Overload del método Matriz
	//Se inicializará así si no mandamos argumentos
	public Matriz()
	{
		this.fil = 1;				//filas = 1
		this.col = 1;				//columnas = 1
		mat = new double[fil][col];	//matriz[1][1]
	}

	//Método Constructor:
	//Debe tener el mismo nombre de la clase
	//Los argumentos son los requisitos mínimos para crear el objeto
	public Matriz(int fil, int col)
	{
		this.fil = fil;				//Asigna el valor de filas con el parámetro fil
		this.col = col;				//Asigna el valor de columnas con el parámetro col
		mat = new double[fil][col];	//Asigna los valores de filas y columnas a la matriz mat 
	}

	
//-----Getters y Setters------------------------------------------------------------------------------------------------------------------
	
	//Obtiene el valor de las filas (privado)
	public int getFilas()
	{
		return fil;
	}
	
	//Cambia el valor de las filas (con restricción)
	public void setFilas(int fil)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIngrese el numero de filas de la matriz:\t");

		//Aplicando validación (sólo valores positivos)
		do
		{
			fil = sc.nextInt();
			if (fil >= 1)
			{
				this.fil = fil;
			}
			else
			{
				System.out.println("Por favor, ingresa un valor -----entero positivo-----:\t");
			}
		}while(fil < 1);
		
	}
	
	//Obtiene el valor de las columnas (privado)
	public int getColumnas()
	{
		return col;
	}
	
	//Cambia el valor de las columnas (con restricción)
	public void setColumnas(int col)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIngrese el numero de columnas de la matriz:\t");

		//Aplicando validación (sólo valores positivos)
		do
		{
			col = sc.nextInt();
			if (col >= 1)
			{
				this.col = col;
			}
			else
			{
				System.out.println("Por favor, ingresa un valor -----entero positivo-----:\t");
			}	
		}while(col < 1);
	}

	//Obtiene los valores del arreglo Matriz
	public double[][] getMatriz()
	{
		return mat;
	}

	//Asigna los valores del arreglo Matriz
	public void setMatriz(double[][] mat)
	{
		this.mat = mat;
	}

	//Obtiene los valores del arreglo Matriz
	public double[][] getMatriz2()
	{
		return mat2;
	}

	//Asigna los valores del arreglo Matriz
	public void setMatriz2(double[][] mat2)
	{
		this.mat2 = mat2;
	}

	public double getEscalar()
	{
		return escalar;
	}
	
	public void setEscalar(double escalar)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIngrese el escalar para multiplicar la matriz:\t");
		escalar = sc.nextInt();
		this.escalar = escalar;
	}

//-----Metodos:---------------------------------------------------------------------------------------------------------------------------
	//Llenar la matriz
	public void llenaMatriz()
	{
		Scanner sc = new Scanner(System.in);	//Sirve para leer valores del teclado

		int i, j;								//Para el recorrido de los ciclos for
		for (i = 0; i < fil; i++)
		{
			for (j = 0; j < col; j++)
			{
				System.out.print("Matriz[" + i + "][" + j + "]:\t");
				mat[i][j] = sc.nextDouble();	//Inserta a la matriz el valor leido del teclado
			}
			
		}
	}

	//Imprimir la matriz
	public void imprimeMatriz()
	{
		int i, j;								//Para el recorrido de los ciclos for
		
		System.out.println("\nLos datos de la matriz son:"); 
		
		for (i = 0; i < fil; i++)				//Inicio for (filas)
		{
			System.out.print("\n");				//Imprime un nuevo renglón
			System.out.print("|");				//Imprime una barra al inicio para dar apariencia de matriz
			for(j = 0; j < col; j++)			//Inicio for (columnas)
			{
				System.out.print(mat[i][j]);	//Imprime el valor en turno
				if(j != col - 1)				//Si no es el ultimo valor de la columna...
				{
					System.out.print("\t");		//Imprime un tabulador
				}
				
			}
			System.out.print("|");				//Imprime una barra al final para dar apariencia de matriz
		}
	}

	//Genera la matriz Transpuesta
	public Matriz transpuesta()
	{
		int i, j;								//Para los valores de los ciclos for
		Matriz trans = new Matriz(col, fil);	//Nueva matriz (para guardar el valor transpuesto)

		for (i = 0; i < col; i++)				//Invertimos el recorrido de la matriz (para transponerla)
		{
			for (j = 0; j < fil; j++)			//Invertimos el recorrido de la matriz (para transponerla)
			{
				trans.mat[i][j] = mat[j][i];	//Intercambiamos filas y columnas
			}
		}
		return trans;							//Regresa la matriz transpuesta
	}

	//Multiplicación de una matriz por un escalar
	public Matriz multEscalar()
	{
		int i, j;								//Para los valores de los ciclos for
		Matriz mult = new Matriz(fil, col);		//Nueva matriz para guardar el resultado de la multiplicacion

		for (i = 0; i < fil; i++)
		{
			for (j = 0; j < col; j++)
			{
				mult.mat[i][j] = escalar * mat[i][j]; //Multiplica el escalar por cada valor de la matriz
			}
		}	

		return mult;		//Entrega la matriz "mult"
	}

	//Suma de una matriz con otra
		//Se necesitan 2 matrices para hacer la operacion, asi que ingresamos una como parametro (mat2)
	public Matriz sumaMatriz(Matriz mat2)		
	{
		int i, j;								//Para el recorrido de los ciclos for
		Matriz suma = new Matriz(fil, col);		//Nueva matriz para guardar el resultado de la suma
		
		//Si las filas y columnas de las matrices coinciden, entonces suma
		if(getFilas() == mat2.getFilas() && getColumnas() == mat2.getColumnas())
		{
			for (i = 0; i < fil; i++)
			{
				for (j = 0; j < col; j++)
				{
					//Guarda en "suma" el resultado de la matriz 1 "mat" y la matriz 2 "mat2"
					suma.mat[i][j] = mat[i][j] + mat2.mat[i][j];
					//mat2 es un parametro, por ello debemos acceder como objeto al arreglo
				}
			}
		}
		//Si no coinciden, manda mensaje de error y entrega una matriz de ceros
		else
		{
			System.out.println("Matrices incompatibles para la operacion");
		}
		
		return suma;		//Entrega la matriz "suma"
	}

	//Resta de una matriz con otra
		//Se necesitan 2 matrices para hacer la operacion, asi que ingresamos una como parametro (mat2)
	public Matriz restaMatriz(Matriz mat2)		
	{
		int i, j;								//Para el recorrido de los ciclos for
		Matriz resta = new Matriz(fil, col);	//Nueva matriz para guardar el resultado de la resta
		
		//Si las filas y las columnas de las matrices coinciden, entonces resta
		if(getFilas() == mat2.getFilas() && getColumnas() == mat2.getColumnas())
		{
			for (i = 0; i < fil; i++)
			{
				for (j = 0; j < col; j++)
				{
					//Guarda en "resta" el resultado de la matriz 1 "mat" y la matriz 2 "mat2"
					resta.mat[i][j] = mat[i][j] - mat2.mat[i][j];
					//mat2 es un parametro, por ello debemos acceder como objeto al arreglo
				}
			}
		}
		//Si no coinciden, manda mensaje de error y entrega una matriz de ceros
		else
		{
			System.out.println("Matrices incompatibles para la operacion");
		}

		return resta;		//Entrega la matriz "resta"
	}


	
}	//Fin Clase Matriz