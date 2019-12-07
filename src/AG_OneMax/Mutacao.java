/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AG_OneMax;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Renato
 */
public class Mutacao {

    public ArrayList<ArrayList<Integer>> mutacao(ArrayList<ArrayList<Integer>> filhos, int TAXAMUTACAO) {
        for (int i = 0; i < filhos.size(); i++) {
            for (int j = 0; j < filhos.get(i).size(); j++) {
                Random rand = new Random();
                int taxa = rand.nextInt(100);
                if (taxa < TAXAMUTACAO) {
                    if (filhos.get(i).get(j) == 0) {
                        filhos.get(i).set(j, 1);
                    } else {
                        filhos.get(i).set(j, 0);
                    }
                }
            }

        }
        return filhos;
    }
}
