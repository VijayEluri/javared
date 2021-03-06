/*
 * frmConfig.java
 *
 * Created on August 3, 2006, 12:04 AM
 */

package rwframework;

import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.io.StringWriter;
import java.text.*;
/**
 *
 * @author  Reid Lane
 */
public class frmConfig extends javax.swing.JDialog {
    rwframework.controls.cDataHandler Data;
    //rwframework.frmLogin login;
    /** Creates new form frmConfig */
    public boolean cancel=false;
    NumberFormat AmountFormat = java.text.NumberFormat.getIntegerInstance();
    
    public frmConfig(rwframework.controls.cDataHandler DataHandle,String datab) {
        initComponents();
        Data = DataHandle;
        //login = loginFrame;
        AmountFormat.setMaximumIntegerDigits(4);
        AmountFormat.setGroupingUsed(false);
        txtHost.setText(Data.hostname);
        txtUsername.setText(Data.UserName);
        txtPassword.setText(Data.Password);
        txtDatabase.setText(datab);
        txtPort.setText(Data.port);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHost = new javax.swing.JTextField();
        lblHost = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        lblDatabase = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        buttonAccept = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        lblConfig = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtPort = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblHost.setText("Host Name");

        lblUsername.setText("User Name");

        lblPassword.setText("Password");

        lblDatabase.setText("Database");

        lblPort.setText("Port");

        buttonAccept.setMnemonic('a');
        buttonAccept.setText("Accept");
        buttonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcceptActionPerformed(evt);
            }
        });

        buttonCancel.setMnemonic('c');
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        lblConfig.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblConfig.setText("Database Configuration");

        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblConfig)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(lblDatabase)
                                .add(layout.createSequentialGroup()
                                    .add(buttonAccept)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(buttonCancel))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(layout.createSequentialGroup()
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(lblHost)
                                                .add(txtHost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(layout.createSequentialGroup()
                                                    .add(25, 25, 25)
                                                    .add(lblPort))
                                                .add(layout.createSequentialGroup()
                                                    .add(9, 9, 9)
                                                    .add(txtPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                        .add(layout.createSequentialGroup()
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                                .add(org.jdesktop.layout.GroupLayout.LEADING, txtDatabase, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                                .add(layout.createSequentialGroup()
                                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                        .add(lblUsername)
                                                        .add(txtUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                    .add(39, 39, 39)
                                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                        .add(lblPassword)
                                                        .add(txtPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                                    .add(39, 39, 39)))))
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(lblConfig)
                .add(3, 3, 3)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblHost)
                    .add(lblPort))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtHost, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(10, 10, 10)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblUsername)
                    .add(lblPassword))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(lblDatabase)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtDatabase, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonAccept)
                    .add(buttonCancel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-358)/2, (screenSize.height-307)/2, 358, 307);
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcceptActionPerformed
//write to config
        try {
            SAXBuilder b = new SAXBuilder();
            Document doc = new Document(new Element("Config"));
            Element main = doc.getRootElement();
            List mainList = main.getChildren();
            
            Element ld = new Element("hostname");
            ld.setText(this.txtHost.getText());
            mainList.add(ld);
            
            ld = new Element("UserName");
            ld.setText(this.txtUsername.getText());
            mainList.add(ld);
            
            ld = new Element("Password");
            ld.setText(this.txtPassword.getText());
            mainList.add(ld);
            
            ld = new Element("port");
            ld.setText(this.txtPort.getText());
            mainList.add(ld);
            
            ld = new Element("database");
            ld.setText(this.txtDatabase.getText());
            mainList.add(ld);
            
            XMLOutputter outputter = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
            StringWriter saved = new StringWriter();
            outputter.output(doc, saved); //saved to a string
            
            File open = new File("config.xml");
            FileWriter out = new FileWriter(open);
            out.write(saved.toString());
            out.close();
        }catch(Exception e){
            //can't write to file
            javax.swing.JOptionPane.showMessageDialog(this,"Error writing to config file, check premissions.");
            return;
        }
        //reload from config (do in this order incase something goes wrong with saving)
        Data.hostname = this.txtHost.getText();
        Data.UserName = this.txtUsername.getText();
        Data.Password = this.txtPassword.getText();
        Data.database = this.txtDatabase.getText();
        Data.port = this.txtPort.getText();
        closeform();
        
    }//GEN-LAST:event_buttonAcceptActionPerformed
    
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        cancel=true;
        closeform();
    }//GEN-LAST:event_buttonCancelActionPerformed

private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtPortActionPerformed
    
    public void closeform(){
        //reload a new login or salvage old one?
        this.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAccept;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
}
