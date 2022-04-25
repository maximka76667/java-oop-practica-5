package main;

public class Main {

	public static void main(String[] args) {
		Fraccion fraccion = null;
		try {
			fraccion = new Fraccion(5, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(fraccion != null) System.out.println(fraccion.getNumerador() + " " + fraccion.getDenominador());
		
		
		Fraccion frac2 = null;
		try {
			frac2 = new Fraccion(1.2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(frac2.getNumerador() + " " + frac2.getDenominador());
		System.out.println(frac2.MCD());
		System.out.println(frac2.getNumerador() + " " + frac2.getDenominador());
	}

}
