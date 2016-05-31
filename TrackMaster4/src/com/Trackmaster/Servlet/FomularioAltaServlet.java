package com.Trackmaster.Servlet;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//importat package propios
import com.Trackmaster.Modelo.Validaciones;

/**
 * Servlet implementation class FomularioServlet
 */
//@WebServlet("/FomularioServlet")
public class FomularioAltaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public FomularioAltaServlet() {
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
		System.out.println("Servlet de Formulario alta");
		//Para validar contenido
		String Usuario;
		String Apellido;
		String Email;
		String EstadoCuenta;
		String Direccion;
		//fin para validar contenido
		
		//Para validar contenido nulo
		Boolean BUsuario;
		Boolean BApellido;
		Boolean BEmail;
		Boolean BDireccion;
		//fin para validar contenido nulo
		
		//contenido de textos
		Usuario 	 = request.getParameter("NombreUsuario");
		Apellido	 = request.getParameter("ApellidoUsuario");
		Email		 = request.getParameter("EmailUsuario");
		EstadoCuenta = request.getParameter("EstadoCuentaUsuario");
		Direccion  	 = request.getParameter("DireccionEnvioUsuario");
		//fin contenido de textos
		
		//Resultados de campos vacios o llenos (false o true)
		BUsuario=Usuario.isEmpty();
		BApellido=Apellido.isEmpty();
		BEmail=Email.isEmpty();
		BDireccion=Direccion.isEmpty();
		//fin de Resultados de campos vacios o llenos (false o true)
		
		//validar datos ingresados no sean nulos
		try
		{
			//System.out.println("entra en el try/FormularioAltaServlet");
					
			if(Usuario.equals("") && Apellido.equals("") && Email.equals("") && EstadoCuenta.equals("activo") && Direccion.equals("") )
			{
				System.out.println("no se han ingresado datos");
				
			}
			//validar que los textos se hayan 
			else
			{
				//instancia la clase validaciones para usar sus metodos
				Validaciones validacionUsuario = new Validaciones();
				
				if(BUsuario.equals(true) )
				{	
					System.out.println("no se han ingresado todos los datos");
									
				}
				else
				{
				 if(BApellido.equals(true))
				 {
					 System.out.println("no se han ingresado todos los datos");
				 }
				 else
				 {
				  if(BEmail.equals(true)){
					  System.out.println("no se han ingresado todos los datos");  
				  }
				  else
				  {
				   if(BDireccion.equals(true))
				   {
					   System.out.println("no se han ingresado todos los datos"); 
				   }
				   else
				   {
					System.out.println("ha completado todos los datos con éxito");   
					//ha pasado por todas las pruebas y ahora toca validar si los datos son correctos   
					Boolean bandUsuario=null;
					Boolean bandApellido=null;
					Boolean bandEmail=null;
					Boolean bandDireccion=null;
					bandUsuario=validacionUsuario.validaNumericoEnTexto(Usuario);
					if(bandUsuario==true)
					{
						System.out.println("Se ha ingresado caracteres incorrectos en Nombre");
					}
					else
					{
					 bandApellido=validacionUsuario.validaNumericoEnTexto(Apellido);
					 if(bandApellido==true)
					 {
						System.out.println("Se ha ingresado caracteres incorrectos en Apellido");
					 }
					 else
					 {
					  bandEmail=validacionUsuario.validaEmailEnTexto(Email);
					  if(bandEmail==false)
					  {
					    System.out.println("Se ha ingresado caracteres incorrectos en Email");
					  }
					  else
					  {
					   bandDireccion=validacionUsuario.validaAlfaNumericoEnTexto(Direccion);	  
					   if(bandDireccion==true)
					   {
						System.out.println("Se ha ingresado caracteres incorrectos en la dirección");
					   }
					   else
					   {
						//PASÓ POR TODAS LAS VALIDACIONES CAMPOS NULOS Y DE ANÁLISIS DE TEXTO
					   }
					  }
					 }
					}
					
				   }
				  }
				 }
					 
				}
			}	
		}
		catch(Exception ex)
		{
			System.out.println("ha ocurrido un error en el servidor");
			//request.getRequestDispatcher("login.jsp").forward(request, response);
		}	
	}
	
}
