package Boletin17;
import java.util.ArrayList;

/**
 * @author Gema Paz Castrelo
 */

public class DNI {
	private char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
	/**
	 * M�todo que valora se un DNI � v�lido ou non, se o n�mero se corresponde coa letra.
	 * @param numeroLetra String co valor do NIF, � dicir, coa letra.
	 * @return true se o valor do DNI se corresponde coa letra, false en caso contrario.
	 */
	public boolean eValido(String numeroLetra){
		if(numeroLetra.length()<2 || numeroLetra.length()>9) return false;
		
		char letra;
		int numero=0,resto=-1,contador=0;
		
		while(numeroLetra.charAt(contador)>='0' && numeroLetra.charAt(contador)<='9') contador++;
		numero=Integer.parseInt(numeroLetra.substring(0,contador));
		letra=numeroLetra.charAt(numeroLetra.length()-1);
		resto=numero%23;
		for(int i=0;i<letras.length;i++)
			if(resto==i)
				if(letra==letras[i])
					return true;
		return false;
	}
	
	/**
	 * M�todo que calcula a letra v�lida para un n�mero DNI.
	 * @param numero String co n�mero DNI sobre o que se quere calcular a letra correspondente.
	 * @return O valor int correspondente � posici�n da letra.
	 */
	public int calculaLetra(String numero){
		if(numero.length()<1 || numero.length()>8) return -1;
		
		int resto=-1;
		
		for(int i=0;i<numero.length();i++)
			if(numero.charAt(i)<'0' || numero.charAt(i)>'9') return -1;
		
		resto=Integer.parseInt(numero)%23;
		for(int i=0;i<letras.length;i++){
			if(resto==i)
				return letras[i];
		}
		return -1;
	}
	
	/**
	 * M�todo que valora se un DNI � v�lido ou non, se o n�mero se corresponde coa letra.
	 * @param numeros ArrayList de enteiros co n�mero do DNI.
	 * @param letra Letra a probar a s�a validez co n�mero.
	 * @return true se a letra se corresponde co n�mero, false en caso contrario.
	 */
	public boolean eValido(ArrayList<Integer> numeros, char letra){
		if(numeros.size()<1 || numeros.size()>8) return false;
		
		int resto=-1,numero=0;
		
		for(int i=0;i<numeros.size();i++)
			numero+=(int)(numeros.get(i)*Math.pow(10,(numeros.size()-1)-i));
		resto=numero%23;
		for(int i=0;i<letras.length;i++)
			if(resto==i)
				if(letra==letras[i])
					return true;
		return false;		
	}
	
	/**
	 * M�todo que calcula a letra v�lida para un n�mero DNI.
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
		for(int i=0;i<letras.length;i++)
			if(resto==i)
				return letras[i];
		return -1;
	}
}
