import java.util.*;

public class GumballMachine {
 
	State soldOutState;
	State noMoneyState;
	State hasMoneyState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
        int cost_gumball;
        int total_cost = 0;
        int gumball_model; 
        ArrayList<Integer> coin_list = new ArrayList<Integer>();
 
	public GumballMachine(int model, int numberGumballs, int cost_gumball, ArrayList<Integer> list) {
		soldOutState = new SoldOutState(this);
		noMoneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
                this.cost_gumball = cost_gumball;
                this.coin_list = list;
                this.gumball_model = model;
 		if (numberGumballs > 0) {
			state = noMoneyState;
		} 
	}
 
	public void insertMoney(int coin) {
	       if(this.coin_list.contains(coin)){
                 total_cost+= coin;
                 if(total_cost==cost_gumball)	
                    state.insertMoney();
                }
                else
                 System.out.println("Invalid Coin");    
	}
 
	public void ejectMoney() {
		state.ejectMoney();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
                this.total_cost = 0;
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noMoneyState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
      		//result.append("\nJava-enabled Standing Gumball Model #2004"); 
                result.append("\nJava-enabled Standing Gumball Model #" + gumball_model);
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
