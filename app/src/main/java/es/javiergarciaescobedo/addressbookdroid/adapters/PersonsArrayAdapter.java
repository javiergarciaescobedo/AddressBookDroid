package es.javiergarciaescobedo.addressbookdroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import es.javiergarciaescobedo.addressbookdroid.R;
import es.javiergarciaescobedo.addressbookdroid.models.Person;

public class PersonsArrayAdapter extends ArrayAdapter {

    private final Context context;

    private final List<Person> personList; //Lista de objetos que va a contener la lista

    /**
     * Constructor que permite cargar las propiedades de esta clase, y que llama inicialmente
     * al constructor original de ArrayAdapter indicando el nombre del layout (person_row_adapter)
     *
     * @param context    Contexto (p.e. getActivity())
     * @param personList Lista de objetos que va a contener la lista
     */
    public PersonsArrayAdapter(Context context, List personList) {
        super(context, R.layout.person_row_adapter, personList);
        this.context = context;
        this.personList = personList;
    }

    /* Sobrecargar el método getView para rellenar el elemento de la lista con los valores
        almacenados en la propiedad values de esta clase
         */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Asociar este ArrayAdpater con el layout 'person_row_adapter' que se ha creado
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.person_row_adapter, parent, false);

        //Obtener el objeto Person correspondiente a la posición de la lista que ha seleccionado el usuario
        Person person = personList.get(position);

        //Cargar en el TextView de letra grande el alias del contacto
        TextView textViewAlias = (TextView) rowView.findViewById(R.id.textViewAlias);
        textViewAlias.setText(person.getAlias());

        //Cargar en el TextView de letra pequeña el nombre completo del contacto
        TextView textViewFullName = (TextView) rowView.findViewById(R.id.textViewFullName);
        textViewFullName.setText(person.getSurnames() + ", " + person.getName());

        //Cargar el icono correspondiente si el contacto está marcado como favorito
        ImageView imageViewPhoto = (ImageView) rowView.findViewById(R.id.imageViewFavorite);
        if(person.isFavorite()) {
            int id = context.getResources().getIdentifier("drawable/favorite", "drawable", context.getPackageName());
            imageViewPhoto.setImageDrawable(context.getResources().getDrawable(id));
        } else {
            imageViewPhoto.setImageDrawable(null);
        }

        return rowView;
    }
}
