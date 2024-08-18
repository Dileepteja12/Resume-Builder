import java.util.Scanner;

class ResumeBuilder {
    String name, email, phone, address, objective, skills, experience, education;
    String template;

    void gatherInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        phone = scanner.nextLine();

        System.out.print("Enter your address: ");
        address = scanner.nextLine();

        System.out.print("Enter your career objective: ");
        objective = scanner.nextLine();

        System.out.print("Enter your skills (comma-separated): ");
        skills = scanner.nextLine();

        System.out.print("Enter your work experience (in format: Company, Position, Start Date - End Date, Description): ");
        experience = scanner.nextLine();

        System.out.print("Enter your education (in format: Degree, Institution, Year): ");
        education = scanner.nextLine();

        System.out.println("Choose a template:");
        System.out.println("1. Simple Template");
        System.out.println("2. Modern Template");
        System.out.println("3. Professional Template");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch (choice) {
            case 1:
                template = "simple";
                break;
            case 2:
                template = "modern";
                break;
            case 3:
                template = "professional";
                break;
            default:
                template = "simple";
                break;
        }

        scanner.close();
    }

    void displayResume() {
        if (template.equals("simple")) {
            System.out.println("\nResume");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Address: " + address);
            System.out.println("\nObjective:");
            System.out.println(objective);
            System.out.println("\nSkills:");
            System.out.println(skills);
            System.out.println("\nExperience:");
            System.out.println(experience);
            System.out.println("\nEducation:");
            System.out.println(education);
        } else if (template.equals("modern")) {
            System.out.println("\n" + name);
            System.out.println(email + " | " + phone + " | " + address);
            System.out.println("\nCAREER OBJECTIVE");
            System.out.println(objective);
            System.out.println("\nSKILLS");
            System.out.println(skills);
            System.out.println("\nEXPERIENCE");
            System.out.println(experience);
            System.out.println("\nEDUCATION");
            System.out.println(education);
        } else if (template.equals("professional")) {
            System.out.println("\n" + name);
            System.out.println(address);
            System.out.println(email + " | " + phone);
            System.out.println("\nSUMMARY");
            System.out.println(objective);
            System.out.println("\nSKILLS");
            System.out.println(skills);
            System.out.println("\nPROFESSIONAL EXPERIENCE");
            System.out.println(experience);
            System.out.println("\nEDUCATION");
            System.out.println(education);
        }
    }

    public static void main(String[] args) {
        ResumeBuilder builder = new ResumeBuilder();
        builder.gatherInformation();
        builder.displayResume();
    }
}