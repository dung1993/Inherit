package BaiTap1;

public abstract class Animal implements Barkable,Flyable,Runable,Swimable {
    public abstract String HowToBarkable();
    public abstract String HowToFly();

    @Override
    public abstract String HowToRun();

    @Override
    public abstract String HowToSwim();
}

