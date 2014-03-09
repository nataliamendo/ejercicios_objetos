package edu.upc.eetac.dsa.nmendo.objetosjava;

public class Arbol {
	
	public static int altura;
	public static String tipo;
	
	public Arbol ()
	{
		System.out.println("Un árbol genérico");
	}
	public Arbol (int a)
	{
        System.out.println("Un árbol de" + a +" metros");
	}
	
	public Arbol(String s)
	{
		 System.out.println("Un " + s);
	}
	
	public Arbol(Integer i, String s)
	{
        System.out.println("Un " + s + " de " + i + " metros");
	}

}
