import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(25);
                list.add(5);
                list.add(10);
                GumballMachine gumballMachine = new GumballMachine(2004,5,25,list);
                GumballMachine gumballMachine1 = new GumballMachine(2005,1,50,list);
                GumballMachine gumballMachine2 = new GumballMachine(2006,2,50,list);

		System.out.println(gumballMachine);

		gumballMachine.insertMoney(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertMoney(25);
		gumballMachine.turnCrank();
                
                System.out.println(gumballMachine);
                
                System.out.println(gumballMachine1);
		
                gumballMachine1.insertMoney(25);
		gumballMachine1.turnCrank();
                
                System.out.println(gumballMachine1);
                
                gumballMachine1.insertMoney(25);
		gumballMachine1.turnCrank();
                
                System.out.println(gumballMachine1);
                
                System.out.println(gumballMachine2);
                
                gumballMachine2.insertMoney(25);
		gumballMachine2.turnCrank();

                System.out.println(gumballMachine2);
               
                gumballMachine2.insertMoney(10);
		gumballMachine2.turnCrank();

                System.out.println(gumballMachine2);

                gumballMachine2.insertMoney(10);
		gumballMachine2.turnCrank();

                System.out.println(gumballMachine2);
                 
                gumballMachine2.insertMoney(5);
		gumballMachine2.turnCrank();
 
		System.out.println(gumballMachine2);
            
	}
}
