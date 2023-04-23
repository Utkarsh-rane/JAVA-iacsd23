package Class;

public class Bank {
    private int accid;
    private double balance;
	private String name;
 
	private static int idcount;
    
    static {
    	idcount=1000;
    }

    
    public Bank(double balance, String name) {
		idcount++;
		this.accid=idcount;
		this.balance = balance;
		this.name = name;
	}
    public int getAccid() {
 		return this.accid;
 	}

	public void display()
    {
    	System.out.println("AccountNo::"+accid+"  Balance::"+balance+
    			"  Name of AccountHolder::"+name);
    }
	public void displayAccount() {
		System.out.println("----Account Details---------");
		System.out.println("ActId=" + accid +" Name:" + name +" Balance=" + balance);

	}
    
    public void withdraw(double amount) 
    {	System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    	balance-=amount;
    	System.out.println("After The Withdraw::\n Withdraw Amount::"+amount+
    			"Your Balance ::"+balance);
         System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");	
    }
    public void deposite(double amount)
    {	System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    	balance+=amount;
    	System.out.println("After The Deposite::\n Deposite Amount::"+amount+
    			"Your Balance ::"+balance);
         System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");	
    }
    
    public void moneytransfer(Bank reciver,double amount)
    {	System.out.println("-*-*-*-*-*-*-*-moneytransfer-*-*-*-*-*-*-*");
    	this.balance-=amount;
    	reciver.balance+=amount;
    	System.out.println("MoneyTranfer is Done. \n MoneyTranfer Amount is"+amount+
    			"\n Your Balance "+balance);
    }
    
    
}
