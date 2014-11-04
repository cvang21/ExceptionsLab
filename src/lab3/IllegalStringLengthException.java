/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author cvadmin
 */
public class IllegalStringLengthException extends IllegalArgumentException{
    private static final String msg = "Input length invalid";

    public IllegalStringLengthException() {
        super(msg);
    }

    public IllegalStringLengthException(String s) {
        super(msg);
    }

    public IllegalStringLengthException(String message, Throwable cause) {
        super(msg, cause);
    }

    public IllegalStringLengthException(Throwable cause) {
        super(cause);
    }
    
    
    
}
