package model;

import java.util.Comparator;

public class MascFechaComparator implements Comparator<Mascota>{

	@Override
	public int compare(Mascota o1, Mascota o2) {
		return o1.getFechaNac().compareTo(o2.getFechaNac());
	}

}
