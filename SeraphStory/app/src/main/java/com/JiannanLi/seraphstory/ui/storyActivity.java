package com.JiannanLi.seraphstory.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.JiannanLi.seraphstory.R;
import com.JiannanLi.seraphstory.model.Page;
import com.JiannanLi.seraphstory.model.StoryStream;

import org.w3c.dom.Text;

public class storyActivity extends Activity {
    public static final String TAG = storyActivity.class.getSimpleName();
    private StoryStream mStoryStream = new StoryStream();
    private ImageView mImageView;
    private TextView mText;
    private Button mChoice1;
    private Button mChoice2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        if(name == null){
            name = "Seraph";
        }
        Log.d(TAG,name);
        mImageView = (ImageView) findViewById(R.id.storyImage);
        mText = (TextView) findViewById(R.id.storyTextView);
        mChoice1 = (Button) findViewById(R.id.choiceButton1);
        mChoice2 = (Button) findViewById(R.id.choiceButton2);

        LoadPage(name,0);

    }

    private void LoadPage(final String mName, int nextPage){
        String pageText;
        final Page mPage = mStoryStream.getPage(nextPage);
        Drawable mDrawable = getResources().getDrawable(mPage.getImageId());
        mImageView.setImageDrawable(mDrawable);
        pageText = mPage.getText();
        pageText = String.format(pageText,mName);
        mText.setText(pageText);

        if (mPage.getIsFinal()) {
            mChoice1.setVisibility(View.INVISIBLE);
            mChoice2.setText("PLAY AGAIN?");
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }
        else {
            mChoice1.setText(mPage.getChoice1().getText());
            mChoice2.setText(mPage.getChoice2().getText());
            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    LoadPage(mName, mPage.getChoice1().getNextPage());
                }
            });
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    LoadPage(mName, mPage.getChoice2().getNextPage());
                }
            });
        }
    }
}
