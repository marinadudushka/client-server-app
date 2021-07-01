import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;

public class Server{
    private String serverName;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public Server(String name,int port) {
        this.serverName = name;
        try {
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();//waits for request from client

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void receiveMessage(Message message){

        System.out.println("Message received: "+ LocalTime.now().toString() +" "+ LocalDate.now());
        System.out.println(message.getSender()+ " said: " + message.getMessage());

    }

}
