import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   
public class FenetreGraphique extends JFrame implements ActionListener{
        
   JButton bouton;
   PanelDessin paneldessin1, paneldessin2;
	          
   public FenetreGraphique() {
      super();
      this.setSize(800, 500);
      this.setTitle("TP3");
   	
      JPanel panel = new JPanel();
      GridLayout gl = new GridLayout(1,0); //1 ligne et n colonnes
      panel.setLayout(gl);
   		
      bouton = new JButton("Anim");
      paneldessin1 = new PanelDessin("Fenetre1");
      paneldessin2 = new PanelDessin("Fenetre2");	
      panel.add(bouton);
      panel.add(paneldessin1);
      panel.add(paneldessin2);
   	         
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setContentPane(panel);
      this.setVisible(true);
      bouton.addActionListener(this);
      
   }

        		
   public static void main(String args[]) {
      FenetreGraphique f = new FenetreGraphique();
   }
   
   public void actionPerformed(ActionEvent e){
         /*this.paneldessin1.startAnim();
         this.paneldessin2.startAnim();*/
         
      this.paneldessin1.mon_thread.start();
      this.paneldessin2.mon_thread.start();
   }
   
}