/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task3glimakova;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV20Task3Glimakova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ваше имя:");
        String name = input.nextLine();
        System.out.println("Ваша фамилия:");
        String name1 = input.nextLine();
        System.out.println("Ваш день рождения:");
        String name2 = input.nextLine();
        System.out.println("Ваш месяц рождения:");
        String name3 = input.nextLine();
        System.out.println("Ваш год рождения:");
        String name4 = input.nextLine();
        
        System.out.print(name +" " +name1+ " родился(-ась) "+ name2+"."+ name3+"."+name4);
        System.out.println(" ");
    }
}
