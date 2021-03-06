/*
 * testform.java
 *
 * Created on December 2, 2008, 8:55 PM
 */

package rwframework;
import rwframework.controls.*;
/**
 *
 * @author  destes
 */
public class frmusermaint extends rwframework.controls.rwInternalFrame {

    /** Creates new form testform */
    private rwframework.models.User user;
    public frmusermaint(rwframework.Application myApp) {
        super(myApp);
        
        user = new rwframework.models.User(myApp.DataHandler);
        initComponents();
        user.bindForm(this.getContentPane());
        user.bindForm(this.pnlHeader);
        this.primaryRecord = user;
        this.pnlHeader.loadStandardImage();
        this.txtusername.setBrowseString(new String[]{"User Name,username","Full Name,full_name","Created,created_at"});
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFullName = new rwframework.controls.rwTextField();
        jLabel2 = new javax.swing.JLabel();
        pnlHeader = new rwframework.controls.BackgroundImagePanel();
        txtusername = new rwframework.controls.rwTextField();
        jLabel1 = new javax.swing.JLabel();
        rwCheckBox1 = new rwframework.controls.rwCheckBox();
        rwCheckBox2 = new rwframework.controls.rwCheckBox();
        txtCreatedAt = new rwframework.controls.rwTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFullName1 = new rwframework.controls.rwTextField();
        jLabel4 = new javax.swing.JLabel();
        cmdPassword = new rwframework.controls.rwButton();
        jLabel5 = new javax.swing.JLabel();
        comboRole = new rwframework.controls.rwComboBox();
        rwCheckBox3 = new rwframework.controls.rwCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("User Maintenance");

        txtFullName.setEnabled(false);
        txtFullName.setFieldName("full_name");
        txtFullName.setTableName("users");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setLabelFor(txtFullName);
        jLabel2.setText("Full Name:");

        txtusername.setDataHandler(MainApplication.DataHandler);
        txtusername.setDefaultKeyEnabled(true);
        txtusername.setDefaultNonKeyEnabled(false);
        txtusername.setFieldName("username");
        txtusername.setTableName("users");
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusernameKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setLabelFor(txtusername);
        jLabel1.setText("UserName:");

        org.jdesktop.layout.GroupLayout pnlHeaderLayout = new org.jdesktop.layout.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlHeaderLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtusername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(360, 360, 360))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlHeaderLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(pnlHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtusername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        rwCheckBox1.setText("Administrator?");
        rwCheckBox1.setEnabled(false);
        rwCheckBox1.setFieldName("admin");
        rwCheckBox1.setTableName("users");

        rwCheckBox2.setText("Enabled?");
        rwCheckBox2.setEnabled(false);
        rwCheckBox2.setFieldName("enabled");
        rwCheckBox2.setTableName("users");

        txtCreatedAt.setDefaultNonKeyEnabled(false);
        txtCreatedAt.setEnabled(false);
        txtCreatedAt.setFieldName("created_at");
        txtCreatedAt.setTableName("users");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setLabelFor(txtFullName);
        jLabel3.setText("Created At:");

        txtFullName1.setEnabled(false);
        txtFullName1.setFieldName("toolbar_image");
        txtFullName1.setTableName("users");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setLabelFor(txtFullName);
        jLabel4.setText("Image URL:");

        cmdPassword.setText("Change Password");
        cmdPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPasswordActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setLabelFor(txtFullName);
        jLabel5.setText("User Role:");

        comboRole.setDataHandler(MainApplication.DataHandler);
        comboRole.setFieldName("role_id");
        comboRole.setSourceDisplayField("role_name");
        comboRole.setSourceReturnField("id");
        comboRole.setSourceTableName("user_roles");
        comboRole.setTableName("users");

        rwCheckBox3.setText("Use Enter as Tab?");
        rwCheckBox3.setEnabled(false);
        rwCheckBox3.setFieldName("use_enter");
        rwCheckBox3.setTableName("users");
        rwCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rwCheckBox3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlHeader, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtCreatedAt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(rwCheckBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(txtFullName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 189, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(rwCheckBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtFullName1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(199, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cmdPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(comboRole, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(rwCheckBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(pnlHeader, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(txtFullName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rwCheckBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rwCheckBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtFullName1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(comboRole, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rwCheckBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cmdPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtCreatedAt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
// TODO add your handling code here:
    Load();
}//GEN-LAST:event_txtusernameActionPerformed

private void cmdPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPasswordActionPerformed
// TODO add your handling code here:
    frmChangePassword PasswordDialog = new frmChangePassword(this.MainApplication,true,user);
    PasswordDialog.setVisible(true);
}//GEN-LAST:event_cmdPasswordActionPerformed

private void txtusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_txtusernameKeyTyped

private void rwCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rwCheckBox3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_rwCheckBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rwframework.controls.rwButton cmdPassword;
    private rwframework.controls.rwComboBox comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private rwframework.controls.BackgroundImagePanel pnlHeader;
    private rwframework.controls.rwCheckBox rwCheckBox1;
    private rwframework.controls.rwCheckBox rwCheckBox2;
    private rwframework.controls.rwCheckBox rwCheckBox3;
    private rwframework.controls.rwTextField txtCreatedAt;
    private rwframework.controls.rwTextField txtFullName;
    private rwframework.controls.rwTextField txtFullName1;
    private rwframework.controls.rwTextField txtusername;
    // End of variables declaration//GEN-END:variables

}
