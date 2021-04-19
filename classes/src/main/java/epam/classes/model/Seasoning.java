package epam.classes.model;

public class Seasoning extends AbstractDiet {

	private Boolean withSalt;

	public Seasoning(String name, Boolean withSalt) {
		super(name);
		this.withSalt = withSalt;
	}

	public Boolean isWithSalt() {
		return withSalt;
	}

	public void setWithSalt(Boolean withSalt) {
		this.withSalt = withSalt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (withSalt ? 1231 : 1237);
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
		Seasoning other = (Seasoning) obj;
		if (withSalt != other.withSalt)
			return false;
		return true;
	}

}
