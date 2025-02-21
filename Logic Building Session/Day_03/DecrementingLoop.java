public class DecrementingLoop {
public static void main(String[] args) {
int total = 0;

//i=5,4,3,2,1
for (int i = 5; i > 0; i--) { //Loop starts with i = 5 and decreases by 1 in each iteration.
total += i;//total=total+i=0+5=5,8,10,12,12
if (i == 3) continue; //5===3,4==3 3==3:skip
total -= 1;//5-1=4 ,8-1=7 ,11,11
}

System.out.println(total);//10,11
}
}
// Guess the output of this loop.

//Final output:11