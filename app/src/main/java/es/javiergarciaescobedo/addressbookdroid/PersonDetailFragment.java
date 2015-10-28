package es.javiergarciaescobedo.addressbookdroid;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.javiergarciaescobedo.addressbookdroid.dummy.DummyContent;
import es.javiergarciaescobedo.addressbookdroid.models.Person;
import es.javiergarciaescobedo.addressbookdroid.models.Persons;

/**
 * A fragment representing a single Person detail screen.
 * This fragment is either contained in a {@link PersonListActivity}
 * in two-pane mode (on tablets) or a {@link PersonDetailActivity}
 * on handsets.
 */
public class PersonDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
//    private DummyContent.DummyItem mItem;
    private Person person;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PersonDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
//            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
            String idPersonSelected = getArguments().getString(ARG_ITEM_ID);
            person = Persons.ITEM_MAP.get(idPersonSelected);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
//                appBarLayout.setTitle(mItem.content);
                appBarLayout.setTitle(person.getAlias());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_person_detail, container, false);

        // Show the dummy content as text in a TextView.
//        if (mItem != null) {
//            ((TextView) rootView.findViewById(R.id.person_detail)).setText(mItem.details);
//        }

        // Show the person content
        if(person != null) {
            ((TextView) rootView.findViewById(R.id.textViewName)).setText(person.getName());
            ((TextView) rootView.findViewById(R.id.textViewSurnames)).setText(person.getSurnames());
            ((TextView) rootView.findViewById(R.id.textViewPhone)).setText(person.getPhoneNumber());
        }

        return rootView;
    }
}
