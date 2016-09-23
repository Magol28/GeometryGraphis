/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.math.grafic.forms.Shape;

import ec.edu.espe.math.geometry.solids.circularsolids.Cone;
import ec.edu.espe.math.geometry.solids.circularsolids.Cylinder;
import ec.edu.espe.math.geometry.solids.circularsolids.Frustum;
import ec.edu.espe.math.geometry.solids.circularsolids.Sphere;
import ec.edu.espe.math.geometry.solids.cubicsolids.Cube;
import ec.edu.espe.util.GeometricConstants;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel_Angel
 */
public class SolidMenu extends javax.swing.JFrame {

    public SolidMenu() {
        Datessolid(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dates_solid = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txRadio = new javax.swing.JTextField();
        Txoradio = new javax.swing.JTextField();
        txHeigth = new javax.swing.JTextField();
        Txside = new javax.swing.JTextField();
        txvolume = new javax.swing.JButton();
        txarea = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Strar_solid = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Optionsolid = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dates_solid.setBorder(new javax.swing.border.MatteBorder(null));
        Dates_solid.setEnabled(false);

        jLabel3.setText("Radio");

        jLabel4.setText("heigth");

        jLabel5.setText("Other Radio");

        jLabel6.setText("Side");

        txvolume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txvolume.setText(" calculate volume");
        txvolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txvolumeActionPerformed(evt);
            }
        });

        txarea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txarea.setText("calculate Area");
        txarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txareaActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Dates_solidLayout = new javax.swing.GroupLayout(Dates_solid);
        Dates_solid.setLayout(Dates_solidLayout);
        Dates_solidLayout.setHorizontalGroup(
            Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dates_solidLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txoradio, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(txRadio)
                    .addComponent(txHeigth)
                    .addComponent(Txside))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dates_solidLayout.createSequentialGroup()
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txarea)
                            .addComponent(txvolume))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dates_solidLayout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(59, 59, 59))))
        );
        Dates_solidLayout.setVerticalGroup(
            Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dates_solidLayout.createSequentialGroup()
                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dates_solidLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(Dates_solidLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txvolume))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txoradio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Dates_solidLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txHeigth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txarea))
                                .addGap(11, 11, 11)
                                .addComponent(Txside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dates_solidLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Back)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Strar_solid.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Optionsolid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Optionsolid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cube", "Sphere", "Cone", "Cylinder", "Frustum" }));

        jLabel2.setText("Optión ");

        javax.swing.GroupLayout Strar_solidLayout = new javax.swing.GroupLayout(Strar_solid);
        Strar_solid.setLayout(Strar_solidLayout);
        Strar_solidLayout.setHorizontalGroup(
            Strar_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Strar_solidLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(Optionsolid, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
        );
        Strar_solidLayout.setVerticalGroup(
            Strar_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Strar_solidLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(Strar_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Optionsolid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Solid Menu ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Strar_solid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dates_solid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Strar_solid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Dates_solid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void printDates(String name,String parameter, String value){
            JOptionPane.showMessageDialog(rootPane, "The "+parameter+" of "+name +" is: "+value);
    }
    private void txvolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txvolumeActionPerformed
 
String name,parameter, value;
parameter=GeometricConstants.VOLUME;
switch(Optionsolid.getSelectedIndex()){
 
    case 0:
        Cube Cube1=new Cube(Float.parseFloat(Txside.getText()));
        name =Cube.class.getSimpleName();
       value=Cube1.CalculateVolume()+"";
       printDates(parameter,name,value);
        break;
     case 1:
          Sphere Sphere1=new Sphere(Float.parseFloat(txRadio.getText()));
        name =Sphere.class.getSimpleName();
       value=Sphere1.CalculateVolume()+"";
        printDates(parameter,name,value);
        break;
     case 2:
         Cone Cone1= new Cone(Float.parseFloat(txHeigth.getText()),Float.parseFloat(txRadio.getText()));
          name =Cone.class.getSimpleName();
       value=Cone1.CalculateVolume()+"";
        printDates(parameter,name,value);
        break;
     case 3:
         Cylinder Cylinder1= new Cylinder(Float.parseFloat(txHeigth.getText()),Float.parseFloat(txRadio.getText()));
          name =Cylinder.class.getSimpleName();
       value=Cylinder1.CalculateVolume()+"";
        printDates(parameter,name,value);
        break;
     case 4:
          Frustum Frustum1= new Frustum(Float.parseFloat(txHeigth.getText()),Float.parseFloat(Txoradio.getText()),Float.parseFloat(txRadio.getText()));
          name =Frustum.class.getSimpleName();
       value=Frustum1.CalculateVolume()+"";
        printDates(parameter,name,value);
        break;
}

    }//GEN-LAST:event_txvolumeActionPerformed

    private void Strarsolid(boolean click){
        Optionsolid.setEnabled(click);
        jButton1.setEnabled(click);
        
    }
    private void Datessolid(boolean boton){
        txRadio.setEnabled(boton);
        Txoradio.setEnabled(boton);
        txHeigth.setEnabled(boton);
        Txside.setEnabled(boton);
        botonsenable(boton);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Strarsolid(false);      
      botonsenable(true);
switch(Optionsolid.getSelectedIndex()){
    case 0:
        Txside.setEnabled(true);
        break;
     case 1:
         txRadio.setEnabled(true);
        break;
     case 2:
         txHeigth.setEnabled(true);
         txRadio.setEnabled(true);
        break;
     case 3:
        txHeigth.setEnabled(true);
        txRadio.setEnabled(true);
        break;
     case 4:
        txHeigth.setEnabled(true);
        Txoradio.setEnabled(true);
        txRadio.setEnabled(true);
        break;
}
      
    }//GEN-LAST:event_jButton1ActionPerformed
private void botonsenable(boolean boton){
    txvolume.setEnabled(boton);
    txarea.setEnabled(boton);
    Back.setEnabled(boton);
    
}
    private void txareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txareaActionPerformed
 
String name,parameter, value;
parameter=GeometricConstants.AREA;
switch(Optionsolid.getSelectedIndex()){
 
    case 0:
        Cube Cube1=new Cube(Float.parseFloat(Txside.getText()));
        name =Cube.class.getSimpleName();
       value=Cube1.CalculateArea()+"";
       printDates(parameter,name,value);
        break;
     case 1:
          Sphere Sphere1=new Sphere(Float.parseFloat(txRadio.getText()));
        name =Sphere.class.getSimpleName();
       value=Sphere1.CalculateArea()+"";
        printDates(parameter,name,value);
        break;
     case 2:
         Cone Cone1= new Cone(Float.parseFloat(txHeigth.getText()),Float.parseFloat(txRadio.getText()));
          name =Cone.class.getSimpleName();
       value=Cone1.CalculateArea()+"";
        printDates(parameter,name,value);
        break;
     case 3:
         Cylinder Cylinder1= new Cylinder(Float.parseFloat(txHeigth.getText()),Float.parseFloat(txRadio.getText()));
          name =Cylinder.class.getSimpleName();
       value=Cylinder1.CalculateArea()+"";
        printDates(parameter,name,value);
        break;
     case 4:
          Frustum Frustum1= new Frustum(Float.parseFloat(txHeigth.getText()),Float.parseFloat(Txoradio.getText()),Float.parseFloat(txRadio.getText()));
          name =Frustum.class.getSimpleName();
       value=Frustum1.CalculateArea()+"";
        printDates(parameter,name,value);
        break;
}
    }//GEN-LAST:event_txareaActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    Strarsolid(true);
    Datessolid(false);     // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SolidMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel Dates_solid;
    private javax.swing.JComboBox<String> Optionsolid;
    private javax.swing.JPanel Strar_solid;
    private javax.swing.JTextField Txoradio;
    private javax.swing.JTextField Txside;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txHeigth;
    private javax.swing.JTextField txRadio;
    private javax.swing.JButton txarea;
    private javax.swing.JButton txvolume;
    // End of variables declaration//GEN-END:variables
}
