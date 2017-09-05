
package autoposto;

/**
 * @author danilo
 * 
 * Essa classe tem como objeto realizar uma equação para
 * verificar se compensa abastecer usando álcool ou 
 * gasolina
 */
public class Teste {
    
    private final float relacao; // Exemplo de Encapsulamento private
    
    /**
     * Métoo construtor que define os valores dos combustiveis que serão computados.
     * @param alcool
     * @param gasolina
     */
    public Teste (double alcool, double gasolina){
        relacao = (float) (alcool / gasolina);
    }
    /**
     * Calcula qual combustível compensa abastecer entre Álcool e Gasolina.
     * Retorna uma string com o nome do combustível a ser abastecido.
     * @return Combustível a ser abastecido
     */
    public String resultado(){
        // Exemplo de Encapsulamento do tipo public
        String resultado;
        
        if (relacao >= 0.7){
            resultado = "Gasolina";
        }
        else if(relacao < 0.7 && relacao >= 0){
            resultado = "Álcool";
        }
        else resultado = "#ERRO";
        
        return resultado;
    }
}
