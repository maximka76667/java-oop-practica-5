package main;

public class Fraccion {
	
	int numerador, denominador;

	public Fraccion(int numerador, int denominador) throws Exception {
		this.numerador = numerador;
		setDenominador(denominador);
	}
	
	public Fraccion(int numerador) throws Exception {
		this(numerador, 1);
	}
	
	public Fraccion(double numero) throws Exception {
		setDenominador(1);
		setNumerador(numero);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	
	public void setNumerador(double numerador) {
		while(numerador % 1 != 0) {
			numerador *= 10;
			this.denominador *= 10;
		}
		this.numerador = (int) numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) throws Exception {
		if(denominador == 0) throw new Exception("Denominador inválido");
		this.denominador = denominador;
	}
	
	public int MCD() {
		
		int a = Math.max(numerador, denominador);
	    int b = Math.min(numerador, denominador);
	    
		int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return temp;
	}

//	private int MCM() {
//		
//	}
	
}
