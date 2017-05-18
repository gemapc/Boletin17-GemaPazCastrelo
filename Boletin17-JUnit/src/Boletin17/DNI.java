package Boletin17;
import java.util.ArrayList;

/**
 * @author Gema Paz Castrelo
 */

public class DNI {
	private char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
	/**
	 * M�todo que valora se un DNI � v�lido ou non, se o n�mero se corresponde coa letra.
	 * Se un numero � menor que 8 cifras, completase con 0 pola esquerda.
	 * @param numeroLetra String co valor do NIF, � dicir, coa letra.
	 * @return true se o valor do DNI se corresponde coa letra, false en caso contrario.
	 */
	public boolean eValido(String numeroLetra){
		if(numeroLetra.length()<2 || numeroLetra.length()>9) return false;
		
		String dni=numeroLetra.toUpperCase();
		char letra;
		int numero=0,resto=-1;
		
		for(int i=0;i<dni.length()-2;i++){
			if(dni.charAt(i)<'0' || dni.charAt(i)>'9') return false;
		}
		numero=Integer.parseInt(dni.substring(0,numeroLetra.length()-1));
		
		if(dni.charAt(dni.length()-1)<'A' || dni.charAt(dni.length()-1)>'Z') return false;
		letra=dni.charAt(dni.length()-1);
		
		resto=numero%23;
		if(letra==letras[resto]) return true;
		return false;
	}
	
	/**
	 * M�todo que calcula a letra v�lida para un n�mero DNI. Se un numero � menor que 8
	 * cifras, completase con 0 pola esquerda.
	 * @param numero String co n�mero DNI sobre o que se quere calcular a letra correspondente.
	 * @return O valor int correspondente � posici�n da letra.
	 */
	public int calculaLetra(String numero){
		if(numero.length()<1 || numero.length()>8) return -1;
		
		int resto=-1;
		
		for(int i=0;i<numero.length();i++)
			if(numero.charAt(i)<'0' || numero.charAt(i)>'9') return -1;
		resto=Integer.parseInt(numero)%23;
		return letras[resto];
	}
	
	/**
	 * M�todo que valora se un DNI � v�lido ou non, se o n�mero se corresponde coa letra.
	 * Se un numero � menor que 8  cifras, completase con 0 pola esquerda.
	 * @param numeros ArrayList de enteiros co n�mero do DNI.
	 * @param letra Letra a probar a s�a validez co n�mero.
	 * @return true se a letra se corresponde co n�mero, false en caso contrario.
	 */
	public boolean eValido(ArrayList<Integer> numeros, char letra){
		if(numeros.size()<1 || numeros.size()>8) return false;
		
		int resto=-1,numero=0;
		
		for(int i=0;i<numeros.size();i++){
			if(numeros.get(i)<0 || numeros.get(i)>9) return false;
			numero+=(int)(numeros.get(i)*Math.pow(10,(numeros.size()-1)-i));
		}
		resto=numero%23;
		if(letra==letras[resto]) return true;
		return false;		
	}
	
	/**
	 * M�todo que calcula a letra v�lida para un n�mero DNI.
	 * Se un numero � menor que 8  cifras, completase con 0 pola esquerda.
	 * @param numeros ArrayList de enteiros co n�mero DNI sobre o 
	 * que se quere calcular a letra correspondente.
	 * @return O valor int correspondente � posici�n da letra.
	 */
	public int calculaLetra(ArrayList<Integer> numeros){
		if(numeros.size()<1 || numeros.size()>8) return -1;
		
		int resto=-1,numero=0;
		
		for(int i=0;i<numeros.size();i++){
			if(numeros.get(i)<0 || numeros.get(i)>9) return -1;
			numero+=(int)(numeros.get(i)*Math.pow(10,(numeros.size()-1)-i));
		}
		resto=numero%23;
		return letras[resto];
	}
}
