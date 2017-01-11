package übungsblattarray;

public class fibonacci {

	public static void main(String[] args) {
		int anzahl = 8;
		System.out.printf("Anzahl Paare:\t");{
		for (int i = 0; i < anzahl; i++) {
			System.out.printf("%3d", fibonacci(i));
			
		}
		System.out.println();
		System.out.print("Monat:\t \t");
		for (int i = 0; i < anzahl; i++) {
			System.out.printf("%3d",i);
			
		}
		System.out.println();
		}
		

		int [] fibonacci = fibonacciZahlBis(11);
		for (int i : fibonacci) {
			System.out.println(i);
		}

	}

	

	public static int fibonacci (int monat) {
		if(monat == 0 || monat == 1) {
			return 1;
			
		}
		int anzahlVorvorgaenger = 1;
		int anzahlVorgaenger = 1;
		int fib = 1;
		int i = 2;
		while (i <= monat) {
			anzahlVorvorgaenger = anzahlVorgaenger;
			anzahlVorgaenger = fib;
			fib = anzahlVorvorgaenger + anzahlVorgaenger;
			i++;
		}
		return fib;
		
	}

	public static int [] fibonacciZahlBis(int n) {
		int[] fib = new int [n];
		if (n > 1) {
		fib[0] =1;
		fib[1] =1;
		for (int i = 2; i < n; i++) {
				fib[i] = fib[i - 2] + fib [i - 1];
			}
		}
		return fib;
	}

	


}
