package android.example.com;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
int teamScoreA =0;
    int teamScoreB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//    int id=item.getItemId();
//    if (id==R.id.action_settings)
//    {return true;
//
//    }
//    return super.onOptionsItemSelected(item);
//    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
public void addThreeForTeamA(View V){
    teamScoreA=teamScoreA+3;

        displayForTeamA(teamScoreA);
}

    public void addTwoForTeamA(View V){
        teamScoreA=teamScoreA+2;
        displayForTeamA(teamScoreA);
    }

    public void addOneForTeamA(View V){
        teamScoreA=teamScoreA+1;
        displayForTeamA(teamScoreA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View V){
        teamScoreB=teamScoreB+3;

        displayForTeamB(teamScoreB);
    }
    public void addTwoForTeamB(View V){
        teamScoreB=teamScoreB+2;

        displayForTeamB(teamScoreB);
    } public void addOneForTeamB(View V){
        teamScoreB=teamScoreB+1;

        displayForTeamB(teamScoreB);
    }
//this code to reset all the values
    public void resetAll(View V){
        teamScoreA = 0;
        teamScoreB = 0;
        displayForTeamB(teamScoreB);
        displayForTeamA(teamScoreA);
    }
}