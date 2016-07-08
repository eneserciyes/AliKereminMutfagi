package com.enes.smellslikebakin;

/**
 * Created by Enes on 7/7/2016.
 */
public class GridAdapter  extends RecyclerAdapter {
    private final GridFragment.OnRecipeSelectedInterface mListener;

    public GridAdapter(GridFragment.OnRecipeSelectedInterface listener){
        mListener = listener;

    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;

    }
    @Override
    protected void onRecipeSelected(int index) {
        mListener.onGridRecipeSelected(index);
    }
}
