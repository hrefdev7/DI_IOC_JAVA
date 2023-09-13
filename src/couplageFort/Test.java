package couplageFort;

/**
* @author Achref Hawari
 *
 */
public class Test {

	public static void main(String[] args) {
		
		/*COUPLAGE FORT
		 *  Application ouverte a la modification 
		 *  on doit modifier dans le code source une fois on veut changer le srvice
		 * 
		 * *  Une classe devait être ouverte pour l'extension, mais fermée pour la modification.

          Le système devait pouvoir s'ouvrir pour l'extension (nous pouvions ajouter de nouvelles fonctionnalités) 
          et devait rester fermé à la modification (l'ancien code n'avait pas nécessairement besoin d'être modifié 
          lorsque nous ajoutions ces nouvelles fonctionnalités).
		 */
			 

		Metier app = new Metier();//Application est besoin de Email

		app.processMessages("Achref", "hrefhaouari@gmail.com");
		/*
		 * 
		 *     Cela rend notre application difficile à étendre et si le service 
		 *     de messagerie est utilisé dans plusieurs classes, ce serait encore 
		 *     plus difficile.
		 */
		app.processMessages2("ISSA", "YUOR ACCCEPTED TO PASS THE ENTREVIE");
		/*
		 * Si nous voulons étendre notre application pour fournir une fonctionnalité
		 *  de messagerie supplémentaire, telle que SMS ou message Facebook,
		 *   nous aurions besoin d'écrire une autre application pour cela. Cela
		 *    impliquera également des changements de code dans les classes
		 *     d'application et dans les classes client.
		 */
	
		
		
		// TODO Auto-generated method stub

	}

}