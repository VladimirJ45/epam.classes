package epam.classes.model;

import java.util.ArrayList;
import java.util.List;

public class Salad {

	private List<AbstractDiet> diets;

	public Salad() {
		diets = new ArrayList<>();
	}

	public void add(AbstractDiet diet) {
		diets.add(diet);
	}

	public List<AbstractDiet> getDiet() {
		return diets;
	}

}
