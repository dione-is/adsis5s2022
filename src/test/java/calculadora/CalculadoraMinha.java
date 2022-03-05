package calculadora;

public class CalculadoraMinha {

	public double Somar(int v1, double v2) {
		//return 20.25;
		return v1 + v2;
	}
	
	public double Subtrair(int v1, double v2) {
		//return 20.25;
		return v1 - v2;
	}

	public double Multiplicar(int v1, double v2) {
		//return 20.25;
		return v1 * v2;
	}

	
	public double Dividir(int v1, double v2) {
		// TODO Auto-generated method stub
		if(v2 == 0 ) {
			throw new DivisaoPorZeroException();
		}
		return v1/v2;
	}

	public double Mem() {
		double result = Dividir(10, 2);
		return result;
	}


}
