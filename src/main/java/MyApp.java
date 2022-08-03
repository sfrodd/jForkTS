public class MyApp {

    public static void main(String args[]){
        Adder a=new Adder();
        DBConnector dbc=new DBConnector();
        dbc.connectDB();
        System.out.println("Result of adding :"+a.add(5,7));
        System.out.println("Hello World");
    }
}
