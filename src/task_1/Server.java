package task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Server {
    private List<Client> clients = new ArrayList<>();
    private long id = 0;

    @Override
    public String toString() {
        String res = "";
        for (Client client : clients) {
            res += (client.toString());
        }

        return res;
    }

    public void save(Client client) {
        try {
            for (Client serv: clients) {
                if(serv.getEmail().equals(client.getEmail())){
                    throw new InvalidData("Client with email: " + client.getEmail() + " already exists");
                }
            }
            id++;
            client.setId(id);
            clients.add(client);
        }catch (InvalidData e){
            e.invoke();
        }
    }
}
