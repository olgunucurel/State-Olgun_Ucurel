/**
 * 
 */
package boats;

/**
 * @author Olgun
 *
 */
public class battleState implements InterfaceShip{

	private ship Ship;

    public battleState(ship Ship)
    {
        //this.ship = Ship;
        System.out.println ("Hit and move in battle mode");
    }

    public boolean canMove()
    {
        return true;
    }

    public boolean canAttack()
    {
        return true;
    }
    public boolean dropAnchor()
    {
        return false;
    }
    public boolean carryPassengers()
    {
        return false;
    }
}