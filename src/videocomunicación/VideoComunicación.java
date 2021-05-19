/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocomunicación;

/**
 *
 * @author Johnny Reveles
 */
public class VideoComunicación {

     private static String nombre;
     private static int cantidadUsuarios;
     private static Integer tiempo;
     private static String nivel;
     private static int estrella;
     
     public VideoComunicación(String nombre, int cantidadUsuarios,int tiempo, String nivel, int estrella) {
        VideoComunicación.nombre = nombre;
        VideoComunicación.cantidadUsuarios = cantidadUsuarios;
        VideoComunicación.estrella = estrella;
        VideoComunicación.tiempo = tiempo;
        VideoComunicación.nivel = nivel;
    }
    
     public static int calidad() {
         return cantidadUsuarios*tiempo*estrella;
       
    }

     public static void main(String[] args) {
         
         VideoComunicación miVideoComunicación= new VideoComunicación("Meet", 50, 7, "Libre", 18);
            System.out.println(calidad());
    }
     
}


