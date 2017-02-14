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
    Container containerFrigo = new Container();
    Frigo frigo ;
    
    public Fenetre(Frigo frigo) {
        super("Cuisine");
        this.frigo = frigo;
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
        remplirContainerFrigo();
        
        
        
        containerPrincipal.add(containerFrigo);
        
        // 2eme ligne en rouge
        Container deuxiemeContainerRouge = new Container();
        deuxiemeContainerRouge.setLayout(new GridLayout(2,1));
        deuxiemeContainerRouge.add(new JLabel("Plats à préparer"));
        deuxiemeContainerRouge.add(new JTable(5,2));
        
        containerPrincipal.add(deuxiemeContainerRouge);

        
        // 3eme ligne en rouge
        Container troisiemeContainerRouge = new Container();
        troisiemeContainerRouge.setLayout(new GridLayout(2,1));
        troisiemeContainerRouge.add(new JLabel("Plats préparés"));
        troisiemeContainerRouge.add(new JTable(5,2));
        
        containerPrincipal.add(troisiemeContainerRouge);
        
        JButton b = new JButton("Voir le champ");

        // ATTENTION ! CLASSE ANONYME
        
        Fenetre moiMeme = this;
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                new FenetreChamp(frigo, moiMeme);
            }  
        });

        containerPrincipal.add(b);
        
        setVisible(true);
    }
//    public void afficher(String str){
//        label.setText(str);
//    }
    
    public void remplirContainerFrigo() {
        containerFrigo.removeAll();
        containerFrigo.setLayout(new GridLayout(2,1));
        containerFrigo.add(new JLabel("Frigo"));
        
        // On veut remplir avec le frigo
        
        String[] columnNames = {"Légume"};
        Object[][] tmp = new Object[frigo.contenu.size()][1];
        
        for(int i = 0 ; i < frigo.contenu.size() ; i ++){
            if(frigo.contenu.get(i) != null){
                tmp[i][0] = frigo.contenu.get(i);
            }
        }
        
        JTable tableFrigo = new JTable(tmp, columnNames);

        containerFrigo.add(tableFrigo);
        validate();
        repaint();
        
    }
}
