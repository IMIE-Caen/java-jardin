/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clement
 */
public class Cuisine extends AbstractTableModel implements TableModelListener {

        // Design pattern singleton
    private static Cuisine instanceUnique = null;
        private Cuisine(){
    }
    public static Cuisine getInstance(){
        if(instanceUnique == null){
            instanceUnique = new Cuisine();
        }
        return instanceUnique;
    }
    
    
    public String message= "Coucou";
    
    
    @Override
    public void tableChanged(TableModelEvent e) {
        message = "LE FRIGO A CHANGÉ";
        fireTableDataChanged();
    }
    /*public static Plat craft( Frigo f ){
        if(f.containsIngredientDeType("Patate") && f.containsIngredientDeType("Carotte")){
            return new GratinCarotte();
        }
        if(f.containsIngredientDeType("Carotte")){
            return new CarottesRapees();
        }
        
        if(f.containsIngredientDeType("Patate") ){
            return new Frites();
        }
        return null;
    }*/

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return 1 ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return message;
    }
    
    
    
}
