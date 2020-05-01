// Lesson 6/2: Behind the scenes file creation
// by intellij for java.
//
public class Car{   // public: Access modifier. Also:
                    // private: No other class can access
                    // protected: Classes from this package can access
                    // -

    // State of the Car
    private int doors;      // Field doors
    private int wheels;     // Field wheels
    private String model;   // Field model
    private String engine;  // Field engine
    private String color;   // Field color
    
    // Behavior of the car: Access to its state.
    public void setModel ( String model ){
        String validModel = model.toLowerCase();
        if ( validModel.equals( "carrera" ) || validModel.equals( "commodore" ) ){ 
            this.model = model.toLowerCase(); } 
        else { 
            this.model = "Unknown";
        }
    }

    public String getModel (){
        return this.model;
    }
}
