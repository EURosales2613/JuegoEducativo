/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathman;

import Formularios.*;

/**
 *
 * @author Eduar
 */
public class MathMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inicio_juego inicio = new Inicio_juego();
        SplahsScreen splash = new SplahsScreen();
        splash.setLocationRelativeTo(null);
        splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {

                Thread.sleep(40);
                splash.LoadTime.setText(Integer.toString(i) + "%");
                //El contador al llegar a 100 se cierra el primer splash screen y se habre el segundo
                if (i == 100) {
                    splash.setVisible(false);
                    inicio.setVisible(true);
                }
            }
        } catch (Exception e) {
        }

    }

}
