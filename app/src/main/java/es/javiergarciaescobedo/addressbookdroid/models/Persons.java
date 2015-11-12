package es.javiergarciaescobedo.addressbookdroid.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persons {

    public static List<Person> personList = new ArrayList();

    public static Map<String, Person> ITEM_MAP = new HashMap<String, Person>();

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
        person.setPhoneNumber("956290949");
        person.setFavorite(true);
        person.setEmail("eva.hurtado@server.com");
        person.setAddress("CLAVILEÑO , CALLE");
        person.setPostCode("11659");
        person.setCity("PUERTO SERRANO");
        person.setProvince("CÁDIZ");
        personList.add(person);
        ITEM_MAP.put(String.valueOf(person.getId()), person);

        person = new Person();
        person.setId(2);
        person.setName("CARLOS DOMINGO DE GUZMAN");
        person.setSurnames("BLANCO  PEREZ");
        person.setAlias("CARLOS");
        person.setPhoneNumber("956125889");
        person.setFavorite(false);
        person.setEmail("carlos.blanco@server.com");
        person.setAddress("PERU , CALLE");
        person.setPostCode("11611");
        person.setCity("VILLALUENGA DEL ROSARIO");
        person.setProvince("CÁDIZ");
        personList.add(person);
        ITEM_MAP.put(String.valueOf(person.getId()), person);

        person = new Person();
        person.setId(3);
        person.setName("ANTONIO ENRIQUE");
        person.setSurnames("FUENTE DE LA SANDE\n");
        person.setAlias("ANTONIO");
        person.setPhoneNumber("956222472");
        person.setFavorite(true);
        person.setEmail("antonio.fuente@server.com");
        person.setAddress("PORTERIA DE STO.DOMINGO , CALLE");
        person.setPostCode("11600");
        person.setCity("UBRIQUE");
        person.setProvince("CÁDIZ");
        personList.add(person);
        ITEM_MAP.put(String.valueOf(person.getId()), person);
    }

}
