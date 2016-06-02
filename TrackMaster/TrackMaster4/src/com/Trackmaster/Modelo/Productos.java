package com.Trackmaster.Modelo;

public class Productos {
	private int    idProducto;
	private String marca;
	private String modelo;
	private String descripcion;
	private int	   precioUnitario;
	private int	   stock;
	
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}	
	
	//Constructor inicializador
	public Productos(){
		idProducto=0;
		marca="";
		modelo="";
		descripcion="";
		precioUnitario=0;
		stock=0;
	}
	
	
	
}
