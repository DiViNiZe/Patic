/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author INT105
 */
public class Person {
    private long cardId;
    private Adress[] addr;
    
    public Person(){
        setCardId(0);
    }
    public Person(long id,Adress[] addr){
        setCardId(0);
        this.addr = addr;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        String out = "CardID :"+cardId+"\n";
        for(Adress add:addr){
            out += add+"\n";
            
        }
        return out;
    }

    public Adress[] getAddr() {
        return addr;
    }

    public void setAddr(Adress[] addr) {
        this.addr = addr;
    }
    public void removeAddr(Adress[] addr){
        this.addr=null;
    }
    
}
