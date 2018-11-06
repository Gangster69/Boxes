package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView result =findViewById(R.id.result);
        result.setText("\n Box 3\n Dimension :23/14/13 cm\n Price:65");
    }
}
