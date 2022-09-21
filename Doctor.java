import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Doctor {
    private static  String name = "James";
    private static  int doctid = 22345;
   

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.doctid;
    }

    public void setName(String Name){
        name = Name;
    }

    public void setId(int ID){
        doctid = ID;
    }

    public static void patientReport() throws Exception {
        Scanner sc = new Scanner(System.in);
        File F = new File("PatientReport.txt");
        FileOutputStream fi = new FileOutputStream(F, true);
        PrintWriter pw = new PrintWriter(fi);
        System.out.print("Enter the prescribed medicine and any other suggestions : ");
        String s = sc.next();
        pw.println("\n\t\t\t\t Medicine and suggestions : " + s);
        pw.flush();
        pw.close();
        fi.close();
        
    }
    
}
