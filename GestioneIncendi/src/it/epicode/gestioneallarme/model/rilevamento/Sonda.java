package it.epicode.gestioneallarme.model.rilevamento;

import it.epicode.gestioneallarme.model.observer.Observer;

public class Sonda extends Subject {

	private static final int SMOKE_TRESHOLD = 5;
	private Long id;
	private double latitude;
	private double longitude;
	private int smokeLevel;

	public Sonda(Long id, double latitude, double longitude, int smokeLevel) {

		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
	}

	@Override
	public void notifyObservers() {

		for (Observer o1 : lst) {

			o1.update(this);

		}

	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		if (this.smokeLevel > SMOKE_TRESHOLD) {
			notifyObservers();

		}
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

	public static int getSmokeTreshold() {
		return SMOKE_TRESHOLD;
	}

	@Override
	public String toString() {
		return "Sonda [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", smokeLevel=" + smokeLevel
				+ "]";
	}

}
