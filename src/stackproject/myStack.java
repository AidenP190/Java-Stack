package stackproject;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aparsons
 */
public class myStack<T> {
    public ArrayList<T> Inputs = new ArrayList<>();
    private int counter = 0;
    
    public void push(T Stack)
    {
        Inputs.add(Stack);
    }
    public T pop()
    {
        return Inputs.get(counter++);
    }
}
