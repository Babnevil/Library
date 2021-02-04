/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Kiosk {
    Scanner sc = new Scanner(System.in);
    String[] command;
    public Kiosk (){    //should this do anything but call run?
        Library library = new Library();
    }
    public void run(){
        System.out.println("===============================");
        System.out.println("Welcome to the Library System:\n");
        System.out.println("Awaiting Instruction:");
        String userInput = sc.next();
        command = userInput.split("/");
        for (String com : command){
            System.out.println(com);
        }
    }
}
