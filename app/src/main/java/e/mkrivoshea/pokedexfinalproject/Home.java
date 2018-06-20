package e.mkrivoshea.pokedexfinalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private Button mRap;
    private ListView mList;
    private ImageView mPokeball;

    private ProgressBar mBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mRap = (Button)  findViewById(R.id.btn_rap);
        mPokeball = (ImageView) findViewById(R.id.iv_pokeb);

        String[] options = new String[]{"pokedex", "enter pokemon"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent pokeIntent = new Intent(Home.this, Poke.class);

                Intent Pokes;

                Intent chooser;
                if(Position == 0)
                {
                    startActivity(pokeIntent);

                }
            }
        };

        final ProgressBar mBar = (ProgressBar) findViewById(R.id.pb_progress);

        mRap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Home.this, R.raw.OriginalPokeRap);


                public void onclick(view v){
                    mBar.setVisibility(View.VISIBLE);

            }
            mp.start();
            }
        });
    }

}
