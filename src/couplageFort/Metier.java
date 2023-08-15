package couplageFort;

public class Metier {

	EmailService email=new EmailService();

	
	/*private EmailService email ;//injection dependence avce constructeur
	
	 public Metier(EmailService svc){
	this.email=svc;
}
	
	/*
	 *  nous pouvons supprimer la cr�ation d'instance de service
	 *  de messagerie de  metier la classe en ayant un constructeur qui
	 *   n�cessite un service de messagerie comme argument.
	 */ 
	

/*
 * metier class est charg� d'initialiser le service de messagerie,
		 *  puis de l'utiliser. Cela conduit � une d�pendance cod�e en dur.
		 *  COUPLAGE FORT
		 *   Si nous voulons passer � un autre service de messagerie avanc� � l'avenir,
		 *    cela n�cessitera des modifications de code dans la classe MyApplication.
 */

		public void processMessages(String msg, String rec){
			//do some msg validation, manipulation logic etc
			this.email.SendEmail(msg, rec);
			
	
	}

	

		
		
		
		 
}
