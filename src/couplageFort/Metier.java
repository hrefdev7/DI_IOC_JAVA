package couplageFort;

public class Metier {
/* 
 * la class metier s'occupe denvoyer les message par mail ou par sms
 */
	EmailService email=new EmailService();
 SMSService sms=new SMSService();
	
	/*private EmailService email ;//injection dependence avce constructeur
	
	 public Metier(EmailService svc){
	this.email=svc;
}
	
	/*
	 *  nous pouvons supprimer la création d'instance de service
	 *  de messagerie de  metier la classe en ayant un constructeur qui
	 *   nécessite un service de messagerie comme argument.
	 */ /*
 * metier class est chargé d'initialiser le service de messagerie,
		 *  puis de l'utiliser. Cela conduit à une dépendance codée en dur.
		 *  COUPLAGE FORT
		 *  
 */

		public void processMessages(String msg, String rec){
			//do some msg validation, manipulation logic etc
			this.email.SendEmail(msg, rec);
			
		/*
		 * 	 Si nous voulons passer à un autre service de messagerie avancé à l'avenir,
		 	     cela nécessitera des modifications de code dans la classe MyApplication.
	*/
	}
		public void processMessages2(String msg, String rec){
			//do some msg validation, manipulation logic etc
				this.sms.sendMessage(msg,rec);
			
	
	}

	

		
		
		
		 
}