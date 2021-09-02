/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboardobserver;

/**
 *
 * @author siriya_s
 */
public class ObserverA implements MyObserver {
    @Override
    public void update(Source obj) {
        System.out.println("live result: " + ((Scoreboard)obj).getScore());
    }
}
