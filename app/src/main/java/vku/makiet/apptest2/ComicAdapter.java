package vku.makiet.apptest2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ComicAdapter extends RecyclerView.Adapter<ComicAdapter.ComicViewHolder> {

    public ComicAdapter(ArrayList<ComicModel> comics, OnComicListener onComicListener) {
        this.comics = comics;
        this.onComicClick = onComicListener;
    }

    private ArrayList<ComicModel> comics;
    private OnComicListener onComicClick;

    @NonNull
    @Override
    public ComicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comic, parent, false);
        return new ComicViewHolder(view, onComicClick);
    }

    @Override
    public void onBindViewHolder(@NonNull ComicViewHolder holder, int position) {
        holder.title.setText(comics.get(position).getName());
        holder.price.setText(comics.get(position).getPrice());
        holder.image.setImageResource(comics.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return comics.size();
    }

    public class ComicViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView image;
        TextView title, price;

        OnComicListener onComicListener;

        public ComicViewHolder(@NonNull View itemView, OnComicListener onComicListener) {
            super(itemView);

            image = itemView.findViewById(R.id.img_comic);
            title = itemView.findViewById(R.id.tv_title);
            price = itemView.findViewById(R.id.tv_price);

            this.onComicListener = onComicListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onComicListener.onComicClick(getAdapterPosition());
        }
    }

    public interface OnComicListener {
        void onComicClick(int position);
    }
}
