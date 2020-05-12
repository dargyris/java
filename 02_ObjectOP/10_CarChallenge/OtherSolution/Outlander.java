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

    public void accelerate(int rate){
        int newVelocity = getItsCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            setItsCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10){
            setItsCurrentGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20){
            setItsCurrentGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30){
            setItsCurrentGear(3);
        } else {
            setItsCurrentGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getItsCurrentDirection());
        }
    }
}
