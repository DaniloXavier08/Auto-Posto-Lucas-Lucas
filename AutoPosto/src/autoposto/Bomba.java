
package autoposto;

/**
 *
 * @author danilo
 * 
 * Classe referente as caracteristicas da Bomba de Combustível
 */
public class Bomba {
    private int cod;
    private String descricao;
    private int status;
    private String horario; // horário de atualização
    
    // Getters e Setters

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
