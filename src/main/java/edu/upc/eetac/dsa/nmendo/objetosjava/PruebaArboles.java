package edu.upc.eetac.dsa.nmendo.objetosjava;
import java.io.*;
import java.io.IOException;

/**
 * Hello world!
 *
 */

/*
 * queremos que la salida por consola de un programa en Java sea:
 * 	Un árbol de 4 metros
 * 	Un Roble
 * 	Un árbol genérico
 * 	Un Pino de 5 metros
 */
public class PruebaArboles 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try{
        	Arbol arbol1 = new Arbol(4);
        	Arbol arbol2 = new Arbol("Roble");
        	Arbol arbol3 = new Arbol();
        	Arbol arbol4 = new Arbol(5,"Pino");
        }
        catch(Exception e)
        {
        	System.err.println(e.getMessage());
        }
        
    }
}
