package yilmaz.ahmet.deneme;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.widget.Toast.*;
import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Aramakutusu = (EditText) this.findViewById(R.id.aratextkutu);
        final TextView AramaEtiketi = (TextView) this.findViewById(R.id.aratextetiket);
        Button btnara = (Button) this.findViewById(R.id.btnara);

        btnara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Aranankelime = Aramakutusu.getText().toString();
                AramaEtiketi.setText(Aranankelime);
                Toast.makeText(c(MainActivity.this,"Geldiiii!",LENGTH_LONG).show();
            }

        });

    }
}
