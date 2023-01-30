public class Samurai1 extends Human1 {

    private static int subcount = 0;

    public Samurai1(String name, String job, int hp, int mp, int inte, int str, int agi) {
        super(name, job, hp, mp, inte, str, agi);
        subcount++;
    }
    public static int getCount() {
        return subcount;
    }
    public Samurai1(String name, String job, int agi, int str, int inte) {
        super(name, job, agi, str, inte);
    }

    public Samurai1(String name, String job) {
        super(name, job);
    }
    
    public void Deathblow (Human1 target){
        System.out.println(this.getName()+ " uses deathblow towards "+ target.getName());
        int dmg = 0;
        target.setHp(0);
        this.setHp(this.getHp()/2);
        takeAttack(dmg, target);
    }

    public void Meditate () {
     this.setHp(this.getHp()+(this.getHp())/2);
     System.out.println(this.getName()+" uses meditate he have now "+ this.getHp()  );
    }

    public void howMany() {
        System.out.println("the total current number of Samurai is " + Samurai1.getCount());
    }
    


    
}
