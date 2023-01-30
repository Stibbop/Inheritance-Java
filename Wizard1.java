public class Wizard1 extends Human1 {

    public Wizard1(String name, String job, int agi, int str, int inte, int hp, int mp) {
        super(name, job, agi, str, inte, hp, mp);
    }

    public Wizard1(String name, String job, int agi, int str, int inte) {
        super(name, job, agi, str, inte);
    }

    public Wizard1(String name, String job) {
        super(name, job);
    }
    
    public void Healinggaling (Human1 target){
        System.out.println(this.getName()+ " uses healinggaling to "+ target.getName());
        target.setHp(target.getHp()+this.getInte());
        System.out.println(this.getName()+" heals "+target.getName()+" by "+ target.getHp());
    }

    public void Fireball (Human1 target){
        int dmg = this.getInte()*3;
        System.out.println(this.getName()+ " uses fireball towards "+ target.getName());
        takeAttack(dmg, target);
    }

    

    

}
