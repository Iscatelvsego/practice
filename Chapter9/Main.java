package Chapter9;
interface A{
    void a();
    void b();

}
interface B{
    void c();
    void d();

}
interface C{
    void e();
    void f();

}
interface D extends A,B,C{
    void g();

}
class E {
    void ea(){}
    }
class F extends E implements D {
     public void a(){
        System.out.println("F.a()");
    };
    public void b(){
        System.out.println("F.b()");
    };
    public void c(){
        System.out.println("F.c()");
    };
    public void d(){
        System.out.println("F.d()");
    };
    public void e(){
        System.out.println("F.e()");
    };
    public void f(){
        System.out.println("F.f()");
    };
    public void g(){
        System.out.println("F.g()");
    };
   }
public class Main {
    static void fa(A a){a.b();}
    static void fb(B b){b.d();}
    static void fc(C c){c.f();}
    static void fd(D d){d.g();}
    public static void main(String args[]) {
F test = new F();
fa(test);
fb(test);
fc(test);
fd(test);
    }
}

