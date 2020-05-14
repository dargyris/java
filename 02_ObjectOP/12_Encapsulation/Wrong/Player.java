public class Player {

    public String itsName;
    public int itsHealth;
    public String itsWeapon;

    public void loseHealth(int damage){
        this.itsHealth -= damage;
        if(this.itsHealth <= 0){
            System.out.println( "Player knocked out." );
            // Reduce number of lives remaining for the player.
        }
    }

    public int healthRemaining(){
        return this.itsHealth;
    }
}
