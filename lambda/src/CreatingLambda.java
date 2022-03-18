public class CreatingLambda {
    interface Greeting
    {
        public String sayHello(String str);
    }

    public void testGreeting(String str, Greeting greeting)
    {
        String result = greeting.sayHello(str);

        System.out.println("result:"+result);
    }

    public static void main(String[] args) {

        // input
        // (String s) -> "Harry",+str
        new CreatingLambda().testGreeting("Harry",(String str) -> "HELLO, "+str);
        new CreatingLambda().testGreeting("Miss Pingu",(String str) -> "HELLO, "+str);

        new CreatingLambda().testGreeting("",(String str) -> !str.isEmpty()? "Howdy, "+str:"Did you miss something");
        new CreatingLambda().testGreeting("shubham",(String str) -> !str.isEmpty()? "Howdy, "+str:"Did you miss something");
    }

}

