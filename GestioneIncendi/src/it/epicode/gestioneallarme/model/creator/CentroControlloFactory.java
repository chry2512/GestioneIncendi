package it.epicode.gestioneallarme.model.creator;

import it.epicode.gestioneallarme.model.rilevamento.CentroControlloHTTP;
import it.epicode.gestioneallarme.model.rilevamento.CentroControlloInterface;
import it.epicode.gestioneallarme.model.rilevamento.Sonda;
import it.epicode.gestioneallarme.model.rilevamento.Subject;

public class CentroControlloFactory {
	
	public CentroControlloInterface createCentroControllo(Subject obj) {
		
		if (obj instanceof Sonda) {
			return new CentroControlloHTTP();
		}
		return null;
	}

}
