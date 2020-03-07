package remoteclasses;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.Game;

public class User extends UnicastRemoteObject implements UserInt {

    private final String name;
    private String oponent;
    private int bank, card1, card2;
    private int oponentBank;
    Game tela;
    private int cardSelected = -1;

    public User(String name, Game tela) throws RemoteException {
        super();
        this.tela = tela;
        this.name = name;
        bank = 100;
        oponentBank = 100;
        tela.setBank(bank, oponentBank);
        card1 = -1;
        card2 = -1;
    }

    public void setCardSelected(int cardSelected) {
        System.out.println("carta nao setada" + this.cardSelected);
        if (cardSelected == card1) {
            card1 = -1;
        } else {
            card2 = -1;
        }
        this.cardSelected = cardSelected;
        System.out.println("Setei carta" + this.cardSelected);
    }

    @Override
    public boolean challenge(String nome) throws RemoteException {
        oponent = nome;
        int n = JOptionPane.showConfirmDialog(null, "Gostaria de aceitar o convide de jogo de " + nome + " ?",
                "Solicitação de Jogo", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            tela.GamePanelShow();
            tela.setOponentName(oponent);
        }
        tela.setBank(bank, oponentBank);
        return (n == 0);

    }

    @Override
    public void flagSystem(boolean card1, boolean card2) throws RemoteException {
        if (card1) {
            System.out.print("Alta e ");
            tela.setFlagCardOne("Alta");
        } else {

            System.out.print("Baixa e ");
            tela.setFlagCardOne("Baixa");
        }
        if (card2) {
            System.out.print("alta");
            tela.setFlagCardTwo("Alta");
        } else {

            System.out.print("baixa");
            tela.setFlagCardTwo("Baixa");
        }
        System.out.println("");
    }

    public void setOponent(String oponent) {
        this.oponent = oponent;
    }

    @Override
    public void results(String winner, int winnings, int cartaDoJogador, int cartaDoOponente) throws RemoteException {
        cardSelected = -1;
        tela.setOponentCard(cartaDoOponente);
        if (name.equals(winner)) {
            System.out.println("Você venceu esta rodada.");
            tela.newTurn("Você venceu esta rodada.");
            bank += winnings;
            oponentBank = oponentBank - winnings;
            tela.setBank(bank, oponentBank);
        } else {
            System.out.println("Você perdeu esta rodada.");
            tela.newTurn("Você perdeu esta rodada.");
            bank -= winnings;
            oponentBank = oponentBank + winnings;
            tela.setBank(bank, oponentBank);
        }
        System.out.println("winnings"+winnings);
    }

    @Override
    public void endGame(String winner) throws RemoteException {
        if (name.equals(winner)) {
            System.out.println("Você venceu este jogo.");
            tela.setLabelMensagem("Você venceu este jogo.");
            tela.endGame("Você venceu este jogo.");
        } else {
            System.out.println("Você perdeu este jogo.");
            tela.setLabelMensagem("Você perdeu este jogo.");
            tela.endGame("Você perdeu este jogo.");
        }
        bank = 100;
        oponentBank = 100;
        tela.setBank(bank, oponentBank);
        card1 = -1;
        card2 = -1;
    }

    @Override
    public void setCard(int card) throws RemoteException {
        cardSelected = -1;
        if (card1 == -1) {
            card1 = card;
        } else {
            card2 = card;

        }

        tela.setCards(card1, card2);
        System.out.println("Suas cartas: " + card1 + " " + card2);
    }

    @Override
    public int getCard() throws RemoteException {
        if (cardSelected != -1) {
            System.out.println("carda setada " + cardSelected);
        }

        return cardSelected;
        /*
            System.out.println("Escolha uma carta para jogar. Carta 1: " + card1 + " Carta2: " + card2);
            int aux;
            aux = scan.nextInt();
            if (aux == 1) {
                return card1;
            }
            return card2;
         */
    }

    @Override
    public int bet(int oponentBet) throws RemoteException {
        int n = 0;
        if (oponentBet == 0) {
            n = inicialBet(oponentBet);
        } else {
            n = replyBet(oponentBet);
        }

        switch (n) {
            case 0:
                return oponentBet;
            case 1:
                return (-1);
            case 2:
                return  bank;
            case 3:
                return (oponentBet + 10);
            case 4:
                return (oponentBet + 50);
            case 5:
                return (oponentBet + 100);
        }
        /*
            System.out.println("Oponente apostou " + oponentBet + ". Você quer Apostar 0 (1), Apostar(2), desistir(3)");
            int aux;
            aux = scan.nextInt();
            
         */
        System.out.println("retornei zero");
        return 0;

    }

    public int inicialBet(int oponentBet) {
        String[] options =  optionsIncial(oponentBet);
        return JOptionPane.showOptionDialog(null, "Faça uma aposta inicial", "Aposta Inicial",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
    }

    public int replyBet(int oponentBet) {
        String[] options = optionsReply(oponentBet);
        return JOptionPane.showOptionDialog(null, oponent + " apostou " + oponentBet + ", deseja:", "Aposta de "+oponent,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
    }
  public String[] optionsIncial(int oponentBet) {
        int value = bank - oponentBet;
        int valueOponent = oponentBank - oponentBet;
        
        if (value < 10 || valueOponent <= 0) {
        return new String[]{"Apostar 0", "Desistir","ALL IN("+bank+")"};
        } else if (value >= 10 && value < 50 ) {
            return new String[]{"Apostar 0", "Desistir","ALL IN ("+bank+")", "Apostar 10"};
        } else if (value >= 50 && value < 100) {
            return new String[]{"Apostar 0", "Desistir","ALL IN ("+bank+")", "Apostar 10", "Apostar 50"};
        }else if (value >= 100 ) {
            return new String[]{"Apostar 0", "Desistir","ALL IN ("+bank+")", "Apostar 10", "Apostar 50", "Apostar 100"};
        }
        return new String[]{"Apostar 0", "Desistir", "Apostar 10"};
    }
    public String[] optionsReply(int oponentBet) {
        int value = bank - oponentBet;
        int valueOponent = oponentBank - oponentBet;
        
        if (value < 10 || valueOponent <= 0) {
        return new String[]{"Cobrir", "Desistir","ALL IN("+bank+")"};
        } else if (value >= 10 && value < 50 ) {
            return new String[]{"Cobrir", "Desistir","ALL IN ("+bank+")", "Aumentar 10"};
        } else if (value >= 50 && value < 100) {
            return new String[]{"Cobrir", "Desistir","ALL IN ("+bank+")", "Aumentar 10", "Aumentar 50"};
        }else if (value >= 100 ) {
            return new String[]{"Cobrir", "Desistir","ALL IN ("+bank+")", "Aumentar 10", "Aumentar 50", "Aumentar 100"};
        }
        return new String[]{"Cobrir", "Desistir", "Aumentar 10"};
    }
    
    @Override
    public void testConnection(){}
}
