package test;

import metier.MetierImpl;
import serviceMess.SMSServiceImpl;

/*
 * OV Solid la classe tsetint est ouverte a la modification
 * //injection dependence avec new static
 */
public class TestInt {

	public static void main(String[] args) {
		//la classe doit dependre d'une interface
		
		//injection dependence avec new static
		
		// EmailServiceImpl a=new EmailServiceImpl();
		
		SMSServiceImpl s=new SMSServiceImpl(); 
			
		 /* *************C UNE RELATION AGREGATION  ***WITH CONSTRUCTOR********
		 		****MetierImpl c=new MetierImpl(s);********	
		 		au moment de la creation de l'objet 
		      metierimpl on creer un objet servicemessege
	 		
		*/
		
		
	//***********RELATION ASSOCIATION***************
		
		MetierImpl c=new MetierImpl();
		/*
		 * setter est utiliser pour inject dependency
		 */
		c.setService(s);
		
		
		c.processMessages("ok", "op");
		
		
		// TODO Auto-generated method stub

	}

}
