package fr.cherif.zoo.animal.animalnageant;

import fr.cherif.zoo.animal.Animal;

public class AnimalQuiPeutNager extends Animal {

	public AnimalQuiPeutNager() {
		super();
	}

	public AnimalQuiPeutNager(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
	}

	public void nage() {
		System.out.println("Plouf!");
	}

}
