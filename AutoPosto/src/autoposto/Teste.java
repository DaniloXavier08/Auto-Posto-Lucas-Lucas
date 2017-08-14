
package autoposto;

/**
 *
 * @author danilo
 * 
 * Essa classe tem como objeto realizar uma equação para
 * verificar se compensa abastecer usando álcool ou 
 * gasolina
 */
public class Teste {
    
    private float relacao;
    
    // Cálculo da relação entre álcool dividido por gasolina.
    public String calcular (float alcool, float gasolina){
        relacao = alcool / gasolina;
        
        if (relacao >= 0.7){
            return "Gasolina";
        }
        else if(relacao < 0.7 && relacao >= 0){
            return "Álcool";
        }
        else return "#ERRO";
    }
}
