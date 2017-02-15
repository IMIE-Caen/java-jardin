/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author clement
 */
public class Jardin extends AbstractTableModel{
    
    // Design pattern singleton
    private static Jardin instanceUnique = null;
    public final ArrayList<Recoltable> champ = new ArrayList() ;
    
    private Jardin(){
    };
    public static Jardin getInstance(){
        if(instanceUnique == null){
            instanceUnique = new Jardin();
        }
        return instanceUnique;
    }
    
 
    public Recoltable harvest(int index){
        Recoltable r = champ.get(index);
        champ.set(index, null);
        r.harvest();
        fireTableDataChanged();
        return r;
    }
    
    @Override
    public int getRowCount() {
        return champ.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    
                                    // 0       //0
                                    // 0       //1
                                    // 1       //0
                                    // 1       //1
                                    // 50       //0
                                    // 50       //1
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(champ.get(rowIndex) == null){
            return "";
        }
        if(columnIndex == 0){
            return champ.get(rowIndex).toString();
        }

        return champ.get(rowIndex).isHarvested();

    }
    
    
    
    
    
}
