package es.studium.Repositorio;

import java.util.Scanner;

public class Repositorio
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do
		{
			System.out.println("Menú");
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("4-Dividir");
			System.out.println("0-Salir");
			opcion = teclado.nextInt();
			switch(opcion)
			{
			case 0:
				System.out.println("Adiós");
				break;
			case 1:
				sumar();
				break;
			case 2:
				restar();
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		}while(opcion!=0);
		teclado.close();
	}

	private static void restar()
	{
		System.out.println("Has elegido la resta");
	}

	private static void sumar()
	{
		System.out.println("Has elegido la suma");
	}
}