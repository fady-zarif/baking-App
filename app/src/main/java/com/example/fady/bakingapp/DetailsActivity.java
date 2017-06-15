package com.example.fady.bakingapp;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.ArrayAdapter;

import com.example.fady.bakingapp.Fragment.DetailsActivityFragment;
import com.example.fady.bakingapp.Model.Recipe;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        DetailsActivityFragment fragment = new DetailsActivityFragment();
        android.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.myframe, fragment);
        fragmentTransaction.commit();


    }

    @Override
    public void onBackPressed() {

        if (RecipesActivity.FrNum != 0) {
            while (RecipesActivity.FrNum > 0) {
                getFragmentManager().popBackStack("a",
                        FragmentManager.POP_BACK_STACK_INCLUSIVE);
                RecipesActivity.FrNum--;
            }
        } else {
            super.onBackPressed();
        }
    }
}
