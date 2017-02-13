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
        Jardin j = new Jardin();
      
        for(int i = 0 ; i < 10 ; i ++){
            j.champ.add(new Patate());
        }
        for(int i = 0 ; i < 5 ; i ++){
            j.champ.add(new Carotte());
        }
        System.out.println(j);
        
    }
}
