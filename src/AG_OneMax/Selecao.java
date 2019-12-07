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
public class Selecao {

    public ArrayList<Integer> mostrarMelhorIndividuo(ArrayList<ArrayList<Integer>> cromossomo, ArrayList<Integer> fitness, ArrayList<Integer> fitnessGeracao, int geracao) {
        int melhorFitness = 0;
        int melhorIndividuo = 0;
        for (int i = 0; i < fitness.size(); i++) {
            if (melhorFitness < fitness.get(i)) {
                melhorIndividuo = i;
                melhorFitness = fitness.get(i);
            }
        }
        //System.out.println("Melhor Individuo: " + melhorIndividuo);
        System.out.print("Geração " + geracao + " : ");
        
        for (int j = 0; j < cromossomo.get(melhorIndividuo).size(); j++) {
            System.out.print(cromossomo.get(melhorIndividuo).get(j));            
        }
        
        System.out.print(" Fitness :" + fitness.get(melhorIndividuo)+" "+"Individuo: " + melhorIndividuo);
        System.out.println();
        fitnessGeracao.add(fitness.get(melhorIndividuo));
        return fitnessGeracao;
    }

    public void melhorGeracao(ArrayList<Integer> fitnessGeracao) {
        int melhorFitness = 0;
        int melhorGeracao = 0;
        for (int i = 0; i < fitnessGeracao.size(); i++) {
            if (melhorFitness < fitnessGeracao.get(i)) {
                melhorGeracao = i;
                melhorFitness = fitnessGeracao.get(i);
            }
        }
        System.out.println("Melhor geracão: "+melhorGeracao+" Fitness: "+fitnessGeracao.get(melhorGeracao));
    }

    public int melhorIndividuo(ArrayList<Integer> fitness) {
        int melhorFitness = 0;
        int melhorIndividuo = 0;
        for (int i = 0; i < fitness.size(); i++) {
            if (melhorFitness < fitness.get(i)) {
                melhorIndividuo = i;
                melhorFitness = fitness.get(i);
            }
        }
        return melhorIndividuo;
    }
}
