package Prototype;

/**
 * Este é um exemplo de Classe
 */
public abstract class Combustivel implements Cloneable{

    // Variaveis
    protected int cod;
    protected String descricao; // nome do combustivel
    protected float valor;

    /*
     * Método clone conforme padrão de projeto 
     * Prototype.
     */
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

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
