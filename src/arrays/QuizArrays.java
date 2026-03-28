package arrays;

public class QuizArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] quizArray = {85, 2, 78, 90, 88, 76, 95, 189};
		int large=0;
				int small = 0;
				 large = quizArray[0];
				 small = quizArray[0];
				double avr = 0;
				 double sum=0;
		for(int i =0 ; i < quizArray.length; i++) {
			
			
			if(quizArray[i]>large) {
				large = quizArray[i];
				
				
			}if(quizArray[i]<small) {
				small = quizArray[i];
				
			} sum = sum+quizArray[i];
			
		}
		avr = sum / quizArray.length;
		System.out.println("largest score is "+large);
		System.out.println("smallest score is "+small);
		System.out.println("Average score is "+avr);
	}

}
