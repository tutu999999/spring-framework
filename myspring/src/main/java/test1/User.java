package test1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class User implements InitializingBean , DisposableBean , BeanFactoryPostProcessor ,
        InstantiationAwareBeanPostProcessor, BeanNameAware, BeanClassLoaderAware {
    private String user;

    public User() {
        log("构造方法");
    }

    @Override
    public void afterPropertiesSet()  {
        log("InitializingBean>>afterPropertiesSet()");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
        log("setUser()");
    }

    public void log(String log){
        System.out.println(">>>>>" + log);
    }

    @Override
    public void destroy() throws Exception {
        log("DisposableBean>>destroy()");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log("BeanFactoryPostProcessor>>postProcessBeanFactory()");
    }

    @Override
    public void setBeanName(String name) {
        log("BeanNameAware>>setBeanName()");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        log("BeanClassLoaderAware>>setBeanClassLoader()");
    }
}
