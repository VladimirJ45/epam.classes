package epam.classes.model;

import epam.classes.model.SaladDressing.Type;

public abstract class AbstractDiet {

	private String name;
	private int calories;
	private Type type;
	private Boolean withSalt;
	
	public int getCalories() {
		return calories;
	}
	
	public Type getType() {
		return type;
	}
	
	public Boolean isWithSalt() {
		return withSalt;
	}

	public AbstractDiet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "AbstractDiet [name=" + name + ", calories=" + calories + ", type=" + type + ", withSalt=" + withSalt
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractDiet other = (AbstractDiet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
