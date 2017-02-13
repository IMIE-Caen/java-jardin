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

    private final ArrayList<Recoltable> champ = new ArrayList() ;
    
    public static void main(String[] args) {

        Jardin j = new Jardin();
        
        for(int i = 0 ; i < 10 ; i ++){
            j.champ.add(new Patate());
        }
        
        for(int i = 0 ; i < 5 ; i ++){
            j.champ.add(new Carotte());
        }
        
        System.out.println(j);
        
    }

    @Override
    public String toString() {
        String str = "_";
        for(Recoltable r : champ){
            str += r + "_";
        }
        return str;
    }
    
    
    
    
    
}
