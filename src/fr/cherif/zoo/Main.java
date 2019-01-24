package fr.cherif.zoo;

import fr.cherif.zoo.animal.Elephant;
import fr.cherif.zoo.animal.animalnageant.Kraken;
import fr.cherif.zoo.animal.animalsautant.Chat;
import fr.cherif.zoo.animal.animalsautant.Cheval;
import fr.cherif.zoo.animal.animalsautant.Chien;
import fr.cherif.zoo.animal.animalvolant.Aigle;

public class Main {

	public static void main(String[] args) {
		Chien rex = new Chien("Rex", "Berger", 15, 12, "Jaune", true);

		System.out.println(rex.getRace());

		Chat cat = new Chat("Tom", "Birman", 8, 6, "Rouge", true);
		System.out.println(cat.getNom());

		Cheval hor = new Cheval("Cheval", "Cheval de course", 100, 20, "Gris", false);

		Aigle ea = new Aigle("Not A Pygargue", "Aigle Royal", 8, 4, "Brun", true);

		Kraken kk = new Kraken("Octo", "Pieuvre Géante", 8000, 2000, "Bleu", true);

		System.out.println(hor.getNom());

		hor.manger();

		hor.sauter();

		Elephant petitElephant = new Elephant("Eleph", "Race des elephants", 1000, 120, "Gris", false);
		System.out.println("Animal: " + petitElephant.getNom());
		petitElephant.courir();
		System.out.println("Not A Pygargue:");
		ea.sauter();
		ea.voler();
		kk.nage();

		// Variable (ici ea = aigle) + . + Method (ici sauter) + (); tom.sauter();
	}

}

//Heritage multiple impossible sur Java.