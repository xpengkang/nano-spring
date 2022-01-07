package springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    // 使用线程安全的 ConcurrentHashMap
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    // 注册bean，加入map
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

    // 获取bean
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

}
