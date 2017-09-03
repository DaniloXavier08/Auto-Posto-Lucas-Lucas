package autoposto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CombustivelDAO extends InterfaceDAO {

    //Variável
    Combustivel combustivel;

    /**
     * Método construtror
     * @param combustivel
     */
    public CombustivelDAO(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    /**
     * Adicionar dados na tabela através de um SQL
     */
    public void adicionar() {
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        try {
            // Pedido
            stm = con.prepareStatement("INSERT INTO combustivel VALUES (default,?,?)");

            stm.setString(1, combustivel.getDescricao());
            stm.setFloat(2, combustivel.getValor());

            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CombustivelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        BancoDados.fecharConexao(con, stm);
    }
    
    /**
     * Altera dados no Banco de Dados através de um SQL
     * 
    **/
    public void alterar(){
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        try {
            // Pedido
            stm = con.prepareStatement("UPDATE combustivel SET valor = ? WHERE cod=?");
            stm.setFloat(1, combustivel.getValor());
            stm.setInt(2, combustivel.getCod());

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        BancoDados.fecharConexao(con, stm);
    }

    @Override
    /**
     * Remover dados da tabela através de um SQL
     */
    public void remover() {
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        try {
            // Pedido
            stm = con.prepareStatement("DELETE FROM combustivel WHERE cod=?");
            stm.setInt(1, combustivel.getCod());

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        BancoDados.fecharConexao(con, stm);
    }

    @Override
    public List obterLista() {
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        ResultSet rs = null;

        // Lista de objetos Controle
        List<Combustivel> listaCombustivel = new ArrayList<>();

        try {
            // pedido
            stm = con.prepareStatement("SELECT * FROM combustivel ORDER BY cod");
            rs = stm.executeQuery();
            while (rs.next()) {
                
                combustivel = new Combustivel(rs.getString("descricao"), rs.getFloat("valor"));
                combustivel.setCod(rs.getInt("cod"));
                
                // Adiciona elemento na lista
                listaCombustivel.add(combustivel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível carregar");
        }
        BancoDados.fecharConexao(con, stm, rs);
        return listaCombustivel;
    }

}
