package com.bertolli.monsterbox.data;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by h205p3 on 2/9/16.
 */
public interface PadHerderService {
    @GET("monsters")
    Call<List<Monster>> listMosters();
}
