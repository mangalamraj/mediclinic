import java.util.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;


interface Identification {
    public void faceId();
    public void fingerprint();
    public void eyeScan();
}

class MobNoException extends Exception {
    @Override
    public String toString() {
        return "The input is invalid here !\n";
    }
    public String getMessage() {
        return "Please enter valid mobile no (10 digits)\n";
    }
}

class personalinfo implements Identification{
    String Name;
    int age;
    String bloodgroup;
    float weight;
    String gender;
    int faceId;
    int fingerprintId;
    int eyeScanId;
    String mob_no;
    String email;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    // personalinfo(String Name,int age,String bloodgroup,int weight,char gender){
    //     this. Name=Name;
    //     this. age=age;
    //     this. bloodgroup=bloodgroup;
    //     this. weight=weight;
    //     this. gender=gender;
    // }
    public void askpersonalinfo(){
        System.out.println("Enter Your Name: ");
        Name = sc.nextLine();
        System.out.println("Enter the email address : " );
        email = sc.nextLine();
        System.out.println("Enter Your age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your blood group: ");
        bloodgroup = sc.nextLine();
        System.out.println("Enter Your gender: ");
        gender = sc.nextLine();
        System.out.println("Enter Your weight(in kg): ");
        weight = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the mobile number "  );
        mob_no = sc.nextLine();
        if(mob_no.length()!=10) {
            try{
                throw new MobNoException();
            }
            catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
            mob_no = sc.nextLine();
        }


    }
    public void fingerprint() {
        fingerprintId = ThreadLocalRandom.current().nextInt(10000000);
    }
    public void faceId() {
        faceId = ThreadLocalRandom.current().nextInt(10000000);
    }
    public void eyeScan() {
        eyeScanId = ThreadLocalRandom.current().nextInt(1000000000);
//        System.out.println(eyeScanId);
    }

 }
 

public class mediclinic{




 public static void main(String args[]) {
     //Registration date
     Date d = new Date();
     MedicalInfo mi = new MedicalInfo();
     Cure c = new Cure();
     Discount di = new Discount();
     personalinfo pi = new personalinfo();
     pi.askpersonalinfo();
     pi.eyeScan();
     pi.faceId();
     pi.fingerprint();

     //The functions in past Medical History
     mi.askMedicHistory();
//     mi.askSymptoms();
     c.disease();
     c.curing();
     di.financial_info();


     //The parameters required to print in the report
     String name = pi.Name;
     int age = pi.age;
     String bloodgroup = pi.bloodgroup;
     float weight = pi.weight;
     String gender = pi.gender;
     String medicalHistory = mi.medicalHistory;
     String symptom = mi.symptom;
     String doctor = "Dr. Arnav Patil";
     String disease = c.disease;
     String medicine = c.medicine;
     int flag = di.flag;
     int eyeScanId = pi.eyeScanId;
     int faceId = pi.faceId;
     int fingerprint = pi.fingerprintId;
     String address = pi.email;
     String no = pi.mob_no;
     int cost = c.cost;

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


     try{
         FileWriter fw = new FileWriter("Sample.txt");
         fw.write("\t\t\t\t\t\t*** MEDICLINIC PVT LTD ***\n\n\n");
//         fw.write("\t\t\t----------------------\n\n\n\n\n\n");
         fw.write("Name : " + name);
         fw.write("\n\n");
         fw.write("Age : " + age);
         fw.write("\n\n");

         fw.write("Mobile no : " + no);
         fw.write("\n\n");

         fw.write("Address : "+ address);
         fw.write("\n\n");


         fw.write("Bloodgroup : " + bloodgroup);
         fw.write("\n\n");

         fw.write("Gender : "+ gender);
         fw.write("\n\n");

         fw.write("Weight : " + weight);
         fw.write("\n\n");

         fw.write("Consultant : " + doctor);
         fw.write("\n\n");

         fw.write("Registration date & time : " + d);
         fw.write("\n\n");

         fw.write("Your Fingerprint Id is : " + fingerprint);
         fw.write("\n\n");

         fw.write("Your Face Id is : " + faceId);
         fw.write("\n\n");

         fw.write("Your EyeScan Id is : " + fingerprint);
         fw.write("\n\n");

         fw.write("MEDICAL REPORT \n\n\n");

         fw.write("Past medical history : " + medicalHistory);
         fw.write("\n\n\n");

         fw.write("Disease diagnosed : "+ disease);
         fw.write("\n\n");

         fw.write("The medicines prescribed : \n\n\n" + medicine);
         fw.write("\n\n\n");
         if(flag ==1) {
             fw.write("As you have income below 1 lakh , we are providing the medicines free of cost for you\n");
             fw.write("Total cost : " + cost+"Rs\n");
             fw.write("Discount = " + cost +"Rs\n\n");
         }
         else{
             fw.write("Cost of all the medicines to be paid : " + cost + "Rs\n\n");

         }

         if(flag == 1) {
             fw.write("Please verify the aadhar number as we will verify the fingerprint and eyescan for free treatment\n");
             fw.write("Cost = nill\n");
         }
         else{
             fw.write("Please pay the bill at the bill counter \n     ");
             fw.write("Online as well as offline cash payment mode available\n\n");
         }
         //Tests related info
         fw.write("Tests required : \n");
         fw.write("HDL Cholestrol - Direct \t|\t HDL/LDL Ratio \t|\t VLDL Cholestrol\n\n");
         fw.write("*PLEASE CORRELATE WITH CLINICAL CONDITIONS*\n\n\n");
         fw.write("Method: \n");
         fw.write("CHOL - CHOLESTROL OXIDASE , ESTERASE , PEROXIDASE\n");
         fw.write("HD/LD - Derived from HDL and LDL Values\n");

         fw.write("Alert !!! 10-12 hours of fasting is mandatory for lipid parameters.If not, values might fluctuate\n\n\n\n\n");
         fw.write("For more enquiry :\nContact : 9999999999\nOr visit mediclinic.org\n\n");
         fw.write("Our Branches :\n");
         fw.write("White Field Road , Bangalore\n");
         fw.write("Town Square , Mumbai\n");
         fw.write("Green Lantern Colony , Kolkata\n");
         fw.write("Blue Vines Road , Nashik\n");
//         fw.write("Sitabuldi \t\t\t|\t\tNashik Rd  \t\t\t|\t\tCivil Lines\t\t\t|\t\tDharampeth\nOpp Hosp\t\t\t|\t\tNear Main circle\t|\t\tOpp Pinto Colony\t|\t\tGalaxy Park\n");
//         fw.write("White Field Road\t|\t\tNear Shoppy mall\t|\t\tNear Mill\t\t\t|\t\tDwarka Chowk\n");
//         fw.write("Nagpur\t\t\t\t|\t\tNashik\t\t\t\t|\t\tPune\t\t\t\t|\t\tMumbai");
         fw.close();


     }
     catch(IOException e) {
         System.out.println(e.getMessage());
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
        System.out.println("Choose any one (If multiple , then choose the higher one in the list)");
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
                System.out.println("We at the mediclinic try to provide the best service if you cooperate :)\nThanks!");

        }
//        System.out.println("The medical History is : " + medicalHistory);



    }

