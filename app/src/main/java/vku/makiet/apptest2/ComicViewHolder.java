package vku.makiet.apptest2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ComicViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView title, price;

    public ComicViewHolder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.img_comic);
        title = itemView.findViewById(R.id.tv_title);
        price = itemView.findViewById(R.id.tv_price);
    }
}
