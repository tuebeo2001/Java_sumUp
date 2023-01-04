package Lab5;

  public class Student {
     private final String name;
     private final int age;

     private final Address address;

      public Student(String name, int age, Address address) {
          this.name = name;
          this.age = age;
          this.address = address;
      }

      public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

      public Address getAddress() {
          return address;
      }
  }
