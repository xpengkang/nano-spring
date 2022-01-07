package springframework;

public class BeanDefinition {
    public static void main(String[] args) {
//        System.out.println("test bean name");
    }

    private Object bean; // 私有bean


    public BeanDefinition(Object bean) {
        this.bean = bean;
    }



    public Object getBean() {
        return bean;
    }
}
