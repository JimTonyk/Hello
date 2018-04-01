package fr.doudou.model;

import fr.doudou.services.ICalculs;

public class Cercle implements ICalculs{
	
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon=rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2*rayon*Math.PI;
	}

	@Override
	public double surface() {
		return Math.PI*Math.pow(rayon, 2);
	}
	
	

}
