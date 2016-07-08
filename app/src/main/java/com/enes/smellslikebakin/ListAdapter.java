package com.enes.smellslikebakin;

/**
 * Created by Enes on 7/3/2016.
 */
public class ListAdapter extends RecyclerAdapter {
    private final ListFragment.OnRecipeSelectedInterface mListener;

    public ListAdapter(ListFragment.OnRecipeSelectedInterface listener){
        mListener = listener;

    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;

    }
    @Override
    protected void onRecipeSelected(int index) {
        mListener.onListRecipeSelected(index);
    }
}
