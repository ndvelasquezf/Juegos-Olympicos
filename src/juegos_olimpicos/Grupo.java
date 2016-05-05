/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos_olimpicos;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Velasquez y Nicolas David Velasquez Fuentes
 */
public class Grupo {

	private String deporte;

	private ArrayList <Deportista> deportistas;
	
	
	public void anadirDeportista(Deportista deportista){
		this.deportistas.add(deportista);
	}
	
	public Grupo(String deporte) {
		this.deporte = deporte;
		this.deportistas = new ArrayList<Deportista>();
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	@Override
	public String toString() {
		String string = "";
		for (Deportista deportista : deportistas) {
			string = string + deportista.toString();
		}
		return "Deporte: " + this.deporte + "[" + string + "] Deportistas: ";
	}
}
