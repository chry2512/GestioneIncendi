package it.epicode.gestioneallarme.model.observer;

import it.epicode.gestioneallarme.model.rilevamento.Subject;

public interface Observer {

	public abstract void update(Subject obj);

}
