/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import beans.DatosBean;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class sinoMapper implements Mapper{
    
    public Object mapRow(ResultSet rs) throws SQLException {
        DatosBean dat = new DatosBean();
        
      
        
         if (rs.getString("ID_OP") != null) {
            dat.setID_OP(rs.getString("ID_OP").trim());
        } else {
            dat.setID_OP(rs.getString("ID_OP"));
        }
        
      
            
         if (rs.getString("OP") != null) {
            dat.setOP(rs.getString("OP").trim());
        } else {
            dat.setOP(rs.getString("OP"));
        }
         
         
         
        return dat;  
        
    }
    
    
}
