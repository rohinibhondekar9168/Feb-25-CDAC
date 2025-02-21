
public class NestedLoopOutput {
public static void main(String[] args) {

for (int i = 1; i <= 3; i++)// i=1,2,3 (outer loop)
 {  
for (int j = 1; j <= 2; j++)  //inner loop: j runs from 1 to 2 (j = 1, 2 for each i).
{ 
System.out.print(i + " " + j + " "); // 1 1 1 2 2 1 2 2 3 1 3 2
}
System.out.println();
}
}
}
// Guess the output of this nested loop.
/* 
PS D:\CDAC\Core_Java1\Day_3> java  NestedLoopOutput
1 1 1 2 
2 1 2 2
3 1 3 2 */