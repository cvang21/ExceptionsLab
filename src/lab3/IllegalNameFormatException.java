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
public class IllegalNameFormatException extends IllegalArgumentException{
    private static final String msg = "Only First and Last Name allowed, both required";

    public IllegalNameFormatException() {
        super(msg);
    }

    public IllegalNameFormatException(String s) {
        super(msg);
    }

    public IllegalNameFormatException(String message, Throwable cause) {
        super(msg, cause);
    }

    public IllegalNameFormatException(Throwable cause) {
        super(cause);
    }
    
    
    
}
