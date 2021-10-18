package it.epicode.gestioneallarme.model.rilevamento;

import java.util.ArrayList;
import java.util.List;

import it.epicode.gestioneallarme.model.observer.Observer;

public abstract class Subject {

	public abstract void notifyObservers();

	protected List<Observer> lst = new ArrayList<>();

	public void addObservers(Observer obj) {
		lst.add(obj);

	}

	public void deleteobservers(Observer obj) {
		lst.add(obj);

	}

}
