import java.util.Scanner;

class Admin {
    public static int ID = 505;
    public static long pass = 66789;

    public int getid(){
        return ID;
    }

    public long getPassword(){
        return pass;
    }

    public static void drDetails(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name of the doctor");
        String name = sc1.next();
        System.out.println("Enter Id of the doctor");
        int id = sc1.nextInt();
        Doctor d = new Doctor();
        d.setName(name);
        d.setId(id);
        
    }

    public static void RecepDetails(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter name of the Receptionist");
        String name = sc2.next();
        System.out.println("Enter Id of the Receptionist");
        int id = sc2.nextInt();
        Receptionist r = new Receptionist();
        r.setName(name);
        r.setId(id);
        
    }

    public static void adminmain(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter whose name and id to should be changed");
          
        System.out.println(
					"-------------------------------------------------------------------------------------------------------------------");
        System.out.println("                     1.Doctor              2.Receptionist                                                    ");
        System.out.println(
					"-------------------------------------------------------------------------------------------------------------------");
        
        int option = sc.nextInt();

        switch(option){
            case 1:
               drDetails();
               break;

            case 2 :
               RecepDetails();
               break;
        }
        
    }
}
