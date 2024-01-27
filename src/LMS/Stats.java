/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.awt.CardLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author 91983
 */
public class Stats {
   Conn con =  new Conn(); 
 
   public Stats(CardLayout c,JPanel p,JPanel p1,JTable table,JTable table_1){
         c.show(p,"stats");
         issuebook(table);
         returnbook(table_1);
    }

    private void returnbook(JTable table_1) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            
            String sql = "select * from returnBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
           table_1.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    private void issuebook(JTable table) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            
            String sql = "select * from issueBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }
        
}
