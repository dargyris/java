public class Player {

    protected String itsName;
    protected int itsHealth = 100;
    protected String itsWeapon;

    // ============== Constructors ===========



    // =========== Setter Constructor ========

    public Player( String name,
                   int health,
                   String weapon){
        
    	this.itsName = name;
        if(itsHealth > 0 && itsHealth <= 100){
    	    this.itsHealth = health;
        }
    	this.itsWeapon = weapon;

    }

    // =======================================

    public void loseHealth(int damage){
        this.itsHealth -= damage;
        if(this.itsHealth <= 0){
            System.out.println( "Player knocked out." );
        }
    }

    public int getItsHealth(){
        return this.itsHealth;
    }

}
