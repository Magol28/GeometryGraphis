/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.math.grafic.forms.Shape;

import converter.measures.Converter_Measures;
import ec.edu.espe.math.geometry.shape.circumference.Circle;
import ec.edu.espe.math.geometry.shape.circumference.Ellipse;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Parallelogram;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Rhombus;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Square;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Trapezoid;
import ec.edu.espe.math.geometry.shape.triangles.EquilateralTriangle;
import ec.edu.espe.math.geometry.shape.triangles.IsocelesTriangle;
import ec.edu.espe.math.geometry.shape.triangles.RightAngleTriangle;
import ec.edu.espe.math.geometry.shape.triangles.ScaleneTriangle;
import ec.edu.espe.math.geometry.shape.quadrilaterals.Rectangle;
import ec.edu.espe.util.GeometricConstants;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel_Angel
 */
public class MenuShapes extends javax.swing.JFrame {

  public void cargaritems(){
      for(int i=0;i<Converter_Measures.names.length;i++){
          Centry.addItem(Converter_Measures.names[i]);
           CExit.addItem(Converter_Measures.names[i]);
      }
  }
    public MenuShapes() {
        initComponents();
        panelstart(false);
        cargaritems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_start = new javax.swing.JPanel();
        Start = new javax.swing.JButton();
        ShapesSellection = new javax.swing.JComboBox<>();
        data_entry = new javax.swing.JPanel();
        Perimeter = new javax.swing.JButton();
        Area = new javax.swing.JButton();
        base = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        side2 = new javax.swing.JLabel();
        side3 = new javax.swing.JLabel();
        TXBase = new java.awt.TextField();
        txside2 = new java.awt.TextField();
        txside3 = new java.awt.TextField();
        TXheigth = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txRadio1 = new java.awt.TextField();
        TxRadio2 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxSdia = new java.awt.TextField();
        TxBdia = new java.awt.TextField();
        atras = new javax.swing.JButton();
        Centry = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CExit = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Shapes Menu");

        Start.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        ShapesSellection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ShapesSellection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Square", "Equilateral Triangle", "Isosceles Triangle", "RigthAngle Triangle", "Ecalene Triangle", "Circle", "Ellipse", "Rhombus", "Trapezoid", "Rectangle", "Quadrilateral" }));

        data_entry.setBorder(new javax.swing.border.MatteBorder(null));
        data_entry.setEnabled(false);

        Perimeter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Perimeter.setText("Calcular Perímetro");
        Perimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerimeterActionPerformed(evt);
            }
        });

        Area.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Area.setText("Calcular Area ");
        Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaActionPerformed(evt);
            }
        });

        base.setText("Base");

        altura.setText("Altura");

        side2.setText("Lado 2");

        side3.setText("Lado3");

        jLabel2.setText("Radio one");

        jLabel3.setText("Radio two");

        jLabel4.setText("Big Diagonal");

        jLabel5.setText("Small Diagonal");

        atras.setText("Back");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jLabel6.setText("Entry");

        jLabel7.setText("Exit");

        javax.swing.GroupLayout data_entryLayout = new javax.swing.GroupLayout(data_entry);
        data_entry.setLayout(data_entryLayout);
        data_entryLayout.setHorizontalGroup(
            data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_entryLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(data_entryLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(data_entryLayout.createSequentialGroup()
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(base)
                            .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(side3)
                                .addComponent(side2)
                                .addComponent(altura)))
                        .addGap(21, 21, 21)))
                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Centry, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TXBase, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txside3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txside2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXheigth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(data_entryLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Area)
                        .addGap(25, 25, 25))
                    .addGroup(data_entryLayout.createSequentialGroup()
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(data_entryLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(txRadio1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addGroup(data_entryLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxBdia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxRadio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(80, 80, 80)
                        .addComponent(Perimeter)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, data_entryLayout.createSequentialGroup()
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(data_entryLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7)))
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(data_entryLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CExit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_entryLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TxSdia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_entryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atras)
                .addGap(34, 34, 34))
        );
        data_entryLayout.setVerticalGroup(
            data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_entryLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Perimeter)
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(base)
                            .addComponent(TXBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(data_entryLayout.createSequentialGroup()
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txRadio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(data_entryLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxRadio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(altura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXheigth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(data_entryLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(Area)
                            .addGap(4, 4, 4)
                            .addComponent(side3))
                        .addGroup(data_entryLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxBdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(side2)
                                .addComponent(txside2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxSdia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_entryLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(txside3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(data_entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Centry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(CExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(atras)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_startLayout = new javax.swing.GroupLayout(panel_start);
        panel_start.setLayout(panel_startLayout);
        panel_startLayout.setHorizontalGroup(
            panel_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_startLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ShapesSellection, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(Start)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_startLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(data_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_startLayout.setVerticalGroup(
            panel_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_startLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShapesSellection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Start))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(data_entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panel_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(panel_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Float convertUnits(Float number, int indexfinal,int indexinicial){
        Float calculo;
         calculo=Converter_Measures.Convert(number,indexinicial);
         return Converter_Measures.Convertto(calculo, indexfinal);
                
    }
    private void PerimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerimeterActionPerformed
     
       String parameter,value;
       Float Calculo;
         int exit=CExit.getSelectedIndex();
        switch( ShapesSellection.getSelectedIndex()){
            case 0://square
                Square Square1= new Square(Float.parseFloat(TXBase.getText()));
                parameter=Square.class.getSimpleName();
               value=convertUnits(Square1.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
                printDates(GeometricConstants.PERIMETER,parameter,value,CExit.getSelectedIndex());
                break;
            case 1://equilarero
                EquilateralTriangle triangle= new EquilateralTriangle(Float.parseFloat(TXBase.getText()),Float.parseFloat(TXheigth.getText()));
                 parameter=EquilateralTriangle.class.getSimpleName();
                  value=convertUnits(triangle.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
                printDates(GeometricConstants.PERIMETER,parameter,value,exit);
                break;
            case 2://isoceles
                 IsocelesTriangle triangleI= new IsocelesTriangle(Float.parseFloat(txside3.getText()),Float.parseFloat(TXBase.getText()),Float.parseFloat(TXheigth.getText()));
                 parameter=IsocelesTriangle.class.getSimpleName();
                  value=convertUnits(triangleI.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
                printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 3://angulo recto
                RightAngleTriangle triangleR= new RightAngleTriangle(Float.parseFloat(TXBase.getText()),Float.parseFloat(TXheigth.getText()));
                 parameter=RightAngleTriangle.class.getSimpleName();
                 value=convertUnits(triangleR.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
                printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 4://escaleno
                 ScaleneTriangle triangleE= new ScaleneTriangle(Float.parseFloat(txside2.getText()),Float.parseFloat(txside3.getText()),Float.parseFloat(TXBase.getText()),Float.parseFloat(TXheigth.getText()));
                 parameter=ScaleneTriangle.class.getSimpleName();
                value=convertUnits(triangleE.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
                printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 5://circulo
                Circle circle1= new Circle(Float.parseFloat(txRadio1.getText()));
                 parameter=Circle.class.getSimpleName();
                value=convertUnits(circle1.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
               printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 6://elipse
                 Ellipse Ellipse1= new Ellipse(Float.parseFloat(txRadio1.getText()),Float.parseFloat(TxRadio2.getText()));
                 parameter=Ellipse.class.getSimpleName();
                value=convertUnits(Ellipse1.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
              printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 7://rombo
                Rhombus Rhombus1= new Rhombus(Float.parseFloat(TxBdia.getText()),Float.parseFloat(TxSdia.getText()));
                 parameter=Rhombus.class.getSimpleName();
               value=convertUnits(Rhombus1.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
               printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 8://trapezoide
                Trapezoid Trapezoid1= new Trapezoid(Float.parseFloat(TXBase.getText()),Float.parseFloat(TXheigth.getText()),Float.parseFloat(txside2.getText()));
                 parameter=Trapezoid.class.getSimpleName();
                value=convertUnits(Trapezoid1.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
               printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 9://rectangulo
                Rectangle Rectangle1= new Rectangle(Float.parseFloat(TXBase.getText()),Float.parseFloat(TXheigth.getText()));
                 parameter=Rectangle.class.getSimpleName();
                value=convertUnits(Rectangle1.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
               printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            case 10://Quadrilateral
                Parallelogram Parallelogram1= new Parallelogram(Float.parseFloat(txside2.getText()),Float.parseFloat(TXBase.getText()),Float.parseFloat(TXheigth.getText()));
                 parameter=Parallelogram.class.getSimpleName();
                value=convertUnits(Parallelogram1.CalculatePerimeter(),CExit.getSelectedIndex(),Centry.getSelectedIndex())+"";
               printDates(GeometricConstants.PERIMETER,parameter,value,exit);
            break;
            
            
        }
    
    }//GEN-LAST:event_PerimeterActionPerformed
    private void printDates(String name,String parameter, String value,int exit){
            JOptionPane.showMessageDialog(rootPane, "The "+parameter+" of "+name +" is: "+value+" "+Converter_Measures.names[exit]);
    }
    private void AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaActionPerformed
     String name,parameter,value;
        int exit=CExit.getSelectedIndex();
        switch( ShapesSellection.getSelectedIndex()){
            case 0://square
                Square Square1= new Square(convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                parameter=Square.class.getSimpleName();
                  value=Square1.CalculateArea()+"";
               printDates(GeometricConstants.AREA,parameter,value,exit);
                break;
            case 1://equilarero
                EquilateralTriangle triangle= new EquilateralTriangle(convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(TXheigth.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                 parameter=EquilateralTriangle.class.getSimpleName();
                value=triangle.CalculateArea()+"";
               printDates(GeometricConstants.AREA,parameter,value,exit);
                break;
            case 2://isoceles
                 IsocelesTriangle triangleI= new IsocelesTriangle(convertUnits(Float.parseFloat(txside3.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(TXheigth.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                 parameter=IsocelesTriangle.class.getSimpleName();
                value=triangleI.CalculateArea()+"";
              printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 3://angulo recto
                RightAngleTriangle triangleR= new RightAngleTriangle(convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),convertUnits(Float.parseFloat(TXheigth.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                 parameter=RightAngleTriangle.class.getSimpleName();
                value=triangleR.CalculateArea()+"";
              printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 4://escaleno
                 ScaleneTriangle triangleE= new ScaleneTriangle( convertUnits(Float.parseFloat(txside2.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(txside3.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
               convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                  convertUnits(Float.parseFloat(TXheigth.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                 parameter=ScaleneTriangle.class.getSimpleName();
                value=triangleE.CalculateArea()+"";
              printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 5://circulo
                Circle circle1= new Circle(convertUnits(Float.parseFloat(txRadio1.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                
                parameter=Circle.class.getSimpleName();
                value=circle1.CalculateArea()+"";
              printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 6://elipse
                 Ellipse Ellipse1= new Ellipse(convertUnits(Float.parseFloat(txRadio1.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(TxRadio2.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                 parameter=Ellipse.class.getSimpleName();
                value=Ellipse1.CalculateArea()+"";
               printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 7://rombo
                Rhombus Rhombus1= new Rhombus(convertUnits(Float.parseFloat(TxBdia.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(TxSdia.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));
                 parameter=Rhombus.class.getSimpleName();
               value=Rhombus1.CalculateArea()+"";
               printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 8://trapezoide
                Trapezoid Trapezoid1= new Trapezoid(convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(TXheigth.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(txside2.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex())
               );
                 parameter=Trapezoid.class.getSimpleName();                
               value=Trapezoid1.CalculateArea()+"";
               printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 9://rectangulo
                Rectangle Rectangle1= new Rectangle(convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(TXheigth.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex())
               );
                 parameter=Rectangle.class.getSimpleName();
                value=Rectangle1.CalculateArea()+"";
               printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            case 10://Quadrilateral
                Parallelogram Parallelogram1= new Parallelogram(convertUnits(Float.parseFloat(txside2.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(TXBase.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()),
                 convertUnits(Float.parseFloat(TXheigth.getText()),CExit.getSelectedIndex(),Centry.getSelectedIndex()));               
                parameter=Parallelogram.class.getSimpleName();
               value=Parallelogram1.CalculateArea()+"";
               printDates(GeometricConstants.AREA,parameter,value,exit);
            break;
            
            
        }   
    }//GEN-LAST:event_AreaActionPerformed

   
    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
/*Square
Equilateral Triangle
Isosceles Triangle
RigthAngle Triangle
Ecalene Triangle
Circle
Ellipse
Rhombus
Trapezoid
Rectangle
Quadrilateral*/
         String name,parameter,value;
        
        switch( ShapesSellection.getSelectedIndex()){
            case 0://square
                TXBase.setEnabled(true);
             
                break;
            case 1://equilarero
             TXBase. setEnabled(true);
            TXheigth.setEnabled(true);
                break;
            case 2://isoceles
           txside3.setEnabled(true);
           TXBase.setEnabled(true);
          TXheigth.setEnabled(true);
               
            break;
            case 3://angulo recto
           TXBase.setEnabled(true);
        TXheigth.setEnabled(true);
                
            break;
            case 4://escaleno
            txside2.setEnabled(true);
            txside3.setEnabled(true);
           TXBase.setEnabled(true);
            TXheigth.setEnabled(true);
               
            break;
            case 5://circulo
          txRadio1.setEnabled(true);
                
            break;
            case 6://elipse
            txRadio1.setEnabled(true);
            TxRadio2.setEnabled(true);
            break;
            case 7://rombo
               TxBdia.setEnabled(true);
               TxSdia.setEnabled(true);
            break;
            case 8://trapezoide
               TXBase.setEnabled(true);
               TXheigth.setEnabled(true);
               txside2.setEnabled(true);
            break;
            case 9://rectangulo
            TXBase.setEnabled(true);
            TXheigth.setEnabled(true);
                
            break;
            case 10://Quadrilateral
            txside2.setEnabled(true);
            TXBase.setEnabled(true);
            TXheigth.setEnabled(true);
                
            break;
            
            
        }  
        botonsenable(true);
        dataentry(false);
      
    }//GEN-LAST:event_StartActionPerformed
    public void botonsenable(boolean boton){
         Perimeter.setEnabled(boton);        
        Area.setEnabled(boton);        
        atras.setEnabled(boton);
      
    }
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        dataentry(true);
       panelstart(false);   
       
    }//GEN-LAST:event_atrasActionPerformed

    public void panelstart(boolean click){
        TXBase.setEnabled(click);
        TXheigth.setEnabled(click);
        txside2.setEnabled(click);
        txside3.setEnabled(click);
        txRadio1.setEnabled(click);
        TxRadio2.setEnabled(click);
        TxBdia.setEnabled(click);
        TxSdia.setEnabled(click);
        Perimeter.setEnabled(click);        
        Area.setEnabled(click);
        atras.setEnabled(click);
    }
     public void dataentry(boolean click){
        ShapesSellection.setEnabled(click);
        Start.setEnabled(click);
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuShapes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Area;
    private javax.swing.JComboBox<String> CExit;
    private javax.swing.JComboBox<String> Centry;
    private javax.swing.JButton Perimeter;
    private javax.swing.JComboBox<String> ShapesSellection;
    private javax.swing.JButton Start;
    private java.awt.TextField TXBase;
    private java.awt.TextField TXheigth;
    private java.awt.TextField TxBdia;
    private java.awt.TextField TxRadio2;
    private java.awt.TextField TxSdia;
    private javax.swing.JLabel altura;
    private javax.swing.JButton atras;
    private javax.swing.JLabel base;
    private javax.swing.JPanel data_entry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panel_start;
    private javax.swing.JLabel side2;
    private javax.swing.JLabel side3;
    private java.awt.TextField txRadio1;
    private java.awt.TextField txside2;
    private java.awt.TextField txside3;
    // End of variables declaration//GEN-END:variables
}
