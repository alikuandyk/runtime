package self;

public class Main {
    public static void main(String[] args) {
        System.out.println("Жалпы тури - (5 * n) + 2");
        System.out.println();
        
        for (int n = 1; n <= 10; n++) {
            int x = 5 * n + 2;
            System.out.println("x = (5 * " + n + ") + 2 = " + x);
            System.out.println("x % 5 = " + x + " % 5 = " + x % 5 + " (дурыс, есеп шарты бойынша 2 калдык калу керек)");
            System.out.println(x);
            System.out.println("3x % 5 = " + "(3 * " + x + ") % 5 = " + (3 * x) % 5 + "калдык");
            System.out.println();
        }
    }
}
