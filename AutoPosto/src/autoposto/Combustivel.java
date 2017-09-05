
package autoposto;

/**
 * Este é um exemplo de Classe
 */
public class Combustivel {
    
    // Variaveis
    protected int cod; 
    protected String descricao; // nome do combustivel
    protected float valor;
    
    // Exemplo de Métodos
    public int getCod() {
        return cod; // Método com retorno
    }

    public void setCod(int cod) {
        this.cod = cod; // Método sem retorno do tipo void
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
