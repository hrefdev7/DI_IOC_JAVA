package iocStatic.inter;

public class SMSServiceImpl implements MessageService  {

	@Override
	public void sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("SMS sent to "+rec+ " with Message="+msg);

	}

}
