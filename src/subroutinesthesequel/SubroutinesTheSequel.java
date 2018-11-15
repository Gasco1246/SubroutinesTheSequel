/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subroutinesthesequel;

/**
 *
 * @author gasco1246
 */
import java.util.Scanner;

/**
 *
 * @author gasco1246
 */
public class SubroutinesTheSequel {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        System.out.println("Type 1 toCalculate the average of four random numbers:");
        System.out.println("Type 2 to prompt for an int:");
        System.out.println("Type 3 to play a fun game");
        Scanner put = new Scanner(System.in);
        int usrin = put.nextInt();
        switch(usrin){
            case 1:
                System.out.println("Le moyen est: "+randAv());
                break;
            case 2:
                enterInt();
            case 3:
                System.out.println(oneMillion());
                break;
        }
        
       
    }
    public static double randAv(){
        double[] ShArK= new double[4];
        for(int i = 0; i<=3;i++){
            ShArK[i] = Math.random();
            System.out.println(ShArK[i]);
        }
        return(avCalc(ShArK));
       
    }
    public static double avCalc(double [] a){
       double sum = 0;
       for(int i = 0; i<=3; i++){
           sum+=a[i];
       }
       sum/=4;
       return(sum);
    }
    public static void enterInt (){
        for(int i = 0; i<=1000; i++){
            System.out.println("Please enter an Integer");
            
        }
        
        Scanner put = new Scanner(System.in);
        int usrin = put.nextInt();
        System.out.println("Thanks for entering an int today");
        
    }
    public static String oneMillion(){
        String ret = "";
        System.out.println("enter any int;");
        Scanner put = new Scanner(System.in);
        int usrin = put.nextInt();
        if (usrin>134){
            while(ret != "qwerty"){
                System.out.println("Ha u lose");
            }
            
        }else{
            ret = "lol";
        }
        
 

        return(ret);
    }
}
        
    


