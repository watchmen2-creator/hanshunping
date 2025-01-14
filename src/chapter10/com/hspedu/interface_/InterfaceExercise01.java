package chapter10.com.hspedu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        G g = new G();
        System.out.println(g.a);
        System.out.println(IG.a);
        System.out.println(G.a);
    }
}

interface IG {
    int a = 10;
}

class G implements IG {

}
