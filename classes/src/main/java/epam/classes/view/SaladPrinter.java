package epam.classes.view;

import java.util.List;

import epam.classes.logic.SaladLogic;
import epam.classes.model.AbstractDiet;
import epam.classes.model.Salad;
import epam.classes.model.SaladDressing.Type;

public class SaladPrinter {

	public void print(Salad salad) {

		List<AbstractDiet> diet = salad.getDiet();

		System.out.println("Salad Ingredients:");

		for (int i = 0; i < diet.size(); i++) {

			Type type = diet.get(i).getType(); 
			
			//check salad dressing type 
			if (type != null) { 
				switch (type) {
				case VINEGARY: { //Vinegary dressing output
					System.out.println("Vinegary salad dressing " + diet.get(i).getName() + " (Calories: " 
							+ diet.get(i).getCalories() + ")");
					break;
				}
				case OILY: { //Oily dressing output
					System.out.println("Oily salad dressing '" + diet.get(i).getName() + "' (Calories: "
							+ diet.get(i).getCalories() + ")");
					break;
				}
				case MAYO: { //Mayonnaise based dressing output
					System.out.println("Mayonnaise based salad dressing " + diet.get(i).getName() + " (Calories: "
							+ diet.get(i).getCalories() + ")");
					break;
				}
				}
			} else if (diet.get(i).isWithSalt() != null) { //check if the ingredient is seasoning 

				boolean salted = diet.get(i).isWithSalt();
				if (salted) {
					System.out.println("Seasoned with " + diet.get(i).getName() + " and salt."); //seasoning with salt output
				} else {
					System.out.println("Seasoned with " + diet.get(i).getName()); //seasoning without salt output
				}
			} else {
				System.out.println(diet.get(i).getName() + " (Calories: " + diet.get(i).getCalories() + ")"); //standard ingredient output
			}
		}
		SaladLogic logic = new SaladLogic();
		int calories = logic.calculateCalorieContent(salad); //calculate calorie content
		System.out.println("Calorie content:" + calories); //calorie content output
	}

}
