/**
 * 
 */
package boats;

/**
 * @author Olgun
 *
 */
public class cruisingState implements InterfaceShip {

	private ship Ship;

    public cruisingState(ship Ship)
    {
        this.Ship = Ship;
        System.out.println("Smooth sailing in cruising mode");
    }
    @Override
    public boolean canMove()
    {
        return true;
    }
    @Override
    public boolean canAttack()
    {
        return false;
    }
    @Override
    public boolean dropAnchor()
    {
        return false;
    }
    @Override
    public boolean carryPassengers()
    {
        return true;
    }
}