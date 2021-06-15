package com.CompuderApps.boardfootcalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Parts List Adapter</h1>
 *
 *
 *
 * @version alpha
 * @since 06/2021
 */
public class PartsListAdapter extends RecyclerView.Adapter<PartsListAdapter.ViewHolder> {

    /**
     * <h1>View Holder</h1>
     * This class is within the Parts List Adapter. It is used to connect the view and the data.
     *
     *
     * @version alpha
     * @since 06/2021
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        /** Part Name TextView */
        public TextView PartNameTextView;
        /** Dimension TextView */
        public TextView DimensionTextView;

        /**
         * ViewHolder constructor. Passes in the view and sets {@link com.CompuderApps.boardfootcalculator.PartsListAdapter.ViewHolder#PartNameTextView}
         * and {@link com.CompuderApps.boardfootcalculator.PartsListAdapter.ViewHolder#DimensionTextView}
         *
         * @version alpha
         * @since 06/2021
         */
        public ViewHolder(View itemView) {

            super(itemView);

            PartNameTextView = (TextView) itemView.findViewById(R.id.part_name);
            DimensionTextView = (TextView) itemView.findViewById(R.id.part_dimension);
        }

    }

    /** Parts List */
    private List<Part> PartsList;

    /**
     * Default Parts List Adapter Constructor.
     *
     *
     * @version alpha
     * @since 06/2021
     */
    public PartsListAdapter() {
        PartsList = new ArrayList<Part>();
    }

    /**
     * Parts List Adapter Constructor. Sets {@link com.CompuderApps.boardfootcalculator.PartsListAdapter#PartsList}
     *
     *
     * @version alpha
     * @since 06/2021
     */
    public PartsListAdapter (List<Part> partsList) {
        PartsList = new ArrayList<Part>(partsList);
    }


    @Override
    /**
     * On Create View Holder. Initializes the ViewHolder
     *
     * @version alpha
     * @since 06/2021
     */
    public PartsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // inflate the custom layout
        View partsView = inflater.inflate(R.layout.part_layout, parent, false);

        // return a new holder instance
        ViewHolder viewHolder = new ViewHolder(partsView);
        return viewHolder;
    }

    @Override
    /**
     * On Bind View Holder. Bind the data to the views.
     *
     * @version alpha
     * @since 06/2021
     */
    public void onBindViewHolder(PartsListAdapter.ViewHolder holder, int position) {
        Part part = PartsList.get(position);

        // set the name
        TextView textView = holder.PartNameTextView;
        textView.setText(part.getName());
        // format the dimension
        String dimension = part.getQuantity() + " - " + part.getLength() + "\"x" + part.getWidth() + "\"x" + part.getThickness() + "\"";
        // set the dimension
        textView = holder.DimensionTextView;
        textView.setText(dimension);
    }

    @Override
    /**
     * Get Item Count. Get the count of the items in the parts list.
     *
     * @version alpha
     * @since 06/2021
     */
    public int getItemCount() {
        return PartsList.size();
    }
}
