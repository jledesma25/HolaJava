package holajava.academiamoviles.com.holajava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        events();
    }

    private void events() {

        btn1.setOnClickListener(this);
    }

    private void init() {

        btn1 = (ImageButton) findViewById(R.id.button);

    }

    @Override
    public void onClick(View v) {

        

    }
}
