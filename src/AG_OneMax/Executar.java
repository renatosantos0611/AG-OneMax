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
public class Executar {

    public static void main(String[] args) {

        IniciaPopulacao populacao = new IniciaPopulacao();
        Fitness aptidao = new Fitness();
        Selecao selecao = new Selecao();
        Crossover crossover = new Crossover();
        Variaveis variaveis = new Variaveis();
        Mutacao mutacao = new Mutacao();

        variaveis.QUANTIADADECROMOSSOMO = 10;
        variaveis.QUANTIDADEGERACAO = 10;
        variaveis.QUANTIDADEGENE = 10;
        variaveis.TAXAMUTACAO = 3;
        variaveis.TAXACROSSOVER = 100;

        //Cria Populacao Inicial (Random)
        variaveis.cromossomo = populacao.populacaoInicial(variaveis.QUANTIADADECROMOSSOMO, variaveis.QUANTIDADEGENE);

        //Começa Criterio de parada
        while (variaveis.CONTAGERACAO < variaveis.QUANTIDADEGERACAO) {
            //Calcula o Fitness
            variaveis.fitness = aptidao.avaliacaoAptidao(variaveis.cromossomo);
            //populacao.mostrarPopulacao(variaveis.cromossomo, variaveis.fitness);
            variaveis.fitnessGeracao = selecao.mostrarMelhorIndividuo(variaveis.cromossomo, variaveis.fitness, variaveis.fitnessGeracao, variaveis.CONTAGERACAO);
            variaveis.filhos = crossover.Recombinacao(variaveis.cromossomo, variaveis.fitness, variaveis.TAXACROSSOVER);
            variaveis.fitnessFilhos = aptidao.avaliacaoAptidao(variaveis.filhos);
            //populacao.mostrarPopulacaoFilhos(variaveis.filhos, variaveis.fitnessFilhos);

            variaveis.cromossomo = mutacao.mutacao(variaveis.filhos, variaveis.TAXAMUTACAO);
            variaveis.fitness = variaveis.fitnessFilhos;
            //populacao.mostrarPopulacao(variaveis.cromossomo, variaveis.fitness);

            variaveis.CONTAGERACAO++;
        }
        selecao.melhorGeracao(variaveis.fitnessGeracao);

    }

}
