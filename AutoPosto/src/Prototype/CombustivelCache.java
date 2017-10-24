/**
 * O Padrão de Projeto Prototype tem como objetivo clonar elementos definidos no início
 * do código, tornando menos oneroso a intanciação. Se cria um clone do elemento da classe
 * ao invés de se criar uma nova.
 */ 
package Prototype;

import java.util.Hashtable;

/**
 * Classe responsável por armazenar e gerar as instâncias da Classe Combustível.
 * @author Danilo
 */
public class CombustivelCache {
    private static Hashtable<Integer, Combustivel> combustMap  = new Hashtable<>();

    /**
     * Retorna um clone do Combustível desejado conforme o id solicitado.
     * @param combustId
     */
    public static Combustivel getCombust(int combustId) {
      Combustivel cachedCombustivel = combustMap.get(combustId);
      return (Combustivel) cachedCombustivel.clone(); 
    }

   /** 
    * Carrega o hashtable de combustível, disponibilzando os elementos de Combustível.
    */
   public static void loadCache() {
       // Para cada Instancia de Combustível será adicionado um elemento
       // no Hashtable no modelo combustMap.put(combustId, combustivel)
       
       // 01 - Diesel.
      Diesel diesel = new Diesel();
      combustMap.put(diesel.getCod(), diesel);

       // 02 - Etanol.
      Etanol etanol = new Etanol();
      combustMap.put(etanol.getCod(), etanol);
      
       // 03 - Gasolina.
      Gasolina gasolina = new Gasolina();
      combustMap.put(gasolina.getCod(), gasolina);
   }
}
