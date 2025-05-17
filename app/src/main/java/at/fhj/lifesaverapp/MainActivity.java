package at.fhj.lifesaverapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import at.fhj.lifesaverapp.R;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment;
            switch (item.getItemId()) {
                case R.id.:
                    selectedFragment = new UebungFragment();
                    break;
                case R.id.nav_profil:
                    selectedFragment = new ProfilFragment();
                    break;
                case R.id.nav_lernen:
                default:
                    selectedFragment = new LernenFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit();
            return true;
        });

        bottomNav.setSelectedItemId(R.id.nav_lernen);

    }
}