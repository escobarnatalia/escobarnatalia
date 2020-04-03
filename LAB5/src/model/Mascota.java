package model;

import processing.core.PApplet;

public class Mascota implements Comparable<Mascota> {
	
	private int edad;
	private  String nombre, raza, idNum;
	 private  String fechaNac;
	 
	public Mascota(String idNum,  int edad, String nombre, String raza, String fechaNac, PApplet app) {
		this.edad = edad;
		this.idNum = idNum;
		this.nombre = nombre;
		this.raza = raza;
		this.fechaNac = fechaNac;
		 
	}
	
	 

 	public String getIdNum() {
		return idNum;
	}


	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}



	@Override
	public int compareTo(Mascota m) {
		 return idNum.compareTo(m.getIdNum());
	}


}