/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;

/**
 *
 * @author clement
 */
public class Patate{
    public final static boolean HAS_AMIDON = true;
    private boolean harvested = false;
   
    
    private String nom ;

    public Patate() {
    }
    
    
    public Patate(String nom) {
        this.nom = nom;
    }

    public boolean isHarvested() {
        return harvested;
    }

    public void harvest(){
        harvested = true;                
    }

  
    
    
    
    
    
}
