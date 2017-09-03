
package autoposto;

import java.util.List;

/**
 * Interface para implementação da arquitetura DAO
 * para manipulação de dados no Banco de Dados.
 */
public abstract class InterfaceDAO {
    public abstract void adicionar();
    public abstract void remover();
    public abstract List obterLista();
}
