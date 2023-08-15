package iocStatic.inter;

public class ConsumerService implements Consumer   {
	
	/*
	 * Notez que notre classe d'application utilise simplement le service.
	 *  Il n'initialise pas le service qui conduit � une meilleure � s�paration
	 *   des pr�occupations �. L'utilisation de l'interface de service nous permet
	 *    �galement de tester facilement l'application en se moquant du MessageService
	 *     et de lier les services au moment de l'ex�cution plut�t qu'au moment
	 *      de la compilation. Nous sommes maintenant pr�ts � �crire des classes 
	 *      d'injecteur de d�pendance Java qui initialiseront le service ainsi 
	 *      que les classes de consommateur.
	 */
	
	
private MessageService service;
	
	public ConsumerService(MessageService svc){
		this.service=svc;
	}
	/*
	 * /setter dependency injection	
	public void setService(MessageService service) {
		this.service = service;
	 */
	@Override
	public void processMessages(String msg, String rec) {
		// TODO Auto-generated method stub
		this.service.sendMessage(msg, rec);

	}



}
