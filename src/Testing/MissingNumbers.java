package Testing;

public class MissingNumbers {

	public static void main(String[] args) {

int[] input = {1,2,2,2,1,5,5,7,8,9};
int[] register = new int[input.length];

for (int i:input){
	register[i] = 1;
	}
for (int i=1; i<register.length; i++){
	if(register[i] == 0){
		System.out.println(i);
	}}}}
