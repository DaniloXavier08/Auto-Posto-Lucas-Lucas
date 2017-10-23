/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoposto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danil
 */
public class BombaDAO extends InterfaceDAO{
    //Variável
    private Bomba bomba;

    public BombaDAO(){
        // Método para apenas obter a Lista
    }
    /**
     * Método construtror
     * @param bomba
     */
    public BombaDAO(Bomba bomba) {
        this.bomba = bomba;
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
            stm = con.prepareStatement("INSERT INTO bomba VALUES (default,?,null)");

            stm.setString(1, bomba.getDescricao());

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
            stm = con.prepareStatement("UPDATE bomba SET descricao = ? WHERE cod=?");
            stm.setString(1, bomba.getDescricao());
            stm.setInt(2, bomba.getCod());

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
            stm = con.prepareStatement("DELETE FROM bomba WHERE cod=?");
            stm.setInt(1, bomba.getCod());

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        BancoDados.fecharConexao(con, stm);
    }

    @Override
    public ArrayList obterLista() {
        Connection con = BancoDados.iniciarConexao();
        PreparedStatement stm = null;
        ResultSet rs = null;

        // Lista de objetos Controle
        ArrayList<Bomba> listaBombas = new ArrayList<>();

        try {
            // pedido
            stm = con.prepareStatement("SELECT * FROM bomba ORDER BY cod");
            rs = stm.executeQuery();
            while (rs.next()) {
                // Nova instancia da classe Bomba
                bomba = new Bomba(rs.getInt("cod"), rs.getString("descricao"), 0, rs.getString("ultima_atualizacao"));
                
                // Adiciona elemento na lista
                listaBombas.add(bomba);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Não foi possível carregar Lista de Bombas");
        }
        BancoDados.fecharConexao(con, stm, rs);
        return listaBombas;
    }
    
}


