package serviceMess;

public class SMSServiceImpl implements MessageService  {

	
	
	@Override
	public void sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("SMS sent to "+rec+ "  Message : "+msg);

	}

}
