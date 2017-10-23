
package Prototype;

import autoposto.CombustivelDAO;

public class Etanol extends Combustivel{
    
    public Etanol(){
        this.descricao = "Etanol";
        
        Combustivel comb = new CombustivelDAO().obterDados(this);
        
        this.cod = comb.getCod();
        this.valor = comb.getValor();
    }
}
