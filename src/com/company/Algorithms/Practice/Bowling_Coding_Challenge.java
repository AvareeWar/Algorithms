package com.company.Algorithms.Practice;

import org.junit.Test;

import java.util.ArrayList;

public class Bowling_Coding_Challenge {

    public Bowling_Coding_Challenge(){
    }


    //if strike variables
    int strikeStore = 0;

    //if spare variables
    int spareStore = 0;

    int endpoints = 0;

    ArrayList<Integer> items = new ArrayList<>();


    public void rolls(int a){

        items.add(a);

    }

    public int scoreGame(){

        for(int i = 0; i < items.size(); i++){
            if(items.get(i) == 10){
                System.out.println(items.get(i));
                if(items.get(i) != items.get(items.size()-2) || items.get(i) != items.get(items.size()-1)){
                    System.out.println("|");
                    endpoints += items.get(i) + items.get(i + 1) + items.get(i + 2);
                }
                if(items.get(i) == items.get(items.size()-2) || items.get(i) != items.get(items.size()-1)){
                    System.out.println("-");
                    endpoints += items.get(i);
                }
            }

            if(items.get(i) != 10){
                spareStore = items.get(i);
                endpoints += items.get(i);
            }

            if((spareStore + items.get(i+1)) == 10){
                spareStore = spareStore + items.get(i+1) + items.get(i+2);
                endpoints += spareStore;
                if(spareStore == 10){
                    items.set(i,i+1);
                }
            }

        }
        System.out.println("END: " + endpoints);
        return endpoints;
    }

}
