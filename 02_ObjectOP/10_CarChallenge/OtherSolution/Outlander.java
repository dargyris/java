public class Outlander extends Car {

    private int itsRoadServiceMonths;

    public Outlander( /*String name,*/
                      /*String size,*/
                      
                      /*int wheels,*/
                      /*int doors,*/
                      /*int gears,*/
                      /*boolean manual,*/

                      int roadServiceMonths){

        super("Outlander", "4WD", 
                5, 5, 6, false);

        this.itsRoadServiceMonths = roadServiceMonths;
        
    }
}
