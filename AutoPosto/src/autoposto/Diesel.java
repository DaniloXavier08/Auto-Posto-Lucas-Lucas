
package autoposto;

public class Diesel extends Combustivel{
    public Diesel(){
        this.descricao = "Diesel";
        
        CombustivelDAO dao = new CombustivelDAO();
        Combustivel comb;
        comb = dao.obterDados(this);
        
        this.cod = comb.getCod();
        this.valor = comb.getValor(); 
    }
}
