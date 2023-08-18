package iocStatic;




import metier.MetierImpl;
import serviceMess.SMSServiceImpl;

/*
 * OV Solid la classe tsetint est ouverte a la modification
 * //injection dependence avec new ---> static
 */
public class TestInt {

	public static void main(String[] args) {
			
		 /* *************C UNE RELATION AGREGATION**injection dependence ***WITH CONSTRUCTOR********
 		* MetierImpl c=new MetierImpl(s); 	
 		* EmailServiceImpl s=new EmailServiceImpl();
        * au moment de la creation de l'objet metierimpl on creer un objet servicemessege	
		
				 		
		*/		
	//***********RELATION ASSOCIATION******WIH SETTER *********
		SMSServiceImpl s=new SMSServiceImpl(); 
		MetierImpl c=new MetierImpl(s);
	 			
		c.processMessages("achref", " GO no stop");
	
	}

}
