package Class;

import Models.queriesModel;
import Views.priceChecker;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class main {
    
    //colors defined for the views in the complete program
    public static Color MainColor=new Color(102,0,102);
    public static Color SecondColor=new Color(102,0,102);
    public static final Color whiteColor=new Color(255,255,255);

    
    
    
    public static void main(String[] args) {
        //this method is defined the color for the program
        randomColors();
        
        //in this method is defined the design of the view with the interface from
        //window
        designView();
        
        //this class is the main, the firts windows that start with the program

        startView(startProviders());
       
    }
    
    //method where is called the firts view
    public static void startView(List providers){
        priceChecker v1=new priceChecker(providers);
        v1.setTitle("Verificador de Precios Papeleria");
        v1.setLocationRelativeTo(null);
        v1.setExtendedState(MAXIMIZED_BOTH);     
        v1.setVisible(true);
    }
    
    //this objet is initialized to star with the values of the providers 
    public static List startProviders(){
        queriesModel m=new queriesModel();
        m.queryProviders();
        return m.getProviders();
    }
    
    //interface for the views
    public static void designView(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException error){
            JOptionPane.showMessageDialog(null,"Error Fernando"+error.getMessage()
                    , null, MAXIMIZED_BOTH);
        }
    }
    
    
    //default colors
    public static void randomColors(){
        int numero= (int)(Math.random()*63)+1;
        switch(numero){
            //special
            case 1:
                MainColor=new Color( 0, 0, 0 );
                SecondColor=new Color(10, 10, 10 );
                break;
            case 2:
                MainColor=new Color( 252, 0, 168 );
                SecondColor=new Color(255, 25, 186 );
                break;
            case 3:
                MainColor=new Color(255, 0, 0);
                SecondColor=new Color(235, 0, 0);
                break;
            //************************************************
            case 4:
                MainColor=new Color( 51, 105, 30);
                SecondColor=new Color(104, 159, 56);
                break;
            case 5:
                MainColor=new Color(67, 160, 71);
                SecondColor=new Color(  102, 187, 106 );
                break;
            case 6:
                MainColor=new Color( 27, 94, 32 );
                SecondColor=new Color( 56, 142, 60 );
                break;
            case 7:
                MainColor=new Color(0, 137, 123);
                SecondColor=new Color( 38, 166, 154 );
                break;
            case 8:
                MainColor=new Color( 0, 77, 64 );
                SecondColor=new Color( 0, 121, 107);
                break;
            case 9:
                MainColor=new Color(0, 172, 193);
                SecondColor=new Color(38, 198, 218);
                break;
            case 10:
                MainColor=new Color( 0, 96, 100);
                SecondColor=new Color(0, 151, 167);
                break;
            case 11:
                MainColor=new Color(3, 155, 229);
                SecondColor=new Color( 41, 182, 246 );
                break;
            case 12:
                MainColor=new Color(1, 87, 155);
                SecondColor=new Color( 2, 136, 209);
                break;
            case 13:
                MainColor=new Color( 30, 136, 229);
                SecondColor=new Color( 66, 165, 245 );
                break;
            case 14:
                MainColor=new Color( 13, 71, 161 );
                SecondColor=new Color(25, 118, 210);
                break;
            case 15:
                MainColor=new Color( 57, 73, 171);
                SecondColor=new Color(92, 107, 192);
                break;
            case 16:
                MainColor=new Color( 26, 35, 126 );
                SecondColor=new Color( 48, 63, 159);
                break;
            case 17:
                MainColor=new Color( 94, 53, 177 );
                SecondColor=new Color(126, 87, 194);
                break;
            case 18:
                MainColor=new Color( 49, 27, 146 );
                SecondColor=new Color( 81, 45, 168);
                break;
            case 19:
                MainColor=new Color( 142, 36, 170 );
                SecondColor=new Color(171, 71, 188);
                break;
            case 20:
                MainColor=new Color(74, 20, 140);
                SecondColor=new Color(123, 31, 162);
                break;
            case 21:
                MainColor=new Color( 216, 27, 96 );
                SecondColor=new Color(  236, 64, 122);
                break;
            case 22:
                MainColor=new Color(136, 14, 79);
                SecondColor=new Color( 194, 24, 91);
                break;
            case 23:
                MainColor=new Color(229, 57, 53);
                SecondColor=new Color(239, 83, 80);
                break;
            case 24:
                MainColor=new Color(183, 28, 28 );
                SecondColor=new Color(211, 47, 47);
                break;
            case 25:
                MainColor=new Color(  39, 55, 70 );
                SecondColor=new Color(86, 101, 115);
                break;
            case 26:
                MainColor=new Color( 23, 32, 42);
                SecondColor=new Color(33, 47, 61);
                break;
            case 27:
                MainColor=new Color(46, 64, 83);
                SecondColor=new Color(93, 109, 126);
                break;
            case 28:
                MainColor=new Color( 27, 38, 49 );
                SecondColor=new Color(40, 55, 71);
                break;
            case 29:
                MainColor=new Color(66, 73, 73);
                SecondColor=new Color(97, 106, 107);
                break;
            case 30:
                MainColor=new Color( 77, 86, 86);
                SecondColor=new Color( 113, 125, 126);
                break;
            case 31:
                MainColor=new Color( 98, 101, 103);
                SecondColor=new Color(144, 148, 151);
                break;
            case 32:
                MainColor=new Color( 123, 125, 125);
                SecondColor=new Color(  179, 182, 183 );
                break;
            case 33:
                MainColor=new Color( 186, 74, 0);
                SecondColor=new Color( 220, 118, 51 );
                break;
            case 34:
                MainColor=new Color(110, 44, 0);
                SecondColor=new Color(160, 64, 0);
                break;
            case 35:
                MainColor=new Color(202, 111, 30 );
                SecondColor=new Color( 235, 152, 78 );
                break;
            case 36:
                MainColor=new Color( 120, 66, 18 );
                SecondColor=new Color(175, 96, 26);
                break;
            case 37:
                MainColor=new Color(202, 111, 30);
                SecondColor=new Color( 245, 176, 65);
                break;
            case 38:
                MainColor=new Color(126, 81, 9);
                SecondColor=new Color(185, 119, 14);
                break;
            case 39:
                MainColor=new Color(212, 172, 13);
                SecondColor=new Color(244, 208, 63);
                break;
            case 40:
                MainColor=new Color( 125, 102, 8 );
                SecondColor=new Color( 183, 149, 11);
                break;
            case 41:
                MainColor=new Color( 40, 180, 99);
                SecondColor=new Color(88, 214, 141);
                break;
            case 42:
                MainColor=new Color(24, 106, 59);
                SecondColor=new Color(35, 155, 86);
                break;
            case 43:
                MainColor=new Color(34, 153, 84);
                SecondColor=new Color(82, 190, 128);
                break;
            case 44:
                MainColor=new Color( 20, 90, 50 );
                SecondColor=new Color(30, 132, 73);
                break;
            case 45:
                MainColor=new Color( 19, 141, 117 );
                SecondColor=new Color( 69, 179, 157);
                break;
            case 46:
                MainColor=new Color(11, 83, 69);
                SecondColor=new Color( 17, 122, 101 );
                break;
            case 47:
                MainColor=new Color(23, 165, 137);
                SecondColor=new Color( 26, 188, 156 );
                break;
            case 48:
                MainColor=new Color(14, 98, 81);
                SecondColor=new Color( 20, 143, 119 );
                break;
            case 49:
                MainColor=new Color( 46, 134, 193);
                SecondColor=new Color( 93, 173, 226);
                break;
            case 50:
                MainColor=new Color( 27, 79, 114);
                SecondColor=new Color( 40, 116, 166);
                break;
            case 51:
                MainColor=new Color(36, 113, 163);
                SecondColor=new Color( 84, 153, 199 );
                break;
            case 52:
                MainColor=new Color(21, 67, 96);
                SecondColor=new Color(31, 97, 141);
                break;
            case 53:
                MainColor=new Color(125, 60, 152);
                SecondColor=new Color(165, 105, 189);
                break;
            case 54:
                MainColor=new Color(74, 35, 90);
                SecondColor=new Color(108, 52, 131);
                break;
            case 55:
                MainColor=new Color(136, 78, 160);
                SecondColor=new Color( 155, 89, 182 );
                break;
            case 56:
                MainColor=new Color( 81, 46, 95 );
                SecondColor=new Color( 118, 68, 138 );
                break;
            case 57:
                MainColor=new Color( 203, 67, 53);
                SecondColor=new Color( 236, 112, 99 );
                break;
            case 58:
                MainColor=new Color(120, 40, 31);
                SecondColor=new Color(176, 58, 46);
                break;
            case 59:
                MainColor=new Color( 169, 50, 38  );
                SecondColor=new Color( 205, 97, 85);
                break;
            case 60:
                MainColor=new Color( 100, 30, 22 );
                SecondColor=new Color( 146, 43, 33 );
                break;
            case 61:
                MainColor=new Color( 111, 255, 22 );
                SecondColor=new Color( 152, 255, 60 );
                break;
            case 62:
                MainColor=new Color(3, 155, 229);
                SecondColor=new Color(25, 118, 210);
                break;
            case 63:
                MainColor=new Color(  30, 136, 229);
                SecondColor=new Color( 3, 155, 229);
                break;
            
        }
    }
    
}
