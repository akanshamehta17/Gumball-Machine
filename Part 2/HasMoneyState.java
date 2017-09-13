

import java.util.Random;

public class HasMoneyState implements State {
	GumballMachine gumballMachine;
 
	public HasMoneyState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertMoney() {
		System.out.println("You can't insert more money");
	}
 
	public void ejectMoney() {
		System.out.println("Money returned");
		gumballMachine.setState(gumballMachine.getNoMoneyState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
