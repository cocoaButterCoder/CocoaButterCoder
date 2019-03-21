package com.example.cocoabuttercoder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SocialMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social_media);
    }

    public void openTwitter(View view){
        Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/cocoabuttercode"));
        startActivity(twitterIntent);
    }

    public void openLinkedIn(View view){
        Intent linkedInIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/bmmay/"));
        startActivity(linkedInIntent);
    }

    public void openGithub(View view){
        Intent githubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/cocoaButterCoder"));
        startActivity(githubIntent);
    }

    public void sendEmail(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:cocoabuttercoder@gmail.com"));
        startActivity(emailIntent);
    }
}
