package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;

	public Libretto() {
		this.voti= new ArrayList<Voto>();

	}

	public void add(int voto, String corso, LocalDate data) {

	}

	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) { //piu utilizzabile
		voti.add(v);
		//deleghiamo alla lista voti l'aggiunta del voto
		//lista ordinata per ordine di inserimento
	}

	//public void StampaVoti (int voto) {} //stampa direttamente i voti

	//public StringStampaVoti2 (int voto) {} //costruisce una stringa con gli esami da stampare ma non stampa ancora
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * 
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	public List<Voto> cercaVoti (int punti){ //seleziona una lista che corrisponde ai criteri di ricerca
	List<Voto> result = new ArrayList<Voto>();

	for(Voto v: this.voti) {
		//scandisci lista voti
		//se è uguale a quello passato da parametro
		//aggiungi a lista risultati fatta di oggetti voto 
		if(v.getPunti()==punti) {
			result.add(v);
		}
	}
	return result;
	}
}
