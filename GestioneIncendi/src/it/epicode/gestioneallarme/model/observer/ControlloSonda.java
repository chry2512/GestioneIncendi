package it.epicode.gestioneallarme.model.observer;

import it.epicode.gestioneallarme.model.comunicazione.InfoSonda;
import it.epicode.gestioneallarme.model.creator.CentroControlloProxy;
import it.epicode.gestioneallarme.model.rilevamento.Sonda;
import it.epicode.gestioneallarme.model.rilevamento.Subject;

public class ControlloSonda implements Observer {

	private Long id;

	public ControlloSonda(Long id, Sonda sonda) {
		this.setId(id);
		sonda.addObservers(this);

	}

	@Override
	public void update(Subject obj) {

		InfoSonda infoSonda = new InfoSonda((Sonda) obj);
		CentroControlloProxy centro1 = new CentroControlloProxy(infoSonda);
		centro1.rilevaIncendio(infoSonda);

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
