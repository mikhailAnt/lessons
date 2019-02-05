/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polindrom;

/**
 *
 * @author user
 */
public class Controller {
    model model =new model();
    View view = new View();
    Controller(){
        view.View(model.model("Привет хай"));
    }
}
