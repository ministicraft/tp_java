public class MaClasse{

   private int maVariable;
   
   public MaClasse(){
      System.out.println("Constructeur, Variable = " + maVariable);
   }
   
   public void maMethode(int i){
      maVariable = i;
      System.out.println("maVariable = " + maVariable);
   }
}