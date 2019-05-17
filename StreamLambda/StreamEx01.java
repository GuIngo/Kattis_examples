package StreamLambda;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class StreamEx01{
  public static void main(String[]args){
    List<Person> people = Arrays.asList(
      new Person("Anton", "Lyngfelt",23),
      new Person("Erik", "Oscarsson",45),
      new Person("Carl","Davidsson",15)
      );

    System.out.println("\nSort reverse by age:");
    Comparator<Person> compAge = (aName, bName) ->
        aName.getAge().compareTo(bName.getAge());
    
    Comparator<Person> compFirstName = (aName, bName) ->
        aName.getFirstName().compareTo(bName.getFirstName());
    
    
    //Make a stream, sort by age
    people.stream()
        .sorted(compAge.reversed())
        .forEach(System.out::println);
    
    System.out.println("\nSort reverse by first name:");
    //Make a stream, sort by name
    people.stream()
        .sorted(compFirstName.reversed())
        .forEach(System.out::println);
    
    System.out.println("WAAAH");
  }
}
