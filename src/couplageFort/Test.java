package couplageFort;

public class Test {

	public static void main(String[] args) {
		
		/*COUPLAGE FORT
		 *  Application ouverte a la modification 
		 *  on doit modifier dans le code source une fois on veut changer le srvice
		 * 
		 * *  Une classe devait �tre ouverte pour l'extension, mais ferm�e pour la modification.

          Le syst�me devait pouvoir s'ouvrir pour l'extension (nous pouvions ajouter de nouvelles fonctionnalit�s) 
          et devait rester ferm� � la modification (l'ancien code n'avait pas n�cessairement besoin d'�tre modifi� 
          lorsque nous ajoutions ces nouvelles fonctionnalit�s).
		 */
			 

		Metier app = new Metier();//Application est besoin de Email

		app.processMessages("Achref", "hrefhaouari@gmail.com");
		/*
		 * 
		 *     Cela rend notre application difficile � �tendre et si le service 
		 *     de messagerie est utilis� dans plusieurs classes, ce serait encore 
		 *     plus difficile.
		 */
		app.processMessages2("Hamma sms Envoy�", "come here");


		/*
		 * Si nous voulons �tendre notre application pour fournir une fonctionnalit�
		 *  de messagerie suppl�mentaire, telle que SMS ou message Facebook,
		 *   nous aurions besoin d'�crire une autre application pour cela. Cela
		 *    impliquera �galement des changements de code dans les classes
		 *     d'application et dans les classes client.
		 */
	
		
		
		// TODO Auto-generated method stub

	}

}
