import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getCat());
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean1.getCat());

        System.out.println(bean.equals(bean1));
        System.out.println(catBean.equals(catBean1));
    }
}

/*
Класс App содержит метод main, который запускает Спринг при создании контекста. В контекст мы передаем класс AppConfig,
который помечен аннотацией @Configuration - так Спринг понимает, что это настроечный класс.

В методе main мы можем получить бин HelloWorld по имени и использовать в любом месте программы.
Спринг позволяет использовать различные типы бинов, одни будут жить от старта до завершения программы, другие будут
создаваться при каждом запросе или открытии новой сессии, третьи при каждом вызове будут создаваться новые. За это
отвечает аннотация @Scope.
 */