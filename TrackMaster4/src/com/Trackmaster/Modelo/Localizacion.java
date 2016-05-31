package com.Trackmaster.Modelo;

public class Localizacion {
	private double  fechaEnvio;
	private int		idPedido;
	private double	latitud;
	private double 	longitud;
	
	
	public double getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(double fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
}
