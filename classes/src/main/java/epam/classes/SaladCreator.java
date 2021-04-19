package epam.classes;

import epam.classes.model.Salad;
import epam.classes.model.SaladDressing;
import epam.classes.model.Seasoning;
import epam.classes.model.Vegetable;

public class SaladCreator {

	public Salad create() {

		Vegetable vegetable1 = new Vegetable(18, "Tomato");
		Vegetable vegetable2 = new Vegetable(40, "Onion");
		Vegetable vegetable3 = new Vegetable(16, "Cucumber");
		SaladDressing dressing = new SaladDressing("Olive oil", SaladDressing.Type.OILY);
		Seasoning seasoning = new Seasoning("Black pepper", true);

		Salad salad = new Salad();
		salad.add(vegetable1);
		salad.add(vegetable2);
		salad.add(vegetable3);
		salad.add(dressing);
		salad.add(seasoning);

		return salad;
	}

}
