
package autoposto;

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
    private String horario; // ** UTILIZAR VARIAVEL DE TEMPO CORRETA**
       
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
