package e.mkrivoshea.pokedexfinalproject;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.io.IOException;
import java.net.URL;

public class Poke extends AppCompatActivity {

    private ListView cPoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke);
        cPoke = (ListView) findViewById(R.id.lv_poke);

        ArrayAdapter<Entry> arrayAdapter = new ArrayAdapter<Entry>(this, android.R.layout.simple_expandable_list_item_2, Entry.entries);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent pokeIntent = new Intent(Poke.this, DexEntry.class);

                pokeIntent.putExtra(DexEntry.EXTRA_POKENO, position);

                startActivity(pokeIntent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
            }
        };

        cPoke.setAdapter(arrayAdapter);
        cPoke.setOnItemClickListener(itemClickListener);
    }




    @Override
    public void onBackPressed()
    {
        super.onBackPressed();

        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
    }
}
