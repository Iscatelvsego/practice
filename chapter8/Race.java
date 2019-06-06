package chapter8;


public class Race{
    public static void ride(Cycle i) {
        i.ride();}
    public static void main (String args[]){
        Unicycle a = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle c = new Tricycle();
        ride(a);
        ride(b);
        ride(c);
    }

}