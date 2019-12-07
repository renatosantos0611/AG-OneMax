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
public class Crossover {

    Selecao selecao = new Selecao();
    Fitness fitness = new Fitness();

    public ArrayList<ArrayList<Integer>> Recombinacao(ArrayList<ArrayList<Integer>> cromossomo, ArrayList<Integer> fitness, int TAXACROSSOVER) {
        ArrayList<ArrayList<Integer>> filhos = new ArrayList<ArrayList<Integer>>();
        int melhorIndividuo = selecao.melhorIndividuo(fitness);
        Random rand = new Random();

        int TAXA = rand.nextInt(100);
        int TAXA2 = rand.nextInt(100);
        if (TAXA < 50) {
            for (int i = 0; i < cromossomo.size(); i++) {
                if (TAXA2 < TAXACROSSOVER) {
                    int PONTODECORTE = rand.nextInt(cromossomo.get(0).size());
                    ArrayList<Integer> gene = new ArrayList<Integer>();
                    for (int j = 0; j < cromossomo.get(i).size(); j++) {
                        if (j < PONTODECORTE) {
                            gene.add(cromossomo.get(melhorIndividuo).get(j));
                        } else {
                            gene.add(cromossomo.get(i).get(j));
                        }
                    }
                    filhos.add(gene);
                } else {
                    ArrayList<Integer> gene = new ArrayList<Integer>();
                    for (int j = 0; j < cromossomo.get(i).size(); j++) {
                        gene.add(cromossomo.get(i).get(j));
                    }
                    filhos.add(gene);
                }

            }
        } else {
            for (int i = 0; i < cromossomo.size(); i++) {
                if (TAXA2 < TAXACROSSOVER) {
                    int PONTODECORTE = rand.nextInt(cromossomo.get(0).size());
                    ArrayList<Integer> gene = new ArrayList<Integer>();
                    for (int j = 0; j < cromossomo.get(i).size(); j++) {
                        if (j < PONTODECORTE) {
                            gene.add(cromossomo.get(melhorIndividuo).get(j));
                        } else {
                            gene.add(cromossomo.get(i).get(j));
                        }
                    }
                    filhos.add(gene);
                } else {
                    ArrayList<Integer> gene = new ArrayList<Integer>();
                    for (int j = 0; j < cromossomo.get(i).size(); j++) {
                        gene.add(cromossomo.get(i).get(j));
                    }
                    filhos.add(gene);
                }
            }
        }
        return filhos;
    }

}
