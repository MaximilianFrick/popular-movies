package com.maximilianfrick.myappportfolio.movies.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.maximilianfrick.myappportfolio.R;
import com.maximilianfrick.myappportfolio.core.dagger.Injector;
import com.maximilianfrick.myappportfolio.movies.detail.MoviesDetailContract;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesActivity extends AppCompatActivity {
    private static final String KEY_FILTER_TYPE = "KEY_FILTER_TYPE";
    @BindView(R.id.view_movies)
    MoviesContract.View moviesView;
    MoviesContract.Presenter moviesPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ButterKnife.bind(this);
        Injector.getAppComponent().inject(this);
        if (findViewById(R.id.view_movies_detail) != null) {
            MoviesDetailContract.View detailView = ButterKnife.findById(this, R.id.view_movies_detail);
            moviesPresenter = new MoviesPresenter(moviesView, detailView);
        } else {
            moviesPresenter = new MoviesPresenter(moviesView);
        }
        if (savedInstanceState != null) {
            moviesPresenter.setFilterType((MoviesFilterType) savedInstanceState.getSerializable(KEY_FILTER_TYPE));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        moviesPresenter.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        moviesPresenter.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.movies_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_filter:
                moviesView.showFilteringOptions();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(KEY_FILTER_TYPE, moviesPresenter.getFilterType());
        super.onSaveInstanceState(outState);
    }
}
