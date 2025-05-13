package clases;

public class Maximos {
	
	/**
	 * Calcula el valor maximo de dos numeros enteros positivos pasados por parametros
	 * 
	 * @param num1
	 * @param num2
	 * 
	 * @return el numero maximo de dos numeros enteros positivos
	 * 
	 * @throws IllegalArgumentException
	 */
	public static int MaximoDe2EnterosPositivos (int num1, int num2) throws IllegalArgumentException{
		if (num1>=0 && num2>=0) {
			if(num1>num2) {
				return num1;
			}else if(num2>num1) {
				return num2;
			}else {
				return num1; //enviar cualquiera para mostrar que es igual
			}
		}else {
			throw new IllegalArgumentException ("Alguno de los numeros es menor que 0");	
		}
	}
	
	/**
	 * Calcula el valor maximo de tres numeros enteros positivos pasados por parametros
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * 
	 * @return el numero maximo de tres numeros enteros positivos
	 * 
	 * @throws IllegalArgumentException
	 */
	public static int MaximoDe3EnterosPositivos (int num1, int num2, int num3) throws IllegalArgumentException{
		if (num1>=0 && num2>=0 && num3>=0) {
			if(num1>num2 && num1>num3) {
				return num1;
			}else if(num2>num1 && num2>num3) {
				return num2;
			}else if(num3>num1 && num3>num2) {
				return num3;
			}else {
				return num1; //enviar cualquiera para mostrar que es igual
			}
		}else {
			throw new IllegalArgumentException ("Alguno de los numeros es menor que 0");		
		}
	}

}
