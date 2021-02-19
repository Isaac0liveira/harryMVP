package com.example.app_mvp.data.Api;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.collection.LruCache;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.app_mvp.R;

import java.io.InputStream;

public class DownloadImage {

   

    public static class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {

        @SuppressLint("StaticFieldLeak")
        ImageView bmImage;
        @SuppressLint("StaticFieldLeak")
        ProgressBar progressBar;

        public DownloadImageTask(ImageView bmImage, View view) {
            this.bmImage = bmImage;
            this.bmImage.setVisibility(View.GONE);
            progressBar = view.findViewById(R.id.progressBar);
            progressBar.setVisibility(View.VISIBLE);
        }


        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", "image download error");
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            Bitmap resized = Bitmap.createScaledBitmap(mIcon11,80, 140, true);
            return resized;
        }

        protected void onPostExecute(Bitmap result) {
            //set image of your imageview

            bmImage.setImageBitmap(result);
            progressBar.setVisibility(View.GONE);
            bmImage.setVisibility(View.VISIBLE);
            this.cancel(true);
        }
    }
}
