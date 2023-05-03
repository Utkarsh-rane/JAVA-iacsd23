package tester;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;

import cust_exception.InvalidCustomerException;
import utils.CustomerValidationRule;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			List<Customer> cust =new ArrayList<>()  ;
		
			boolean exit = false;
			System.out.println("-----Service plans for Customer-------- ");
			ServicePlan[] sep=ServicePlan.values();
			for(ServicePlan sp: sep)
			{
				System.out.println(sp);
			}
			System.out.println("-----------------------------------------");
			
			System.out.println("-------Options for Customer--------------");
			System.out.println("1.sign up\n2.sign in \n3.update pasword \n4.unsubscribe user \n5.Display All customer \n 0.exit");

			
			while (!exit) {
				try {
					System.out.println("enter choice");
					switch (sc.nextInt()) {
					case 1:
				
							System.out.println(
									"enter  firstname,  lastname,  email,  passwd,  regAmt ,dob (yyyy-MM-dd),plan_name");
							Customer customer = CustomerValidationRule.ValidateAll(sc.next(), sc.next(), sc.next(),
									sc.next(), sc.nextDouble(), sc.next(), sc.next(), cust);
							cust.add(customer);
							System.out.println("sucessfully registered!!!!!!!!!!!");
						
						break;
					case 2:
						System.out.println("enter email and enter password ");
						Customer cd=new Customer(sc.next(),sc.next());
						//Customer cgmail=new Customer(sc.next());
						
                        int index= cust.indexOf(cd);
                        if(index==-1)
                        {
                        	throw new InvalidCustomerException("invalid email and password");
                        }
                       System.out.println(cust.get(index));
						break;
					case 3:
						System.out.println("enter email and enter password ");
						 cd=new Customer(sc.next(),sc.next());

					      index=cust.indexOf(cd);
					      if(index==-1)
	                        {
	                        	throw new InvalidCustomerException("invalid email and password");
	                        }
					      
					      System.out.println("enter new password");
					      cust.get(index).setPasswd(sc.next());
						System.out.println("new password set sucessful");
						break;
					case 4:
						System.out.println("enter email and enter password ");
						cd=new Customer(sc.next(),sc.next());

					      index=cust.indexOf(cd);
					      if(index==-1)
	                        {
	                        	throw new InvalidCustomerException("invalid email and password");
	                        }
					      System.out.println("Removed ::"+cust.remove(index));
						break;

					case 5:
						System.out.println("All customer accounts");
						for(Customer c: cust)
						{
							System.out.println(c);
						}
						
						break;
					case 6:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					//System.out.println(e.getMessage());
				}
			}
		}

	}

}


//utkarsh rane utk@gmail utk 1000 2000-03-02 silver
//sham ghire sham@ shamu 5000 2001-01-02 diamond
//shubham badgujar shu@ subhya 2000 1999-12-25

