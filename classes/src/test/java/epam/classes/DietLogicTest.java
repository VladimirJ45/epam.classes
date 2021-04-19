package epam.classes;

import org.junit.Assert;
import org.junit.Test;

import epam.classes.logic.SaladLogic;
import epam.classes.model.Salad;

public class DietLogicTest {

	@Test
	public void testShouldCalculateCalorieContent() {
		// given
		SaladCreator creator = new SaladCreator();
		Salad salad = creator.create();
		SaladLogic logic = new SaladLogic();
		// when
		int calories = logic.calculateCalorieContent(salad);
		// then
		Assert.assertEquals(89, calories);
	}

}
