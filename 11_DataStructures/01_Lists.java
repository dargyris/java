import java.util.List;
import java.util.ArrayList;

class Employee{

    private String firstName;
    private String lastName;
    private int id;

    // ============== Constructor =============

    public Employee ( 
            String firstName, 
            String lastName, 
            int id ){

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    // =============== Getters ===============

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getId(){
        return this.id;
    }


    // =============== Setters ===============

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setId(int d){
        this.id = d;
    }

    @Override
    public String toString (){
        return "Employee{" + 
            "firstName = '" + firstName + "\'" + 
            ", lastName = '" + lastName + "\'" + 
            ", id = " + id + 
            "}";
    }
}

    class Lists{


    public static void main ( String[] args ){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add( new Employee( "Jane", "Jones", 123 ) );
        employeeList.add( new Employee( "Jone", "Doe", 4567 ) );
        employeeList.add( new Employee( "Mary", "Smith", 22 ) );
        employeeList.add( new Employee( "Mike", "Wilson", 3245 ) );

        employeeList.forEach( employee -> System.out.println( employee ) );

        System.out.println();
        System.out.println( employeeList.get(1) );
        System.out.println( "Is List empty? " + employeeList.isEmpty() );
        System.out.println();

        employeeList.set(1, new Employee( "John", "Adams", 4568 ));
        employeeList.forEach( employee -> System.out.println( employee ) );
        System.out.println();

        System.out.println( "Size: " + employeeList.size() );
        System.out.println();

        employeeList.add( 3, new Employee( "John", "Doe", 4567 ) );
        employeeList.forEach( employee -> System.out.println( employee ) );
        System.out.println();

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for ( Employee employee: employeeArray ){
            System.out.println( employee );
        }


    }
}
