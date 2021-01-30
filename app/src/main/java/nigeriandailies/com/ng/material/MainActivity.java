package nigeriandailies.com.ng.material;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Call some material design APIs here
        } else { // For Below API 21
            // Implement this feature without material design
        }
    }
}