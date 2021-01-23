/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ksiazkakucharska;

import javax.swing.JLabel;


public class Controller {
    
    //RECIPE MODEL
    public class PrzepisController{
        
        public Recipe model;
        public NewJFrame.PrzepisView view;

        public PrzepisController(Recipe model, NewJFrame.PrzepisView view){
            this.model = model;
            this.view = view;
        }
        void wyswietl_caly_przepis_controller(JLabel miejscenazdjecie, JLabel miejscenatekst, String tekstprzepisu){
            view.wyswietl_caly_przepis(model, miejscenazdjecie, miejscenatekst, model.getTekstPrzepisuSformatowany());
        }
        void wyswietl_zdjecie_i_tytul_controller(JLabel miejscenazdjecie, JLabel miejscenatekst){
            view.wyswietl_zdjecie_i_tytul(model, miejscenazdjecie, miejscenatekst);
        }
    }
}
