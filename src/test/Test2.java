package test;

import static org.junit.Assert.*;

import org.junit.Test;

import couplageFort.Metier;

public class Test2 {

	@Test
	public void test() {
		Metier app = new Metier();//Application est besoin de Email

		app.processMessages("Achref", "hrefhaouari@gmail.com");
	}

}
