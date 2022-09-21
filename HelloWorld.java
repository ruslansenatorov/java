public class HelloWorld {
    public static void main(String[] args){
        String name;
        if (args.length == 0){
            name = "Senatorov";
            System.out.println(args.length + " " + name);
        } else {
            System.out.println("Hi, world! " + args[0]);
        }
    }
}
