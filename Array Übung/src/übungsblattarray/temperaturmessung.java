package übungsblattarray;

public class temperaturmessung {

	public static void main(String[] args) {
		double [] temperaturen = new double [365];
		for (int i = 0; i < temperaturen.length; i++) {
			temperaturen[i] = generiereZufallstemperatur(-30, 30);
			
		}
	}
		public static int kaeltersterTag (double[]array) {
			double minimum = array[0];
			int pos = 0;
			for(int i = 1; i < array.length; i++) {
				if (array[i] < minimum) {
					minimum = array[i];
					pos = i;
				}
			}
			return pos ;
			
		}
		public static void druckeArray(double [] array) {
			for (double i: array) {
				System.out.println(i);
				
			}
		}
		
	
	
	
	public static double generiereZufallstemperatur(int min, int max) {
		return (Math.random() * (max - min)) + min ;
		
	}

}

