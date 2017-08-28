
package autoposto;

public class Combustivel {
    
    // Variaveis 
    private int cod;
    private String descricao; // nome do combustivel
    private float valor;
    
    /**
     * Este é o método construtor da classe Combustivel.
     * Deve-se entrar com a descrição do combustível e seu valor.
     * @param descricao
     * @param valor 
     */
    public Combustivel(String descricao, float valor){
        this.descricao = descricao;
        this.valor = valor;
    }
    
    // getter e setter
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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
