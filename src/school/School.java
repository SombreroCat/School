
package school;

public class School {

    public static void main(String[] args) {
        Person joe = Person.addPerson("Joe", Person.Gender.Male,120);
        System.out.println(joe.getWeight());
        Person tom = Person.addPerson("Tom", Person.Gender.Male,180);
        tom.setName("Tim");
        Person mike = Person.addPerson("Mike", Person.Gender.Male,220);
        Person steph = Person.addPerson("Stephanie", Person.Gender.Female,220);
        Person.printNames();
        
        Person.printNames(Person.Gender.Male);
        
        System.out.println(joe);
        
    }
}
