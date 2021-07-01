import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private String username;
    private Socket clientSocket;
    private BufferedReader input;
    private PrintWriter output;
    private Scanner sc = new Scanner(System.in);

    //should run a receiver thread and a sender thread

    public Message createMessage(Scanner scanner){
        Message message = null;
        try{
            System.out.print(username+":");
            String buffer = scanner.nextLine();
            message = new Message(this.username,buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
    public Client(String username,String address,int port) {
        this.username = username;
        try {
            this.clientSocket = new Socket(address, port);
            System.out.println("Connected to server.");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
