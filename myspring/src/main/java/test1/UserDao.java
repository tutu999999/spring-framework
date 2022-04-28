package test1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class UserDao implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean, BeanPostProcessor {
	private static Logger logger = LoggerFactory.getLogger(UserDao.class);

	private String a;

	public UserDao() {
		logger.info("userDao{}", "构造方法");
	}

	@Autowired
	OrderDao orderDao;

	@Async
	public void printInfo(){
        System.out.println("user dao");
    }


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		logger.info("userDao{}", "setBeanFactory");
	}

	@Override
	public void setBeanName(String name) {
		logger.info("userDao{}", "setBeanName");
	}

	@Override
	public void destroy() throws Exception {

	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		logger.info("userDao{}", "execute set");
		this.a = a;
	}
}