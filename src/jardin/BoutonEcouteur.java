/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import javax.swing.JButton;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author clement
 */
public class BoutonEcouteur extends JButton implements TableModelListener{
    public BoutonEcouteur(String label){
        super(label);
    }
    @Override
    public void tableChanged(TableModelEvent e) {
        if(Jardin.getInstance().isEmpty()){
            this.setEnabled(false);
        }
    }
    
}
