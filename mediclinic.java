import java.util.*;
import java.io.*;




public class mediclinic{
 public static void main(String args[]) {
     //Registration date
     Date d = new Date();
     MedicalInfo mi = new MedicalInfo();
     Cure c = new Cure();
     Discount di = new Discount();

     //The functions in past Medical History
     mi.askMedicHistory();
//     mi.askSymptoms();
     c.disease();
     c.curing();
     di.financial_info();



     //The parameters required to print in the report
     String medicalHistory = mi.medicalHistory;
     String symptom = mi.symptom;
     String doctor = "Dr. Arnav Patil";
     String disease = c.disease;
     String medicine = c.medicine;
     int flag = di.flag;

     System.out.println("The medical history is " + medicalHistory);
     System.out.println("Referred by "+ doctor);
     System.out.println("The disease diagnosed is " + disease);
     System.out.println("The medicine prescribed  is " + medicine);

     File myFile = new File("Sample.txt");
     try{
         myFile.createNewFile();
     }
     catch (IOException e) {
         System.out.println(e);
     }
 












 }

}
class MedicalInfo {
    String medicalHistory;
    String symptom;
    int symptom_no;

    Scanner sc = new Scanner(System.in);
    public void askMedicHistory() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to Mediclinic!\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tGiving Hospitality a new definition!");
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
//        System.out.println("1.\n2.\n3.\n4.\n5.\n");
        System.out.println(" 1) Shortness of breath , rapid or irregular heartbeat  , pinkish cough , swelling in legs , ankles , feet .");
        System.out.println(" 2) Whooshing sound , heart murmur\nFainting , abdominal swelling");
        System.out.println(" 3) Difficulty in lying flat to sleep\nBloating of abdomen (due to fluid buildup)\nCough while lying down");
        System.out.println(" 4) Blue tinge of the skin or lips\nRapid breathing \nSwelling of legs or tummy");
        System.out.println(" 5) Racing of heartbeat or slow heartbeat\nShortness of breath\nFluttering of heart");

         symptom_no = sc.nextInt();
        int disease_no;
        switch (symptom_no) {
            case 1:
                symptom = "S1\n";
                disease_no =1;
                break;
            case 2:
                symptom = "S2\n";
                disease_no =1;
                break;
            case 3:
                symptom = "S3\n";
                disease_no =1;
                break;
            case 4:
                symptom = "S4\n";
                disease_no =1;
                break;
            case 5:
                symptom = "S5\n";
                disease_no =1;
                break;

            default:
                System.out.println("Please enter the valid choice :)");
                System.out.println("We at the mediclinic try to provide the best service if you cooperate :)\nThanks!");

        }

    }





}

class Cure {
    MedicalInfo mi = new MedicalInfo();
    String disease;
    int symptom;
    String medicine;
    public void disease() {
        mi.askSymptoms();

         symptom = mi.symptom_no;

        switch (symptom) {
            case 1 :
                disease = "Heart Failure\n";
                break;
            case 2 :
                disease = "Heart valve disease\n";
                break;
            case 3 :
                disease = "cardiomyopathy artery disease\n";
                break;
            case 4 :
                disease = "Congenital heart disease\n";
                break;
            case 5 :
                disease = "Heart arrhythmia\n";
                break;
            default:
                System.out.println("Please enter the valid choice :)");
                System.out.println("We at the mediclinic try to provide the best service if you cooperate :)\nThanks!");
        }
        System.out.println("The disease diagnosed is "+ disease);
    }

    public void curing() {
        switch (symptom) {
            case 1 :
                medicine = "1.Capoten\n2.Vasitec\n3.Monopril\n4.Prinivil\n5.Zestril\n6.Mavik";
                break;
            case 2:
                medicine = "1.Candesarten\n2.Cozaar\n3.Diovan\n4.Valsartann5.Sacubitril\n";
                break;
            case 3:
                medicine = "1.Lanoxin\n2.Corlanor\n3.Xaretto\n4.Worvasc\n5.rivaroxaban\n6.perindopril\n";
                break;
            case 4 :
                medicine = "1.Tenormin\n2.Zebeta\n3.coreg\n4.Lopressor\n5.Corgard\n6.Betapake\n";
                break;
            case 5:
                medicine ="Amiodarone\n2.Flecainide\n3.Ibutilide\n4.Procainamide\n5.Rhythmol\n6.Tocainide\n";
                break;
            default:
                System.out.println("Please enter the valid choice :)");
                System.out.println("We at the mediclinic try to provide the best service if you cooperate :)\nThanks!");

        }
    }


}

class Discount {
    int flag = 0;
    public void financial_info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your yearly income in INR");
        int income = sc.nextInt();
        if(income <100000) {
            flag = 1;
        }



    }
}