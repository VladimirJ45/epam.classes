package epam.classes.model;

public class Vegetable extends AbstractDiet {

	private int calories;

	public Vegetable(int calories, String name) {
		super(name);
		this.calories = calories;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + calories;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
		if (calories != other.calories)
			return false;
		return true;
	}

}
