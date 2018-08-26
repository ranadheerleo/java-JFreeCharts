package JfreeCharts;

import javax.swing.JFrame;

public class ChartMain extends javax.swing.JFrame {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 private javax.swing.JButton jButton1;
 private javax.swing.JButton jButton2;
 private javax.swing.JButton jButton3;
 private javax.swing.JButton jButton4;
 private javax.swing.JButton jButton5;
 private javax.swing.JButton jButton6;
 private javax.swing.JButton jButton7;
 private javax.swing.JButton jButton8;
  

 public ChartMain() {

     initComponents();
     this.setVisible(true);
 }

 private void initComponents() {

     jButton1 = new javax.swing.JButton();
     jButton2 = new javax.swing.JButton();
     jButton3 = new javax.swing.JButton();
     jButton4 = new javax.swing.JButton();
     jButton5 = new javax.swing.JButton();
     jButton6 = new javax.swing.JButton();
     jButton7 = new javax.swing.JButton();
     jButton8 = new javax.swing.JButton();
    
     
     
     jButton1.setText("Chart Controller-Enter Data");
     jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton1ActionPerformed(evt);
         }
     });

     jButton2.setText("Area Chart");
     jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton2ActionPerformed(evt);
         }
     });

     jButton3.setText("Bar Chart 3D Horizontal");
     jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton3ActionPerformed(evt);
         }
     });

     jButton4.setText("Bar Chart");
     jButton4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton4ActionPerformed(evt);
         }
     });
     jButton5.setText("Line Chart");
     jButton5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton5ActionPerformed(evt);
         }
     });
     jButton6.setText("Pie Chart 3D");
     jButton6.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton6ActionPerformed(evt);
         }
     });
     jButton7.setText("Pie Chart 2D");
     jButton7.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton7ActionPerformed(evt);
         }
     });
     jButton8.setText("Stacked Area Chart");
     jButton8.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jButton8ActionPerformed(evt);
         }
     });
     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                     .addGap(87, 87, 87)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                             .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                             .addContainerGap(116, Short.MAX_VALUE))
     );
     layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                     .addGap(41, 41, 41)
                     .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addContainerGap(48, Short.MAX_VALUE))
             
     );

     pack();
 }

 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
	 new ChartController();
 }
 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
     new AreaChart();

 }
 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
     new Barchart();

 }
 private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
     new BarChart2D();

 }
 private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
     new LineChart();

 }
 private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
     new PieChart();

 }

 private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
     new PieChart2D();
 }
 
 private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
      new StackedAreaChart();
 }

 
 public static void main(String args[]) {
	
	 ChartSimul n= new ChartSimul();// With JPanel
	 ChartModel.data[0] = "UnderGraduates";
     ChartModel.data[1] = "Graduates";
     ChartModel.data[2] = "PostGraduates";
     ChartModel.dataName[0] = 10.00;
     ChartModel.dataName[1] = 20.00;
     ChartModel.dataName[2] = 15.00;
    // ChartMain n = new ChartMain(); Without JPanel
	 n.setVisible(true);
     n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     n.setTitle("JFree Chart");

 }
}
