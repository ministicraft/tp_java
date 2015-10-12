import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Fenetre extends JFrame implements ActionListener{
   private JButton bouton1,bouton2;
   private JLabel texte;
   int nb1 = 0;
   int nb2 = 0;
   Random rand = new Random();
   int R = 0;
   int B = 0;
   int G = 0;
   
   public Fenetre(int x, int y){
      super();
      this.setSize(x,y);
      this.setVisible(true);
      this.setTitle("Mon titre");
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      bouton1 = new JButton ("OK");
      bouton2 = new JButton ("Super!!!");
      texte = new JLabel ("Bonjour !");
      Container c = this.getContentPane();
      c.add(bouton1, BorderLayout.WEST);
      c.add(texte, BorderLayout.CENTER);
      c.add(bouton2, BorderLayout.NORTH);
      texte.setOpaque(true);
      bouton1.addActionListener(this);
      bouton2.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e){
      if (e.getSource() == bouton1) {
         nb1++;
         R = rand.nextInt(255);
         B = rand.nextInt(255);
         G = rand.nextInt(255);
         this.texte.setText("J'ai appuyer sur le Bouton 1 " + nb1 + " fois");
         texte.setForeground(new Color(R,G,B));
         texte.setBackground(Color.GRAY);
      }
      if (e.getSource() == bouton2) {
         nb2++;
         R = rand.nextInt(255);
         B = rand.nextInt(255);
         G = rand.nextInt(255);
         this.texte.setText("J'ai appuyer sur le Bouton 2 " + nb2 + " fois");
         texte.setForeground(new Color(R,G,B));
         texte.setBackground(Color.blue);
      }
   }
}