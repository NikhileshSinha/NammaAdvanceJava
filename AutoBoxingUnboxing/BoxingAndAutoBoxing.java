package AutoBoxingUnboxing;
public class BoxingAndAutoBoxing {
    public static void main(String[] args) {
        Integer iob = 100;
        Float fob = 98.8f;
        System.out.println(iob+fob);
        iob = 2;
        switch (iob) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        
            default:
                break;
        }
    }
}
