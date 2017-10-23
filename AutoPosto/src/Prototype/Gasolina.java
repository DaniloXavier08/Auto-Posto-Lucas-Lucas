
package Prototype;

import autoposto.CombustivelDAO;

public class Gasolina extends Combustivel{
    public Gasolina(){
        this.descricao = "Gasolina";
        
        Combustivel comb = new CombustivelDAO().obterDados(this);
        
        this.cod = comb.getCod();
        this.valor = comb.getValor();
    }
}
