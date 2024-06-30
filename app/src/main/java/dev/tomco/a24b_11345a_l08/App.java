package dev.tomco.a24b_11345a_l08;

import android.app.Application;

import dev.tomco.a24b_11345a_l08.Utilities.ImageLoader;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoader.init(this);
    }
}
