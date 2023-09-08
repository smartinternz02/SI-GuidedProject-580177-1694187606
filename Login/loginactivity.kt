import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            // Add your login logic here
        }

        forgetPasswordText.setOnClickListener {
            // Add your forget password logic here
        }

        signupButton.setOnClickListener {
            // Add your sign-up logic here
        }
    }
}
