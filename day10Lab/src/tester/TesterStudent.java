package tester;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import static utils.StudentCollectionUtils.*;

import com.app.core.Address;
import com.app.core.Student;
import com.app.core.Subject;

public class TesterStudent {

	private static final String Double = null;

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);)
		{
                      List<Student> studentList= populateList();
                      System.out.println("students:");
                      
                      System.out.println("students:**************************");
                      
                      studentList.forEach(s-> System.out.println(s));
                     
                      Map<String, Student> maplist=populateMap(studentList);
                     
                      System.out.println("students:**************************");
                      maplist.values().forEach(s-> System.out.println(s));
                     
                      System.out.println("************************************");
                      maplist.values()
                      .stream()
                      .sorted((p1, p2) -> ((Double) p1.getGpa()).compareTo(p2.getGpa()))
                      .forEach(z-> System.out.println(z));
                    
                      System.out.println("**************************************");
                     
                      /*
                       4. list : Display all product names of a particular category , exceeding specific price.
                         I/P category name & price.
                         eg : productList.stream()
                            .filter(p -> p.getCategory()==cat)
                            .filter(p -> p.getPrice() > price)
                            .forEach(p -> sop(p.getName()));
                       */
                      System.out.println("enter subject");
                      String sub=sc.next();
                      
                       OptionalDouble op=maplist.values()
                    		   .stream()
                    		   .filter(p-> p.getSubject().equals(Subject.valueOf(sub)))
                    		   .mapToDouble(p -> p.getGpa())
                    		   .average();
                    		   if(op.isPresent())
                    		   System.out.println("avg"+op.getAsDouble());
                    		   else
                    			   System.out.println("no such subject is present");
                  
                     System.out.println("**************************************"); 
                   //  5 Print name of specified subject  topper
                     System.out.println("enter subject to find topper");
                     String subj=sc.next();
                     Optional<Student> os=maplist.values()
                    		 .stream()
                    		 .filter(p -> p.getSubject().equals(Subject.valueOf(subj)))
                    		 .max((p1,p2) -> ((Double) p1.getGpa()).compareTo(p2.getGpa()));
                     if(os.isPresent())
                    	 System.out.println("topper is"+os.get().getName());
                     else
                    	 System.out.println("subject not found");
                    System.out.println("**************************************"); 	
                    //6 Print no of  failures for the specified subject chosen  from user.
                   // (gpa < 5 : failed case)
                    System.out.println("failed students");
                    System.out.println("enter subject");
                    String subje=sc.next();
//                     maplist.values()
//                    .stream()
//                    .filter(p -> p.getSubject().equals(Subject.valueOf(subje)))
//                    .filter(p-> p.getGpa()<8)
//                    .forEach(p->System.out.println(p));
                    long of=maplist.values()
                      		 .stream()
                      		.filter(p -> p.getSubject().equals(Subject.valueOf(subje)))
                      		.filter(p-> p.getGpa()<8)
                      		.count();
                     System.out.println("no of failed student::"+of);
                     
 
                     System.out.println("**************************************"); 
                    // 7. Display student names of all the students , from a specified city.
                    
                     System.out.println("enter city");
                     String city=sc.next();
                     
                     maplist.values()
              		 .stream()
              		 .filter(c-> c.getAddress().getCity().equals(city))
              		 .forEach(c->System.out.println(c));
                   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
