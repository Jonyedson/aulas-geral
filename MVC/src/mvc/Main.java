package mvc;

import mvc.controller.AppController;
import mvc.view.TelaPrincipal;

public class Main {
	
	public static void main(String[] args) {
		TelaPrincipal telaPrincipal = new TelaPrincipal();
		new AppController(telaPrincipal);
		telaPrincipal.setVisible(true);
	}

}
