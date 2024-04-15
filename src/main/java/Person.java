public class Person {
//    The class should declare a final field named id of type long.
//    The class should declare a field named name of type String.
//    Person constructor should have a parameter of type long and String which sets the id and name field to the respective values.
//    The class should define a getId() method which returns the Person object's id field.
//    The class should define a getName() method which returns the Person object's name field.
//    The class should define a setName() method which sets the Person object's name field

     final Long id;
     String name;


    public Person(Long id, String name) {

        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
