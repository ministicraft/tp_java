import javax.swing.*;
public class AfficheTexte implements Runnable{

   private String texte;
   private Thread ma_tache;
   
   public AfficheTexte(String texte){
      ma_tache = new Thread(this);
      this.texte = new String(texte);
      ma_tache.start();
   }
   
   public void run(){
      try{
         for (int c=0;c<texte.length();c++){
            System.out.print(texte.charAt(c));
            ma_tache.sleep(100);
         }
         System.out.println();
      }catch (InterruptedException exception) { }
   }    
}




/*
public class AfficheTexte2 extends Thread{
   
   public AfficheTexte(String texte){
      super();
      this.texte = new String(texte);
   }
   
   public void run(){
      for (int c=0;c<texte.length();c++)
         System.out.print(texte.charAt(c));
      System.out.println();
   }  
}*/