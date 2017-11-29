package de.fhro.inf.prg3.a08;

import java.util.List;

import de.fhro.inf.prg3.a08.api.OpenMensaAPI;
import de.fhro.inf.prg3.a08.model.Meal;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by flmueh on 29.11.17.
 */

public class OpenMensaAPIService implements OpenMensaAPI {
    private static OpenMensaAPIService ourInstance; ;
    private static final Retrofit retrofit;

    static {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://openmensa.org/api/v2/")
                .client(client)
                .build();
    }


    public static OpenMensaAPIService getInstance() {
        if(ourInstance == null)
            ourInstance = new OpenMensaAPIService();
        return ourInstance;
    }

    private OpenMensaAPIService() {

    }

    @Override
    public Call<List<Meal>> getMeals(String date) {
        OpenMensaAPI openMensaAPI = retrofit.create(OpenMensaAPI.class);
        return openMensaAPI.getMeals("2017-11-22");
    }
}
