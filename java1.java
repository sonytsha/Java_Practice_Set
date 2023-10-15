// Inheritance in Java
class Base {
    int x ;
    public int getx() {
        return x;
    }
    public void setx ( int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printMe() {
        System.out.println("I am a constructor");
    }
}
class Derived extends Base {
    int y ;
    public int gety(){
        return y;
    }
    public void sety(int y) {
        this.y=y;
    }
}
public class Code67 {
public static void main (String[] args) {
    // creating an object of base class
    Base b = new Base(); // or Derived b = new Derived();
    b.setx(4);
    System.out.println(b.getx());

// creating an object of derived class
Derived d = new Derived();
d.setx(34);
System.out.println(d.getx());


}
}

