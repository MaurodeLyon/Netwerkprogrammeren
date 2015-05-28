import model.Model;
import view.View;

public class Launch {

	public static void main(String[] args) {
		View view = new View();
		new Model(view);
	}

}
