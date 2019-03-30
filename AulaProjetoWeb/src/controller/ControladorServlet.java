package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app")
public class ControladorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		if(acao == null) {
			acao = "HomeControlador";
		}
		String nomeDaClasse = "controller." + acao;
		try	{
			Class<?> classe	= Class.forName(nomeDaClasse);
			IControlador controlador = (IControlador) classe.newInstance();
			controlador.executa(request, response);
		} catch (Exception e) {
			throw new ServletException("Erro na execução", e);
		}
	}
}
