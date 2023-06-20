class PetersonPrinter {
    private volatile boolean[] flag = new boolean[2];
    private volatile int turn = 0;

    public void printDocument(int printerId, String document) {
        int otherPrinterId = 1 - printerId;
        flag[printerId] = true;
        turn = otherPrinterId;

        while (flag[otherPrinterId] && turn == otherPrinterId) {
            // Wait until it's your turn
        }

        // Print the document
        System.out.println("Printer " + (printerId + 1) + " is printing: " + document);

        flag[printerId] = false;
    }
}

class PrinterThread extends Thread {
    private int printerId;
    private PetersonPrinter printer;

    public PrinterThread(int printerId, PetersonPrinter printer) {
        this.printerId = printerId;
        this.printer = printer;
    }

    public void run() {
        int documentNumber = 1;
        while (true) {
            String document = "Document " + documentNumber;
            printer.printDocument(printerId, document);
            documentNumber++;

            try {
                // Pause between print jobs
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        PetersonPrinter printer = new PetersonPrinter();

        // Create and start two printer threads
        PrinterThread printer1 = new PrinterThread(0, printer);
        PrinterThread printer2 = new PrinterThread(1, printer);

        printer1.start();
        printer2.start();

        try {
            // Sleep for a while to allow printing to continue
            Thread.sleep(10000);

            // Interrupt the printer threads to stop the program
            printer1.interrupt();
            printer2.interrupt();

            // Wait for both printer threads to finish
            printer1.join();
            printer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
