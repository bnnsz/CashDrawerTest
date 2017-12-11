/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cashdrawertest;

/**
 *
 * @author ObinnaAsuzu
 */
public class Command {
    private final String name;
    private final byte[] code;

    public Command(String name, byte[] code) {
        this.name = name;
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the code
     */
    public byte[] getCode() {
        return code;
    }
    

}
