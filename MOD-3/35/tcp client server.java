import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client...");

            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connected.");

                BufferedReader clientReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter clientWriter = new PrintWriter(clientSocket.getOutputStream(), true);

                BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

                Thread sendThread = new Thread(() -> {
                    try {
                        String msgToSend;
                        while ((msgToSend = consoleReader.readLine()) != null) {
                            clientWriter.println(msgToSend);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                Thread receiveThread = new Thread(() -> {
                    try {
                        String msgReceived;
                        while ((msgReceived = clientReader.readLine()) != null) {
                            System.out.println("Client: " + msgReceived);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

                sendThread.start();
                receiveThread.start();

                sendThread.join();
                receiveThread.join();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
