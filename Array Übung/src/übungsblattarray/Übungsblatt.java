package übungsblattarray;


//Aufgabe 1
public class Übungsblatt {

	public static void main(String[] args) {
		int[] quadrat;
		quadrat = new int [20];
		
		for (int i= 0; i < quadrat.length; i++) {
			quadrat [i] = i* i;
			
		}

		for (int quadratzahl : quadrat) {
			System.out.println(quadratzahl);
		}
		druckeArray (quadrat);
		int[] quersumme = new int [50];
		for (int i = 0; i < quersumme.length; i++) {
			quersumme [i] = quersumme(i);
			
		}
		druckeArray(quersumme);
		System.out.println("Mittelwert von Array quersumme:" + (double) summe(quersumme) / quersumme.length);
		System.out.println("Mittelwert von Array quadrat:" + (double) summe(quadrat) / quadrat.length);
		System.out.println("Das Maximum des Arrays quadrat liegt an Position" + maximum(quadrat) + "und hat den Wert" + quadrat [maximum(quadrat)]);
		System.out.println("Das Maximum des Arrays quadrat liegt an Position" + maximum(quersumme) + "und hat den Wert" + quadrat [maximum(quersumme)]);
	
		int[] quersummeKopie = kopieren(quersumme);
	}
	public static int [] kopieren (int [] original) {
		int[] kopie = new int[original.length];
		for (int i=0; i <kopie.length; i++) {
			kopie [i] = original [i];
		}
		return kopie;
	}
	public static int maximum(int[]	array) {
		int maximum = array [0];
		int pos = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array [i];
				pos = i;
			}
		}
	return pos;
	}


public static void druckeArray(int[] array) {
		System.out.println("Wert:\t");
		for(int i = 0; i< array.length; i++) {
			System.out.printf("%5d" ,array[i]);
		}
		System.out.println();
		System.out.println("Index:/t");
		for(int index =0; index < array.length; index++) {
			System.out.printf("%5d",index);
		}
	}
	
public static int quersumme (int zahl) {
		int quersumme = 0 ;
		while (zahl!=0) {
			quersumme += zahl % 10;
			zahl /= 10;
		}
		return quersumme;
	}
	
public static int summe (int[] array) {
	int summe = 0 ;
		for (int wert : array) {
			summe += wert;
	}
	return summe;
	}




}
