
public class Xeometria {
	
	public int perimetroCadrado(int lado){
		if(lado<0) return -1;
		return lado*4;
	}
	
	public int areaCadrado(int lado){
		if(lado<0) return -1;
		return lado*2;
	}
	
	public double teoremaPitagoras(int catetoA, int catetoB){
		if(catetoA<0 || catetoB<0) return -1;
		return Math.sqrt(catetoA*catetoA+catetoB*catetoB);
	}
	
	public double teoremaPitagoras(double hipotenusa, double catetoA){
		if(catetoA<0 || hipotenusa<0) return -1;
		return Math.sqrt(hipotenusa*hipotenusa-catetoA*catetoA);
	}
}