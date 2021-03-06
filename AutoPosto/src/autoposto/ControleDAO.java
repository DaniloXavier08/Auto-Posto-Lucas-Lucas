
package autoposto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Manipulação de dados no Banco de Dados através
 * da classe BancoDados
 */
public class ControleDAO extends InterfaceDAO{
    
    private Controle controle;
    
    /**
     *  Método construtor da classe.
     * @param controle uma instancia da classe Controle.
     */
    public ControleDAO(Controle controle){
        this.controle = controle;
    }
    
    /**
     * Adiciona dados na tabela controle através de um SQL
     */
    @Override
    public void adicionar(){
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        try {
            // Pedido
            stm = con.prepareStatement("INSERT INTO controle VALUES (default,?,?,null,?)");
                       
            stm.setInt(1, controle.getBomba());
            stm.setInt(2, controle.getCombustivel());
            stm.setFloat(3, controle.getValor());
            
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        BancoDados.fecharConexao(con, stm);
    }
    
    /**
     * Remove dados da tabela Controle através de um SQL.
     */
    @Override
    public void remover(){
        Connection con = BancoDados.iniciarConexao();
            PreparedStatement stm = null;
            try {
                // Pedido
                stm = con.prepareStatement("DELETE FROM controle WHERE cod=?");
                stm.setInt(1, controle.getCod());
                
                stm.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            BancoDados.fecharConexao(con,stm);
    }
    
    /**
     * Lista dados relativos a tabela controle através de um SQL.
     * @return ListaControle
     */
    @Override
    public List obterLista(){
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        ResultSet rs = null;

        // Lista de objetos Controle
        List<Controle> listaControle = new ArrayList<>();
        controle = new Controle(0,0,0,null,0);
        
        try {
            // pedido
            stm = con.prepareStatement("SELECT * FROM controle ORDER BY cod");
            rs = stm.executeQuery();
            while (rs.next()) {
                controle = new Controle(
                    rs.getInt("cod"),
                    rs.getInt("bomba"),
                    rs.getInt("combustivel"),
                    rs.getDate("horario"),
                    rs.getFloat("valor"));
                
                // Adiciona elemento na lista
                listaControle.add(controle);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BancoDados.fecharConexao(con, stm, rs);
        }
        return listaControle;
    }
}
