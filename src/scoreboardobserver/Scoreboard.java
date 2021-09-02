/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboardobserver;

import java.util.ArrayList;

/**
 *
 * @author siriya_s
 */
public class Scoreboard implements Source {
    private final ArrayList<MyObserver> list;
    private String score;
    
    public Scoreboard() {
        this.list = new ArrayList<MyObserver>();
    }
    
    public void setScore(String s) {
        score = s;
        notifyObservers();
    }
    
    public String getScore() {
        return score;
    }
    
    @Override
    public void register(MyObserver observer) {
        list.add(observer);
    }
    
    @Override
    public void notifyObservers() {
        for(int i = 0; i < list.size(); i++) {
            (list.get(i)).update(this);
        }
    }
    
    @Override
    public void remove(MyObserver observer) {
        list.remove(list.indexOf(observer));
    }
}
