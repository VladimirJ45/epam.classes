package epam.classes.logic;

import java.util.List;

import epam.classes.model.AbstractDiet;
import epam.classes.model.Salad;
 
public class SaladLogic {

	public int calculateCalorieContent(Salad salad) {

		List<AbstractDiet> diet = salad.getDiet();
		int calorieContent = 0;

		for (int i = 0; i < diet.size(); i++) {
			calorieContent = calorieContent + diet.get(i).getCalories();
		}
		return calorieContent;
	}

}
