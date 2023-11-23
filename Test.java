/**
 * Docblock:
 * 
 * @author Thomas Vrielink
 * @date 31-08-2023
 * 
 * Waar dit project voor bedoeld is
 */
import com.cert.Opdracht1;

class A {
    public A() {
        this.print();
    }
    public void print() {
        System.out.print("A ");
    }
}

class B extends A {
    int i = 4;
    public void print() {
        System.out.print(i + " ");
    }
}

//Dit is commentaar
public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}
