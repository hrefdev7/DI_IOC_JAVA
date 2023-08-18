package metier;

import serviceMess.MessageService;

public class MetierImpl implements Imetier   {
	
	/*
	 * Notez que notre classe d'application utilise simplement le service.
	 * 
	 *  Il n'initialise pas le service 
	
	 */
		
private MessageService service;
	
	 
	
	public MetierImpl() {
	
}

	public MetierImpl(MessageService service) {
	
		this.service = service;
	}

	/*  // Constructor  dependency injection	
	
	 * public MetierImpl(MessageService svc){this.service=svc;}  
	 * 
	    * Pour Injecter dans la variable  un objet d'une classe * qui implémenter l'interface 
     * 
     * *
     */
 
	 
	public void setService(MessageService service) {// setter dependency injection	
		this.service = service;}
	 
	@Override
	public void processMessages(String msg, String rec) {
		// TODO Auto-generated method stub
		this.service.sendMessage(msg, rec);

	}

	

}
