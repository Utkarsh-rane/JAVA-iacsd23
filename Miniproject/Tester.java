package tester;


import static utils.CustomerValidationRule.ValidateAll;
import static utils.CustomerValidationRule.customerlogin;
import static utils.Customerutils.customer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.customer.Customer;
import com.app.customer.ServicePlan;

import cust_exception.InvalidCustomerException;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			List<Customer> cust =customer();
		
			boolean exit = false;
			System.out.println("-----Service plans for Customer-------- ");
			System.out.println();
			ServicePlan[] sep=ServicePlan.values();
			for(ServicePlan sp: sep)
			{
				System.out.println(sp);
			}
			System.out.println("-----------------------------------------");
			System.out.println();
			System.out.println("-------Options for Customer--------------");
			System.out.println("1.sign up\n2.sign in \n3.update pasword \n4.unsubscribe user \n5.Display All customer "
					+ " \n6.Display All customer in accending \n7.Display All customer sort as per dob n reg amount \n 0.exit");

			
			while (!exit)
			{
				try {
					System.out.println("enter choice");
					switch (sc.nextInt()) {
					case 1:
				
							System.out.println(
									"enter  firstname,  lastname,  email,  passwd,  regAmt ,dob (yyyy-MM-dd),plan_name");
							Customer customer = ValidateAll(sc.next(), sc.next(), sc.next(),
									sc.next(), sc.nextDouble(), sc.next(), sc.next(), cust);
							cust.add(customer);
							System.out.println("sucessfully registered!!!!!!!!!!!");
						
						break;
					case 2:
						System.out.println("enter email and password ");
						customer=customerlogin(sc.next(),sc.next(),cust);
						System.out.println(customer);
						
						break;
					case 3:
						System.out.println("enter email and password ");
						customer=customerlogin(sc.next(),sc.next(),cust);
                        customer.setPasswd(sc.next());
                        	System.out.println("password set sucessful");
                        		
						
						break;
					case 4:
						System.out.println("enter email  ");
						Customer cgmail=new Customer(sc.next());

						int index=cust.indexOf(cgmail);
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
						Collections.sort(cust);
						break;
					case 7:
						Collections.sort(cust, new Comparator<Customer>()
								{

									@Override
									public int compare(Customer c1, Customer c2) {
										int ret=c1.getDob().compareTo(c2.getDob());
										if(ret==0)
										return (c1.getRegAmt()).compareTo(c2.getRegAmt());
										
										return ret;
									}
							
								}
						);
						System.out.println("sort information by dob ");
						for(Customer c: cust)
						System.out.println(c);
						break;
					case 0:
						exit = true;
						break;
					}
				} 
				catch (Exception e) {
				e.printStackTrace();
					//System.out.println(e.getMessage());
					//System.out.println(e);
				}
			}
		}

	}

}


//utkarsh rane utk@gmail utk 1000 2000-03-02 silver
//sham ghire sham@ shamu 5000 2001-01-02 diamond
//shubham badgujar shu@ subhya 2000 1999-12-25 gold

