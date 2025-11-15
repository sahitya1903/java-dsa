class Printer {
    synchronized void printDocument(String user, int pages) {
        System.out.println(user + " started printing...");
        for (int i = 1; i <= pages; i++) {
            System.out.println(user + " printing page " + i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
        System.out.println(user + " finished printing.");
    }
}

class UserThread extends Thread {
    Printer p;
    String user;
    int pages;

    UserThread(Printer p, String user, int pages) {
        this.p = p;
        this.user = user;
        this.pages = pages;
    }

    public void run() {
        p.printDocument(user, pages);
    }
}

public class PrintManager {
    public static void main(String[] args) {
        Printer printer = new Printer();

        UserThread u1 = new UserThread(printer, "User1", 3);
        UserThread u2 = new UserThread(printer, "User2", 4);
        UserThread u3 = new UserThread(printer, "User3", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}

