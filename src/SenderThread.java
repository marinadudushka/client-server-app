import java.io.PrintWriter;
import java.util.Scanner;

public class SenderThread implements Runnable{
    private Scanner scanner;
    private PrintWriter printWriter;

    public SenderThread(Scanner scanner, Client client) {
        this.scanner = scanner;
    }

    @Override
    public void run() {

        do{
            Message message = this.client.createMessage(scanner);
            System.out.println(message);
        }while(message!=null);

    }
}
