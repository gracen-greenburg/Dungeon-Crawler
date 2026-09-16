package com.gg.entities;

/**
 * @author gracen-greenburg 2026
 * 
 * Entity class -- acts as in interface for the entities.
 * Player, Enemy, and NPC's will extend this calss
 */
public abstract class Entity {

    protected int x;
    protected int y;
    protected int hp;
    protected int maxHp;
    protected int attack;
    protected String name;
    protected int ac;

    // An entity has: 
    /*
     * name
     * position x,y --> scope -> x,y, should there be a z?
     * hp
     * attack
     * AC
     */

     protected Entity(String name, int x, int y, int hp, int attack, int ac) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.attack = attack;
     }

     // Getters and Setters
     // ------
     public String getName() {
        return name;
     }

     public void setName(String name) {
        this.name = name;
     }

     public int[] getPosition() {
        return new int[] {x, y};
     }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    
}