    public void askSymptoms() {
        System.out.println("What are the symptoms you are facing\n");
        System.out.println("Please select the options you are facing\n");
        System.out.println("Choose any one (If multiple , then choose the higher one in the list)");

//        System.out.println("1.\n2.\n3.\n4.\n5.\n");
        System.out.println(" 1) Shortness of breath , rapid or irregular heartbeat  , pinkish cough , swelling in legs , ankles , feet .");
        System.out.println(" 2) Whooshing sound , heart murmur , Fainting , abdominal swelling");
        System.out.println(" 3) Difficulty in lying flat to sleep , Bloating of abdomen (due to fluid buildup) , Cough while lying down");
        System.out.println(" 4) Blue tinge of the skin or lips , Rapid breathing , Swelling of legs or tummy");
        System.out.println(" 5) Racing of heartbeat or slow heartbeat , Shortness of breath, Fluttering of heart");

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
    int cost;
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
                cost = 350;
                break;
            case 2:
                medicine = "1.Candesarten\n2.Cozaar\n3.Diovan\n4.Valsartann5.Sacubitril\n";
                cost = 457;
                break;
            case 3:
                medicine = "1.Lanoxin\n2.Corlanor\n3.Xaretto\n4.Worvasc\n5.rivaroxaban\n6.perindopril\n";
                cost = 674;
                break;
            case 4 :
                medicine = "1.Tenormin\n2.Zebeta\n3.coreg\n4.Lopressor\n5.Corgard\n6.Betapake\n";
                cost = 289;
                break;
            case 5:
                medicine ="Amiodarone\n2.Flecainide\n3.Ibutilide\n4.Procainamide\n5.Rhythmol\n6.Tocainide\n";
                cost = 754;
                break;
            default:
                System.out.println("Please enter the valid choice :)");
                System.out.println("We at the mediclinic try to provide the best service if you cooperate :)\nThanks!");

        }
    }



}

class Discount {
    int flag = 0;
    String income;
    public void financial_info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your yearly income in INR");
         income = sc.nextLine();
        if(income.length() <6) {
            flag = 1;
        }



    }
}



