/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

/**
 *
 * @author pedro
 */
import beans.DatosBean;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaSituacionAcaMapper implements Mapper {

    public Object mapRow(ResultSet rs) throws SQLException {
        DatosBean dat = new DatosBean();
       
        if (rs.getString("id_situacion_aca") != null) {
            dat.setID_SITUACION_ACA(rs.getString("id_situacion_aca").trim());
        } else {
            dat.setID_SITUACION_ACA(rs.getString("id_situacion_aca"));
        }
        if (rs.getString("nom_situacion") != null) {
            dat.setNOM_SITUACION(rs.getString("nom_situacion").trim());
        } else {
            dat.setNOM_SITUACION(rs.getString("nom_situacion"));
        }
       
        return dat;
    }

}

