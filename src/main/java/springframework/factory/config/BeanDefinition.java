package springframework.factory.config;

@SuppressWarnings({"rawtypes"})
public class BeanDefinition {
//    public static void main(String[] args) {
////        System.out.println("test bean name");
//    }

//    private Object bean; // 私有bean
    //    public BeanDefinition(Object bean) {
//        this.bean = bean;
//    }
//    public Object getBean() {
//        return bean;
//    }

    // 把Object 替换为Class
    // 这样就可以把 Bean 的实例化操作放到容器中处理了
    private Class beanClass;
    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
