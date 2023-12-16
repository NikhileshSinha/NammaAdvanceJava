package EnumsDemo;
//Ordinal and Compare methods in ENUMERATE

enum MobileComany{
    Redmi, Realme, Sony, Google, iPhone, iQOO;
}

public class EnumDemo3 {
    public static void main(String[] args) {
        for(MobileComany mc: MobileComany.values()){
            System.out.println((mc.ordinal()+1)+". "+mc);
        }
        MobileComany mc1 = MobileComany.Realme;
        MobileComany mc2 = MobileComany.Sony;
        MobileComany mc3 = MobileComany.Redmi;
        MobileComany mc4 = MobileComany.Google;
        MobileComany mc5 = MobileComany.iPhone;
        MobileComany mc6 = MobileComany.iQOO;

        for(MobileComany mc: MobileComany.values()){
            if(mc.equals(mc1))
                System.out.println("mc1 is: "+mc);
            if(mc.equals(mc2))
                System.out.println("mc2 is: "+mc);
            if(mc.equals(mc3))
                System.out.println("mc3 is: "+mc);
            if(mc.equals(mc4))
                System.out.println("mc4 is: "+mc);
            if(mc.equals(mc5))
                System.out.println("mc5 is: "+mc);
            if(mc.equals(mc6))
                System.out.println("mc6 is: "+mc);
        }
    }    
}
