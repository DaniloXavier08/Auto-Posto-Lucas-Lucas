
package autoposto;

public class Gasolina extends Combustivel{
    public Gasolina(){
        this.descricao = "Gasolina";
        
        CombustivelDAO dao = new CombustivelDAO();
        Combustivel comb;
        comb = dao.obterDados(this);
        
        this.cod = comb.getCod();
        this.valor = comb.getValor();
    }
}
