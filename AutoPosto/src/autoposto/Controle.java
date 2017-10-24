
package autoposto;

import java.sql.Date;

/**
 *
 * @author danilo
 * 
 * Classe responsável por armazenar os dados que
 * serão inseridos pelo Controle no Banco de Dados
 */
public class Controle {
    
    // Este é um exemplo de Absração
    private int cod;
    private int bomba;
    private int combustivel;
    private Date horario;
    private float valor;

    public Controle(int bomba, int combustivel, float valor) {
        this.bomba = bomba;
        this.combustivel = combustivel;
        this.valor = valor;
    }
    
    public Controle(int cod, int bomba, int combustivel, Date horario, float valor) {
        this.cod = cod;
        this.bomba = bomba;
        this.combustivel = combustivel;
        this.horario = horario;
        this.valor = valor;
    }
    
    // Getter e Setter

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getBomba() {
        return bomba;
    }

    public void setBomba(int bomba) {
        this.bomba = bomba;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
    
     public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
