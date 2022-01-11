package springframework.factory;

import springframework.BeansException;
import springframework.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface  BeanFactory {
    // 使用线程安全的 ConcurrentHashMap
//    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
//
//    // 注册bean，加入map
//    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
//        beanDefinitionMap.put(name, beanDefinition);
//    }
//
//    // 获取bean
//    public Object getBean(String name) {
//        return beanDefinitionMap.get(name).getBean();
//    }

    Object getBean(String name) throws BeansException;


    // 加一个
    Object getBean(String name, Object... args) throws BeansException;


}
