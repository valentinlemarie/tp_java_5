package com.com.animal.animals;

import com.animal.Aliment;
import com.animal.Animal;
import com.animal.Regime;
import com.origin.Omnivore;

public class Homme extends Animal {


    public Homme(int age, float poids, String noms, float taille){
        super(age, poids, noms, taille);
        this.regime = new Omnivore(age, poids, noms, taille) ;
    }




    /*
    public void manger(Aliment aliment){
        if(Omnivore.mange.contains(aliment)){
            System.out.println("l'homme a mange "+aliment.toString());
        }else{
            System.out.println("Il ne mange pas de "+aliment.toString());
        }
    }
    public void deplacer(){
        System.out.println("un Homme ce déplace");
    }
    */
}
