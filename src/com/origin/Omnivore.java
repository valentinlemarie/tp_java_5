package com.origin;

import com.animal.Aliment;
import com.animal.Animal;
import com.animal.Regime;

import java.util.EnumSet;

import static com.animal.Aliment.*;

public class Omnivore extends Animal implements Regime {
    public static final EnumSet<Aliment> mange =EnumSet.of(ANTOLOPPE,CARCASSE,HOMME,ZEBRE,POISSON,HERBE,CAROTTE,LEGUME,FRUIT);

    public Omnivore(int age, float poids, String noms, float taille){
        super(age, poids, noms, taille);
    }

    @Override
    public void manger(Aliment aliment) {
        if(Omnivore.mange.contains(aliment)){
            System.out.println("a mange "+aliment.toString());
        }else{
            System.out.println("ne peux manger de"+aliment.toString());
        }
    }
}
