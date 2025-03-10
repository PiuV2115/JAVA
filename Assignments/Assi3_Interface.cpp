import java.util.Scanner;

// Base Class
class Hospital {
    String name;
    int id;
    String phone;

    Hospital() {
        name = "";
        id = 0;
        phone = "";
    }

    void accept(Scanner sc) {
        System.out.print("# Name: ");
        name = sc.nextLine();
        System.out.print("# ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("# Phone: ");
        phone = sc.nextLine();
    }

    void display() {
        System.out.println("# Name: " + name);
        System.out.println("# ID: " + id);
        System.out.println("# Phone: " + phone);
    }
}

// Derived Class: Doctor
class Doctor extends Hospital {
    String speci;
    int room_no;

    Doctor() {
        speci = "";
        room_no = 0;
    }

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("# Specialization: ");
        speci = sc.nextLine();
        System.out.print("# Room No.: ");
        room_no = sc.nextInt();
        sc.nextLine();
    }

    void display() {
        System.out.println("Here are Doctor Details:");
        super.display();
        System.out.println("# Specialization: " + speci);
        System.out.println("# Room No.: " + room_no);
    }
}

// Derived Class: Nurse
class Nurse extends Hospital {
    String shift;
    int ward_no;

    Nurse() {
        shift = "";
        ward_no = 0;
    }

    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("# Shift: ");
        shift = sc.nextLine();
        System.out.print("# Ward No.: ");
        ward_no = sc.nextInt();
        sc.nextLine();
    }

    void display() {
        System.out.println("Here are Nurse Details:");
        super.display();
        System.out.println("# Shift: " + shift);
        System.out.println("# Ward No.: " + ward_no);
    }
}

// Update Class
class Update {
    static Scanner sc = new Scanner(System.in);

    static void doctorUpdate(Doctor doc) {
        System.out.print("Enter old ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        if (doc.id == id1) {
            System.out.println("Enter new Doctor Info:");
            doc.accept(sc);
        } else {
            System.out.println("ID not found.");
        }
    }

    static void nurseUpdate(Nurse nur) {
        System.out.print("Enter old ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        if (nur.id == id1) {
            System.out.println("Enter new Nurse Info:");
            nur.accept(sc);
        } else {
            System.out.println("ID not found.");
        }
    }
}
public class Main { 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Nurse nur = new Nurse();
        Doctor doc = new Doctor();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Accept Doctor Details");
            System.out.println("2. Display Doctor Details");
            System.out.println("3. Accept Nurse Details");
            System.out.println("4. Display Nurse Details");
            System.out.println("5. Update Doctor Details");
            System.out.println("6. Update Nurse Details");
            System.out.print("Enter your choice: ");
            choice = obj.nextInt();
            obj.nextLine();

            switch (choice) {
                case 1:
                    doc.accept(obj);
                    break;
                case 2:
                    doc.display();
                    break;
                case 3:
                    nur.accept(obj);
                    break;
                case 4:
                    nur.display();
                    break;
                case 5:
                    Update.doctorUpdate(doc);
                    break;
                case 6:
                    Update.nurseUpdate(nur);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("\nEnter 1 to continue, 0 to exit: ");
        } while (obj.nextInt() == 1);

        obj.close();
    }
}
