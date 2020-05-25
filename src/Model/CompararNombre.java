package Model;

import java.util.Comparator;

public class CompararNombre implements Comparator <Pokemon>{

	
	public int compare(Pokemon o1, Pokemon o2) {
		return o1.getNom().compareTo(o2.getNom());
	}

}
