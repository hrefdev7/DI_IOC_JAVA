package iocStatic;

public class Application {
/*
 * On peut affirmer que nous pouvons supprimer la création d'instance de service
 *  de messagerie de MyApplicationla classe en ayant un constructeur qui
 *   nécessite un service de messagerie comme argument.
 */
	private EmailService email ;
	
	private EmailService2 email2=new EmailService2() ;
	
		
	/*
	 * private EmailService email = new EmailService();
	 */
	
	
public Application(EmailService svc){
	this.email=svc;
}


		public void processMessages(String msg, String rec){
			//do some msg validation, manipulation logic etc
			this.email.SendEmail(msg, rec);
			
	
	}
		
		
		public void recMessages(String msg, String rec){
			//do some msg validation, manipulation logic etc
			this.email2.RecEmail(msg, rec);
			
	
	}
}
