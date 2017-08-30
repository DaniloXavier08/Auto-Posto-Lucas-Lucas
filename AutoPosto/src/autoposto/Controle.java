
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
    private int cod;
    private int bomba;
    private int combustivel;
    private Date horario;
       
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
    
    
}
