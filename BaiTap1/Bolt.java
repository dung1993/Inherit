package BaiTap1;

public class Bolt extends Animal{
    @Override
    public String HowToBarkable() {
        return "Gâu Gâu";
    }

    @Override
    public String HowToFly() {
        return null;
    }

    @Override
    public String HowToRun() {
        return "Run by Foot";
    }

    @Override
    public String HowToSwim() {
        return null;
    }
}
