package extention;

import serviceMess.MessageService;

public class EmailServiceImpl implements MessageService {
	
	public  EmailServiceImpl() {
	}
	@Override
	public void sendMessage(String msg, String rec) {
		
		System.out.println("Email sent to "+rec+ " with Message="+msg);
		
	}

}
