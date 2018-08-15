/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Nisrina Izdihar
 */
public class array2 {
    public static void main(String[] args){
        int nilai [] = new int [3];
        nilai[0] = 70;
        nilai[1] = 85;
        nilai[2] = 60;
        double ratarata = 0.0;
        for(int i = 0; i < nilai.length; i++)ratarata+=nilai[i];
        ratarata/=nilai.length;
        System.out.println("nilai rata-rata = " + ratarata);
    }
}
