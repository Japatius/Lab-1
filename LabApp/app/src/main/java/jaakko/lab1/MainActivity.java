package jaakko.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //an array of strings are assigned into a final 'COUNTRIES' variable
        //values in a final variable cannot be changed
        final String[] COUNTRIES = new String[] {
            "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra","Angola",
            "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia",
            "Aruba", "Australia", "Austria", "Azerbaijan"
        };

        //here we find the list by id and assign it to a variable
        //called 'myListView'
        ListView myListview = (ListView) findViewById(R.id.country_list);

        //here we assign an ArrayAdapter to a final-variable 'aa'
        //ArrayAdapter helps us in inserting values into a ListView
        final ArrayAdapter<String> aa;

        //here we create a new ArrayAdapter and assign it to a layout
        //called 'simple_list_item_1', the layout is provided by ArrayAdapeter
        //and we dont need to make it ourself
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                COUNTRIES);
        //and finally, we set the adapter for our ListView
        myListview.setAdapter(aa);
    }
}
