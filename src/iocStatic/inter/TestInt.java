package iocStatic.inter;

public class TestInt {

	public static void main(String[] args) {
		
		 EmailServiceImpl a=new EmailServiceImpl();
		SMSServiceImpl s=new SMSServiceImpl();
		ConsumerService c=new ConsumerService(s);
		c.processMessages("ok", "op");
		// TODO Auto-generated method stub

	}

}
