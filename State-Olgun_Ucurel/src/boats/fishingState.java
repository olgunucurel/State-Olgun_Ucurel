/**
 * 
 */
package boats;

/**
 * @author Olgun Ucurel
 *
 */
public class fishingState implements InterfaceShip{

	private ship Ship;

    public fishingState(ship Ship)
    {
        this.Ship = Ship;
        System.out.println ("Silent operation in fishing mode");
    }

    public boolean  canMove()
    {
        return false;
    }
    public boolean  canAttack()
    {
        return false;
    }
    public boolean  dropAnchor()
        {
        return true;
        }
    public boolean  carryPassengers()
    {
        return true;
    }
}