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
/**
* @author Achref Hawari
 *
 */
public  class InstanceDynamicFile {
	
	public static void main(String[] args) throws Exception   {
		
//Scanner scan = new Scanner(new File("config.txt"));
		
	File text = new File("config.txt");
	
	Scanner scan = new Scanner(text); 
	 String line2 =scan.nextLine(); //lire la premiere ligne de fichier config.txt
	 Class emailimpl=Class.forName(line2);
	 System.out.println("la premier class est charger : "+line2);	
	 
	 // charger la premier class  en memoire sinn s'introuvable  exception "class not found exception"
	   
	 	MessageService sms=(MessageService)emailimpl.getConstructor().newInstance(); //equivalent a ---> new Metierimple ()
	  
	    System.err.println("Adresse memoire de l'objet :"+emailimpl.hashCode()+"\n");
		
	     
	String line1 =scan.nextLine(); 	//lire la premiere ligne de fichier config.txt
	Class metimpl=Class.forName(line1);
	System.out.println("Deuxieme ligne charger,Nom de la class  :"+metimpl);
	
	//********* Injection des dependances dynamique with Constructor ********
	
	Imetier imp=(Imetier)metimpl.getConstructor(MessageService.class).newInstance(sms); //equivalent a ---> new SMSServiceImpl ()
	System.out.println(line1);
    System.err.println("Adresse memoire de l'objet :"+metimpl.hashCode());
	System.out.println("****************************************************");
    imp.processMessages("Nice", "Job");
   scan.close();
    /*OUBIEN
	 ********** Injection des dependances dynamique with settet ********
       Method m1=metimpl.getDeclaredMethod("setService",MessageService.class);
       m1.invoke(imp,sms); 
	 */
   	
  
			
				
		
	}
}
