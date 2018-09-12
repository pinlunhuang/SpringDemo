import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ResourceServlet;

public class SpringDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"SpringDemo-config.xml"});
        BeanFactory factory = context;

        HelloBean helloBean = (HelloBean) factory.getBean("HelloBean");
        System.out.println(helloBean.getHelloWord());
    }

}
