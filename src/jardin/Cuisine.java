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
    public static String craft( Brouette b ){
        if(b.containsIngredientDeType("Patate") && b.containsIngredientDeType("Carotte")){
            return "Gratin de Carottes";
        }
        if(b.containsIngredientDeType("Carotte")){
            return "Carotte rappées";
        }
        
        if(b.containsIngredientDeType("Patate") ){
            return "Frites";
        }
        return null;
    }
}
