/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Артём
 */
class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        
        vol = mybox.width * mybox.height * mybox.depth;
        
        System.out.println("объем коробки " + vol);
    }
}
