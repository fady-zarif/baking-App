package com.example.fady.bakingapp.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.fady.bakingapp.Adapter.RecipesStepsAdapter;
import com.example.fady.bakingapp.Model.Ingredient;
import com.example.fady.bakingapp.Model.Recipe;
import com.example.fady.bakingapp.Model.Step;
import com.example.fady.bakingapp.R;

import java.sql.Array;
import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailsActivityFragment extends Fragment {
    RecyclerView recipeStepsRecycler;

    public DetailsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_details, container, false);
        recipeStepsRecycler = (RecyclerView) root.findViewById(R.id.details_Recycler);
        Recipe recipe = getActivity().getIntent().getParcelableExtra("RecipeObject");
        getActivity().getActionBar().setTitle(recipe.getName());
        RecipesStepsAdapter stepsAdapter = new RecipesStepsAdapter(recipe, getActivity());
        recipeStepsRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recipeStepsRecycler.setAdapter(stepsAdapter);

        return root;
    }

}
