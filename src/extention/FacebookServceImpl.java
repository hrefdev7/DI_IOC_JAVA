package extention;

import serviceMess.MessageService;

public class FacebookServceImpl implements  MessageService{

	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("Messag sent To : "+rec +"Message :"+msg);
		
	} 

}
