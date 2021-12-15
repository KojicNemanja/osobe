package com.example;
import com.example.osobe.Osoba;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Osoba> osobe = new ArrayList<>();
        String java_resursi = System.getenv("JAVA_RESOURCES");
        File osobe_txt = new File(java_resursi + "\\osobe.txt");
        if(osobe_txt.exists()){
            Scanner reader = new Scanner(osobe_txt);
            reader.useDelimiter("\\n");
            while(reader.hasNext()){
                String red = reader.next();
                String[] podela = red.split(",");
                int id = Integer.parseInt(podela[0]);
                String ime = podela[1];
                String prezime = podela[2];
                int godine = Integer.parseInt(podela[3]);
                Osoba o = new Osoba(id, ime, prezime, godine);
                osobe.add(o);
            }



            //broj maloletnih osoba
            int broj_maloletnih_osoba = 0;
            for(Osoba o : osobe){
                if(o.getGodine() < 18){
                    broj_maloletnih_osoba++;
                }
            }
            //broj punoletnih osoba
            int broj_punoletnih_osoba = 0;
            for(Osoba o : osobe){
                if(o.getGodine() >= 18){
                    broj_punoletnih_osoba++;
                }
            }
            System.out.println("Broj maloletnih osoba: " + broj_maloletnih_osoba);
            System.out.println("Broj punoletnih osoba: " + broj_punoletnih_osoba);
        }else{
            System.err.println("File not found: " + osobe_txt.getAbsolutePath());
        }

    }
}
