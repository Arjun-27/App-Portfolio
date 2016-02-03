package mynanodegree.com.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void onButtonsClick(View view) {
        String toastText = "";
        switch(view.getId()) {
            case R.id.btnSpotify:
                toastText = "This button will launch Spotify Streamer App!!";
                break;

            case R.id.btnScores:
                toastText = "This button will launch Football Scores App!!";
                break;

            case R.id.btnLibrary:
                toastText = "This button will launch Library App!!";
                break;

            case R.id.btnBigger:
                toastText = "Building it Bigger!!!!";
                break;

            case R.id.btnReader:
                toastText = "This button will launch the XYZ Reader!!";
                break;

            case R.id.btnCapstone:
                toastText = "This button will launch my capstone app!!";
                break;
        }

        Toast.makeText(PortfolioActivity.this, toastText, Toast.LENGTH_LONG).show();
    }
}