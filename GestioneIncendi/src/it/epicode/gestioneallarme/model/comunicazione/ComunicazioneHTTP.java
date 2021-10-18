package it.epicode.gestioneallarme.model.comunicazione;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComunicazioneHTTP extends CanaleComunicazione {

	private static final Logger logger = LoggerFactory.getLogger(ComunicazioneHTTP.class);
	private String baseUrlnotifica;

	public ComunicazioneHTTP(String baseUrlnotifica) {

		this.baseUrlnotifica = baseUrlnotifica;
	}

	public void sendGet(InfoSonda is) {

		logger.info("ALLARME SCATTATO DALLA SONDA: " + is.getId() + baseUrlnotifica + "?=idsonda=" + is.getId() + "&lat="
				+ is.getLatitude() + "&lon=" + is.getLongitude() + "&smokelevel=" + is.getSmokeLevel());

	}

}
