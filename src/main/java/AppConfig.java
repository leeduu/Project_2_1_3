import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setCat("Barsik", "British Shorthair", 9);
        return cat;
    }

    /*
    public class Employee implements java.io.Serializable {
   private int id;
   private String name;
   public Employee(){}
   public void setId(int id){this.id=id;}
   public int getId(){return id;}
   public void setName(String name){this.name=name;}
   public String getName(){return name;}
}
     */
}

/*
В классе AppConfig содержится метод, помеченный аннотацией как бин, этот метод будет выполнен при запуске и его
результат станет объектом, управляемым Спрингом.
 */