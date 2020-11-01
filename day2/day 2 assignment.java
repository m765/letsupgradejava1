// Questions 1:
// Create a class employee. Inside that class create three variable name,age,city. Also create a function to
// display the three variables. In the main function create two objects and call the function using it.
// Output:
// The name is Saurab
// The age is 23
// The city is chennai

//---------------------------------------------------------------------------------------------------------------------

package employee;

public class employee {
    
    String name, city;
    int age;
    
    public void display() {
        
        System.out.println("The Name is : " +name);
        System.out.println("The Age is : " +age);
        System.out.println("The City is : " +city);
        
    }
    
    public static void main(String[] args) {
        
        employee emp1 = new employee();
        emp1.name = "Vijay";
        emp1.age = 46;
        emp1.city = "Chennai";
        
        employee emp2 = new employee();
        emp2.name = "Suresh";
        emp2.age = 21;
        emp2.city = "Chennai";
        
        System.out.println("--- Employee Details ---");
        emp1.display();
        emp2.display();
        
    }
    
}