package id.my.adi.choosecan;

import android.annotation.SuppressLint;
import android.content.Intent;
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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText;
    private Button loginButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inisialisasi View
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.gasken_button);

        // Listener untuk tombol login
        loginButton.setOnClickListener(v -> {
            // Menampilkan pesan masuk sukses
            Toast.makeText(LoginActivity.this, "Login berhasil!", Toast.LENGTH_SHORT).show();

            // Beralih ke StartActivity
            Intent intent = new Intent(LoginActivity.this, StartActivity.class);
            startActivity(intent);

            // Tutup LoginActivity agar tidak bisa kembali ke layar login
            finish();
        });
    }
}