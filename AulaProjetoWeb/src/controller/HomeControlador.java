package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeControlador implements IControlador {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.getRequestDispatcher("/WEB-INF/paginas/home.jsp").forward(request, response);
	}

}
