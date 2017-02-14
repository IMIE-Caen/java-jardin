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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author clement
 */
public class FenetreChamp extends JFrame{
    
    
    
    public FenetreChamp(){   
        super("Champ");
        setSize(300, 300);
        setAlwaysOnTop(true);
        //setResizable(false);
        
        
        Jardin jardin = Jardin.getInstance();
        JTable table;
        String[] columnNames = {"Légume"};
        
        
        
        Object[][] tmp = new Object[jardin.champ.size()][1];
        
        for(int i = 0 ; i < jardin.champ.size() ; i ++){
            tmp[i][0] = jardin.champ.get(i);
        }
        
              
        table = new JTable(tmp, columnNames);
        
        add(table);
        
        
        
        
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        

        
        setVisible(true);
    }

    
}
