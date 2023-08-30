package test;

import static org.junit.Assert.*;

import org.junit.Test;

import couplageFort.Metier;

public class tests {

	@Test
	public void test() {
		Metier app = new Metier();//Application est besoin de Email

		app.processMessages("Achref", "hrefhaouari@gmail.com");
		/*
		 * 
		 *     Cela rend notre application difficile à étendre et si le service 
		 *     de messagerie est utilisé dans plusieurs classes, ce serait encore 
		 *     plus difficile.
		 */
		app.processMessages2("ISSA", "YUOR ACCCEPTED TO PASS THE ENTREVIE");
	}

}
