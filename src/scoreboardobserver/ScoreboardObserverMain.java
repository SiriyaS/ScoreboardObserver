/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboardobserver;

import java.util.Scanner;

/**
 *
 * @author siriya_s
 */
public class ScoreboardObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scoreboard board = new Scoreboard();
        ObserverA objA = new ObserverA();
        ObserverB objB = new ObserverB();
        
        board.register(objA);
        board.register(objB);
        
        while(true) {
            System.out.print("Enter score (Enter for exit): ");
            String score = input.nextLine();
            
            if(score.equalsIgnoreCase("")) {
                System.out.println("EXIT!!");
                return;
            }
            
            board.setScore(score);
        }
    }
    
}
