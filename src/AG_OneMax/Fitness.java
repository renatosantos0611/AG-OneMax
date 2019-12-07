/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AG_OneMax;

import java.util.ArrayList;

/**
 *
 * @author Renato
 */
public class Fitness {

    public ArrayList<Integer> avaliacaoAptidao(ArrayList<ArrayList<Integer>> cromossomo) {
        ArrayList<Integer> fitness = new ArrayList<Integer>();
        //Tira o valor nulo do Fitness
        if (fitness.isEmpty()) {
            for (int i = 0; i < cromossomo.size(); i++) {
                fitness.add(0);
            }
        }
        for (int i = 0; i < cromossomo.size(); i++) {
            for (int j = 0; j < cromossomo.get(i).size(); j++) {
                if (cromossomo.get(i).get(j) == 1) {
                    int valor = 1;
                    fitness.set(i, fitness.get(i) + valor);
                }
            }
        }
        return fitness;
    }

}
