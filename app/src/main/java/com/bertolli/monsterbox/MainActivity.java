package com.bertolli.monsterbox;

import android.app.SearchManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.bertolli.monsterbox.data.Monster;
import com.bertolli.monsterbox.data.PadHerderService;
import com.bertolli.monsterbox.util.SimpleDividerItemDecoration;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import solid.functions.SolidFunc1;

import static solid.stream.Stream.stream;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private MainAdapter adapter;
    private List<Monster> monsterList;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.search));

        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        searchView.setInputType(InputType.TYPE_CLASS_TEXT);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(final String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(final String newText) {
                if (adapter != null && monsterList != null) {
                    List<Monster> list = stream(monsterList).filter(new SolidFunc1<Monster, Boolean>() {
                        @Override
                        public Boolean call(Monster value) {
                            return value.getId().toString().contains(newText) || value.getName().toString().toLowerCase().contains(newText.toLowerCase());
                        }
                    }).toList();
                    adapter.setData(list);
                    return true;
                }
                return false;
            }
        });
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.MainMenuListView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));


        adapter = new MainAdapter(this);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new MainAdapter.OnItemClickListener() {
            @Override
            public void onClick(Monster monster, View v) {
                String hpRange = "HP: " + monster.getHpMin() + " - " + monster.getHpMax();
                String atkRange = "ATK: " + monster.getAtkMin() + " - " + monster.getAtkMax();
                String rcuRange = "RCU: " + monster.getRcvMin() + " - " + monster.getRcvMax();
                MaterialDialog dialog = new MaterialDialog.Builder(MainActivity.this)
                        .title(monster.getName())
                        .content(hpRange + "\n" + atkRange + "\n" + rcuRange)
                        .show();
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.padherder.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PadHerderService padHerderService = retrofit.create(PadHerderService.class);

        Call<List<Monster>> listCall = padHerderService.listMosters();

        listCall.enqueue(new Callback<List<Monster>>() {
            @Override
            public void onResponse(Call<List<Monster>> call, Response<List<Monster>> response) {
                if (response.isSuccess()) {
                    adapter.setData(response.body());
                    monsterList = response.body();
                } else {
                    Log.e(TAG, "onResponse: Failed to get monsters - " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Monster>> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.bertolli.monsterbox/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.bertolli.monsterbox/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
