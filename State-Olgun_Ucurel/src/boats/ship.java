
/**
 * This is the main class which is used to demonstrate the STATE Pattern Design. In this program you will find a Ship class.
 * The ship has 3 different states with 4 transitions for each one.
 * The 3 states of the ship are: 1 Fishing Ship, 2 Battle Ship and 3 Cruise Ship.
 * the transitions vary between them and you can take a look at each one within its own State.java. But to give you an example.. 
 * in the fishing state, the ship would drop its anchor where as in the Cruise state it would be 'on the move' and a battle ship would not
 * be carry passengers.
 * 
 * Run the program, and make the state selections which will get each result for you and display it on screen.
 * Hit 0 to terminate the program once you're done.
 * 
 * @author Olgun Ucurel
 *
 */
package boats;
import java.util.Scanner;

public class ship {

    public int stateID = 5;
    public int selectedState = 1;
    public String stateString;


	public InterfaceShip state ;

	public cruisingState CruisingState;
	public  battleState BattleState;
	public  fishingState FishingState;
	
	//public function Ship()
	
	//fishingState = new FishingState(this);
	//battleState = new BattleState(this);
	//cruisingState = new CruisingState(this):
	//toBattleMode();



public void Ship(){
	
	CruisingState = new cruisingState(this);
    BattleState = new battleState(this);
    FishingState = new fishingState(this);
    toBattleMode();
}
	
	
public void toBattleMode()
{
    stateID = 0;
    state = BattleState;

	// somehow applyState();
}

public void toFishingMode()
{
    stateID = 1;
    state = FishingState;
	// somehow applyState();
}

public void toCruisingMode()
{
    stateID = 2;
    state = CruisingState;
    
	// somehow applyState();
}

public void applyState()
{
	
}

public String getCurrentState(){

        switch (stateID)  {
            case 0: stateString = "Battle Mode";
    break;
            case 1: stateString = "Fishing Mode";
    break;
            case 2: stateString = "Cruising Mode";
    break;
        }
    return stateString;
    
}

    public void PrintStatusDetails(){

        //String tempStateHolder =  Ship.getCurrentState();

        System.out.println(" \n Current state: " + getCurrentState() + "\n");
        System.out.println(" Can Move status: " + state.canMove());
        System.out.println(" Can Attack status: " + state.canAttack());
        System.out.println(" Drop Anchor status: " + state.dropAnchor());
        System.out.println(" Carry Passengers status: " + state.carryPassengers() + "\n");
    }

    public void SelectNewState(){


        while (selectedState != 0){

        System.out.println(" Select state you wish to test \n");
        System.out.println(" 1: Battle Mode \n");
        System.out.println(" 2: Fishing Mode \n");
        System.out.println(" 3: Cruising Mode \n");
        System.out.println(" 0: Exit \n");

        Scanner in = new Scanner (System.in);
        selectedState = in.nextInt();

        switch (selectedState){
            case 1: toBattleMode();
                break;
            case 2: toFishingMode();
                break;
            case 3: toCruisingMode();
                break;
            case 0: System.out.println(" Exiting State Pattern Demonstation Program \n");
            	System.exit(0);
            	break;
        }
        if ( (selectedState == 1) || (selectedState == 2) || (selectedState == 3))  {
        PrintStatusDetails();
        }
            else{
            System.out.println(" ERROR: Select 0 - 3 only \n");
            SelectNewState();
        }
        }

    }
    public static void main(String[] args){

        ship Ship = new ship();
        Ship.Ship();


        
        //Ship.getCurrentState();

        Ship.PrintStatusDetails();
        Ship.SelectNewState();

        System.out.println ();

        //Scanner in = new Scanner (System.in);
        //int insertedCoins = in.nextInt();
    }
}