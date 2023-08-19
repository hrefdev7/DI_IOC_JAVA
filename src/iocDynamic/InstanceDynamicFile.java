package iocDynamic;

import java.io.File;
import java.util.Scanner;
import metier.Imetier;
import serviceMess.MessageService;
/*
 *                       $$$$ PROGRAMMATION DYNAMIQUE OU PROGRAMMATION PAR REFLEXION $$$$$
 *   /*
     * 
     * ************ L AAPLICATION EST FERMER A LA MODIFICATION OUVERTE A L EXTENSION*****************
     * ******************CHOIX DE SERVICE A UTILISER DANS LE FICHIER CONFIG.TXT**********************
     * 
     *      */
public  class InstanceDynamicFile {
	
	public static void main(String[] args) throws Exception   {
		
//Scanner scan = new Scanner(new File("config.txt"));
	File text = new File("config.txt");
	
	Scanner scan = new Scanner(text); 
	 String line2 =scan.nextLine(); //lire la premiere ligne de fichier config.txt
	 Class smsimpl=Class.forName(line2);	System.out.println(line2);	
	 // charger la premier class  en memoire sinn s'introuvable  exception "class not found exception"
	   
	 	MessageService sms=(MessageService)smsimpl.getConstructor().newInstance(); //equivalent a ---> new Metierimple ()
	   	System.out.println(line2);
	    System.err.println("Adresse memoire de l'objet :"+smsimpl.hashCode());
		
	     
	String line1 =scan.nextLine(); 	//lire la premiere ligne de fichier config.txt
	Class metimpl=Class.forName(line1);
	
	//********* Injection des dependances dynamique with Constructor ********
	Imetier imp=(Imetier)metimpl.getConstructor(MessageService.class).newInstance(sms); //equivalent a ---> new SMSServiceImpl ()
	System.out.println(line1);
    System.err.println("Adresse memoire de l'objet :"+metimpl.hashCode());
	
    imp.processMessages("AZE", "AZERT");
   
    /*OUBIEN
	 ********** Injection des dependances dynamique with settet ********
       Method m1=metimpl.getDeclaredMethod("setService",MessageService.class);
       m1.invoke(imp,sms); 
	 */
   	
  
			
				
		
	}
}
