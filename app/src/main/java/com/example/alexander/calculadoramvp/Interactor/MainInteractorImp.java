package com.example.alexander.calculadoramvp.Interactor;

import com.example.alexander.calculadoramvp.Interface.MainInteractor;
import com.example.alexander.calculadoramvp.Interface.MainPresenter;

/**
 * Created by alexander on 12/04/18.
 */

public class MainInteractorImp implements MainInteractor {

    private MainPresenter presenter;
    private Double result;

    public MainInteractorImp(MainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void Suma(String numero1, String numero2) {

        if (numero1.equals("") && numero2.equals("")){
            presenter.showerror("los campos estan vacios");
        }else {

            try {
        result= Double.valueOf(numero1)+Double.valueOf(numero2);
        presenter.setResultPresente(String.valueOf(result));
            }catch (Exception e){
                presenter.showerror(e.getMessage());
            }


        }

    }
}
