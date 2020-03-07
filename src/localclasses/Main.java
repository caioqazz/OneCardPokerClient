package localclasses;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.JFrame;
import remoteclasses.ServerInt;
import remoteclasses.User;
import view.Game;

public class Main {

    ServerInt server;
    String name;
    Game tela;
    User user;
    String IP;
    public Main(Game tela) {
        this.tela= tela;
    }

    public void iniciar() {
        new Thread() {

            @Override
            public void run() {
                try {
                     user = new User(name, tela);

                    System.setSecurityManager(null);

                    Registry registryServer = LocateRegistry.getRegistry(IP, 1996);
                    server = (ServerInt) registryServer.lookup("Server");

                    server.login(name, user);

                    //while (true);
                } catch (NotBoundException | RemoteException e) {
                    System.err.println("Client exception: " + e.toString());
                }
            }
        }.start();
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
    
    public void logout(){
        server.logout(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getPlayers() throws RemoteException {
        return server.getPlayers();
    }
    
    public boolean challenge(String oponent) throws RemoteException{
      return  server.challenge(name, oponent);
    }
    public void setCardSelected(int cardSelected) {
       user.setCardSelected(cardSelected);
    }
    public void setOponent(String oponent) {
        user.setOponent(oponent);
    }
}
