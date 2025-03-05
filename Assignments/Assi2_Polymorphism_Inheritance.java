import java.util.Scanner;

// Base Class
class Hospital {
    String name;
    int id;
    String phone;

    // Default Constructor
    Hospital() {
        name = "";
        id = 0;
        phone = "";
    }

    // Method to accept details
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("# Name: ");
        name = sc.nextLine();
        System.out.print("# ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("# Phone: ");
        phone = sc.nextLine();
    }

    // Method to display details
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

    // Default Constructor
    Doctor() {
        speci = "";
        room_no = 0;
    }

    // Method to accept details
    void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("# Specialization: ");
        speci = sc.nextLine();
        System.out.print("# Room No.: ");
        room_no = sc.nextInt();
    }

    // Method to display details
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

    // Default Constructor
    Nurse() {
        shift = "";
        ward_no = 0;
    }

    // Method to accept details
    void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("# Shift: ");
        shift = sc.nextLine();
        System.out.print("# Ward No.: ");
        ward_no = sc.nextInt();
    }

    // Method to display details
    void display() {
        System.out.println("Here are Nurse Details:");
        super.display();
        System.out.println("# Shift: " + shift);
        System.out.println("# Ward No.: " + ward_no);
    }
}

// Update Class to Modify Doctor & Nurse Info
class Update {
    static Scanner sc = new Scanner(System.in);

    // Update Doctor Details
    static void doctorUpdate(Doctor doc) {
        System.out.print("Enter old ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (doc.id == id1) {
            System.out.println("Enter new Doctor Info:");
            doc.accept();
        } else {
            System.out.println("ID not found.");
        }
    }

    // Update Nurse Details
    static void nurseUpdate(Nurse nur) {
        System.out.print("Enter old ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (nur.id == id1) {
            System.out.println("Enter new Nurse Info:");
            nur.accept();
        } else {
            System.out.println("ID not found.");
        }
    }
}

// Main Class
public class Student {
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

            switch (choice) {
                case 1:
                    doc.accept();
                    break;
                case 2:
                    doc.display();
                    break;
                case 3:
                    nur.accept();
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
