public final class StudentSingleton extends People {

    final static StudentSingleton instance = new StudentSingleton();
     private StudentSingleton(){
         super();
         personList.add(new Person(2L, "Ben"));
         personList.add(new Person(4L, "Men"));
     }

     public static StudentSingleton getInstance(){
         return instance;
     }



}
