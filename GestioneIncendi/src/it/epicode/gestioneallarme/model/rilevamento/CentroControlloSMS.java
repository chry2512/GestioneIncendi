package it.epicode.gestioneallarme.model.rilevamento;

import it.epicode.gestioneallarme.model.comunicazione.ComunicazioneSMS;
import it.epicode.gestioneallarme.model.comunicazione.InfoSonda;

public class CentroControlloSMS implements CentroControlloInterface {

	private ComunicazioneSMS canaleComunicazione;

	public CentroControlloSMS(ComunicazioneSMS canaleComunicazione) {

		this.canaleComunicazione = canaleComunicazione;
	}

	@Override
	public void rilevaIncendio(InfoSonda is) {
		canaleComunicazione.sendGet(is);
	}

}
