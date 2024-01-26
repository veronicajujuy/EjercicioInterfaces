package com.poointerfaces;

import com.poointerfaces.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen Laboral", "Juan Perez", "Desarrollador");
        cv.addExperiencia("Javascript").addExperiencia("Java").addExperiencia("DBA").addExperiencia("Full Stack");

        Informe informe = new Informe("Estudio sobre microservicios", "Luis Casas", "Martina");

        // pasar como parametro de la funcion:
        //        imprimir(cv);
        //        imprimir(informe);
        System.out.println(cv.imprimir());
        System.out.println(informe.imprimir());

        Libro libro = new Libro("Neil Gaiman", "American Gods", Genero.FANTASIA);
        libro.addPagina(new Pagina("Introducción")).addPagina(new Pagina("Primer Capitulo"))
                .addPagina(new Pagina("Segundo Capitulo"));
        System.out.println(libro.imprimir());
        //        imprimir(libro);

        Imprimible informe2 = new Informe("Un estudio random", "Autor", "Revisor");
        System.out.println(informe2.imprimir());
    }

        // implementando usando una funcion
        //    public static void imprimir(Imprimible imprimible){
        //        System.out.println(imprimible.imprimir());
        //    }
}
