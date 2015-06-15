package package1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Stamboom {

	private Persoon ouder;
	private Persoon getrouwdMet;
	private List<Stamboom> kinderen;

	public Stamboom(Persoon ouder) {
		this.ouder = ouder;
		kinderen = new ArrayList<Stamboom>();
	}

	public boolean voegKindToeAanPersoon(Persoon ouder, Persoon kind) {
		if (getOuder().equals(ouder)) {
			kinderen.add(new Stamboom(kind));
			return true;
		} else {
			for (Stamboom stamboom : kinderen) {
				stamboom.voegKindToeAanPersoon(ouder, kind);
			}
			return false;
		}
	}

	public int startTellingVrouwen() {
		int aantalVrouwen = 0;
		if (!ouder.isMan())
			aantalVrouwen++;
		return AantalVrouwen(aantalVrouwen, kinderen);
	}

	public int AantalVrouwen(int aantalVrouwen, List<Stamboom> kinderen) {
		for (Stamboom s : kinderen) {
			if (!s.getOuder().isMan()) {
				aantalVrouwen++;
			}
			if (!s.getKinderen().isEmpty()) {
				aantalVrouwen = AantalVrouwen(aantalVrouwen, s.getKinderen());
			}
		}
		return aantalVrouwen;
	}

	public Persoon jongstePersoon() {
		Stamboom jongstePersoon = this;

		return zoekJongste(jongstePersoon, jongstePersoon.getKinderen()).getOuder();
	}

	private Stamboom zoekJongste(Stamboom jongstePersoon,
			List<Stamboom> kinderen) {
		if (!kinderen.isEmpty()) {
			for (Stamboom stamboom : kinderen) {
				jongstePersoon = zoekJongste(jongstePersoon,
						stamboom.getKinderen());
				jongstePersoon = getYoungest(stamboom, jongstePersoon);
			}
		}
		return jongstePersoon;
	}

	public Stamboom getYoungest(Stamboom p1, Stamboom p2) {
		if (p1.getOuder().compareTo(p2.getOuder()) == -1) {
			return p1;
		} else if (p1.getOuder().compareTo(p2.getOuder()) == 1) {
			return p2;
		} else
			return p1;
	}

	public Persoon getOuder() {
		return ouder;
	}

	public void setOuder(Persoon ouder) {
		this.ouder = ouder;
	}

	public Persoon getGetrouwdMet() {
		return getrouwdMet;
	}

	public void setGetrouwdMet(Persoon getrouwdMet) {
		this.getrouwdMet = getrouwdMet;
	}

	public List<Stamboom> getKinderen() {
		return kinderen;
	}

	public void setKinderen(List<Stamboom> kinderen) {
		this.kinderen = kinderen;
	}

	@Override
	public String toString() {
		return "Stamboom [ouder = " + ouder.getNaam() + ", getrouwdMet = "
				+ getrouwdMet + ", kinderen = " + kinderen + "]";
	}
}
