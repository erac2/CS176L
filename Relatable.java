/**
 * Add this interface as Relatable.java to lab9.interfaces.
 *
 * Use to compare Triangle objects by area.
 * 
 * @author J. Chung
 * @version Spring 2021
 */

package lab9.interfaces;

public interface Relatable
{
	public abstract boolean equals(Triangle o);
	public abstract boolean lessThan(Triangle o);
	public abstract boolean greaterThan(Triangle o);
	
}

