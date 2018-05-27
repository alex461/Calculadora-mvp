package com.example.alexander.calculadoramvp.Presenter;

import com.example.alexander.calculadoramvp.Interactor.MainInteractorImp;
import com.example.alexander.calculadoramvp.Interface.MainInteractor;
import com.example.alexander.calculadoramvp.Interface.MainPresenter;
import com.example.alexander.calculadoramvp.Interface.MainView;

/**
 * Created by alexander on 12/04/18.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView view;
   private MainInteractor interactor;

    public MainPresenterImpl(MainView view) {
        this.view = view;
        interactor = new MainInteractorImp(this);
    }

    @Override
    public void operation(String numero1, String numero2) {
        if (view!=null){
             // lamar al interactor
            interactor.Suma(numero1,numero2);

        }

    }

    @Override
    public void showerror(String error) {
        if(view !=null){
            view.showError(error);
        }
    }

    @Override
    public void setResultPresente(String result) {
        if(view !=null){
          view.setResult(result);
        }
    }
}
