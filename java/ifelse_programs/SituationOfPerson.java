package ifelse_programs;
import java.util.*;
public class SituationOfPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        if((temp>=85.0 ) && (temp <= 91.0))
        
              System.out.println("Serious Hypothermia");
        
        else if((temp>=91.0) && (temp < 95.0))
        
                System.out.println("Mild Hypothermia");
        
        else if((temp>=95.0) && (temp <= 98.0))
        
                System.out.println("Normal Temperature");
        
        else if((temp>=98.0) && (temp <= 100.0))
        
                System.out.println("Mild Fever");
        
        else if((temp>=100.0 ) && (temp <= 105.0))
        
                System.out.println("High Fever");
        
        

	}

}
/*
 * Problem Description

Given temperature of person, analyse the situation of person and give him advice.
Situations and advice related with temperature are :
1. temp is in range of [85.0 to 91.0] then advice is "Serious Hypothermia".
2. temp is in range of (91.0 to 95.0) then advice is "Mild Hypothermia".
3. temp is in range of [95.0 to 98.0] then advice is "Normal Temperature".
4. temp if in range of (98.0 to 100.0] then advice is "Mild Fever".
5. temp if in range of (100.0 to 105.0] then advice is "High Fever".

Note :
1. Range of temperature in human body is hypothetical.
2. We have two type of bracket is there in Range [] and ()
3. [] means inclusive and () means exclusive.
4. Intention of this problem is to teach you multiple ifs, so try to solve it using multiple ifs


Problem Constraints

85.0 <= temp <= 105.0


Input Format

In single line, given temp. as an input.


Output Format

According to situation of temp, print the advice


Example Input

Input 1 :
97.6

Input 2 :
90.3


Example Output

Output 1 :
Normal Temperature

Output 2 :
Serious Hypothermia


Example Explanation

Explanation 1 :
Temp is 97.6, that means advice is "Normal Temperature"

Explanation 2 :
Temp is 90.3, that means advice is "Serious Hypothermia"


 */
