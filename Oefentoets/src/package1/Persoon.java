package package1;

public class Persoon implements Comparable<Persoon> {

	@Override
	public boolean equals(Object object) {
		Persoon persoon = (Persoon) object;
		if (this.getGeboorteJaar() == persoon.getGeboorteJaar()
				&& this.getNaam() == persoon.getNaam()
				&& this.isMan() == persoon.isMan())
			return true;
		else
			return false;
	}

	private String naam;
	private int geboorteJaar;
	private boolean isMan;

	public Persoon(String naam, int geboorteJaar, boolean isMan) {
		this.naam = naam;
		this.geboorteJaar = geboorteJaar;
		this.isMan = isMan;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getGeboorteJaar() {
		return geboorteJaar;
	}

	public void setGeboorteJaar(int geboorteJaar) {
		this.geboorteJaar = geboorteJaar;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}

	@Override
	public String toString() {
		return "Persoon [naam=" + naam + ", geboorteJaar=" + geboorteJaar
				+ ", isMan=" + isMan + "]";
	}

	@Override
	public int compareTo(Persoon p) {
		if (getGeboorteJaar() < p.getGeboorteJaar())
			return -1;
		else if (getGeboorteJaar() > p.getGeboorteJaar())
			return 1;
		else
			return 0;
	}
}
