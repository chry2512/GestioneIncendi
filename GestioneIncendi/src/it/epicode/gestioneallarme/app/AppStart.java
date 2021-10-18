package it.epicode.gestioneallarme.app;

import java.util.Scanner;

import it.epicode.gestioneallarme.model.observer.ControlloSonda;
import it.epicode.gestioneallarme.model.rilevamento.Sonda;

public class AppStart {

	public static void main(String[] args) {

		Sonda sond1 = new Sonda(1L, 28.75, 29.46, 3);
		Sonda sond2 = new Sonda(2L, 22.45, 24.35, 3);
		Sonda sond3 = new Sonda(3L, 21.85, 20.11, 3);

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserire il Livello di Fumo della Sonda" + sond1.getId() + ":");
		int livelloFumo1 = sc.nextInt();
		System.out.println("Inserire il Livello di Fumo della Sonda" + sond2.getId() + ":");
		int livelloFumo2 = sc.nextInt();
		System.out.println("Inserire il Livello di Fumo della Sonda" + sond3.getId() + ":");
		int livelloFumo3 = sc.nextInt();
		sc.close();

		ControlloSonda roma = new ControlloSonda(1L, sond1);
		ControlloSonda firenze = new ControlloSonda(2L, sond2);
		ControlloSonda bari = new ControlloSonda(3L, sond3);

		sond1.setSmokeLevel(livelloFumo1);
		sond2.setSmokeLevel(livelloFumo2);
		sond3.setSmokeLevel(livelloFumo3);

		sond1.addObservers(roma);
		sond2.addObservers(firenze);
		sond3.addObservers(bari);
		sond1.deleteobservers(firenze);

	}

}
