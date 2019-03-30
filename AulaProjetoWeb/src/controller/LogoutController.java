package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements IControlador {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession sessao = request.getSession();
		sessao.removeAttribute("usuario");
		response.sendRedirect("login.jsp");
	}

}
