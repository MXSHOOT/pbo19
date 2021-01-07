import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation; 
import java.lang.annotation.RetentionPolicy; 

@interface test{
    int angka();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TestAnnotation 
{ 
    String nama() default "Nurul";  
    int nilai(); 
} // will be retained at runtime 

public class Kucing implements Hewan {
    
    @test(angka=90)
    @Override
    public String suaraHewan() {
        return "meaawww";
    }

    @TestAnnotation(nama="Fikri", nilai=90)
    @Override
    public String jenisMakanan() {
        return "Daging";
    }
}