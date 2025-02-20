/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica;

import Interfaces.Documento;
import DocumentoPDFAdaptador.DocumentoPdfImp;
import DocumentoTextoPlano.DocumentoTexto;
import DocumentoHTML.DocumentoHtmlImp;

/**
 *
 * @author juanr
 */
public class DocumentoFabrica {
    
     public enum TipoDocumento {
        PDF, HTML, TEXTO_PLANO
    }

    public static Documento crearDocumento(TipoDocumento tipo) {
        switch (tipo) {
            case PDF:
                return new DocumentoPdfImp();      
            case HTML:
                return new DocumentoHtmlImp();  
            case TEXTO_PLANO:
                return new DocumentoTexto(); 
            default:
                throw new IllegalArgumentException("Tipo de documento no soportado.");
        }
    }
    
}
