package unikl.hunnygenius.proto;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Logout extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);
    }

        @Override
                public boolean onCreateOptionMenu (Menu menu){

            getMenuInflater().inflate(R.menu.main_menu,menu);
            return true;
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){

            case R.id.history:

                Toast.makeText(Logout.this, "Search Menu Selected", Toast.LENGTH_SHORT).show());

                return true;

            case R.id.settings:

                Toast.makeText(Logout.this, "Settings Menu Selected", Toast.LENGTH_SHORT).show());

                return true;

            case R.id.logout:

                Toast.makeText(Logout.this, "Logout Menu Selected", Toast.LENGTH_SHORT).show());

                return true;

            default:

                return super.onOptionsItemSelected(item);
        }
    }
}
