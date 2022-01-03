@SampleAnnotation
@SampleAnnotation1
@SampleAnnotation2
public class annotationTest {
    public static void main(String[] args) {

    }
    @Autowired(value ={"repository","service"},name ="test")
    @Transactional(ReadOnly = true)
    public void test() {}
}
