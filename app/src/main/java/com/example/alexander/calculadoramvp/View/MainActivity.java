package com.example.alexander.calculadoramvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alexander.calculadoramvp.Interface.MainPresenter;
import com.example.alexander.calculadoramvp.Interface.MainView;
import com.example.alexander.calculadoramvp.Presenter.MainPresenterImpl;
import com.example.alexander.calculadoramvp.R;

public class MainActivity extends AppCompatActivity implements MainView {

    private EditText numero1,numero2;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=findViewById(R.id.sumaid);
        numero2=findViewById(R.id.restaid);


        presenter=new MainPresenterImpl(this);

    }

    @Override
    public void setResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();

    }

    public void suma(View v){
        // manda a llamar al presentador
        presenter.operation(numero1.getText().toString(),numero2.getText().toString());
    }
}
