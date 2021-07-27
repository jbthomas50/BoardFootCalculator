package com.CompuderApps.boardfootcalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProjectsListAdapter extends RecyclerView.Adapter<ProjectsListAdapter.ViewHolder> {

    /**
     * <h1>View Holder</h1>
     * This class is within the Projects List Adapter. It is used to connect the view and the data.
     *
     *
     * @version alpha
     * @since 06/2021
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        /** Project Name Text View */
        public TextView ProjectNameTextView;
        //public TextView DimensionTextView;

        /**
         * ViewHolder constructor. Passes in the view and sets {@link com.CompuderApps.boardfootcalculator.ProjectsListAdapter.ViewHolder#ProjectNameTextView}
         *
         *
         * @version alpha
         * @since 06/2021
         */
        public ViewHolder(View itemView) {

            super(itemView);

            ProjectNameTextView = (TextView) itemView.findViewById(R.id.project_name);
            //DimensionTextView = (TextView) itemView.findViewById(R.id.part_dimension);
        }

    }

    /** Projects List */
    List<Project> ProjectsList;

    /**
     * Projects List Adapter constructor. Sets {@link com.CompuderApps.boardfootcalculator.ProjectsListAdapter#ProjectsList}
     *
     * @version alpha
     * @since 06/2021
     */
    public ProjectsListAdapter (List<Project> projectsList) {
        ProjectsList = new ArrayList<Project>(projectsList);
    }


    /**
     * On Create View Holder. Initializes the ViewHolder
     *
     * @version alpha
     * @since 06/2021
     */
    @Override
    public ProjectsListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // inflate the custom layout
        View projectsView = inflater.inflate(R.layout.project_layout, parent, false);

        // return a new holder instance
        ProjectsListAdapter.ViewHolder viewHolder = new ProjectsListAdapter.ViewHolder(projectsView);
        return viewHolder;
    }


    /**
     * On Bind View Holder. Bind the data to the views.
     *
     * @version alpha
     * @since 06/2021
     */
    @Override
    public void onBindViewHolder(ProjectsListAdapter.ViewHolder holder, int position) {
        Project project = ProjectsList.get(position);

        TextView textView = holder.ProjectNameTextView;
        TextView textView = holder.ProjectNameTextView;
        TextView textView = holder.ProjectNameTextView;
        textView.setText(project.getName());
    }


    /**
     * Get Item Count. Get the count of the items in the projects list.
     *
     * @version alpha
     * @since 06/2021
     */
    @Override
    public int getItemCount() {
        return ProjectsList.size();
    }
}
