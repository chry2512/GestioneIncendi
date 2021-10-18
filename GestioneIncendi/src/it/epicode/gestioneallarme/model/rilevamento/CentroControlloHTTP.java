package it.epicode.gestioneallarme.model.rilevamento;

import it.epicode.gestioneallarme.model.comunicazione.ComunicazioneHTTP;
import it.epicode.gestioneallarme.model.comunicazione.InfoSonda;

public class CentroControlloHTTP implements CentroControlloInterface {

	private String baseUrlNotifica = " http://host/alarm";
	private ComunicazioneHTTP canaleComunicazione;

	public CentroControlloHTTP() {
		this.canaleComunicazione = new ComunicazioneHTTP(baseUrlNotifica);
	}

	@Override
	public void rilevaIncendio(InfoSonda is) {
		canaleComunicazione.sendGet(is);

	}

}
