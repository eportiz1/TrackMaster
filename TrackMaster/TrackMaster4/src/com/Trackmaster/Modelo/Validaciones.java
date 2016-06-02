package com.Trackmaster.Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
	
	public Boolean validaNumericoEnTexto(String texto){
		 boolean bandera;	
		 Pattern pat = Pattern.compile("[0-9]+");
		 Matcher mat = pat.matcher(texto);
		 if (mat.matches()) {
			bandera=true;
		 }else{
			bandera=false;
		 }
		return bandera;
		}
	
	public Boolean validaEmailEnTexto(String texto){
		 boolean bandera;	
		 Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		 Matcher mat = pat.matcher(texto);
		 if (mat.matches()) {
			bandera=true;
		 }else{
			bandera=false;
		 }
		return bandera;
		}
	
	public Boolean validaAlfaNumericoEnTexto(String texto){
		 boolean bandera;	
		 Pattern pat = Pattern.compile("[A-Za-z0-9]+");
		 Matcher mat = pat.matcher(texto);
		 if (mat.matches()) {
			bandera=true;
		 }else{
			bandera=false;
		 }
		return bandera;
		}
}
