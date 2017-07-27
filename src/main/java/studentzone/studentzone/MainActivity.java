package studentzone.studentzone;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView=null;
    Toolbar toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {

        EditText emailField = (EditText) findViewById(R.id.email_field);
        String email = emailField.getText().toString();

        boolean y =isValidEmail(email);

        EditText pwdField = (EditText) findViewById(R.id.pwd_field);
        String pwd = pwdField.getText().toString();

        int len = pwd.length();


        if (y && len>6){
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);}
        else  {
            Toast.makeText(this, " Invalid password ( must be larger than 6 characters )or email address ! ", Toast.LENGTH_SHORT).show();
        }



    }

    public static boolean isValidEmail(CharSequence target) {
        return target != null && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }



    public void signup(View view) {

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }

    public void skip(View view) {

        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);

    }

    public void forgot(View view) {

        Toast.makeText(this, " ( message ) ", Toast.LENGTH_SHORT).show();

    }
}

