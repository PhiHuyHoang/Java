/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtery;

/**
 *
 * @author hallgato
 */
public class NotSameAquariumException extends Exception {

    /**
     * Creates a new instance of <code>NotSameAquariumException</code> without
     * detail message.
     */
    public NotSameAquariumException() {
    }

    /**
     * Constructs an instance of <code>NotSameAquariumException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotSameAquariumException(String msg) {
        super(msg);
    }
}
