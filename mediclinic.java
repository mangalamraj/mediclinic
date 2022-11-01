import java.util.*;
import java.io.*;



public class mediclinic{

 class personalinfo{
    String Name;
    int age;
    String bloodgroup;
    int weight;
    char gender;
    Scanner sc = new Scanner(System.in);
    // personalinfo(String Name,int age,String bloodgroup,int weight,char gender){
    //     this. Name=Name;
    //     this. age=age;
    //     this. bloodgroup=bloodgroup;
    //     this. weight=weight;
    //     this. gender=gender;
    // }
    void askpersonalinfo(){
        System.out.println("Enter Your Name: ");
        Name = sc.nextLine();
        System.out.println("Enter Your age: ");
        age = sc.nextInt();
        System.out.println("Enter Your blood group: ");
        bloodgroup = sc.nextLine();
        System.out.println("Enter Your weight: ");
        weight = sc.nextInt();
        System.out.println("Enter Your gender: ");
        gender = sc.next().charAt(0);
    }
 }
 



}
class MedicalInfo {
    String medicalHistory;
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
                System.out.println("We at the mediclinic try to provide the best service if you cooperate :)\nThanks!");

        }
//        System.out.println("The medical History is : " + medicalHistory);



    }

    public void askSymptoms() {
        System.out.println("What are the symptoms you are facing");
    }

}
