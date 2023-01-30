public class TryTest1 {
    public static void main(String[] args) {
        // Instance
       Ninja1 c1 = new Ninja1("Vincent", "Ninja", 10, 100);
       Wizard1 c2 = new Wizard1("Elijah", "Wizard", 0, 0, 8,50,0);
       Samurai1 c3 = new Samurai1("Vionne", "Samurai", 0, 0, 0,200,0);
       Samurai1 c4 = new Samurai1("Rolan", "Samurai1.1", 0, 0, 0,60,0);
       Knight c5 = new Knight("Dwight", "Knight");
       


       System.out.println("------------------");
       //Samurai1
       c3.Deathblow(c1);
       c3.Meditate();
       c3.howMany();
       System.out.println("------------------");
       //Wizard1
       c2.Healinggaling(c3);
       c2.Fireball(c3);
       System.out.println("------------------");
       c1.Steal(c3);
       c1.Run(c3);

       
    
       





    }
    
}
