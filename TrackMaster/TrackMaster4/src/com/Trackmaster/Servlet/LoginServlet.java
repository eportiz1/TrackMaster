package com.Trackmaster.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginWeb.jr")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Servlet de login");
		//Para validar contenido
		String Usuario;
		String Password;
		
		//contenido de textos
		Usuario 	 = request.getParameter("usuario");
		Password	 = request.getParameter("password");
		try
		{
			//No hay restricciones con el contenido de los usuarios y passwords
			if(Password.equals("") && Usuario.equals("") )
			{
				System.out.println("No se ha ingresado ningun dato...");
			}
			else 
			{
				if(Usuario.equals(""))
				{
					System.out.println("Ingresa usuario...");
				}
				else
				{
					if(Password.equals(""))
					{
						System.out.println("Ingresa password...");
					}
					else 
					{
						if(Usuario.equals("quest") && Password.equals("quest"))
						{
							System.out.println("Login exitoso...");
						
						}
						else
						{
							System.out.println("credenciales incorrectas...");
						}

					}
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("ha ocurrido un error en el servidor");
		}
		
	}

}
