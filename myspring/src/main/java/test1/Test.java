package test1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test {
	private static Logger logger = LoggerFactory.getLogger(Test.class);
	public static void main(String[] args) {
		logger.info("user dao");
		AnnotationConfigApplicationContext ac=new
                AnnotationConfigApplicationContext(AnnotationConfig.class);
        UserDao userDao = ac.getBean(UserDao.class);
        userDao.printInfo();
    }
}