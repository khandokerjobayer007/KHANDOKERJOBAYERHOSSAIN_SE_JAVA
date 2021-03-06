/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayonsapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jobayer007
 */
public class UpdateProduct extends javax.swing.JFrame {

    /**
     * Creates new form UpdateProduct
     */
    public UpdateProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        productname2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productprofit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        producttype = new javax.swing.JComboBox<>();
        updatebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        productname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productnameKeyTyped(evt);
            }
        });

        jLabel1.setText("Search Product by name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product name", "price", "profit percentage", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Product name");

        jLabel3.setText("product price");

        jLabel4.setText("Product profit");

        jLabel5.setText("product type");

        producttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RAM", "MOTHERBOARD", "GRAPHICS CARD" }));

        updatebtn.setText("Update Product");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productname2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productprice))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productprofit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(producttype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(updatebtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(productname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(productprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(productprofit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(producttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(updatebtn)))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            String name=productname.getText();
            DatabaseHelper db=new DatabaseHelper();
            Connection conn=db.start();
            String query="select * from product where product_name like '%"+name+"%'";
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            PreparedStatement pst=(PreparedStatement)conn.prepareStatement(query);
            ResultSet rs=pst.executeQuery(query);
            int rowcount=0;
            while(rs.next()){
                rowcount++;
            }
            model.setRowCount(rowcount);
            PreparedStatement pst1=(PreparedStatement)conn.prepareStatement(query);
            ResultSet rs1=pst1.executeQuery();
            int row=0;
            while(rs1.next()){
                model.setValueAt(rs1.getString("product_name"), row, 0);
                model.setValueAt(rs1.getDouble("product_price"), row, 1);
                model.setValueAt(rs1.getDouble("product_profit"), row,2);
                model.setValueAt(rs1.getString("product_type"), row, 3);
                row++;
            }
            db.stop();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productnameKeyTyped
        try {
            // TODO add your handling code here:
            String name=productname.getText();
            DatabaseHelper db=new DatabaseHelper();
            Connection conn=db.start();
            String query="select * from product where product_name like '%"+name+"%'";
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            PreparedStatement pst=(PreparedStatement)conn.prepareStatement(query);
            ResultSet rs=pst.executeQuery(query);
            int rowcount=0;
            while(rs.next()){
            rowcount++;
            }
            model.setRowCount(rowcount);
            PreparedStatement pst1=(PreparedStatement)conn.prepareStatement(query);
            ResultSet rs1=pst1.executeQuery();
            int row=0;
            while(rs1.next()){
            model.setValueAt(rs1.getString("product_name"), row, 0);
            model.setValueAt(rs1.getDouble("product_price"), row, 1);
            model.setValueAt(rs1.getDouble("product_profit"), row,2);
            model.setValueAt(rs1.getString("product_type"), row, 3);
            row++;
            }
            db.stop();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_productnameKeyTyped
private int product_id=0;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            int index=jTable1.getSelectedRow();
            String name=(String)model.getValueAt(index, 0);
            double price=(Double)model.getValueAt(index, 1);
            double profit=(Double)model.getValueAt(index, 2);
            String type=(String)model.getValueAt(index, 3);
            DatabaseHelper db=new DatabaseHelper();
            Connection conn=db.start();
            String query="select product_id from product where product_name=?";
            PreparedStatement pst=(PreparedStatement)conn.prepareStatement(query);
            pst.setString(1,name);
            ResultSet rs=pst.executeQuery();
            int id=0;
            if(rs.next()){
              id=rs.getInt("product_id");  
            }
            product_id=id;
            productname2.setText(name);
            productprice.setText(Double.toString(price));
            productprofit.setText(Double.toString(profit));
            if((type.equals("RAM"))){
             producttype.setSelectedIndex(0);
            }else if(type.equals("MOTHERBOARD")){
             producttype.setSelectedIndex(1);   
            }else{
             producttype.setSelectedIndex(2);
            }
            } catch (SQLException ex) {
            Logger.getLogger(UpdateProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        String name=(String)productname2.getText();
        String p=(String)productprice.getText();
        String pr=(String)productprofit.getText();
        String type=(String)producttype.getSelectedItem();
        //System.out.println(name+","+p+","+pr+","+type);
        if((name.equals(""))||(p.equals(""))||(pr.equals(""))||type.equals("")){
        JOptionPane.showMessageDialog(this, "PLease fill the form first");
        }else{
            try{
                double price=0;
                double profit=0;
                try{
                    price=Double.parseDouble(p);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "price cannot have Alphabet Value");
                }
                try{
                    profit=Double.parseDouble(pr);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"profit can not have Alphabet Value");
                }
                DatabaseHelper db=new DatabaseHelper();
                Connection conn=db.start();
                String query="update product set product_name=?,product_price=?,product_profit=?,product_type=? where product_id=?";
                PreparedStatement pst=(PreparedStatement)conn.prepareStatement(query);
                pst.setString(1,name);
                pst.setDouble(2,price);
                pst.setDouble(3,profit);
                pst.setString(4, type);
                pst.setInt(5, product_id);
                int x=pst.executeUpdate();
                if(x==1){
                    JOptionPane.showMessageDialog(this,"Product Updated");
                    model.setRowCount(0);
                }
                db.stop();
            }catch(SQLException ex){
                Logger.getLogger(UpdateProduct.class.getName()).log(Level.SEVERE, null,ex);
            }
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField productname2;
    private javax.swing.JTextField productprice;
    private javax.swing.JTextField productprofit;
    private javax.swing.JComboBox<String> producttype;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
