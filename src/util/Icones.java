/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.ImageIcon;

/**
 *
 * @author Caio
 */
public class Icones {

    public final ImageIcon CITIZEN = new ImageIcon(getClass().getResource("/imgs/citizenlow.jpg"));
    public final ImageIcon SLAVE = new ImageIcon(getClass().getResource("/imgs/slavelow.jpg"));
    public final ImageIcon SLAVE_BIG = new ImageIcon(getClass().getResource("/imgs/slaveBig.jpg"));
    public final ImageIcon EMPEROR = new ImageIcon(getClass().getResource("/imgs/emperorlow.jpg"));
    public final ImageIcon SET_CARD = new ImageIcon(getClass().getResource("/imgs/setCard.png"));
    public final ImageIcon CARD_EMPTY = new ImageIcon(getClass().getResource("/imgs/cardEmpty.png"));
    public final ImageIcon COINS = new ImageIcon(((new ImageIcon(getClass().getResource("/imgs/coins.png"))).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    public final ImageIcon COINS_BIGGER = new ImageIcon(((new ImageIcon(getClass().getResource("/imgs/coins.png"))).getImage()).getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH));
    public final ImageIcon User = new ImageIcon(((new ImageIcon(getClass().getResource("/imgs/user.png"))).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
    public final ImageIcon CARDS_CONNECT = new ImageIcon(((new ImageIcon(getClass().getResource("/imgs/back_cards-07.png"))).getImage()).getScaledInstance(625, 225, java.awt.Image.SCALE_SMOOTH));
    public final ImageIcon CARD1_NAME = new ImageIcon(((new ImageIcon(getClass().getResource("/imgs/honor_heart-14.png"))).getImage()).getScaledInstance(300, 230, java.awt.Image.SCALE_SMOOTH));
    public final ImageIcon CARD2_NAME = new ImageIcon(((new ImageIcon(getClass().getResource("/imgs/honors_spade-14.png"))).getImage()).getScaledInstance(300, 230, java.awt.Image.SCALE_SMOOTH));
}
