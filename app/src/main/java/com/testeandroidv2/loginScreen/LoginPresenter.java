package com.testeandroidv2.loginScreen;

import android.support.annotation.NonNull;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

interface LoginPresenterInput {
    public void presentLoginData(LoginResponse response);
}


public class LoginPresenter implements LoginPresenterInput {

    public static String TAG = LoginPresenter.class.getSimpleName();

    //weak var output: HomePresenterOutput!
    public WeakReference<LoginActivityInput> output;


    @Override
    public void presentLoginData(LoginResponse response) {
        // Log.e(TAG, "presentLoginData() called with: response = [" + response + "]");
        //Do your decoration or filtering here

    }


}