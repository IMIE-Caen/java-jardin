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
public class Jardin{
    
    // Design pattern singleton
    private static Jardin instanceUnique = null;
    private Jardin(){
    };
    public static Jardin getInstance(){
        if(instanceUnique == null){
            instanceUnique = new Jardin();
        }
        return instanceUnique;
    }
    
    public final ArrayList<Recoltable> champ = new ArrayList() ;
 
    public Recoltable harvest(int index){
        Recoltable r = champ.get(index);
        champ.set(index, null);
        r.harvest();
        return r;
    }
    /*
    public void harvest(int index, Brouette b){
        Recoltable r = champ.remove(index);
        r.harvest();
        b.add(r);
    }
    */
    
    
    @Override
    public String toString() {
        String str = "__";
        for(Recoltable r : champ){
            str += r + "__";
        }
        return str;
    }
    
    
    
    
    
}
