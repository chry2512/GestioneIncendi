package it.epicode.gestioneallarme.test;

import org.junit.jupiter.api.Test;

import it.epicode.gestioneallarme.model.observer.ControlloSonda;
import it.epicode.gestioneallarme.model.rilevamento.Sonda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void testAddSonda() {
		Sonda sond1 = new Sonda(1L, 28.75, 29.46, 3);
		boolean valoreAspettato = true;
		assertEquals(valoreAspettato, sond1 != null);

	}

	@Test
	public void testAddObserver() {
		ControlloSonda roma = new ControlloSonda(1L, new Sonda(1L, 28.75, 29.46, 3));
		boolean valoreAspettato = true;
		assertEquals(valoreAspettato, roma != null);
	}
	
	
	



}
