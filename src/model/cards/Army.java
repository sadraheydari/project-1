package model.cards;

import model.Buff.Buff;
import java.util.ArrayList;
public class Army extends Card {
    protected int hp, ap, ar;
    protected AttackType attackType;
    protected ArrayList<Buff> buffs = new ArrayList<>();
    public Army (String name, int price, String description, int hp, int ap, int ar, AttackType attackType){
        super(name, price, description);
        this.hp = hp;
        this.ap = ap;
        this.ar = ar;
        this.attackType = attackType;
    }

    public int getHp() {
        return hp;
    }

    public int getAp() {
        return ap;
    }

    public int getAr() {
        return ar;
    }

    public AttackType getAttackType() {
        return attackType;
    }
}