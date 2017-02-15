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
import java.util.ArrayList;
import javax.swing.CellRendererPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author clement
 */
public class FenetreChamp extends JFrame{
    
    
    
    public FenetreChamp(Frigo frigo, Fenetre fenetrePrincipale){   
        super("Champ");
        setSize(300, 300);
        setAlwaysOnTop(true);
        //setResizable(false);
        
        
        Jardin jardin = Jardin.getInstance();
        JTable table;
       
              
        table = new JTable(jardin);

        add(table, BorderLayout.CENTER);
          
        JButton b = new JButton("Récolter");

        // ATTENTION ! CLASSE ANONYME
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             
                // item récolté :
                Recoltable r = jardin.harvest(table.getSelectedRow());
                frigo.add(r);

            }  
        });
        
        
        
        add(b, BorderLayout.SOUTH);
        
        
        
        
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        

        
        setVisible(true);
    }

    
}
