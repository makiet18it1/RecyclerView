package vku.makiet.apptest2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final String id = getIntent().getStringExtra("id");
        Log.d(TAG, "Click : "+id);
//        if(getIntent().hasExtra("id")){
//            ComicModel model = getIntent().getParcelableExtra("id");
//            Log.d(TAG, "Click: "+ model.toString());
//        }


    }
}