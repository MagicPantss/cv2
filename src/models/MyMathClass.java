package models;

public final class MyMathClass {

    public static final double pi = 3.14; //statický argument, dovoluje používat argument bez instance třídy mimo třídu, ve které je definován

    private MyMathClass() {}
    public static int sum(int a, int b){
        return a +b;
    }

}
