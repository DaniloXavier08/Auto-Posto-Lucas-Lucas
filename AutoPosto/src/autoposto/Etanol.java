
package autoposto;

public class Etanol extends Combustivel{
    
    public Etanol(){
        this.descricao = "Etanol";
        
        CombustivelDAO dao = new CombustivelDAO();
        Combustivel comb;
        comb = dao.obterDados(this);
        
        this.cod = comb.getCod();
        this.valor = comb.getValor();
    }
}
