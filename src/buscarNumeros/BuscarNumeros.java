package buscarNumeros;

import java.util.Scanner;

public class BuscarNumeros
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[9];
		int buscar;
		boolean encontrado;
		String respuesta;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		do
		{
			encontrado = false;
			System.out.print("Numero a buscar: ");
			buscar = Integer.parseInt(sc.nextLine());
			for(int i = 0; i < numeros.length && !encontrado; i++)
			{
				if(numeros[i] == buscar)
					encontrado = true;
			}
			if(encontrado)
				System.out.println("Encontrado.");
			else
				System.out.println("NO encontrado.");
			System.out.print("¿Desea seguir buscando numeros?(s/n): ");
			respuesta = sc.nextLine();
			while(!respuesta.equals("s") || !respuesta.equals("n"))
			{
				System.out.println("Respuesta incorrecta.");
				System.out.print("¿Desea seguir buscando números?(s/n): ");
				respuesta = sc.nextLine();
			}
		}
		while(respuesta.equals("s"));
		sc.close();
	}
}
