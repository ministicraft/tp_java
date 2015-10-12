public class Principal{
   public static void main(String[] args){
   String texte1 = args[0];
   String texte2 = args[1];
   String texte3 = args[2];
   AfficheTexte af1 = new AfficheTexte(texte1);
   AfficheTexte af2 = new AfficheTexte(texte2);
   AfficheTexte af3 = new AfficheTexte(texte3);
   /*
   af1.start();
   af2.start();
   af3.start();
   */
   }
}