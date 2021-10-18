package it.epicode.gestioneallarme.model.creator;

import it.epicode.gestioneallarme.model.comunicazione.InfoSonda;
import it.epicode.gestioneallarme.model.rilevamento.CentroControlloInterface;

public class CentroControlloProxy {

	private CentroControlloInterface concreteCentroControllo;

	public CentroControlloProxy(InfoSonda createInfoSonda) {
		CentroControlloFactory ccf = new CentroControlloFactory();
		concreteCentroControllo = ccf.createCentroControllo(createInfoSonda.getSonda());
	}

	public void rilevaIncendio(InfoSonda info) {
		concreteCentroControllo.rilevaIncendio(info);
	}

}
