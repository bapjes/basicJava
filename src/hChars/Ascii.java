package hChars;

import libs.Input;

public class Ascii {

	public static void main(String[] args) {
	    for (int i = 65; i < 65 + 26; i++)  // ciclo de i del 65 al 90
	    {
	        Input.print((char) i + " is " + i + "\n");   //imprime el código ASCII de un caracter
	    }

	}

}
