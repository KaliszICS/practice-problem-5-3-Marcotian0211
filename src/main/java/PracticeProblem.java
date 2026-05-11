public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String[] addString(String[]arr,String word,int num){
String[]arr2=new String[arr.length+1];
int index=0;
for(int i=0;i<arr2.length;i++){
	if (i!=num){
		arr2[i]=arr[index];
		index++;
	}
	else{
		arr2[i]=word;
	}
}
return arr2;
	}
public static char[]removeChars(char[]arr,char word){
	int number=0;
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==word){
			count++;
		}
	}
	int number2=0;
	char[]arr3=new char[arr.length-count];
	for(int q=0;q<arr.length;q++){
		if(arr[q]!=word){
			arr3[number2]=arr[q];
			number2++;
		}

	}
	return arr3;

}
}
