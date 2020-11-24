import com.hello.pojo.Books;
import com.hello.service.BooksService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksService = (BooksService) context.getBean("BooksServiceImpl");
        for (Books queryAllBook : booksService.queryAllBooks()) {
            System.out.println(queryAllBook);
        }
    }
}
