package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Entre com as medidas do tri�ngulo X: ");
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());
		
		double p = (x.getA() + x.getB() + x.getC()) / 2.0;
		double areaX = Math.sqrt(p* (p-x.getA()) * (p-x.getB()) * (p-x.getC()));
		
		p = (y.getA() + y.getB() + y.getC()) / 2.0;
		double areaY = Math.sqrt(p* (p-y.getA()) * (p-y.getB()) * (p-y.getC()));
		
		System.out.printf("�rea do tri�ngulo X: %.4f%n" , areaX);
		System.out.printf("�rea do tri�ngulo Y: %.4f%n" , areaY);
		
		if(areaX > areaY) {
			System.out.println("Tri�ngulo com maior �rea: " + areaX);
		}else {
			
			System.out.printf("Tri�ngulo com maior �rea: %.4f%n" , areaY);
		}
		
		sc.close();

	}

}
