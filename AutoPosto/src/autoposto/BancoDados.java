
package autoposto;

/**
 *
 * @author danilo
 * 
 * Classe responsável por fazer a conexão com o Banco de Dados
 * 
 * Será utilizado PostgreSQL nesse projeto
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDados {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/autoposto";
    private static final String USER = "postgres";
    private static final String PASS = "postgres"; // alterar senha e usuário conforme plataforma e/ou usuário

    // Iniciar a conexão com o Banco de Dados
    public static Connection iniciarConexao() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }

    // Fechar conexão - Variável Connection
    public static void fecharConexao(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {

            Logger.getLogger(BancoDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Fechar conexão - Variável Connection e PreparedStatement
    // Será usada apenas quando PreparedStatement for iniciado
    public static void fecharConexao(Connection con, PreparedStatement stm) {
        fecharConexao(con);
        try {
            if (stm != null) {
                stm.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BancoDados.class.getName()).log(Level.SEVERE, null, ex
            );
        }
    }

    // Fechar conexão - Variável Connection, PreparedStatement e RestultSet
    // Será usada apenas quando PreparedStatement e ResultSet for iniciado
    public static void fecharConexao(Connection con, PreparedStatement stm, ResultSet rs) {
        fecharConexao(con, stm);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BancoDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
