package test;

public class Bclass extends Aclass{
    private int c;
    private int d;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Bclass{" +super.getA()+
                super.getB()+
                "c=" + c +
                ", d=" + d +
                '}';
    }
}
