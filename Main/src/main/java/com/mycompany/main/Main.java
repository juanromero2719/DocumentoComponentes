/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author juanr
 */


import Fabrica.DocumentoBuilder;
import Fabrica.DocumentoFabrica.TipoDocumento;
import Interfaces.Documento;

public class Main {
 
    public static void cargarDocumentos(){
        
        System.out.println("-----------------------------------------");
    
        Documento documento = new DocumentoBuilder()
                .conTipo(TipoDocumento.PDF)
                .conContenido("...PDF...PDF...PDF...")
                .build();

        documento.dibujar();
        documento.imprimir();
        
        System.out.println("-----------------------------------------");
        
        documento = new DocumentoBuilder()
                .conTipo(TipoDocumento.HTML)
                .conContenido("<HMTL></HMTL>")
                .build();

        documento.dibujar();
        documento.imprimir();
        
        System.out.println("-----------------------------------------");
        
        documento = new DocumentoBuilder()
                .conTipo(TipoDocumento.TEXTO_PLANO)
                .conContenido("...texto...")
                .build();

        documento.dibujar();
        documento.imprimir();
        
        System.out.println("-----------------------------------------");
    }
    
    public static void main(String[] args) {
        
      cargarDocumentos();

    }
    
 
}
