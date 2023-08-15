package iocStatic;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * � premi�re vue, il ne semble pas y avoir de probl�me avec l'impl�mentation
		 *  ci-dessus. Mais la logique de code ci-dessus a certaines limites.
		 */
		
		EmailService es=new EmailService();
		
		Application app = new Application(es);

		app.processMessages("Hi Pankaj", "pankaj@abc.com");
		/*
		 * Applicationclass est charg� d'initialiser le service de messagerie,
		 *  puis de l'utiliser. Cela conduit � une d�pendance cod�e en dur.
		 *   Si nous voulons passer � un autre service de messagerie avanc� � l'avenir,
		 *    cela n�cessitera des modifications de code dans la classe MyApplication.
		 *     Cela rend notre application difficile � �tendre et si le service 
		 *     de messagerie est utilis� dans plusieurs classes, ce serait encore 
		 *     plus difficile.
		 */
		app.processMessages("Hi nkaj", "nkaj@abc.com");
		app.recMessages("Hi zpa", "zpa@abc.com");
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
