/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.Hashtable;

/**
 *
 * @author a162007X
 */
public class CombustivelCache {
    private static Hashtable<Integer, Combustivel> combustMap  = new Hashtable<>();

   public static Combustivel getCombust(int combustId) {
      Combustivel cachedCombustivel = combustMap.get(combustId);
      return (Combustivel) cachedCombustivel.clone();
   }

   // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes
   
   public static void loadCache() {
      Diesel diesel = new Diesel();
      combustMap.put(diesel.getCod(), diesel);

      Etanol etanol = new Etanol();
      combustMap.put(etanol.getCod(), etanol);
      
      Gasolina gasolina = new Gasolina();
      combustMap.put(gasolina.getCod(), gasolina);
   }
}
