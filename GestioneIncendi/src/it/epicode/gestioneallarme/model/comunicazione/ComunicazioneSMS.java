package it.epicode.gestioneallarme.model.comunicazione;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComunicazioneSMS extends CanaleComunicazione {

	private static final Logger logger = LoggerFactory.getLogger(ComunicazioneSMS.class);

	public void sendGet(InfoSonda is) {
		logger.info("ALLARME SCATTATO DALLA SONDA" + is.getId() + 
				"Invio sms a tutti i dipendenti. SmokeLevel: "+ is.getSmokeLevel());
	}

}
