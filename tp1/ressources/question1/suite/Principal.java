public class Principal{

   public static void main (String argd[]){
      int hauteur=2;
      //hauteur max = 3
      int largeur=5;
      //largeur max = 20
      Fenetre f;
      Jolie j;
      
      f = new Fenetre('0');
      f.retailler(hauteur,largeur);
      f.afficher();
      
      j = new Jolie('0');
      j.retailler(hauteur,largeur);
      j.afficher();
      
   }
}