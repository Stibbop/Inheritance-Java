import java.util.*;

public class Human1 {

    private String name, job;
    private int agi = 0, str = 0, inte = 0, hp = 0, mp = 0;
    
    private static int subcount = 0;
        public Human1(){
            subcount++;
        }


        public static int getCount(){
            return subcount;
        }

    //Constructors
    public Human1 (String name, String job, int agi, int str, int inte, int hp, int mp) {
        this.name = name;
        this.job = job;
        this.agi = agi;
        this.str = str;
        this.inte = inte;
        this.hp = hp;
        this.mp = mp;
    }

    public Human1 (String name, String job, int agi, int str, int inte) {
        this.name = name;
        this.job = job;
        this.agi = agi;
        this.str = str;
        this.inte = inte;
    }

    public Human1(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Human1(String name, String job, int agi, int hp) {
        this.name = name;
        this.job = job;
        this.agi = agi;
        this.hp = hp;
    }
    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void chara() {

    }

    // Character Status
    public void showStats(Human1 target) {
        System.out.println(this.getName());
        System.out.println("Hp: " + this.getHp());
        System.out.println("Mp: " + this.getMp());
        System.out.println("intelligence: " + this.getInte());
        System.out.println("strength: " + this.getStr());
        System.out.println("agility: " + this.getAgi());
        System.out.println("");
        System.out.println(target.getName());
        System.out.println("Hp: " + target.getHp());
        System.out.println("Mp: " + target.getMp());
        System.out.println("intelligence: " + target.getInte());
        System.out.println("strength: " + target.getStr());
        System.out.println("agility: " + target.getAgi());
    }

        public void takeAttack (int dmg, Human1 target){
            target.setHp(target.getHp() - dmg);
            if (target.getHp() <= 0) {
                target.setHp(0);
                System.out.println(target.getName() + " is now dead");
            }
            else {
                System.out.println(this.getName() + " attacks " + target.getName() + "\n" + target.getName() + " now have "
                        + target.getHp()
                        + " hp");
            }
            showStats(target);
        }
        
        

        

        
    }


