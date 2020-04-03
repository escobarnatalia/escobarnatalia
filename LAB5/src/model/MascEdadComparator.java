package model;

import java.util.Comparator;

public class MascEdadComparator implements Comparator<Mascota>{

	@Override
	public int compare(Mascota o1, Mascota o2) {
		 
		return o1.getEdad() - o2.getEdad();
	}

}
