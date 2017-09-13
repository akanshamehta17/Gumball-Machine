import java.util.*;
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_money;
    private int cost_gumball;
    ArrayList<Integer> coin_list = new ArrayList<Integer>();
    private int total_cost = 0;

    public GumballMachine( int size, int cost_gumball, ArrayList<Integer> list )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_money = false;
        this.cost_gumball = cost_gumball;
        this.coin_list = list;
        this.total_cost = 0;
    }

    public void insertMoney(int coin)
    {     
        if(this.coin_list.contains(coin))
        {
          this.total_cost+=coin;
        if ( this.total_cost == this.cost_gumball )
            this.has_money = true ;
        else 
            this.has_money = false ;
         }
        else
        {
          System.out.println("Invalid Coin");
        }
    }
    public void turnCrank() 
    {
    	if ( this.has_money )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_money = false ;
                        this.total_cost = 0;
    			System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Insufficient Money. Please pay more! Total cost of Gumball is"+" "+this.cost_gumball+" cents." ) ;
    	}        
    }
}
