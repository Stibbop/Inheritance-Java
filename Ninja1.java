public class Ninja1 extends Human1 {

    public Ninja1(String name, String job, int agi, int str, int inte, int hp, int mp) {
        super(name, job, agi, str, inte, hp, mp);
    }

    public Ninja1(String name, String job, int agi, int str, int inte) {
        super(name, job, agi, str, inte);
    }

    public Ninja1(String name, String job) {
        super(name, job);
    }

    public Ninja1(String name, String job, int agi, int hp) {
        super(name, job, agi, hp);
    }

    public void Steal (Human1 target){
        System.out.println(this.getName()+ " uses steal towards "+ target.getName());
        target.setHp(target.getHp()-this.getAgi());
        this.setHp(this.getHp()+this.getAgi());
        System.out.println(this.getName()+" now has "+this.getHp()+ " while "+target.getName()+ " has been left with "+target.getHp());

        showStats(target);
    }

    public void Run (Human1 target){
        System.out.println(this.getName()+ " uses run against "+ target.getName());
        this.setHp(this.getHp()-10);
        System.out.println(this.getName()+" uses run but decreases its health by 10 and has only left by "+this.getHp());
    

        showStats(target);
    }




    
    
    
}
