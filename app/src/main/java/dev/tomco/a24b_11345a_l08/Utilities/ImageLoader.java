package dev.tomco.a24b_11345a_l08.Utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import dev.tomco.a24b_11345a_l08.R;

public class ImageLoader {
    private static volatile ImageLoader instance;
    private static Context context;

    private ImageLoader(Context context) {
        this.context = context;
    }

    public static ImageLoader getInstance() {
        return instance;
    }

    public static ImageLoader init(Context context){
        if (instance == null)
            synchronized (ImageLoader.class) {
                if (instance == null){
                    instance = new ImageLoader(context);
                }
            }
        return getInstance();
    }

    public void load(String link, ImageView imageView){
        Glide
                .with(context)
                .load(link)
                .placeholder(R.drawable.unavailable_photo)
                .centerInside()
                .into(imageView);
    }
    public void load(Drawable drawable, ImageView imageView){
        Glide
                .with(context)
                .load(drawable)
                .placeholder(R.drawable.unavailable_photo)
                .centerInside()
                .into(imageView);
    }
}
