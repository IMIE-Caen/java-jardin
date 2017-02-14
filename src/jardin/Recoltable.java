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
public abstract class Recoltable {
    
    private boolean harvested = false;
    
    public boolean isHarvested() {
        return harvested;
    }

    public void harvest(){
        harvested = true;                
    }
    
    public String toString(){
        if(isHarvested()){
            return "récolté(e)";
        }
        return "pas récolté(e)";
    }
}
