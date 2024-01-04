//Method Annotation

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

public class MethodAnnotation {

    @MyAnno(str = "Declared for method", val =10)
    public static void MyMethod(){
        try{
            MethodAnnotation ob = new MethodAnnotation();
            Class c = ob.getClass();
            Method m = c.getMethod("MyMethod");
            MyAnno myAnnotation = m.getAnnotation(MyAnno.class);
            System.out.println(myAnnotation.str()+" & "+myAnnotation.val());

            //Single line
            MyAnno myAnnotation1 = new MethodAnnotation().getClass().getMethod("MyMethod").getAnnotation(MyAnno.class);
            System.out.println("\nValue feched in single line:\n"+myAnnotation1.str()+" & "+myAnnotation1.val());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        MyMethod();
    }    
}
