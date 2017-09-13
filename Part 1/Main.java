import java.util.*;

public class Main {

	public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(25);
                list.add(5);
                list.add(10);
		GumballMachine gumballMachine1 = new GumballMachine(5,25,list);
                GumballMachine gumballMachine2 = new GumballMachine(5,50,list);
                GumballMachine gumballMachine3 = new GumballMachine(5,50,list);
		System.out.println(gumballMachine1);

		gumballMachine1.insertMoney( 25 );
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertMoney( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertMoney( 25 );
		gumballMachine2.turnCrank();
              
		System.out.println(gumballMachine3);
                
                gumballMachine3.insertMoney( 10 );
		gumballMachine3.turnCrank();
                gumballMachine3.insertMoney( 25 );
		gumballMachine3.turnCrank();
                gumballMachine3.insertMoney( 10 );
		gumballMachine3.turnCrank();
                gumballMachine3.insertMoney( 5 );
		gumballMachine3.turnCrank();
	}
}
