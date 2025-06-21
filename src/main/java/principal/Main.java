package principal;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        int HI = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a hora inicial: "));
        int HF = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a hora final: "));
        int duracao;

        if(HI < HF){
            duracao = HF - HI;
        }else{
            duracao = 24 - HI + HF;
        }
        JOptionPane.showMessageDialog(null,"O jogo durou " + duracao + " horas");
    }
}