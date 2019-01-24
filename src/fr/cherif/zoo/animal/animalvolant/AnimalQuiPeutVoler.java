package fr.cherif.zoo.animal.animalvolant;

import fr.cherif.zoo.animal.animalsautant.AnimalQuiPeutSauter;

public class AnimalQuiPeutVoler extends AnimalQuiPeutSauter {

	protected int longueurAiles;
// clic droit source --> générer getter et setters a chaque fois que protected est utilisé. 

	public AnimalQuiPeutVoler() {
		super();
	}

	public int getLongueurAiles() {
		return longueurAiles;
	}

	public void setLongueurAiles(int longueurAiles) {
		this.longueurAiles = longueurAiles;
	}

	public AnimalQuiPeutVoler(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void voler() {
		System.out.println("Vole!");
	}

}
