package com.enes.smellslikebakin;

/**
 * Created by Enes on 7/7/2016.
 */
public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");

    }
}
