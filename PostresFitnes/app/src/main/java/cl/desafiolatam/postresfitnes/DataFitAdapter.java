package cl.desafiolatam.postresfitnes;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataFitAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
private List<Recipe> recipes;
public  DataFitAdapter(Context context, List<Recipe> recipes){
    this.recipes = recipes;

}
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
