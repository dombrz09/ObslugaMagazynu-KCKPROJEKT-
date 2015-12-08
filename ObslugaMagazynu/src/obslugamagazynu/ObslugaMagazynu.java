
package obslugamagazynu;

import javax.swing.JFrame;

        


public class ObslugaMagazynu{

    public static void main(String[] args) {
        
       JFrame okno = new JFrame( "MAGAZYN" );
       applet windows = new applet();
       windows.init( );
       windows.start( );
       okno.setSize(1385, 880);
       okno.getContentPane().add(windows);
       okno.show();
       windows.stop();
       windows.destroy();
       
    }
    
}
