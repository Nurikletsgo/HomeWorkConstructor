import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*MyClass деген класс тузунуз

Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз,
 Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)

Параметри эки башка болгон эки конструктор тузунуз

MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз

Эки объектке эки башка конструктор иштесин.

Объекттердин маанилерин консольго чыгарыныз.*/

 /**             1   with method ( void )            **/

MyClass myClass1 = new MyClass();
myClass1.firstName = "Nurmukhamed";
myClass1.lastName = "Akimbekov";
myClass1.dateOfBirth = LocalDate.of(1999,8,28);
myClass1.age = 24;
MyClass.getClass1(myClass1.firstName, myClass1.lastName,LocalDate.of(1999,8,28), myClass1.age);



      /**              2  with method  ( return )            **/

MyClass myClass2 = new MyClass("Nurmukhamed","Akimbekov",24, myClass1.myLessons, "Besh barmak");
System.out.println(myClass2.getMyClass(myClass2.firstName, myClass2.lastName, myClass2.age, myClass2.myLessons, myClass2.myFavoriteFood));


    /**               3  without method                  **/

MyClass myClass3 = new MyClass("Nurmukhamed","Akimbekov",24,LocalDate.of(1999,8,28), myClass1.myLessons, "Besh barmak");
        System.out.printf("___________________________________________________________"+"\n"+
                "First name       :   "+myClass3.firstName+"\n"+
                "Sure name        :   "+myClass3.lastName+"\n"+
                "Age              :   "+myClass3.age+"\n"+
                "Date of bith     :   "+LocalDate.of(1999,8,28)+"\n"+
                "My lessons       :   "+Arrays.toString(myClass3.myLessons)+"\n"+
                "My favorite food :   "+myClass3.myFavoriteFood+"\n"+
                "___________________________________________________________");
    }
}