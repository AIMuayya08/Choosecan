package id.my.adi.choosecan;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class LoginActivity extends AppCompatActivity {
        private EditText usernameEditText, passwordEditText;
        private Button loginButton;
        private TextView registerTextView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            initViews();
            setListeners();
        }

        private void initViews() {
            usernameEditText = findViewById(R.id.username);
            passwordEditText = findViewById(R.id.password);
            loginButton = findViewById(R.id.gasken_button);
            registerTextView = findViewById(R.id.register_text_view);
        }

        private void setListeners() {
            loginButton.setOnClickListener(v -> {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                // Implement login logic here
            });

           // public void onRegisterClick(View view) {
                // Arahkan pengguna ke halaman pendaftaran
             //   Intent intent = new Intent(this, RegisterActivity.class); // Ganti RegisterActivity dengan kelas tujuan Anda
            //    startActivity(intent);
           // }


            registerTextView.setOnClickListener(v -> {
                // Implement navigation to registration screen
            });
        }
    }