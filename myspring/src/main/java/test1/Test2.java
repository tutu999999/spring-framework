package test1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test2 {
	private static Logger logger = LoggerFactory.getLogger(Test2.class);
	public static void main(String[] args) throws Exception {
		logger.info("user dao");
		AnnotationConfigApplicationContext ac = new
                AnnotationConfigApplicationContext(AnnotationConfig.class);
        MyService myService = ac.getBean("myService", MyService.class);
        myService.async();

    }
}