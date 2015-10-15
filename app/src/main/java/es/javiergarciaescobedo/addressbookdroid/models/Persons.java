package es.javiergarciaescobedo.addressbookdroid.models;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    public static List<Person> personList = new ArrayList();

    /**
     * Load a little number of persons in the list, with only a few properties filled
     */
    public static void loadSimpleSamples() {

        Person person = new Person();

        person = new Person();
        person.setId(1);
        person.setName("EVA MARIA");
        person.setSurnames("HURTADO REQUENA");
        person.setAlias("EVA");
        person.setFavorite(true);
        personList.add(person);

        person = new Person();
        person.setId(2);
        person.setName("CARLOS DOMINGO DE GUZMAN");
        person.setSurnames("BLANCO  PEREZ");
        person.setAlias("CARLOS");
        person.setFavorite(false);
        personList.add(person);

        person = new Person();
        person.setId(3);
        person.setName("ANTONIO ENRIQUE");
        person.setSurnames("FUENTE DE LA SANDE\n");
        person.setAlias("ANTONIO");
        person.setFavorite(true);
        personList.add(person);
    }

}
