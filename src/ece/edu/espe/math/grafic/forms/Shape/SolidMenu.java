/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.math.grafic.forms.Shape;

import converter.measures.Converter_Measures;
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
  public void cargaritems(){
      for(int i=0;i<Converter_Measures.names.length;i++){
          Centry.addItem(Converter_Measures.names[i]);
           Cexit.addItem(Converter_Measures.names[i]);
      }
  }
    public SolidMenu() {
      
        initComponents();
        cargaritems();
          Datessolid(false);
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
        jLabel7 = new javax.swing.JLabel();
        Centry = new javax.swing.JComboBox<>();
        Cexit = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
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

        jLabel7.setText("Entry");

        jLabel8.setText("Exit");

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
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dates_solidLayout.createSequentialGroup()
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txoradio, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txRadio)
                            .addComponent(txHeigth)
                            .addComponent(Txside))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dates_solidLayout.createSequentialGroup()
                                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txarea)
                                    .addComponent(txvolume))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dates_solidLayout.createSequentialGroup()
                                .addComponent(Back)
                                .addGap(65, 65, 65))))
                    .addGroup(Dates_solidLayout.createSequentialGroup()
                        .addComponent(Centry, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(Cexit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Dates_solidLayout.setVerticalGroup(
            Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dates_solidLayout.createSequentialGroup()
                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dates_solidLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Txoradio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Dates_solidLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txvolume)
                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Dates_solidLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txHeigth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txarea))
                                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Dates_solidLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Txside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addGroup(Dates_solidLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Back)))
                                .addGap(0, 34, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dates_solidLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Dates_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Centry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(Cexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
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

        jLabel2.setText("Option ");

        javax.swing.GroupLayout Strar_solidLayout = new javax.swing.GroupLayout(Strar_solid);
        Strar_solid.setLayout(Strar_solidLayout);
        Strar_solidLayout.setHorizontalGroup(
            Strar_solidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Strar_solidLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(Optionsolid, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
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
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Solid Menu ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Strar_solid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dates_solid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(Strar_solid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Dates_solid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void printDates(String name,String parameter, String value,int exit){
            JOptionPane.showMessageDialog(rootPane, "The "+parameter+" of "+name +" is: "+value+" "+Converter_Measures.names[exit]);
    }
    private Float convertUnits(Float number, int indexfinal,int indexinicial){
        Float calculo;
         calculo=Converter_Measures.Convert(number,indexinicial);
         return Converter_Measures.Convertto(calculo, indexfinal);
                
    }
    private void txvolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txvolumeActionPerformed
 
String name,parameter, value;
parameter=GeometricConstants.VOLUME;
int exit=Cexit.getSelectedIndex();
switch(Optionsolid.getSelectedIndex()){
 
    case 0:
        Cube Cube1=new Cube(Float.parseFloat(Txside.getText()));
        name =Cube.class.getSimpleName();
       value=convertUnits(Cube1.CalculateVolume(),Cexit.getSelectedIndex(),Centry.getSelectedIndex())+"";
       printDates(parameter,name,value,exit);
        break;
     case 1:
          Sphere Sphere1=new Sphere(Float.parseFloat(txRadio.getText()));
        name =Sphere.class.getSimpleName();
       value=convertUnits(Sphere1.CalculateVolume(),Cexit.getSelectedIndex(),Centry.getSelectedIndex())+"";
        printDates(parameter,name,value,exit);
        break;
     case 2:
         Cone Cone1= new Cone(Float.parseFloat(txHeigth.getText()),Float.parseFloat(txRadio.getText()));
          name =Cone.class.getSimpleName();
       value=convertUnits(Cone1.CalculateVolume(),Cexit.getSelectedIndex(),Centry.getSelectedIndex())+"";
        printDates(parameter,name,value,exit);
        break;
     case 3:
         Cylinder Cylinder1= new Cylinder(Float.parseFloat(txHeigth.getText()),Float.parseFloat(txRadio.getText()));
          name =Cylinder.class.getSimpleName();
       value=convertUnits(Cylinder1.CalculateVolume(),Cexit.getSelectedIndex(),Centry.getSelectedIndex())+"";
        printDates(parameter,name,value,exit);
        break;
     case 4:
          Frustum Frustum1= new Frustum(Float.parseFloat(txHeigth.getText()),Float.parseFloat(Txoradio.getText()),Float.parseFloat(txRadio.getText()));
          name =Frustum.class.getSimpleName();
      value=convertUnits(Frustum1.CalculateVolume(),Cexit.getSelectedIndex(),Centry.getSelectedIndex())+"";
         printDates(parameter,name,value,exit);
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
int exit=Cexit.getSelectedIndex();
switch(Optionsolid.getSelectedIndex()){
 
    case 0:
        Cube Cube1=new Cube(convertUnits(Float.parseFloat(Txside.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()));
        name =Cube.class.getSimpleName();
       value=Cube1.CalculateArea()+"";
       printDates(parameter,name,value,exit);
        break;
     case 1:
          Sphere Sphere1=new Sphere(convertUnits(Float.parseFloat(txRadio.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()));
        name =Sphere.class.getSimpleName();
       value=Sphere1.CalculateArea()+"";
       printDates(parameter,name,value,exit);
        break;
     case 2:
            Cone Cone1= new Cone(convertUnits(Float.parseFloat(txHeigth.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(txRadio.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()));
          name =Cone.class.getSimpleName();
        value=convertUnits(Cone1.CalculateArea(),Cexit.getSelectedIndex(),Centry.getSelectedIndex())+"";
       printDates(parameter,name,value,exit);
        break;
     case 3:
         Cylinder Cylinder1= new Cylinder(convertUnits(Float.parseFloat(txHeigth.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(txRadio.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()));
         name =Cylinder.class.getSimpleName();
        value=Cylinder1.CalculateArea()+"";
       printDates(parameter,name,value,exit);
        break;
     case 4:
          Frustum Frustum1= new Frustum(convertUnits(Float.parseFloat(txHeigth.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(Txoradio.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(txRadio.getText()),Cexit.getSelectedIndex(),Centry.getSelectedIndex()));
          name =Frustum.class.getSimpleName();
        value=Frustum1.CalculateArea()+"";
        printDates(parameter,name,value,exit);
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
    private javax.swing.JComboBox<String> Centry;
    private javax.swing.JComboBox<String> Cexit;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txHeigth;
    private javax.swing.JTextField txRadio;
    private javax.swing.JButton txarea;
    private javax.swing.JButton txvolume;
    // End of variables declaration//GEN-END:variables
}
