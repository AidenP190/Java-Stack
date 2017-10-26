/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;
/**
 *
 * @author aparsons
 */
public class StackProject {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        myStack myStack = new myStack();
        
        myStack.push("Hello");
        myStack.push(1);
        myStack.push(2.0);
       
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
    
}