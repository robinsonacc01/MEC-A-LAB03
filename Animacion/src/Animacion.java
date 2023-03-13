import java.util.*;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Animacion extends javax.swing.JFrame {

    String[] imagenes = {"Image1.jpg", "Image2.jpg", "Image3.jpg", "Image4.jpg"};
    Timer timer = new Timer();
    int i = 0;
    
    public Animacion() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Slider = new javax.swing.JSlider();
        Imagenes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Slider.setMajorTickSpacing(10);
        Slider.setMaximum(30);
        Slider.setPaintLabels(true);
        Slider.setPaintTicks(true);
        Slider.setToolTipText("0");
        Slider.setValue(0);
        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });

        Imagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(Imagenes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
     
       int a = (int)Slider.getValue();
       timer.cancel();                       
       timer = new Timer();
       
       
       TimerTask tarea  = new TimerTask(){ 
        @Override
        public void run(){
            i = (i == 3 ? 0 : i+1);
            Imagenes.setIcon(new ImageIcon("Imagen/" + imagenes[i]));
            
           
        }
    };
     
       if (a == 0){
       timer.cancel();
       Imagenes.setIcon(new ImageIcon("Imagen/" + imagenes[0]));
       }else
       timer.scheduleAtFixedRate(tarea, 0, 1000);
        
        
    }//GEN-LAST:event_SliderStateChanged

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Animacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Animacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagenes;
    private javax.swing.JSlider Slider;
    // End of variables declaration//GEN-END:variables
}
