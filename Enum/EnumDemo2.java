//Constructor emun
enum SubjectMarks{
    AdvanceJava(59), IoT(67), Python(90), CloudComputer(99);
    private final int marks;
    SubjectMarks(int i){
        marks=i;
    }
    int getMarks(){return marks;}
}

//Main class
public class EnumsDemo2 {
    public static void main(String[] args) {
        //For loop which prints marks too
        for(SubjectMarks sub : SubjectMarks.values()){
            System.out.println(sub.getMarks());
        }
    }
}
