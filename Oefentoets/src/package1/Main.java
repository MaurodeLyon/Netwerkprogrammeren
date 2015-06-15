package package1;

public class Main {

	public static void main(String[] args) {
		Persoon Oma = new Persoon("Oma", 95, false);
		Persoon Opa = new Persoon("Opa", 100, true);

		Persoon Ma = new Persoon("Ma", 45, false);
		Persoon Tante = new Persoon("Tante", 48, false);
		Persoon Pa = new Persoon("Pa", 50, true);
		Persoon Oom = new Persoon("Oom", 49, true);

		Persoon Bro = new Persoon("Bro", 20, true);
		Persoon Zus = new Persoon("Zus", 19, false);
		Persoon Ik = new Persoon("Ik", 18, true);

		Stamboom stamboomP1 = new Stamboom(Opa);

		stamboomP1.voegKindToeAanPersoon(Opa, Pa);
		stamboomP1.voegKindToeAanPersoon(Opa, Oom);
		stamboomP1.voegKindToeAanPersoon(Opa, Tante);

		stamboomP1.voegKindToeAanPersoon(Pa, Bro);
		stamboomP1.voegKindToeAanPersoon(Pa, Ik);
		stamboomP1.voegKindToeAanPersoon(Pa, Zus);

		System.out.println(stamboomP1.jongstePersoon());
	}

}
