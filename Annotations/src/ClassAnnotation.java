//class Annotation

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

@MyAnno(str = "String of some thing", val =20)
public class ClassAnnotation {


    public static void main(String[] args) {
        try{
            ClassAnnotation ob = new ClassAnnotation();
            MyAnno myAnnotation = ob.getClass().getAnnotation(MyAnno.class);
            //AnnotationInterfaceName objectName = classObject.getClass().getAnnotation(AnnotationName.class);

            System.out.println(myAnnotation.str()+" & "+myAnnotation.val());

            //Single line
            MyAnno myAnnotation1 = new ClassAnnotation().getClass().getAnnotation(MyAnno.class);
            System.out.println("\nValue feched in single line:\n"+myAnnotation1.str()+" & "+myAnnotation1.val());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
