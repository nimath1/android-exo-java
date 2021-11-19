package com.company;


import java.util.Scanner;

class Main{

    public static void main (String[]args){

        Scanner ad =new Scanner(System.in);
        Etudiant e=new Etudiant("ADISSA","Nimath",19);
        int school;

        System.out.println("Allez vous à l'école ?");
        school=ad.nextInt();


        if (school==1){
            e.gotoschool(true);
        }else {
            e.gotoschool(false);
        }
        System.out.println("Je m'appelle"+e.getNom()+" "+e.getPrenom()+" "+" ,j\'ai "+e.getAge()+" "+"ans");


        Professeur t=new Professeur();
        t.welcome();

        System.out.println("Etes vous diplomés ?");
        int dip;
        dip=ad.nextInt();

        }
    }








