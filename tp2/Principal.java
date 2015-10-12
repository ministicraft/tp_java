public class Principal{
   public static void main(String[] args){
      int x=0;
      int y=0;
      for (int i=0;i < args.length; i++)
         System.out.println(args[i]);
      if (args.length != 2) 
         return;
      try { 
         x = java.lang.Integer.parseInt(args[0]);
         y = java.lang.Integer.parseInt(args[1]);
      } 
      catch ( NumberFormatException e) {
      // instructions en cas de problème de conversion en entier
      // par exemple : afficher « Eh ?! Donnez moi deux entiers !!! » et
      //fixer la largeur et la hauteur aux valeurs maximales
      System.out.println("Il faut rentrer 2 nombres en arguments");
      return;
      }
      Fenetre f = new Fenetre(x,y);
   }
}
