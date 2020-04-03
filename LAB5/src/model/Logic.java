package model;

import processing.core.PApplet;

public class Logic {

	private String[] text1;
	private String[] text2;
	private Lista lista;
	private PApplet app;
	

	public Logic(PApplet app) {
		this.app = app;
		text1 = app.loadStrings("../data/datosUno.txt");
		text2 = app.loadStrings("../data/datosDos.txt");

		lista = new Lista();
		
		for (int i = 0; i < text1.length; i++) {
			String[] datosUno = text1[i].split(",");

			for (int j = 0; j < text2.length; j++) {
				String[] datosDos = text2[j].split(",");

				if (datosDos[0].equals(datosUno[0])) {
					String nombre = datosUno[1];
					String raza = datosDos[1];
					String fechaNac = datosDos[2];
					String idNum = datosUno[0];
					int edad = Integer.parseInt(datosUno[2]);

					lista.addList(new Mascota(idNum, edad, nombre, raza, fechaNac, app));

				}

			}
		}
		
		
	}


	
	public void drawLista() {
		app.fill(255);
		for(int i = 0; i<lista.getLinkList().size(); i++) {
			app.text(lista.getLinkList().get(i).getIdNum(), 50,50 + (i*80));
			app.text(lista.getLinkList().get(i).getNombre(), 150,50 + (i*80));
			app.text(lista.getLinkList().get(i).getEdad(), 250,50 + (i*80));
			app.text(lista.getLinkList().get(i).getRaza(), 300,50 + (i*80));
			app.text(lista.getLinkList().get(i).getFechaNac(), 450,50 + (i*80));
			
			
		}
		
		 
		
	}
	
	public void ordNatural() {
		lista.OrdenarID();
	}
	
	public void ordParcial() {
		lista.OrdenarNombre();
		
	}

	public void ordParcial2() {
		lista.OrdenarEdad();
		
	}
	
	public void ordParcial3() {
		lista.OrdenarRaza();
		
	}
	
	public void ordParcial4() {
		lista.OrdenarFecha();
		
	}
}
