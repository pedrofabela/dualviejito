package utilidades;

import java.io.Serializable;

public class Constantes implements Serializable {

    private static final long serialVersionUID = -3358884679090829992L;

    //GENERALES
    public static final String tablaDual = "dual";
    public static final String nombreSistema = "SEGESCN";
    public static String usuarioseg = "SEGESCN";
    public static final String modulo0 = "0";
    public static final String moduloSegEsc = "segesc";

    //TABLAS
    public static final String TablaUsuarios = "TBL_USUARIOS";
    public static final String TablaModulosPerfiles = "TBL_MODULOSPERFILES";
    public static final String TablaModulos = "TBL_MODULOS";
    public static final String TablaCct = "CAT_ESCUELAS";
    public static final String TablaCuentas = "CUENTAS_CHARLY";
    public static final String TablaDatos = "DATOS_CUENTA";
    public static final String TablaCarrera = "CAT_CARRERAS";
    public static final String TablaCar_CCT = "CAT_CARRERA_CCT";
    public static final String TablaResponsables = "CAT_RESPONSABLES";
    public static final String TablaAlumnos = "CAT_ALUMNOS";
    public static final String TablaVerificaArchivos = "CAT_REG_ARC";
    public static final String TablaEmpresa = "CAT_EMPRESAS";
    public static final String TablaResponsableEmpresa = "CAT_RESPONSABLES_EMPRESA";
    public static final String TablaAsesoresI = "CAT_ASESOR_INSTITUCIONAL";
    public static final String TablaProyecto = "TBL_PROYECTOS";
    public static final String TablaBecas = "TBL_BECAS";

    /*//**************DESARROLLO**********************************************************
    public static final boolean esDesarrollo = true;
    public static final String rutaProyectos = "http://172.20.2.110:8080/";
    public static final String rutareportesjasper = "C:\\reportes/JasperSoft/permanecerEstudiando/";
    public static final String rutaArch = "C:/ArchivosDUAL/";  //cambair cuando els ervidor este activo
    public static final String rutaEstilos = "http://172.20.2.110:8080/estilosUDAI/";
    public static final String rutaManuales = "C:/manuales/permanecerEstudiando.pdf";
    public static final String rutaImages = "C:\\reportes/JasperSoft/logos/";
    //*/

    //******************* PRODUCCION*******************************************************
      
		public static final boolean esDesarrollo = true;		
		public static final String rutaProyectos =   "http://aplicaciones.edugem.gob.mx/";
		public static final String rutareportesjasper = "/apachetomcat/reportes/";		                                                  
		public static final String rutaArch = "/apachetomcat/dual/documentos/";  				
		public static final String rutaEstilos = "http://aplicaciones.edugem.gob.mx/estilosUDAI/";		                                        
		public static final String rutaImages = "/apachetomcat/reportes/imagenes/";
		public static final String rutaManuales = "http://aplicaciones.edugem.gob.mx/manuales/ManualUsuario3P.pdf";		
		//*/
    public static void enviaMensajeConsola(String cadena) {
        if (Constantes.esDesarrollo) {
            System.out.println("MENSAJE_DESARROLLO: " + cadena);
        }
    }
}
