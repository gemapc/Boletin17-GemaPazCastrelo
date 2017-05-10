import java.util.ArrayList;

public class DNI {
	private char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
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
	
	public int calculaLetra(String numero){
		if(numero.length()<1 || numero.length()>8) return -1;
		
		int resto=-1;
		
		resto=Integer.parseInt(numero)%23;
		for(int i=0;i<letras.length;i++)
			if(resto==i)
				return letras[i];
		return -1;
	}
	
	public boolean eValido(ArrayList<Integer> numeros, char letra){
		if(numeros.size()<1 || numeros.size()>8) return false;
		
		int resto=-1,numero=0;
		
		for(int i=0;i<numeros.size();i++)
			numero=(int)(numeros.get(i)*Math.pow(10,8-i));
		resto=numero%23;
		for(int i=0;i<letras.length;i++)
			if(resto==i)
				if(letra==letras[i])
					return true;
		return false;		
	}
	
	public int calculaLetra(ArrayList<Integer> numeros){
		if(numeros.size()<1 || numeros.size()>8) return -1;
		
		int resto=-1,numero=0;
		
		for(int i=0;i<numeros.size();i++)
			numero=(int)(numeros.get(i)*Math.pow(10,8-i));
		resto=numero%23;
		for(int i=0;i<letras.length;i++)
			if(resto==i)
				return letras[i];
		return -1;
	}
}
