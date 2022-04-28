package test1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean<User> {
	private static Logger logger = LoggerFactory.getLogger(MyFactoryBean.class);

	@Override
	public User getObject() throws Exception {
		User user = new User();
		user.setUser("zzz");
		return user;
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
