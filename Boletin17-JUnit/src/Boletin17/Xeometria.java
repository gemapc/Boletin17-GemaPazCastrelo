package Boletin17;
/**
 * @author Gema Paz Castrelo
 */

public class Xeometria {
	/**
	 * Calcula o per�mero de un cadrado.
	 * @param lado Medida do lado do cadrado.
	 * @return O valor do per�metro.
	 */
	public int perimetroCadrado(int lado){
		if(lado<0) return -1;
		return lado*4;
	}
	
	/**
	 * Calcula a �rea de un cadrado.
	 * @param lado Medida do lado do cadrado.
	 * @return O valor da �rea.
	 */
	public int areaCadrado(int lado){
		if(lado<0) return -1;
		return lado*2;
	}
	
	/**
	 * Calcula a hipotenusa mediante o teorema de pit�goras.
	 * @param catetoA Valor de un dos catetos.
	 * @param catetoB Valor de outro cateto.
	 * @return O valor da hipotenusa.
	 */
	public double teoremaPitagoras(int catetoA, int catetoB){
		if(catetoA<0 || catetoB<0) return -1;
		return Math.sqrt(catetoA*catetoA+catetoB*catetoB);
	}
	
	/**
	 * Calcula o valor de un dos catetos mediante o teorema de pit�goras.
	 * @param hipotenusa Valor da hipotenusa.
	 * @param catetoA Valor do outro cateto.
	 * @return O valor do cateto restante.
	 */
	public double teoremaPitagoras(double hipotenusa, double catetoA){
		if(catetoA<0 || hipotenusa<0) return -1;
		else if(hipotenusa<catetoA) return -1;
		return Math.sqrt(hipotenusa*hipotenusa-catetoA*catetoA);
	}
}