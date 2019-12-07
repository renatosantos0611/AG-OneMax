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
public class Variaveis {

    public int CONTAGERACAO = 0;
    public int QUANTIDADEGERACAO = 2;
    public int QUANTIADADECROMOSSOMO = 10;
    public int QUANTIDADEGENE = 6;
    public int MELHORINDIVIDUO = 0;
    public int MELHORGERACAO = 0;
    public int MELHORFITNESS = 0;
    public int TAXAMUTACAO = 0;
    public int TAXACROSSOVER = 0;

    public ArrayList<ArrayList<Integer>> cromossomo = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> filhos = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> geracao = new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> fitness = new ArrayList<Integer>();
    public ArrayList<Integer> fitnessFilhos = new ArrayList<Integer>();
    public ArrayList<Integer> fitnessGeracao = new ArrayList<Integer>();

}
