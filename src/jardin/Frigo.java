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
public class Frigo extends AbstractTableModel {
    
    // Design pattern singleton
    private static Frigo instanceUnique = null;
    public ArrayList<Recoltable> contenu = new ArrayList();

    
    private Frigo(){
    }
    public static Frigo getInstance(){
        if(instanceUnique == null){
            instanceUnique = new Frigo();
        }
        return instanceUnique;
    }
    
    
    public void add(Recoltable e) {
        contenu.add(e);
        fireTableDataChanged();
    }

    public Recoltable get(int index) {
        return contenu.get(index);
    }
    
    public boolean containsIngredientDeType(String typeIngredient){   
        
        for(Recoltable r : contenu){
            if(r.getClass().getSimpleName().equals(typeIngredient)){
                return true;
            }
        }
        return false;
            
    }

    @Override
    public int getRowCount() {
        return contenu.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return contenu.get(rowIndex);
    }
    
    
}
