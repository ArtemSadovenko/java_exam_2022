package task_1;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        Client client1 = new Client("Caun", "Dabu", "erw@gmail.com", 3000);
        Client client2 = new Client("Dam", "Sam", "erw@gmail.com", 3000);
        Client client3 = new Client("Koly", "Ifo", "sd", 3000);
        Client client4 = new Client("Koly", "Ifo", "Opal@gmail.com", 3000);
        server.save(client1);
        server.save(client2);
        server.save(client4);

        System.out.println(server);
    }
}
