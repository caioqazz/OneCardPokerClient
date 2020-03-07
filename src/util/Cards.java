/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Cards {
    public int altura=90;
    public int largura=120;
    public ImageIcon CA ;
    public  ImageIcon DA ;
    public  ImageIcon HA ;
    public  ImageIcon SA ;
    public  ImageIcon C2 ;
    public  ImageIcon D2 ;
    public  ImageIcon H2 ;
    public  ImageIcon S2 ;
    public  ImageIcon C3 ;
    public  ImageIcon D3 ;
    public  ImageIcon H3 ;
    public  ImageIcon S3 ;
    public  ImageIcon C4 ;
    public  ImageIcon D4 ;
    public  ImageIcon H4 ;
    public  ImageIcon S4 ;
    public  ImageIcon C5 ;
    public  ImageIcon D5 ;
    public  ImageIcon H5 ;
    public  ImageIcon S5 ;
    public  ImageIcon C6 ;
    public  ImageIcon D6 ;
    public  ImageIcon H6 ;
    public  ImageIcon S6 ;
    public  ImageIcon C7 ;
    public  ImageIcon D7 ;
    public  ImageIcon H7 ;
    public  ImageIcon S7 ;
    public  ImageIcon C8 ;
    public  ImageIcon D8 ;
    public  ImageIcon H8 ;
    public  ImageIcon S8 ;
    public  ImageIcon C9 ;
    public  ImageIcon D9 ;
    public  ImageIcon H9 ;
    public  ImageIcon S9 ;
    public  ImageIcon C10 ;
    public  ImageIcon D10 ;
    public  ImageIcon H10 ;
    public  ImageIcon S10 ;
    public  ImageIcon CQ ;
    public  ImageIcon DQ ;
    public  ImageIcon HQ ;
    public  ImageIcon SQ ;
    public  ImageIcon CK ;
    public  ImageIcon DK ;
    public  ImageIcon HK ;
    public  ImageIcon SK ;
    public  ImageIcon CJ ;
    public  ImageIcon DJ ;
    public  ImageIcon HJ ;
    public  ImageIcon SJ ;
    public  ImageIcon Red_CARD ;
    public  ImageIcon Blue_CARD ;
    public  ImageIcon Gray_CARD ;

    public Cards(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
        setTam();
    }
    
    public void setTam(){
       CA = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/AC.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       DA = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/AD.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       HA = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/AH.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       SA = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/AS.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C2 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/2C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D2 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/2D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H2 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/2H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S2 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/2S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C3 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/3C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D3 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/3D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H3 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/3H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S3 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/3S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C4 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/4C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D4 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/4D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H4 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/4H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S4 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/4S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C5 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/5C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D5 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/5D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H5 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/5H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S5 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/5S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C6 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/6C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D6 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/6D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H6 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/6H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S6 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/6S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C7 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/7C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D7 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/7D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H7 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/7H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S7 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/7S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C8 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/8C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D8 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/8D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H8 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/8H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S8 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/8S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C9 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/9C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D9 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/9D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H9 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/9H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S9 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/9S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       C10 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/10C.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       D10 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/10D.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       H10 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/10H.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       S10 = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/10S.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       CQ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/QC.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       DQ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/QD.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       HQ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/QH.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       SQ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/QS.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       CK = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/KC.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       DK = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/KD.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       HK = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/KH.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       SK = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/KS.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       CJ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/JC.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       DJ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/JD.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       HJ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/JH.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       SJ = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/JS.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       Red_CARD = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/red_back.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       Blue_CARD = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/blue_back.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
       Gray_CARD = new ImageIcon(((new ImageIcon(getClass().getResource("/cards/gray_back.png"))).getImage()).getScaledInstance(altura, largura, java.awt.Image.SCALE_SMOOTH));
    }
    
    
    
    
    
    
    public ImageIcon getCard(int card) {
        switch (card) {
            case 0:
                return C2;
            case 1:
                return D2;
            case 2:
                return H2;
            case 3:
                return S2;
            case 4:
                return C3;
            case 5:
                return D3;
            case 6:
                return H3;
            case 7:
                return S3;
            case 8:
                return C4;
            case 9:
                return D4;
            case 10:
                return H4;
            case 11:
                return S4;
            case 12:
                return C5;
            case 13:
                return D5;
            case 14:
                return H5;
            case 15:
                return S5;
            case 16:
                return C6;
            case 17:
                return D6;
            case 18:
                return H6;
            case 19:
                return S6;
            case 20:
                return C7;
            case 21:
                return D7;
            case 22:
                return H7; 
            case 23:
                return S7;
            case 24:
                return C8;
            case 25:
                return D8;
            case 26:
                return H8;
            case 27:
                return S8;
            case 28:
                return C9;
            case 29:
                return D9;
            case 30:
                return H9;
            case 31:
                return S9;
            case 32:
                return C10;
            case 33:
                return D10;
            case 34:
                return H10;
            case 35:
                return S10;
            case 36:
                return CJ;
            case 37:
                return DJ;
            case 38:
                return HJ;
            case 39:
                return SJ;
            case 40:
                return CQ;
            case 41:
                return DQ;
            case 42:
                return HQ;
            case 43:
                return SQ;
            case 44:
                return CK;
            case 45:
                return DK;
            case 46:
                return HK;
            case 47:
                return SK;
            case 48:
                return CA;
            case 49:
                return DA;

            case 50:
                return HA;
            case 51:
                return SA;
            case 52:
                return Red_CARD;
            case 53:
                return Blue_CARD;
            case 54:
                return Gray_CARD;
            case 55:
                return null;
            case 56:
                return null;
            case 57:
                return null;
            case 58:
                return null;
            case 59:
                return null;
        }
        return null;
    }
}
