/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author DEWA
 */
import java.util.Scanner;
import java.lang.System;
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih Menu: ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Masukkan nilai a:");
                int a = input.nextInt();
                System.out.println("masukkan nilai b:");
                int b = input.nextInt();
                System.out.println("masukkan nilai c:");
                int c = input.nextInt();
                satu s =  new satu();
                s.Sa=a;
                s.Sb=b;
                s.Sc=c;
                s.segitiga();
                s.sisiC();
                if(s.segitiga()== s.sisiC()){
                    System.out.println("Segitiga Pythagoras");
                } else{
                    System.out.println("bukan pythagoras");
                }
                    
                break;
            case 2:
                System.out.println("Masukkan nilai d:");
                int d = input.nextInt();
                System.out.println("masukkan nilai e:");
                int e = input.nextInt();
                dua d1 = new dua();
                d1.sisia = d;
                d1.sisib = e;
                d1.sisiMiring();
                break;
            case 3:
                System.out.println("Masukkan sisi Miring:");
                int p = input.nextInt();
                System.out.println("masukkan Sisi Datar:");
                int q = input.nextInt();
                tiga t = new tiga();
                t.sisic = p;
                t.sisia = q;
                t.sisiSiku();
                break;
            case 4:
                System.out.println("exit");
                System.exit(0);
                break;
        }
        
    }
