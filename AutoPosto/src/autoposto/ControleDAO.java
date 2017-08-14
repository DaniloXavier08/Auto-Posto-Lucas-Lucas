
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
 *
 * @author danil
 * 
 * Manipulação de dados no Banco de Dados através
 * da classe BancoDados
 */
public class ControleDAO {
    
    // Adicionar dados na tabela controle
    public void adicionarDadosControle(Controle c){
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        try {
            // Pedido
            stm = con.prepareStatement("INSERT INTO controle VALUES (default,?,?,?)");
                       
            stm.setInt(1, c.getBomba());
            stm.setInt(2, c.getCombustivel());
            stm.setString(3, c.getHorario());
            
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        BancoDados.fecharConexao(con, stm);
    }
    
    // Remover dados da tabela controle
    public void removerDadosControle(Controle c){
        Connection con = BancoDados.iniciarConexao();
            PreparedStatement stm = null;
            try {
                // Pedido
                stm = con.prepareStatement("DELETE FROM controle WHERE cod=?");
                stm.setInt(1, c.getCod());
                
                stm.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            BancoDados.fecharConexao(con,stm);
    }
    
    // Listar dados relativos a tabela controle
    public List lerEstoque(){
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        ResultSet rs = null;

        // Lista de objetos Controle
        List<Controle> listaControle = new ArrayList<>();
        Controle c = new Controle();
        
        try {
            // pedido
            stm = con.prepareStatement("SELECT * FROM controle ORDER BY cod");
            rs = stm.executeQuery();
            while (rs.next()) {
                c = new Controle();
                
                c.setCod(rs.getInt("cod"));
                c.setBomba(rs.getInt("bomba"));
                c.setCombustivel(rs.getInt("combustivel"));
                c.setHorario(rs.getString("horario"));
                
                // Adiciona elemento na lista
                listaControle.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            BancoDados.fecharConexao(con, stm, rs);
            return listaControle;
        }
    }
}
