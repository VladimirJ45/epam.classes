package epam.classes.model;

public class SaladDressing extends AbstractDiet {

	public enum Type {
		VINEGARY, OILY, MAYO
	}

	private Type type;
	private int calories;

	public SaladDressing(String name, Type type) {
		super(name);
		this.type = type;
		switch (type) {
			case VINEGARY: {
				this.calories = 5;
				break;
			}
			case OILY: {
				this.calories = 15;
				break;
			}
			case MAYO: {
				this.calories = 40;
				break;
			}
		}
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		SaladDressing other = (SaladDressing) obj;
		if (type != other.type)
			return false;
		return true;
	}

}
