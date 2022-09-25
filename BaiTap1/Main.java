package BaiTap1;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Bolt();
        animal[1] = new AngryBird();
        animal[2] = new Nemo();
        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Bolt){
                Barkable barkable = (Bolt) animal[i];
                Runable runable = (Bolt) animal[i];
                System.out.println(barkable.HowToBarkable());
                System.out.println(runable.HowToRun());
            }else if (animal[i] instanceof AngryBird) {
                Flyable flyable = (AngryBird) animal[i];
                System.out.println(flyable.HowToFly());
            }else {
                Swimable swimable = (Nemo) animal[i];
                System.out.println(swimable.HowToSwim());
            }
        }


        Machine[] machine = new Machine[2];
        machine[0] = new McQueen();
        machine[1] = new Siddele();
        for (int i = 0; i < machine.length; i++) {
            if (machine[i] instanceof McQueen){
                Runable runable = (McQueen) machine[i];
                System.out.println(runable.HowToRun());
            }else {
                Flyable flyable = (Siddele) machine[i];
                System.out.println(flyable.HowToFly());
            }
        }
    }
}
