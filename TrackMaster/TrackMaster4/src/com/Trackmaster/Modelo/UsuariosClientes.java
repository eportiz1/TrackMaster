package com.Trackmaster.Modelo;

import java.util.ArrayList;

public class UsuariosClientes {
	private int 	idUsuario;
	private String 	nombre;
	private String	apellido;
	private	String	email;
	private String	estadoCuenta;
	private	String	direccionEnvio;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstadoCuenta() {
		return estadoCuenta;
	}
	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	
	//Constructor inicializador 
	public UsuariosClientes(){
		idUsuario=0;
		nombre="";
		apellido="";
		email="";
		estadoCuenta="";
		direccionEnvio="";
	}
	
	public static ArrayList <Productos> productos = new ArrayList<>(); //para un cliente guardar ciertos productos
}
