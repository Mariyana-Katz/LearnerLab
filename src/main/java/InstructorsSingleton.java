public class InstructorsSingleton extends People{
    final static InstructorsSingleton instance = new InstructorsSingleton();
    private InstructorsSingleton(){
        super();
        personList.add(new Person(2L, "Ben"));
        personList.add(new Person(4L, "Men"));
    }

    public static InstructorsSingleton getInstance(){
        return instance;
    }
}
