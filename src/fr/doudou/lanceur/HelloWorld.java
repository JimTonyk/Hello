package fr.doudou.lanceur;

import fr.doudou.model.Carre;
import fr.doudou.model.Cercle;
import fr.doudou.model.Rectangle;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("Encore un texte!");
		
		Rectangle rect1 = new Rectangle(5, 4);
		Rectangle rect2 = new Carre(10);
		Cercle cercle = new Cercle(8);
		
		double [] calcul = new double [6];
		double calcul1 = rect1.perimetre();
		double calcul2 = rect1.surface();
		double calcul3 = rect2.surface();
		double calcul4 = rect2.perimetre();
		double calcul5= cercle.perimetre();
		double calcul6= cercle.surface();
		
		calcul[0]= calcul1;
		calcul[1]= calcul2;
		calcul[2]= calcul3;
		calcul[3]= calcul4;
		calcul[4]= calcul5;
		calcul[5]= calcul6;
		
		for (double d : calcul) {
			double somme=0;
			somme = somme+ d;
			System.out.println(somme);
		}

	}

}
