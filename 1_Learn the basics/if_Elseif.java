import java.util.Scanner;
public class if_Elseif {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input>=90){
            System.out.print("Grade A");
        }else if(input>=70){
            System.out.print("Grade B");
        }else if(input>=50){
            System.out.print("Grade C");
        }else if(input>=35){
            System.out.print("Grade D");
        }
        else{
            System.out.print("Fail");
        }
    }
}
/*  If ElseIf
Subscribe to TUF+

Hints
Company
Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.


For printing use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()
for C# : Console.WriteLine();
for Go : fmt.Println()

Example 1

Input: marks = 95

Output: Grade A

Explanation: marks are greater than or equal to 90.

Example 2

Input: marks = 14

Output: Fail

Explanation: marks are less than 35.*/