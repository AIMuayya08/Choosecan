package id.my.adi.choosecan;

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

    public class LoginActivity extends AppCompatActivity {
        private EditText usernameEditText, passwordEditText;
        private Button loginButton;
        private TextView registerTextView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            // Inisialisasi View
            initViews();

            // Listener untuk tombol login
            loginButton.setOnClickListener(v -> {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    // Tampilkan pesan error jika input kosong
                    Toast.makeText(LoginActivity.this, "Username dan Password harus diisi!", Toast.LENGTH_SHORT).show();
                } else {
                    // Lakukan validasi login
                    if (validateLogin(username, password)) {
                        // Beralih ke StartActivity jika valid
                        Intent intent = new Intent(LoginActivity.this, StartActivity.class);
                        startActivity(intent);
                        finish(); // Tutup LoginActivity agar tidak bisa kembali ke layar login
                    } else {
                        // Tampilkan pesan error jika login gagal
                        Toast.makeText(LoginActivity.this, "Username atau Password salah!", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            // Listener untuk link register
            registerTextView.setOnClickListener(v -> {
                // Tambahkan logika untuk berpindah ke halaman register
                Toast.makeText(LoginActivity.this, "Fitur register belum diimplementasikan!", Toast.LENGTH_SHORT).show();
            });
        }

        private void initViews() {
            usernameEditText = findViewById(R.id.username);
            passwordEditText = findViewById(R.id.password);
            loginButton = findViewById(R.id.gasken_button);
            registerTextView = findViewById(R.id.register_text_view);
        }

        // Fungsi validasi login
        private boolean validateLogin(String username, String password) {
            // Tambahkan logika validasi di sini
            // Contoh validasi sederhana: username = "user", password = "1234"
            return username.equals("user") && password.equals("1234");
        }
    }
