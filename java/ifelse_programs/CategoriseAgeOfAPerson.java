package ifelse_programs;
import java.util.*;
public class CategoriseAgeOfAPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if((age>=0) && (age<=12))
        System.out.println("Child");

        else if((age>=13) && (age<=19))
        System.out.println("Teenager");

        else if((age>=20) && (age<=40))
        System.out.println("Young");
     
        else if((age>=41) && (age<=60))
        System.out.println("Middle-Aged");

        else if(age>60)
        System.out.println("Senior-Citizen");

     }

}
/*
 * Problem Description

Given age of a person, Categorise it based on age.
Category is given below :
if age is in range of 0 to 12 then category is "Child",
Otherwise if age is in range of 13 to 19 then category is "Teenager",
Otherwise if age is in range of 20 to 40 then category is "Young",
Otherwise if age is in range of 41 to 60 then category is "Middle-Aged",
Otherwise if age is more than 60 than category is "Senior-Citizen"

Note : Intention of this problem is to give you intuition of if-elseif, try to solve this problem using else-if.


Problem Constraints

0 <= age <= 150


Input Format

Single value denoting age of a person.

Output Format

According to category of age, print statement in single line.


Example Input

Input 1 :
48

Input 2 :
72


Example Output

Output 1 :
Middle-Aged

Output 2 :
Senior-Citizen


Example Explanation

Explanation 1 :
Age is 48, category for 48 is "Middle-Aged"

Explanation 2 :
Age is 72, category for 72 is "Senior-Citizen"


 */
