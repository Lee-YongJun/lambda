import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.CONSTRUCTOR})
public @interface SampleAnnotation {

}
@Documented
@Retention(RetentionPolicy.CLASS)
@interface SampleAnnotation1{

}
@Retention(RetentionPolicy.RUNTIME)
@interface SampleAnnotation2{
}
@Documented
@Retention(RetentionPolicy.CLASS)
@Repeatable(AutowiredElement.class)
@interface Autowired{
    String [] value() default  "service";
    String name() default "";
}
@Documented
@Retention(RetentionPolicy.CLASS)
@interface AutowiredElement{
    Autowired [] value() ;
}
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@interface Transactional{
    String value() default  "";
    boolean ReadOnly() default false;
}
