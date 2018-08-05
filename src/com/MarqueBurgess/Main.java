package com.MarqueBurgess;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

    private static void showpeek(Stack<Object> st) { // top of stack
        Object a = st.peek();
        System.out.println(a);
        System.out.println("This car was at the top of the list: " + st + "\n");
    }

    private static void showpush(Stack<Object> stack, Object x) { // add to stack
        stack.push(x);
        System.out.println("The following car has been entered (" + x + "\n)");
        System.out.println("The show contains: \n" + stack + "\n");
    }

    private static void showpop(Stack<Object> st) { // remove from stack
        System.out.print("The following car has dropped out.....pop -> ");
        Object a = st.pop();
        System.out.println(a);
        System.out.println("The show now contains: " + st + "\n");
    }

    public static void main(String[] args) throws MalformedURLException {

	    // stack for car show
        Stack<Object> CarShow = new Stack<>();

        // cars in the car show -- objects will be added to stack
        ShowCar Defender = new ShowCar("Land Rover","Defender",1985,"2.5 Turbo Diesel",
                new URL("https://classiccars.com/listings/view/1111906/1985-land-rover-defender-for-sale-in-middleburg-florida-32068"));
        ShowCar Imperial = new ShowCar("Chrysler","Imperial",1958,"Original HEMI",
                new URL("https://classiccars.com/listings/view/1111611/1958-chrysler-imperial-south-hampton-for-sale-in-sacramento-california-95816"));
        ShowCar Porsche = new ShowCar("Porsche","928s",1989,"5.0L V8 ENGINE",
                new URL("https://classiccars.com/listings/view/1034768/1989-porsche-928s-for-sale-in-mission-viejo-california-92691"));
        ShowCar Camaro = new ShowCar("Chevy","Camaro RS/SS",1969,"L35 396 big block engine",
                new URL("https://classiccars.com/listings/view/1113948/1969-chevrolet-camaro-rs-ss-for-sale-in-east-longmeadow-massachusetts-01028"));

        System.out.println("Cars in the show: " + CarShow + "\n");
        showpush(CarShow,Defender.toString()); // added to stack
        showpush(CarShow,Imperial.toString());
        showpush(CarShow,Porsche.toString());
        showpush(CarShow,Camaro.toString());
        showpop(CarShow); //
        showpop(CarShow);
        showpeek(CarShow);
        showpop(CarShow);
        showpop(CarShow);


        try {
            showpop(CarShow);
        } catch (EmptyStackException e) { // if stack is empty
            System.out.println("empty stack");
        }
    }

}
