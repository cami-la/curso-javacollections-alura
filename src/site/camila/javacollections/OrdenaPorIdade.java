/**
 * 
 */
package site.camila.javacollections;

import java.util.Comparator;

/**
 * @author cami-la
 * Crie uma classe que implemente a interface Comparator usando como critério de comparação a idade de funcionários. Crie três funcionários adicionando-os em um TreeSet. 
 * Em seguida, itere sobre a lista usando um Iterator para imprimir o nome de cada funcionário.
 */
public class OrdenaPorIdade implements Comparator<Funcionario>{

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}