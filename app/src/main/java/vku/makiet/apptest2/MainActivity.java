package vku.makiet.apptest2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ComicAdapter.OnComicListener {

    private RecyclerView recyclerview;
    private ArrayList<ComicModel> comics = new ArrayList<ComicModel>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = (RecyclerView) findViewById(R.id.rv_comics);
        LinearLayoutManager lmg = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(lmg);

        ArrayList<ComicModel> comics = new ArrayList<ComicModel>();{
            comics.add(new ComicModel("1","Comics 1", "20000", R.drawable.img));
            comics.add(new ComicModel("2","Comics 2", "20000", R.drawable.img));
            comics.add(new ComicModel("3","Comics 3", "20000", R.drawable.img));
            comics.add(new ComicModel("4","Comics 4", "20000", R.drawable.img));
            comics.add(new ComicModel("5","Comics 5", "20000", R.drawable.img));
            comics.add(new ComicModel("6","Comics 6", "20000", R.drawable.img));
            comics.add(new ComicModel("7","Comics 7", "20000", R.drawable.img));
            comics.add(new ComicModel("8","Comics 8", "20000", R.drawable.img));
            comics.add(new ComicModel("9","Comics 9", "20000", R.drawable.img));
            comics.add(new ComicModel("10","Comics 10", "20000", R.drawable.img));
        }

        ComicAdapter comicAdapter = new ComicAdapter(comics, this);
        recyclerview.setAdapter(comicAdapter);

    }

    @Override
    public void onComicClick(int position) {
        Log.d(TAG, "Click on item" + position);
//        comics.get(position);
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("id", comics.get(position).getId());
        startActivity(intent);

        // Parcelable
    }
}