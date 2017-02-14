/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author clement
 */
public class Fenetre extends JFrame{
    
    private  JLabel  label ;
    
    public Fenetre(){    
        setSize(300, 300);
        setAlwaysOnTop(true);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //label = new JLabel("COUCOU");
        //label.setHorizontalAlignment(JLabel.CENTER);



        Container containerPrincipal = this.getContentPane();
        LayoutManager lm = new GridLayout(4,1);
        containerPrincipal.setLayout(lm);
        
        
        // 1ere ligne en rouge
        Container premierContainerVert = new Container();
        premierContainerVert.setLayout(new GridLayout(2,1));
        premierContainerVert.add(new JLabel("Frigo"));
        premierContainerVert.add(new JTable(5,2));
        
        containerPrincipal.add(premierContainerVert);
        
        // 2eme ligne en rouge
        containerPrincipal.add(new JLabel("Plats à préparer"));
        
        // 3eme ligne en rouge
        containerPrincipal.add(new JLabel("Plats préparés"));
        
        JButton b = new JButton("Voir le champ");

        // ATTENTION ! CLASSE ANONYME
        
//        b.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//                afficher("Les copains");
//            }  
//        });

        containerPrincipal.add(b, BorderLayout.SOUTH);
        
        setVisible(true);
    }
//    public void afficher(String str){
//        label.setText(str);
//    }
    
    
}
