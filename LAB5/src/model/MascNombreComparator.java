package model;

import java.util.Comparator;

public class MascNombreComparator implements Comparator<Mascota>  {

 
	@Override
	public int compare(Mascota m1, Mascota m2) {
		 return m1.getNombre().compareTo(m2.getNombre());
	}

}
