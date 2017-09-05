
package autoposto;

import java.util.List;

/**
 * Classe Abstrata para implementação da arquitetura DAO
 * para manipulação de dados no Banco de Dados.
 */
public abstract class InterfaceDAO {
    //Exemplo de Classe Abstrata
    public abstract void adicionar();
    public abstract void remover();
    public abstract List obterLista();
}
