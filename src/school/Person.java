
package school;
import java.util.ArrayList;
public class Person {
    
//    public static int numPeople = 10;
//    private static int currentPeopleIndex = 0;
//    private static Person people[] = new Person [numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    enum Gender 
    {
        Male, Female
    }
    
    private Gender gender;
    private String name;
    private int weight;
    
    Person()
    {
        gender = Gender.Male;
        name = "John Doe";
        weight = 180;
    }
    
    Person(String _name, Gender _gender, int _weight)
    {
        gender = _gender;
        name = _name;
        weight = _weight;
    }
    
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp = new Person (_name, _gender, _weight);
//        people[currentPeopleIndex++] = temp;
        people.add(temp);
        return(temp);
    }
     
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    
    public int getWeight()
    {
        return(weight);
    }
    
    public void setName(String _name)
    {
        name = _name;
    }
    
    public String getName()
    {
        return(name);
    }
    
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    
    public Gender getGender()
    {
        return(gender);
    }
    
     public static void printNames()
    {
        System.out.println("=======PrintNames=======");
//        for(int index = 0; index < people.length ;index++)
//        {
//            if(people[index] != null)
//                System.out.println(people[index].getName());
//            
//        }
//         for(int index = 0; index < people.size() ;index++)
//        {
////            if(people[index] != null)
////                System.out.println(people[index].getName());
//                System.out.println(people.get(index).getName());
//        }
        for(Person temp: people)
        {
            System.out.println(temp.getName());
        }   
    }
    public static void printNames(Gender _gender)
    {
        System.out.println("=======PrintNames=======");
            for(Person temp: people)
            {
                if(temp.gender == Gender.Male)
                    System.out.println(temp.getName());
            }
    }
    
     public String toString()
     {
         return(name + "  " + gender + "  " + weight);
     }
}
