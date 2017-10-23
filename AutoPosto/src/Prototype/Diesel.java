
package Prototype;

import autoposto.CombustivelDAO;

public class Diesel extends Combustivel{
    public Diesel(){
        this.descricao = "Diesel";
        
        Combustivel comb = new CombustivelDAO().obterDados(this);
        
        this.cod = comb.getCod();
        this.valor = comb.getValor(); 
    }
}
