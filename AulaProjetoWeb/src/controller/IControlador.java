package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IControlador {

	void executa(HttpServletRequest request, 
			HttpServletResponse response) throws Exception;

}
