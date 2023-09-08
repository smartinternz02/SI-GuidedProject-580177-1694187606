import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView diceImageView;
    private Button rollButton;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImageView = findViewById(R.id.diceImageView);
        rollButton = findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = random.nextInt(6) + 1; // Generates a random number between 1 and 6
        int drawableResource = getResources().getIdentifier("dice" + randomNumber, "drawable", getPackageName());

        diceImageView.setImageResource(drawableResource);
    }
}
