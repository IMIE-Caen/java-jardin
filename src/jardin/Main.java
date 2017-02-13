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
    public static void main(String[] args) {
        Jardin j = Jardin.getInstance();
        
        /*
            Jardin j2 = Jardin.getInstance();
            System.out.println(j == j2);
            // Vrai !
        */
      
        for(int i = 0 ; i < 10 ; i ++){
            j.champ.add(new Patate());
        }
        for(int i = 0 ; i < 5 ; i ++){
            j.champ.add(new Carotte());
        }
        
        Brouette b = new Brouette();
     // v--------^
        b.add(j.harvest(12));
        b.add(j.harvest(2));
        
        // j.harvest(0, b);
        
        
        
        
        System.out.println(j);
        System.out.println(b);
        
        System.out.println(Cuisine.craft(b));
    }
}
