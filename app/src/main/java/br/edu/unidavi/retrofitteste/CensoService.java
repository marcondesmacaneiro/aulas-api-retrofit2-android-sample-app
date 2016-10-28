package br.edu.unidavi.retrofitteste;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by shelajev on 16/12/15.
 */
interface CensoService {
    @GET("/api/censo/{id}")
    Call<List<Coletor>> repoCenso(
            @Path("id") String repo
    );


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://pure-island-41431.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}


