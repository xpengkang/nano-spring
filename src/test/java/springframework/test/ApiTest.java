package springframework.test;

import org.junit.Test;
import springframework.factory.config.BeanDefinition;
import springframework.factory.BeanFactory;
import springframework.factory.support.DefaultListableBeanFactory;
import springframework.test.bean.UserService;

public class ApiTest {
//    public static void main(String[] args) {
//        System.out.println("test");
//    }
    @Test
    public void test_BeanFactory(){
//        // 1.初始化 BeanFactory
//        BeanFactory beanFactory = new BeanFactory();
//
//        // 2.注册 bean
//        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//
//        // 3.获取 bean
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfo();


        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3 bean获取和调用。测试验证单例对象的是否正确的存放到了缓存中
        UserService userService = (UserService) beanFactory.getBean("userService", "xpengkang");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }


}
