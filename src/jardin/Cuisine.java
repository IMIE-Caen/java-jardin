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
public class Cuisine {
    public static Plat craft( Frigo f ){
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
    }
}
