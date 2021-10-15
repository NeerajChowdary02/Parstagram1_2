package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tDUBGdEzlBAppqMG9PSNr0o9QDgYlLpPTFOysKN9")
                .clientKey("9FOeTlRK8ZG3z8cB92T8tKqCoxptMtsfIqBXKxd3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
