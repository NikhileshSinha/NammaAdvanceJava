//Constructor emun
enum SubjectCredit{
    AdvanceJava(3), IoT(3), Python(3), CloudComputer(3), IoTLab, PythonLab;
    private final int credit;
    SubjectCredit(int credit){
        this.credit = credit;
    }
    SubjectCredit(){
        this.credit = 2;
    }
    int getCredit(){return credit;}
}

//Main class
public class EnumDemo2 {
    public static void main(String[] args) {
        //For loop which prints Credits too
        for(SubjectCredit sub : SubjectCredit.values()){
            System.out.println(sub+" : "+sub.getCredit());
        }
    }
}
