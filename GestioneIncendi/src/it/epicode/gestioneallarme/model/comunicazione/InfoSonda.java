package it.epicode.gestioneallarme.model.comunicazione;

import it.epicode.gestioneallarme.model.rilevamento.Sonda;

public class InfoSonda {

	private Long id;
	private double latitude;
	private double longitude;
	int smokeLevel;

	private Sonda sonda;

	public InfoSonda(Sonda sonda) {
		this.id = sonda.getId();
		this.latitude = sonda.getLatitude();
		this.longitude = sonda.getLongitude();
		this.smokeLevel = sonda.getSmokeLevel();
		this.sonda = sonda;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
	}

	public Sonda getSonda() {
		return sonda;
	}

	@Override
	public String toString() {
		return "InfoSonda [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", smokeLevel="
				+ smokeLevel + "]";
	}

}
