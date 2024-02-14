import java.time.LocalDate;
import java.util.Arrays;

public class MyClass {
    String firstName;
    String lastName;
    int age;
    String [] myLessons ={"Java","English","Soft skills","Event"};
    String myFavoriteFood;
  LocalDate dateOfBirth;

  /**     1 constructor          */
    public MyClass(){};

/**       2 constructor           */
    public MyClass(String firstName,String lastName,int age , String[]myLessons,String myFavoriteFood){
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
this.myLessons = myLessons;
this.myFavoriteFood = myFavoriteFood;
    }


    /**     3 constructor            */
    public MyClass(String name,String sureName ,int age,LocalDate dateOfBirth ,String[]myLessons,String myFavoriteFood){
        this.firstName = name;
        this.lastName = sureName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.myLessons = myLessons;
        this.myFavoriteFood = myFavoriteFood;
    }


    /**   method 1     */
    public static void getClass1(String firstName,String lastName,LocalDate dateOfBirth,int age){
        System.out.printf("""
                Name :  %s
                Sure name :  %s
                Date of birth :  %s
                Age :  %d
                 \n""",firstName,lastName,dateOfBirth,age);
    }

    /**      method 2        */
    public String getMyClass(String firstName,String lastName,int age , String[]myLessons,String myFavoriteFood){
        return String.format("""
               ------------------------------------------------------------------
               | Name                    :  %s                         |
               | Sure name               :  %s                           |
               | Age                     :  %d                                  |
               | Student lessons         :  %s |
               | Student's favorite food :  %s                         |
               ------------------------------------------------------------------
                  """, firstName, lastName,age, Arrays.toString(myLessons),myFavoriteFood);


    }




    }

