package com.company;

import com.company.aviones.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Archivos {

    private ArrayList<Ruta> rutas= new ArrayList<>();
    private ArrayList<Avion> aviones= new ArrayList<>();
    private ArrayList<String> ciudades = new ArrayList<>();


    public Archivos() {
    }

    public void guardarArchivos() throws IOException {

        File archivoRutas =new File("rutas.json");
        File archivoAviones =new File("aviones.json");
        File archivoCiudades =new File("ciudades.json");


        ObjectMapper mapper=new ObjectMapper();

        //creacion de rutas
        Ruta ruta1 = new Ruta("Buenos Aires", "Cordoba", 695);
        Ruta ruta2 = new Ruta("Buenos Aires", "Santiago", 1400);
        Ruta ruta3 = new Ruta("Buenos Aires", "Montevideo", 950);
        Ruta ruta4 = new Ruta("Cordoba", "Montevideo", 1190);
        Ruta ruta5 = new Ruta("Cordoba", "Santiago", 1050);
        Ruta ruta6 = new Ruta("Montevideo", "Santiago", 2100);

        rutas.add(ruta1);
        rutas.add(ruta2);
        rutas.add(ruta3);
        rutas.add(ruta4);
        rutas.add(ruta5);
        rutas.add(ruta6);
        Rutas ru= new Rutas(rutas);
        mapper.writeValue(archivoRutas,ru);

        ///Creacion de aviones

        Bronze Pilatus = new Bronze("Pilatus", 30000, 150, 10, 960, Propulsion.helice,3000);
        Bronze DassaultFalcon = new Bronze("Dassault Falcon", 15000, 300, 7, 900, Propulsion.helice,3000);
        Bronze Learjet= new Bronze("Learjet", 35000, 180, 15, 950, Propulsion.helice,3000);
        Gold Beechcraft  = new Gold("Beechcraft ", 20000, 100, 5, 900, Propulsion.pistones, true,6000);
        Gold Embraer = new Gold("Embraer ", 24000, 100, 8, 600, Propulsion.pistones, true,6000);
        Gold Eclipse  = new Gold("Eclipse ", 15000, 150, 6, 700, Propulsion.reaccion, false,6000);
        Gold Cirrus  = new Gold("Cirrus ", 35000, 160, 12, 800, Propulsion.pistones, false,6000);
        Silver Phenom  = new Silver("Phenom", 10000, 250, 2, 900, Propulsion.reaccion,4000);
        Silver Falcon  = new Silver("Falcon", 15000, 150, 6, 800, Propulsion.helice,4000);
        Silver Fuchslocher  = new Silver("Fuchslocher", 12000, 250, 4, 980, Propulsion.reaccion,4000);

        aviones.add(Pilatus);
        aviones.add(DassaultFalcon);
        aviones.add(Learjet);
        aviones.add(Beechcraft);
        aviones.add(Embraer);
        aviones.add(Cirrus);
        aviones.add(Eclipse);
        aviones.add(Phenom);
        aviones.add(Falcon);
        aviones.add(Fuchslocher);

        Aviones av = new Aviones(aviones);
        mapper.writeValue(archivoAviones, av);


       ///Creacion ciudades
        ciudades.add("Buenos Aires");
        ciudades.add("Cordoba");
        ciudades.add("Santiago");
        ciudades.add("Montevideo");

        Ciudades ciu = new Ciudades(ciudades);
        mapper.writeValue(archivoCiudades,ciu);





    }

}
