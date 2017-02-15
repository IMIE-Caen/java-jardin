/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.ScrollPane;
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
    
    public Fenetre() {
        super("Cuisine");
        Frigo frigo = Frigo.getInstance();
        setSize(300, 500);
        setAlwaysOnTop(true);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //label = new JLabel("COUCOU");
        //label.setHorizontalAlignment(JLabel.CENTER);



        Container containerPrincipal = this.getContentPane();
        LayoutManager lm = new GridLayout(4,1);
        containerPrincipal.setLayout(lm);
        
        
        // 1ere ligne en rouge
        
        Container containerFrigo = new Container();
        containerFrigo.setLayout(new BorderLayout());
        containerFrigo.add(new JLabel("Frigo"), BorderLayout.NORTH);
        JTable tableFrigo = new JTable(frigo);
        ScrollPane sp = new ScrollPane();
        sp.add(tableFrigo);        
        containerFrigo.add(sp, BorderLayout.CENTER);
        
        containerPrincipal.add(containerFrigo);
        
        // 2eme ligne en rouge
        Container containerCuisine = new Container();
        containerCuisine.setLayout(new BorderLayout());
        containerCuisine.add(new JLabel("Plats à préparer"), BorderLayout.NORTH);
        ScrollPane sp2 = new ScrollPane();
        sp2.add(new JTable(5,2));
        containerCuisine.add(sp2, BorderLayout.CENTER);
        
        containerPrincipal.add(containerCuisine);

        
        // 3eme ligne en rouge
        Container containerService = new Container();
        containerService.setLayout(new BorderLayout());
        containerService.add(new JLabel("Plats préparés"), BorderLayout.NORTH);
        ScrollPane sp3 = new ScrollPane();
        sp3.add(new JTable(5,2));
        containerService.add(sp3, BorderLayout.CENTER);
        
        containerPrincipal.add(containerService);
        
        JButton b = new JButton("Voir le champ");

        // Classe anonyme !
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                new FenetreChamp();
            }  
        });

        containerPrincipal.add(b);
        
        setVisible(true);
    }
    

}
