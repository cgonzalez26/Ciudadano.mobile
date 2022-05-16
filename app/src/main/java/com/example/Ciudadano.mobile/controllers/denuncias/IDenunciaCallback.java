package com.example.Ciudadano.mobile.controllers.denuncias;
import com.androidnetworking.error.ANError;

public interface IDenunciaCallback {
    void onSuccess(String result);
    void onResponse(String result);
    void onError(ANError anError);
    void onError(Exception e);
}
