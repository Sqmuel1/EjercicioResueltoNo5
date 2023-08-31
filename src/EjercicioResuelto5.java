
public class EjercicioResuelto5 {

	public static void main(String[] args) {
		
		double x,y,suma;
		
		suma = 0;
		x = 20;
		suma = suma+ x;
		y = 40;
		x = x + Math.pow(y, 2);
		suma = suma + (x/y);
		
		System.out.print("El valor de la suma es: "+suma);
	}

}
