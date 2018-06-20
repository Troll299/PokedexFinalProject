package e.mkrivoshea.pokedexfinalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DexEntry extends AppCompatActivity {
    public static final String EXTRA_POKENO = "pokeNo";

    private TextView pNumber;
    private TextView pName;
    private TextView pDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dex_entry);

        int pokeNo = (Integer)getIntent().getExtras().get(EXTRA_POKENO);

        Entry entry = Entry.entries[pokeNo];

        pName = (TextView) findViewById(R.id.tv_name);
        pDescription = (TextView) findViewById(R.id.tv_description);
        pNumber = (TextView) findViewById(R.id.tv_number);

        pName.setContentDescription(Entry.getName());
        pName.setText(Entry.getName());

        pDescription.setContentDescription(Entry.getDex());
        pDescription.setText(Entry.getDex());

        pNumber.setContentDescription(Entry.getNumber());
        pNumber.setText(Entry.getNumber());
    }

    @Override
    public void onBackPressed()
    {
        //this line lets this method do everything the back button is supposed to do
        super.onBackPressed();

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }


}
