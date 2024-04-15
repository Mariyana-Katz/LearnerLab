import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List <Person> personList = new ArrayList<>();

    public void add(Person p){
        this.personList.add(p);

    }
    public Person findById(Long id){
        for(Person p:personList){
                if(p.getId().equals(id)){
                    return p;
                }
        }
        return null;
    }

    public boolean contains(Person person){
       return this.personList.contains(person);

    }

    public void remove(Person person){
        this.personList.remove(person);
    }

    public void remove(Long id){
        this.personList.remove(id);
    }

    public void removeAll(){
        this.personList.clear();
    }

    public int count(){
        return this.personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);

    }


    @Override
    public Iterator<Person> iterator() {
        return this.personList.iterator();
    }
}
