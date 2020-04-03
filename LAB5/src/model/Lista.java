	package model;

import java.util.Collections;
import java.util.LinkedList;

public class Lista {

	LinkedList<Mascota> linkList;
	MascNombreComparator ordNombre;
	MascEdadComparator ordEdad;
	MascRazaComparator ordRaza;
	MascFechaComparator ordFecha;
	

	public Lista() {

		linkList = new LinkedList<Mascota>();
		ordNombre = new MascNombreComparator();
		ordEdad = new MascEdadComparator();
		ordRaza = new MascRazaComparator();
		ordFecha = new MascFechaComparator();

	}

	public void addList(Mascota pet) {
		linkList.add(pet);
	}
	
	public void OrdenarID() {
		Collections.sort(linkList);
	}
	
	public void OrdenarNombre() {
		Collections.sort(linkList, ordNombre);
	}
	
	public void OrdenarEdad() {
		Collections.sort(linkList, ordEdad);
	}
	
	public void OrdenarRaza() {
		Collections.sort(linkList, ordRaza);
	}

	public void OrdenarFecha() {
		Collections.sort(linkList, ordFecha);
	}
	
	

	public LinkedList<Mascota> getLinkList() {
		return linkList;
	}

	public void setLinkList(LinkedList<Mascota> linkList) {
		this.linkList = linkList;
	}
 
}
