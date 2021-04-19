package epam.classes;

import epam.classes.model.Salad;
import epam.classes.view.SaladPrinter;

public class Main {

	public static void main(String args[]) {

		SaladCreator creator = new SaladCreator();
		Salad salad = creator.create();

		SaladPrinter printer = new SaladPrinter();
		printer.print(salad);
	}

}
