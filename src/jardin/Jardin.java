/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

import java.util.ArrayList;



/**
 *
 * @author clement
 */
public class Jardin {

    public final ArrayList<Recoltable> champ = new ArrayList() ;
 
    @Override
    public String toString() {
        String str = "_";
        for(Recoltable r : champ){
            str += r + "_";
        }
        return str;
    }
    
    
    
    
    
}
