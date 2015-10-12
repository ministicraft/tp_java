public class Principal{
   public static void main(String[] args){
      Gestionnaire g;
      g = new Gestionnaire();
      try {
         g.activer();
      } 
      catch (java.io.IOException e) {
         System.out.println("Exception levé dans la methode actives : " + e);
      }
   }
}