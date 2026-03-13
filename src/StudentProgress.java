
public class StudentProgress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths = 88;
        int science = 76;
        int english = 92;
        int history = 68;
        int javaProg = 95;
        int total;
        total = maths+science+english+javaProg;
        System.out.println("total "+total);
        Double percentage = total/5.0;
        System.out.println("Percentage is "+percentage);
        
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        String status = (maths >= 40 && science >= 40 && english >= 40 
                        && history >= 40 && javaProg >= 40) ? "PASS" : "FAIL";
        int maxMark = Math.max(maths, Math.max(science, Math.max(english, Math.max(history, javaProg))));
        String maxSubject = "";
        if (maxMark == maths) maxSubject = "Maths";
        else if (maxMark == science) maxSubject = "Science";
        else if (maxMark == english) maxSubject = "English";
        else if (maxMark == history) maxSubject = "History";
        else maxSubject = "Java Programming";

        // Find minimum mark
        int minMark = Math.min(maths, Math.min(science, Math.min(english, Math.min(history, javaProg))));
        String minSubject = "";
        if (minMark == maths) minSubject = "Maths";
        else if (minMark == science) minSubject = "Science";
        else if (minMark == english) minSubject = "English";
        else if (minMark == history) minSubject = "History";
        else minSubject = "Java Programming";

        System.out.println("Highest Scoring Subject: " + maxSubject + " (" + maxMark + ")");
        System.out.println("Lowest Scoring Subject: " + minSubject + " (" + minMark + ")");
	
        String scholarship = (percentage >= 85 && status.equals("PASS")) 
                ? "Eligible for Merit Scholarship" 
                : "Not Eligible (below 85% or failed subjects)";

// Print full report card
System.out.println("---- STUDENT REPORT CARD ----");
System.out.println("Maths: " + maths + "  Science: " + science + "  English: " + english 
              + "  History: " + history + "  Java: " + javaProg);
System.out.println("Total: " + total + "  Percentage: " + percentage + "%");
System.out.println("Grade: " + grade + "  Status: " + status);
System.out.println("Highest Scoring Subject: " + maxSubject + " (" + maxMark + ")");
System.out.println("Lowest Scoring Subject: " + minSubject + " (" + minMark + ")");
System.out.println("Scholarship: " + scholarship);
	}

}
