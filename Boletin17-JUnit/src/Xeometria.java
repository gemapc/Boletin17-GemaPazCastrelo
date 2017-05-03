
public class Xeometria {
	
	public int perimetroCadrado(int lado){
		return lado*4;
	}
	
	public int areaCadrado(int lado){
		return lado*2;
	}
	
	public double teoremaPitagoras(int catetoA, int catetoB){
		return Math.sqrt(catetoA*catetoA+catetoB*catetoB);
	}
}