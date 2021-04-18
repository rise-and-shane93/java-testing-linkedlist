import java.util.*;

public class PrintJobs {
    public static void main(String[] args) {
        LinkedList<Integer> printJobs = new LinkedList<Integer>();

        Scanner input = new Scanner(System.in);
        Random rnGenerator = new Random();
        int printDuration = 0;
        int printJobId = 0;

        System.out.print("Would you like to add a print job? Press 1 for yes or 2 for no: ");
        int userResponse = input.nextInt();

        while(userResponse < 1 || userResponse > 2) {
            System.out.print("Invalid response. Press 1 for yes or 2 for no: ");
            userResponse = input.nextInt();
        }

        while(userResponse == 1) {
            System.out.println("Added print job");
            printDuration = rnGenerator.nextInt(1000-10) + 10;
            Job newJob = new Job(printDuration, printJobId);
            printJobs.add(newJob.getJobDuration());
            printJobId++;
            System.out.print("Would you like to add another print job? Press 1 for yes or 2 for no: ");
            userResponse = input.nextInt();
        }

        System.out.println("Stop\n");

        String headerFormat = "%-16s %-24s %n";
        String bodyFormat = "%-16d %-24d %n";
        System.out.printf(headerFormat, "Job ID", "Print Duration (seconds)");
        System.out.printf(headerFormat, "------", "------------------------");
        for (int i = 0; i < printJobs.size(); i++) {
            System.out.printf(bodyFormat, i, printJobs.get(i));
        }
        // System.out.println(printDuration);
    }

    // public static void addPrintJob() {

    // }
}