public class ConditionalLoopOutput {
    public static void main(String[] args) {
    int num = 1; //num=1,0,2,-1,3
    for (int i = 1; i <= 4; i++) {//i=1 2 3 4 5
    if (i % 2 == 0) {//odd-f T t
    num += i;// num=num+i=0+2=2 -1+4=3
    } else {
    num -= i;//num = num-i=1-1=0 2-3=-1
    }
    }
    System.out.println(num);//3
    }
    }
    // Guess the output of this loop.
    // Output:3

/* 
    Understanding the Logic
Initial value of num = 1
The loop runs from i = 1 to i = 4
If i is odd → subtract i from num
If i is even → add i to num */