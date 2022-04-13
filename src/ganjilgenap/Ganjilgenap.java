/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ganjilgenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner input=new Scanner(System.in);
         Scanner input = new Scanner(System.in);
        int bil;
        System.out.println("masukkan bilangan : ");
        bil = input.nextInt();
                
                if (bil %2==0){
                
                    System.out.println("bilangan ini adalah bilangan genap  ");
                } else{
                
                    System.out.println("bilangan ini adalah bilangan ganjil");
                }
       
        
    }
    }
    
