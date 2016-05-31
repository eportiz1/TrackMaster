package com.Trackmaster.Modelo;

public class Pedido {
	private int 	idPedido;
	private String  descripcion;
	private String 	estado;
	private double	fechaPedido;
	private	int		cantidad;
	private double	precioTotal;
	private int		idProducto;
	private double	fechapedido;
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(double fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public double getFechapedido() {
		return fechapedido;
	}
	public void setFechapedido(double fechapedido) {
		this.fechapedido = fechapedido;
	}

}
