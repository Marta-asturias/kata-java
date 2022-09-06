package com.kata;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       Weird weird = new Weird();
       String numb = weird.Print(8);
       System.out.println(numb);

        
    }
}
