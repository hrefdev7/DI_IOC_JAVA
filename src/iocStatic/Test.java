package iocStatic;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * À première vue, il ne semble pas y avoir de problème avec l'implémentation
		 *  ci-dessus. Mais la logique de code ci-dessus a certaines limites.
		 */
		
		EmailService es=new EmailService();
		
		Application app = new Application(es);

		app.processMessages("Hi Pankaj", "pankaj@abc.com");
		/*
		 * Applicationclass est chargé d'initialiser le service de messagerie,
		 *  puis de l'utiliser. Cela conduit à une dépendance codée en dur.
		 *   Si nous voulons passer à un autre service de messagerie avancé à l'avenir,
		 *    cela nécessitera des modifications de code dans la classe MyApplication.
		 *     Cela rend notre application difficile à étendre et si le service 
		 *     de messagerie est utilisé dans plusieurs classes, ce serait encore 
		 *     plus difficile.
		 */
		app.processMessages("Hi nkaj", "nkaj@abc.com");
		app.recMessages("Hi zpa", "zpa@abc.com");
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
