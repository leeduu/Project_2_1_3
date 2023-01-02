public class Cat {
    String name;
    String breed;
    int age;

    public void setCat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getCat() {
        return name + ", " + breed + ", " + age;
    }

}

/*
public class Employee {
   String name;
   public String id;
   private double salary;
   public Employee(String name, String id,double salary) {
      this.name = name;
      this.id = id;
      this.salary = salary;
   }
   public String getName() {
      return name;
   }
   public String getId() {
      return id;
   }
   public Double getSalary() {
      return salary;
   }
}
 */
