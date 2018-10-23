package Testing;

public class SwapTwoNumbers {

	public static void main(String[] args) {

int x =10;
int y=5;
int temp;

/*x=x+y;
y=x-y;
x=x-y;*/

temp = x;
x = y;
y = temp;

System.out.println(+x+ " and " +y);
	}

}
