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
public interface Source {
    public void notifyObservers();
    
    public void register(MyObserver observer);
    
    public void remove(MyObserver observer);
}
