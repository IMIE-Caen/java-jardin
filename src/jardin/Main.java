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
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Jardin j = Jardin.getInstance();
        
      
        for(int i = 0 ; i < 10 ; i ++){
            j.champ.add(new Patate());
        }
        for(int i = 0 ; i < 5 ; i ++){
            j.champ.add(new Carotte());
        }
        
        Frigo f = Frigo.getInstance();
     // v--------^
        f.add(j.harvest(12));
        f.add(j.harvest(2));
        
        // j.harvest(0, f);
        
        
        
        Plat p = Cuisine.craft(f);
        System.out.println(p);
    
        Fenetre fenetre = new Fenetre();
        
    

    }
}
