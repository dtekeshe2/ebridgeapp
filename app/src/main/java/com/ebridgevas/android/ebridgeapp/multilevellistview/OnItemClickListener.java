package com.ebridgevas.android.ebridgeapp.multilevellistview;


import android.view.View;

/**
 * Interface for handling MultiLevelListView events.
 */
public interface OnItemClickListener {

    /**
     * Method called when an item has been clicked
     *
     * @param parent The MultiLevelListView containing the clicked view
     * @param view The view that was clicked (the view provided by the adapter)
     * @param item Object that was clicked
     * @param itemInfo ItemInfo object with information about the clicked object and its location
     *                 on the list
     */
    void onItemClicked(MultiLevelListView parent, View view, Object item, ItemInfo itemInfo);

    /**
     * Method called when a group item has been clicked
     *
     * @param parent The MultiLevelListView containing the cliked view
     * @param view The view that was clicked (the view provided by the adapter)
     * @param item Object that was clicked
     * @param itemInfo ItemInfo object with information about the clicked object and its location
     *                 on the list
     */
    void onGroupItemClicked(MultiLevelListView parent, View view, Object item, ItemInfo itemInfo);
}
