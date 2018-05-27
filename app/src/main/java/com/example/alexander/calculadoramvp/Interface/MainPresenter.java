package com.example.alexander.calculadoramvp.Interface;

/**
 * Created by alexander on 12/04/18.
 */

public interface MainPresenter {

    void operation(String numero1,String numero2);
    void showerror(String error);
    void setResultPresente(String result);
}
