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
    public static Plat craft( Brouette b ){
        if(b.containsIngredientDeType("Patate") && b.containsIngredientDeType("Carotte")){
            return new GratinCarotte();
        }
        if(b.containsIngredientDeType("Carotte")){
            return new CarottesRapees();
        }
        
        if(b.containsIngredientDeType("Patate") ){
            return new Frites();
        }
        return null;
    }
}
