//Normal emun
enum Subject{
    IoT, AdvaceJava, Python, CloudComputer;
}

//Main class
public class EnumsDemo {
    public static void main(String[] args) {
        //For loop which prints enum member
        for(Subject sub : Subject.values()){
            System.out.println(sub);
        }
    }
}
