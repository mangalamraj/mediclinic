import java.util.*;
import java.io.*;




public class mediclinic{
 public static void main(String args[]) {
     //Registration date
     Date d = new Date();
     MedicalInfo mi = new MedicalInfo();


     //The functions in past Medical History
     mi.askMedicHistory();
     mi.askSymptoms();

     //The parameters required to print in the report
     String medicalHistory = mi.medicalHistory;
     String symptom = mi.symptom;
     String doctor = "Dr. Arnav Patil";









 }

}
class MedicalInfo {
    String medicalHistory;
    String symptom;

    Scanner sc = new Scanner(System.in);
    public void askMedicHistory() {

        System.out.println("Do you have any past medical history?\nIf yes , pls  choose the options accordingly");
        System.out.println("1.High Blood Pressure\n2.Diabetes\n3.Cancer\n4.Anxiety\n5.Nothing");
        int pastHistory = sc.nextByte();
        switch (pastHistory) {
            case 1 :
                medicalHistory = "High Blood Pressure";
                break;
            case 2 :
                medicalHistory = "Diabetic";
                break;
            case 3:
                medicalHistory = "Cancer";
                break;
            case 4:
                medicalHistory = "Anxiety";
                break;
            case 5:
                medicalHistory = "No past medical history";
                break;
            default :
                System.out.println("Please enter the valid choice :)");
                System.out.println("We at the mediclinic try to provide the best service of you cooperate :)\nThanks!");

        }
//        System.out.println("The medical History is : " + medicalHistory);



    }

    public void askSymptoms() {
        System.out.println("What are the symptoms you are facing\n");
        System.out.println("Please select the options you are facing\n");
        System.out.println("1.\n2.\n3.\n4.\n5.\n");
        int symptom_no = sc.nextInt();
        switch (symptom_no) {
            case 1:
                symptom = "Symptom no 1\n";
                break;
            case 2:
                symptom = "Symptom no 2\n";
                break;
            case 3:
                symptom = "Symptom no 3\n";
                break;
            case 4:
                symptom = "Symptom no 4\n";
                break;
            case 5:
                symptom = "Symptom no 5\n";
                break;

            default:
                System.out.println("Please enter the valid choice :)");
                System.out.println("We at the mediclinic try to provide the best service of you cooperate :)\nThanks!");

        }
    }

}