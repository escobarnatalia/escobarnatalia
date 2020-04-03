package model;

import java.util.Comparator;

public class MascRazaComparator implements Comparator<Mascota>{

 
	@Override
	public int compare(Mascota o1, Mascota o2) {
		 
		return o1.getRaza().compareTo(o2.getRaza());
		
	}

}
