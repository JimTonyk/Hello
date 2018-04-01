package fr.doudou.model;

import fr.doudou.services.ICalculs;

public class Rectangle implements ICalculs{
	
	//Attributes
	private double longueur;
	private double largeur;
	
	// Constructor
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	// Getters and setters
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return 2*(longueur+largeur);
	}

	@Override
	public double surface() {
		return longueur*largeur;
	}
	
	
	
	

}
