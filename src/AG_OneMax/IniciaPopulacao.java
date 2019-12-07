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
public class IniciaPopulacao {

    public ArrayList<ArrayList<Integer>> populacaoInicial(int tamanhoCromossomo, int quantGene) {
        ArrayList<ArrayList<Integer>> cromossomo = new ArrayList<ArrayList<Integer>>();
        Random rand = new Random();

        for (int i = 0; i < tamanhoCromossomo; i++) {
            ArrayList<Integer> gene = new ArrayList<Integer>();
            for (int j = 0; j < quantGene; j++) {
                gene.add(rand.nextInt(2));
            }
            cromossomo.add(gene);
        }
        return cromossomo;
    }

    public void mostrarPopulacao(ArrayList<ArrayList<Integer>> cromossomo, ArrayList<Integer> fitness) {
        for (int i = 0; i < cromossomo.size(); i++) {
            System.out.print("Cromossomo " + i + " :");
            for (int j = 0; j < cromossomo.get(i).size(); j++) {
                System.out.print(cromossomo.get(i).get(j));
            }
            System.out.print(" Fitness: " + fitness.get(i));
            System.out.println();
        }
        System.out.println();
    }

    public void mostrarPopulacaoFilhos(ArrayList<ArrayList<Integer>> cromossomo, ArrayList<Integer> fitness) {
        for (int i = 0; i < cromossomo.size(); i++) {
            System.out.print("Cromossomo Filhos " + i + " :");
            for (int j = 0; j < cromossomo.get(i).size(); j++) {
                System.out.print(cromossomo.get(i).get(j));
            }
            System.out.print(" Fitness: " + fitness.get(i));
            System.out.println();
        }
        System.out.println();
    }

}
