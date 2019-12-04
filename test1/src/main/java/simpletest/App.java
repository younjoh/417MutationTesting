package simpletest;

/**
 * Hello world!
 */
public final class App {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public String hello(String t){
        return t;
    }

    public String EvenOrOdd(int temp){
        if(temp%2==0){
            return "even";
        }
        return "odd";
    }
}
