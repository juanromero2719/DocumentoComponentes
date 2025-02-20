/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author juanr
 */


import Fabrica.DocumentoFabrica;
import Fabrica.DocumentoFabrica.TipoDocumento;
import Interfaces.Documento;

public class Main {
 
    public static void cargarDocumentos(){
    
        Documento documentoPDF = DocumentoFabrica.crearDocumento(TipoDocumento.PDF);
        documentoPDF.setContenido("...PDF...PDF...PDF...");
        documentoPDF.dibujar();
        documentoPDF.imprimir();

        System.out.println("\n-------------------------\n");

        Documento documentoHTML = DocumentoFabrica.crearDocumento(TipoDocumento.HTML);
        documentoHTML.setContenido("<HMTL></HMTL>");
        documentoHTML.dibujar();
        documentoHTML.imprimir();

        System.out.println("\n-------------------------\n");


        Documento documentoTEXTO = DocumentoFabrica.crearDocumento(TipoDocumento.TEXTO_PLANO);
        documentoTEXTO.setContenido("...texto...");
        documentoTEXTO.dibujar();
        documentoTEXTO.imprimir();
    }
    
    public static void main(String[] args) {
        
      cargarDocumentos();

    }
    
 
}
